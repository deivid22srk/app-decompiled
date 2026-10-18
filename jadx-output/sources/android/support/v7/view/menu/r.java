package android.support.v7.view.menu;

import android.support.v4.view.ay;
import android.view.MenuItem;

/* loaded from: classes.dex */
final class r extends f<MenuItem.OnActionExpandListener> implements ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(o oVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.f600a = oVar;
    }

    @Override // android.support.v4.view.ay
    public final boolean a(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionExpand(this.f600a.a(menuItem));
    }

    @Override // android.support.v4.view.ay
    public final boolean b(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f600a.a(menuItem));
    }
}
