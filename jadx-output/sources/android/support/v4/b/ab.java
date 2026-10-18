package android.support.v4.b;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class ab extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f244a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static int f245b = 1;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f244a) {
            int i = f245b;
            int i2 = f245b + 1;
            f245b = i2;
            if (i2 <= 0) {
                f245b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            f244a.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean a(Intent intent) {
        boolean z = false;
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra != 0) {
            synchronized (f244a) {
                PowerManager.WakeLock wakeLock = f244a.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    f244a.remove(intExtra);
                    z = true;
                } else {
                    Log.w("WakefulBroadcastReceiver", "No active wake lock id #" + intExtra);
                    z = true;
                }
            }
        }
        return z;
    }
}
