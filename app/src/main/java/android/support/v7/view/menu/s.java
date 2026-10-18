package android.support.v7.view.menu;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class s extends f<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(o oVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.f601a = oVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(this.f601a.a(menuItem));
    }
}
