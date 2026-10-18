package android.support.v7.a;

/* loaded from: classes.dex */
final class bl implements android.support.v7.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f508a;

    private bl(bg bgVar) {
        this.f508a = bgVar;
    }

    /* synthetic */ bl(bg bgVar, byte b2) {
        this(bgVar);
    }

    @Override // android.support.v7.view.menu.y
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        if (this.f508a.c != null) {
            this.f508a.c.onPanelClosed(0, iVar);
        }
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(android.support.v7.view.menu.i iVar) {
        if (iVar == null && this.f508a.c != null) {
            this.f508a.c.onMenuOpened(0, iVar);
            return true;
        }
        return true;
    }
}
