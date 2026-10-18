package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class ad extends i implements SubMenu {
    public i l;
    private m m;

    public ad(Context context, i iVar, m mVar) {
        super(context);
        this.l = iVar;
        this.m = mVar;
    }

    @Override // android.support.v7.view.menu.i, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.i
    public final boolean b() {
        return this.l.b();
    }

    @Override // android.support.v7.view.menu.i
    public final boolean c() {
        return this.l.c();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // android.support.v7.view.menu.i
    public final void a(j jVar) {
        this.l.a(jVar);
    }

    @Override // android.support.v7.view.menu.i
    public final i k() {
        return this.l;
    }

    @Override // android.support.v7.view.menu.i
    final boolean a(i iVar, MenuItem menuItem) {
        return super.a(iVar, menuItem) || this.l.a(iVar, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // android.support.v7.view.menu.i
    public final boolean a(m mVar) {
        return this.l.a(mVar);
    }

    @Override // android.support.v7.view.menu.i
    public final boolean b(m mVar) {
        return this.l.b(mVar);
    }

    @Override // android.support.v7.view.menu.i
    public final String a() {
        int itemId = this.m != null ? this.m.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.a(android.support.v4.b.g.a(this.f592a, i));
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.a(this.f592a.getResources().getString(i));
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.a((CharSequence) null, (Drawable) null, view);
        return this;
    }
}
