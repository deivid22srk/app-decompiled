package android.support.v4.os;

import android.os.Build;
import android.os.Trace;

/* loaded from: classes.dex */
public final class f {
    public static void a(String str) {
        if (Build.VERSION.SDK_INT < 18) {
            return;
        }
        Trace.beginSection(str);
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 18) {
            return;
        }
        Trace.endSection();
    }
}
