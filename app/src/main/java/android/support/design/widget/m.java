package android.support.design.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class m implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f140a;

    m(CoordinatorLayout coordinatorLayout) {
        this.f140a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f140a.a(false);
        return true;
    }
}
