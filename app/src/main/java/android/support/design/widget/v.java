package android.support.design.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class v extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f147a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f148b = null;
    final /* synthetic */ u c;

    v(u uVar, boolean z, af afVar) {
        this.c = uVar;
        this.f147a = z;
    }

    @Override // android.support.design.widget.b, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.c.p = true;
    }

    @Override // android.support.design.widget.b, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.c.p = false;
        this.c.k.a(8, this.f147a);
    }
}
