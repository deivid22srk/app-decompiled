package android.support.v4.c.apkg;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f extends e {
    f() {
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public int d(Drawable drawable) {
        int a2 = j.a(drawable);
        if (a2 >= 0) {
            return a2;
        }
        return 0;
    }

    @Override // android.support.v4.c.apkg.b, android.support.v4.c.apkg.c
    public void b(Drawable drawable, int i) {
        if (!j.f265b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                j.f264a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            j.f265b = true;
        }
        if (j.f264a != null) {
            try {
                j.f264a.invoke(drawable, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                j.f264a = null;
            }
        }
    }
}
