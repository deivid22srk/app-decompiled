package android.support.v4.view;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class aw implements bb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f340a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ av f341b;

    aw(av avVar, ay ayVar) {
        this.f341b = avVar;
        this.f340a = ayVar;
    }

    @Override // android.support.v4.view.bb
    public final boolean a(MenuItem menuItem) {
        return this.f340a.a(menuItem);
    }

    @Override // android.support.v4.view.bb
    public final boolean b(MenuItem menuItem) {
        return this.f340a.b(menuItem);
    }
}
