package android.support.design.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class ae implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f80a;

    ae(ad adVar) {
        this.f80a = adVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f80a.e();
        return true;
    }
}
