package android.support.v4.g;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f277a;

    /* renamed from: b, reason: collision with root package name */
    private static final i f278b;
    private static String c;
    private static String d;

    static {
        byte b2 = 0;
        if (Build.VERSION.SDK_INT >= 17) {
            f278b = new j(b2);
        } else {
            f278b = new i(b2);
        }
        f277a = new Locale("", "");
        c = "Arab";
        d = "Hebr";
    }

    public static int a(Locale locale) {
        return f278b.a(locale);
    }
}
