package android.support.v7.a;

import android.support.v7.widget.gd;
import android.view.MenuItem;

/* loaded from: classes.dex */
final class bi implements gd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f504a;

    bi(bg bgVar) {
        this.f504a = bgVar;
    }

    @Override // android.support.v7.widget.gd
    public final boolean a(MenuItem menuItem) {
        return this.f504a.c.onMenuItemSelected(0, menuItem);
    }
}
