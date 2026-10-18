package android.support.design.widget;

import android.support.v4.view.er;
import android.view.View;

/* loaded from: classes.dex */
final class h implements android.support.v4.view.bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f136a;

    h(CoordinatorLayout coordinatorLayout) {
        this.f136a = coordinatorLayout;
    }

    @Override // android.support.v4.view.bm
    public final er a(View view, er erVar) {
        this.f136a.setWindowInsets(erVar);
        return erVar.f();
    }
}
