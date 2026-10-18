package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.measurement.internal.ap;
import com.google.android.gms.measurement.internal.as;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.z;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f6271b;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6272a = new Handler();

    public static boolean a(Context context) {
        av.a(context);
        if (f6271b != null) {
            return f6271b.booleanValue();
        }
        boolean b2 = g.b(context, (Class<? extends Service>) AppMeasurementService.class);
        f6271b = Boolean.valueOf(b2);
        return b2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        z e = ap.a(this).e();
        if (i.B()) {
            e.g.a("Device AppMeasurementService is starting up");
        } else {
            e.g.a("Local AppMeasurementService is starting up");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        z e = ap.a(this).e();
        if (i.B()) {
            e.g.a("Device AppMeasurementService is shutting down");
        } else {
            e.g.a("Local AppMeasurementService is shutting down");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            synchronized (AppMeasurementReceiver.f6269a) {
                PowerManager.WakeLock wakeLock = AppMeasurementReceiver.f6270b;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        } catch (SecurityException e) {
        }
        ap a2 = ap.a(this);
        z e2 = a2.e();
        String action = intent.getAction();
        if (i.B()) {
            e2.g.a("Device AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        } else {
            e2.g.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a2.f().a(new b(this, a2, i2, e2));
        }
        return 2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            ap.a(this).e().f6388a.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new as(ap.a(this));
        }
        ap.a(this).e().f6389b.a("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (intent == null) {
            ap.a(this).e().f6388a.a("onUnbind called with null intent");
        } else {
            ap.a(this).e().g.a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        if (intent == null) {
            ap.a(this).e().f6388a.a("onRebind called with null intent");
        } else {
            ap.a(this).e().g.a("onRebind called. action", intent.getAction());
        }
    }
}
