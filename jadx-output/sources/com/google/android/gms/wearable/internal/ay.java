package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.mh;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ay<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, cc<T>> f6587a = new HashMap();

    ay() {
    }

    public final void a(IBinder iBinder) {
        synchronized (this.f6587a) {
            am a2 = an.a(iBinder);
            by byVar = new by();
            for (Map.Entry<T, cc<T>> entry : this.f6587a.entrySet()) {
                cc<T> value = entry.getValue();
                try {
                    a2.a(byVar, new AddListenerRequest(value));
                    if (Log.isLoggable("WearableClient", 2)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + entry.getKey() + "/" + value);
                    }
                } catch (RemoteException e) {
                    Log.d("WearableClient", "onPostInitHandler: Didn't add: " + entry.getKey() + "/" + value);
                }
            }
        }
    }

    public final void a(ca caVar) {
        synchronized (this.f6587a) {
            by byVar = new by();
            for (Map.Entry<T, cc<T>> entry : this.f6587a.entrySet()) {
                cc<T> value = entry.getValue();
                if (value != null) {
                    cc.a((mh<?>) value.f6601a);
                    value.f6601a = null;
                    cc.a((mh<?>) value.f6602b);
                    value.f6602b = null;
                    cc.a(value.c);
                    value.c = null;
                    cc.a(value.d);
                    value.d = null;
                    cc.a((mh<?>) value.e);
                    value.e = null;
                    cc.a((mh<?>) value.f);
                    value.f = null;
                    cc.a((mh<?>) value.g);
                    value.g = null;
                    cc.a((mh<?>) value.h);
                    value.h = null;
                    cc.a((mh<?>) value.i);
                    value.i = null;
                    if (caVar.g()) {
                        try {
                            caVar.o().a(byVar, new RemoveListenerRequest(value));
                            if (Log.isLoggable("WearableClient", 2)) {
                                Log.d("WearableClient", "disconnect: removed: " + entry.getKey() + "/" + value);
                            }
                        } catch (RemoteException e) {
                            Log.w("WearableClient", "disconnect: Didn't remove: " + entry.getKey() + "/" + value);
                        }
                    }
                }
            }
            this.f6587a.clear();
        }
    }
}
