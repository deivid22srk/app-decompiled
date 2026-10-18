package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    static Method f264a;

    /* renamed from: b, reason: collision with root package name */
    static boolean f265b;
    private static Method c;
    private static boolean d;

    public static int a(Drawable drawable) {
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Integer) c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", e2);
                c = null;
            }
        }
        return -1;
    }
}
