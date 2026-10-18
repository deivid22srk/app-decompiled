package com.deivid22srk.store.offline;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

/**
 * Application do modo offline.
 *
 * Herda da Application original (com.google.android.finsky.FinskyApp) para
 * preservar 100% do código e do comportamento originais, mas blinda a
 * inicialização: qualquer exceção lançada no onCreate original (por exemplo,
 * SecurityException ao ler identificadores de telefone no Android 10+) é
 * registrada e ignorada, garantindo que o app abra em modo offline em vez de
 * fechar. O catálogo exibido pelo OfflineMainActivity não depende de nenhum
 * estado da inicialização original.
 */
public class StoreApplication extends com.google.android.finsky.FinskyApp {

    private static final String TAG = "StoreApp";

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        try {
            // Multidex legado (API < 21); em API 21+ o multidex é nativo.
            MultiDex.install(this);
        } catch (Throwable t) {
            Log.e(TAG, "MultiDex.install falhou", t);
        }
    }

    @Override
    public void onCreate() {
        try {
            super.onCreate();
        } catch (Throwable t) {
            // Rede de proteção: o app original capturava SecurityException de
            // getSubscriberId/getDeviceId, mas APIs do Android moderno podem
            // falhar em pontos que o código de 2014 não previa. A loja segue
            // funcionando em modo offline mesmo que essa inicialização falhe.
            Log.e(TAG, "Inicialização original falhou — seguindo em modo offline", t);
        }
    }
}
