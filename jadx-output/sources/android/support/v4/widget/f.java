package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f456a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f456a = new g();
        } else if (i >= 21) {
            f456a = new j();
        } else {
            f456a = new h();
        }
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f456a.a(compoundButton, colorStateList);
    }

    public static void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f456a.a(compoundButton, mode);
    }

    public static Drawable a(CompoundButton compoundButton) {
        return f456a.a(compoundButton);
    }
}
