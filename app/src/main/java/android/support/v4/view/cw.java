package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    static final cz f369a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f369a = new db();
            return;
        }
        if (i >= 18) {
            f369a = new da();
            return;
        }
        if (i >= 14) {
            f369a = new cy();
        } else if (i >= 11) {
            f369a = new cx();
        } else {
            f369a = new dc();
        }
    }

    public static void a(ViewGroup viewGroup) {
        f369a.a(viewGroup);
    }
}
