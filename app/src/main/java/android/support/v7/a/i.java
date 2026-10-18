package android.support.v7.a;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
final class i extends android.support.v7.c.a.b implements j {

    /* renamed from: b, reason: collision with root package name */
    private final Activity f524b;

    public i(Activity activity, Context context) {
        super(context);
        this.f524b = activity;
    }

    @Override // android.support.v7.a.j
    public final void a(float f) {
        if (f == 1.0f) {
            a(true);
        } else if (f == 0.0f) {
            a(false);
        }
        b(f);
    }
}
