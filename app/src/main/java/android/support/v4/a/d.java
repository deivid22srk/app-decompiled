package android.support.v4.a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private TimeInterpolator f156a;

    d() {
    }

    @Override // android.support.v4.a.b
    public final void a(View view) {
        if (this.f156a == null) {
            this.f156a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.f156a);
    }
}
