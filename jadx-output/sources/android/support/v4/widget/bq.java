package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    static final bw f447a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f447a = new br();
            return;
        }
        if (i >= 18) {
            f447a = new bu();
            return;
        }
        if (i >= 17) {
            f447a = new bt();
        } else if (i >= 16) {
            f447a = new bv();
        } else {
            f447a = new bs();
        }
    }

    public static void a(TextView textView, Drawable drawable) {
        f447a.a(textView, drawable);
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        f447a.a(textView, drawable, drawable2, drawable3);
    }

    public static void a(TextView textView, int i) {
        f447a.a(textView, i);
    }
}
