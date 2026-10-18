package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class ae extends Service implements h, u {

    /* renamed from: a, reason: collision with root package name */
    private String f6464a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f6465b;
    private IBinder c;
    private final Object d = new Object();
    private boolean e;

    public void a(k kVar) {
    }

    public void a(w wVar) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.c;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: " + getPackageName());
        }
        this.f6464a = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.f6465b = new Handler(handlerThread.getLooper());
        this.c = new af(this, (byte) 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.d) {
            this.e = true;
            if (this.f6465b == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.f6465b.getLooper().quit();
        }
        super.onDestroy();
    }
}
