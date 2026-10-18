package android.support.v4.d.a;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f270b;

    /* renamed from: a, reason: collision with root package name */
    public Context f271a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f271a = context;
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f270b = new b();
        } else {
            f270b = new d();
        }
    }
}
