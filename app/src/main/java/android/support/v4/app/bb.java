package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private static final bc f193a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f193a = new be();
        } else {
            f193a = new bd();
        }
    }

    public static boolean a(Activity activity, Intent intent) {
        return f193a.a(activity, intent);
    }

    public static void b(Activity activity, Intent intent) {
        f193a.b(activity, intent);
    }

    public static Intent a(Activity activity) {
        return f193a.a(activity);
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b2);
        return b(context, componentName2) == null ? android.support.v4.b.i.a(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String b(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String b(Context context, ComponentName componentName) {
        return f193a.a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }
}
