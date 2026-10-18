package android.support.v7.widget;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class v implements android.support.v7.view.menu.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionMenuView f868a;

    private v(ActionMenuView actionMenuView) {
        this.f868a = actionMenuView;
    }

    /* synthetic */ v(ActionMenuView actionMenuView, byte b2) {
        this(actionMenuView);
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(android.support.v7.view.menu.i iVar, MenuItem menuItem) {
        w wVar;
        w wVar2;
        wVar = this.f868a.l;
        if (wVar != null) {
            wVar2 = this.f868a.l;
            if (wVar2.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(android.support.v7.view.menu.i iVar) {
        android.support.v7.view.menu.j jVar;
        android.support.v7.view.menu.j jVar2;
        jVar = this.f868a.g;
        if (jVar != null) {
            jVar2 = this.f868a.g;
            jVar2.a(iVar);
        }
    }
}
