package com.google.android.gms.ads.b;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class e extends Service {

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f5264b;
    private IBinder c;
    private boolean e;

    /* renamed from: a, reason: collision with root package name */
    private volatile int f5263a = -1;
    private final Object d = new Object();

    public abstract void a(c cVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.ads.identifier.BIND_LISTENER".equals(intent.getAction())) {
            return this.c;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5264b = Executors.newSingleThreadExecutor();
        this.c = new f(this, (byte) 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.d) {
            this.e = true;
            this.f5264b.shutdown();
        }
        super.onDestroy();
    }

    static /* synthetic */ void c(e eVar) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != eVar.f5263a) {
            if (!com.google.android.gms.common.c.a(eVar, callingUid)) {
                throw new SecurityException("Caller is not GooglePlayServices.");
            }
            eVar.f5263a = callingUid;
        }
    }
}
