package android.support.v4.g;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static Method f275a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f276b;

    static {
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f275a = cls.getMethod("getScript", String.class);
                f276b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e) {
            f275a = null;
            f276b = null;
            Log.w("ICUCompatIcs", e);
        }
    }

    public static String a(Locale locale) {
        String b2 = b(locale);
        if (b2 != null) {
            return a(b2);
        }
        return null;
    }

    private static String a(String str) {
        try {
            if (f275a != null) {
                return (String) f275a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return null;
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f276b != null) {
                return (String) f276b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return locale2;
    }
}
