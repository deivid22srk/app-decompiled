package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static Field f457a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f458b;

    static Drawable a(CompoundButton compoundButton) {
        if (!f458b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f457a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompatDonut", "Failed to retrieve mButtonDrawable field", e);
            }
            f458b = true;
        }
        if (f457a != null) {
            try {
                return (Drawable) f457a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompatDonut", "Failed to get button drawable via reflection", e2);
                f457a = null;
            }
        }
        return null;
    }
}
