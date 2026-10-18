package android.support.v4.a;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f155a;

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            f155a = new d();
        } else {
            f155a = new c();
        }
    }

    public static void a(View view) {
        f155a.a(view);
    }
}
