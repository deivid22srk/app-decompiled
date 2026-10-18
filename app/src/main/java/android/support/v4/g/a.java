package android.support.v4.g;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f273a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f273a = new e();
        } else if (i >= 14) {
            f273a = new d();
        } else {
            f273a = new c();
        }
    }

    public static String a(Locale locale) {
        return f273a.a(locale);
    }
}
