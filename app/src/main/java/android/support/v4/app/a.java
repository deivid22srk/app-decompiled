package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class a extends android.support.v4.b.g {
    public static void a(Activity activity, Intent intent, int i) {
        if (Build.VERSION.SDK_INT < 16) {
            activity.startActivityForResult(intent, i);
        } else {
            activity.startActivityForResult(intent, i, null);
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT < 16) {
            activity.finish();
        } else {
            activity.finishAffinity();
        }
    }
}
