package android.support.v4.g;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static Method f274a;

    static {
        try {
            f274a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static String a(Locale locale) {
        try {
            return ((Locale) f274a.invoke(null, locale)).getScript();
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
            return locale.getScript();
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
            return locale.getScript();
        }
    }
}
