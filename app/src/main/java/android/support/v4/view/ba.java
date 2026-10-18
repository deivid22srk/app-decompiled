package android.support.v4.view;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class ba implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    private bb f349a;

    public ba(bb bbVar) {
        this.f349a = bbVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f349a.a(menuItem);
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f349a.b(menuItem);
    }
}
