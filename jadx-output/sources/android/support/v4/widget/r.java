package android.support.v4.widget;

import android.view.View;

/* loaded from: classes.dex */
final class r extends android.support.v4.view.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DrawerLayout f465b;

    r(DrawerLayout drawerLayout) {
        this.f465b = drawerLayout;
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.a.j jVar) {
        super.a(view, jVar);
        if (!DrawerLayout.h(view)) {
            jVar.a((View) null);
        }
    }
}
