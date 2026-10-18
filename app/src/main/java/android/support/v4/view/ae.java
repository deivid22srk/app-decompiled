package android.support.v4.view;

import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    static final af f334a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f334a = new ai();
        } else if (i >= 11) {
            f334a = new ah();
        } else {
            f334a = new ag();
        }
    }

    public static void a(LayoutInflater layoutInflater, an anVar) {
        f334a.a(layoutInflater, anVar);
    }

    public static an a(LayoutInflater layoutInflater) {
        return f334a.a(layoutInflater);
    }
}
