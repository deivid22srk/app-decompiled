package android.support.v7.a;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class bk implements android.support.v7.view.menu.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f507a;

    private bk(bg bgVar) {
        this.f507a = bgVar;
    }

    /* synthetic */ bk(bg bgVar, byte b2) {
        this(bgVar);
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(android.support.v7.view.menu.i iVar, MenuItem menuItem) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(android.support.v7.view.menu.i iVar) {
        if (this.f507a.c != null) {
            if (this.f507a.f501a.i()) {
                this.f507a.c.onPanelClosed(108, iVar);
            } else if (this.f507a.c.onPreparePanel(0, null, iVar)) {
                this.f507a.c.onMenuOpened(108, iVar);
            }
        }
    }
}
