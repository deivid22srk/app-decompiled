package android.support.v7.a;

import android.support.v4.view.by;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
final class ay implements android.support.v7.view.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f488a;

    /* renamed from: b, reason: collision with root package name */
    private android.support.v7.view.c f489b;

    public ay(ap apVar, android.support.v7.view.c cVar) {
        this.f488a = apVar;
        this.f489b = cVar;
    }

    @Override // android.support.v7.view.c
    public final boolean a(android.support.v7.view.b bVar, Menu menu) {
        return this.f489b.a(bVar, menu);
    }

    @Override // android.support.v7.view.c
    public final boolean b(android.support.v7.view.b bVar, Menu menu) {
        return this.f489b.b(bVar, menu);
    }

    @Override // android.support.v7.view.c
    public final boolean a(android.support.v7.view.b bVar, MenuItem menuItem) {
        return this.f489b.a(bVar, menuItem);
    }

    @Override // android.support.v7.view.c
    public final void a(android.support.v7.view.b bVar) {
        this.f489b.a(bVar);
        if (this.f488a.s != null) {
            this.f488a.c.getDecorView().removeCallbacks(this.f488a.t);
        }
        if (this.f488a.r != null) {
            this.f488a.m();
            this.f488a.u = by.t(this.f488a.r).a(0.0f);
            this.f488a.u.a(new az(this));
        }
        this.f488a.q = null;
    }
}
