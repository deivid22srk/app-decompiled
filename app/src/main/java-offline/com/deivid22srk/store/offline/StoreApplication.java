package com.deivid22srk.store.offline;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.support.multidex.MultiDex;
import android.util.Log;

/**
 * Application do modo offline.
 *
 * Herda da Application original (com.google.android.finsky.FinskyApp) para
 * preservar 100% do código e do comportamento originais, mas blinda a
 * inicialização e instala uma rede de proteção global: qualquer exceção não
 * tratada na thread principal reinicia o catálogo offline em vez de fechar o
 * app. Exceções em threads de fundo são registradas e absorvidas.
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
        installCrashGuard();
        try {
            super.onCreate();
        } catch (Throwable t) {
            // Ex.: SecurityException ao ler identificadores de telefone no
            // Android 10+. A loja segue funcionando em modo offline.
            Log.e(TAG, "Inicialização original falhou — seguindo em modo offline", t);
        }
    }

    /**
     * Crashes na thread principal: reabre o catálogo offline (limpando a
     * pilha) e encerra o processo de forma limpa — o sistema recria o app
     * direto na interface offline. Em threads de fundo apenas registra e
     * deixa o app vivo.
     */
    private void installCrashGuard() {
        final Thread.UncaughtExceptionHandler previous =
                Thread.getDefaultUncaughtExceptionHandler();
        final Context self = this;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                try {
                    Log.e(TAG, "Exceção não tratada na thread " + thread.getName(), throwable);
                } catch (Throwable ignored) {
                }
                boolean mainThread = (thread == Looper.getMainLooper().getThread());
                if (mainThread) {
                    try {
                        Intent intent = new Intent(self, OfflineMainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                                | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        self.startActivity(intent);
                    } catch (Throwable ignored) {
                    }
                    android.os.Process.killProcess(android.os.Process.myPid());
                } else {
                    // Mantém o processo vivo em crashes de threads de fundo;
                    // delega ao handler anterior apenas se ele existir e não
                    // for o handler padrão da VM (que mata o processo).
                    if (previous != null && !"com.android.internal.os.RuntimeInit$KillApplicationHandler"
                            .equals(previous.getClass().getName())) {
                        try {
                            previous.uncaughtException(thread, throwable);
                        } catch (Throwable ignored) {
                        }
                    }
                }
            }
        });
    }
}
