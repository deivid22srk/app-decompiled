package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: b, reason: collision with root package name */
    private static final ag f418b;

    /* renamed from: a, reason: collision with root package name */
    private Object f419a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f418b = new ah();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f418b = new af();
        } else {
            f418b = new ae();
        }
    }

    public ad(Context context) {
        this.f419a = f418b.a(context);
    }

    public final void a(int i, int i2) {
        f418b.a(this.f419a, i, i2);
    }

    public final boolean a() {
        return f418b.a(this.f419a);
    }

    public final void b() {
        f418b.b(this.f419a);
    }

    public final boolean a(float f) {
        return f418b.a(this.f419a, f);
    }

    public final boolean a(float f, float f2) {
        return f418b.a(this.f419a, f, f2);
    }

    public final boolean c() {
        return f418b.c(this.f419a);
    }

    public final boolean a(int i) {
        return f418b.a(this.f419a, i);
    }

    public final boolean a(Canvas canvas) {
        return f418b.a(this.f419a, canvas);
    }
}
