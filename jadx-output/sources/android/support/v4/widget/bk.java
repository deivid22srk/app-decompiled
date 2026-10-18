package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class bk extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f442b;
    final /* synthetic */ SwipeRefreshLayout c;

    bk(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.f441a = i;
        this.f442b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ak akVar;
        akVar = this.c.C;
        akVar.setAlpha((int) (this.f441a + ((this.f442b - this.f441a) * f)));
    }
}
