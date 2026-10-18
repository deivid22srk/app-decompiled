package android.support.v4.view;

import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class al {

    /* renamed from: a, reason: collision with root package name */
    private static Field f336a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f337b;

    static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f337b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f336a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f337b = true;
        }
        if (f336a != null) {
            try {
                f336a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
