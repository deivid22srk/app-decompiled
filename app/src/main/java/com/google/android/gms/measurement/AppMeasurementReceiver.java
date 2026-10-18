package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.measurement.internal.ap;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.z;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final Object f6269a = new Object();

    /* renamed from: b, reason: collision with root package name */
    static PowerManager.WakeLock f6270b;
    static Boolean c;

    public static boolean a(Context context) {
        av.a(context);
        if (c != null) {
            return c.booleanValue();
        }
        boolean a2 = g.a(context, (Class<? extends BroadcastReceiver>) AppMeasurementReceiver.class);
        c = Boolean.valueOf(a2);
        return a2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z e = ap.a(context).e();
        String action = intent.getAction();
        if (i.B()) {
            e.g.a("Device AppMeasurementReceiver got", action);
        } else {
            e.g.a("Local AppMeasurementReceiver got", action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            boolean a2 = AppMeasurementService.a(context);
            Intent intent2 = new Intent(context, (Class<?>) AppMeasurementService.class);
            intent2.setAction("com.google.android.gms.measurement.UPLOAD");
            synchronized (f6269a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (f6270b == null) {
                            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "AppMeasurement WakeLock");
                            f6270b = newWakeLock;
                            newWakeLock.setReferenceCounted(false);
                        }
                        f6270b.acquire(1000L);
                    } catch (SecurityException e2) {
                        e.f6389b.a("AppMeasurementService at risk of not starting. For more reliable app measurements, add the WAKE_LOCK permission to your manifest.");
                    }
                }
            }
        }
    }
}
