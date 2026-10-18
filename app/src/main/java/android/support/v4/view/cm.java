package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class cm {

    /* renamed from: a, reason: collision with root package name */
    private static Field f364a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f365b;
    private static Field c;
    private static boolean d;

    static int a(View view) {
        if (!f365b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f364a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f365b = true;
        }
        if (f364a != null) {
            try {
                return ((Integer) f364a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    static int b(View view) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Integer) c.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }
}
