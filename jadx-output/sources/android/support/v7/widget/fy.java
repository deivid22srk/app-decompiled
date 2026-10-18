package android.support.v7.widget;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class fy implements w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f838a;

    fy(Toolbar toolbar) {
        this.f838a = toolbar;
    }

    @Override // android.support.v7.widget.w
    public final boolean a(MenuItem menuItem) {
        gd gdVar;
        gd gdVar2;
        gdVar = this.f838a.I;
        if (gdVar == null) {
            return false;
        }
        gdVar2 = this.f838a.I;
        return gdVar2.a(menuItem);
    }
}
