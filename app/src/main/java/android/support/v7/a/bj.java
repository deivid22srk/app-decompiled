package android.support.v7.a;

/* loaded from: classes.dex */
final class bj implements android.support.v7.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f505a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f506b;

    private bj(bg bgVar) {
        this.f505a = bgVar;
    }

    /* synthetic */ bj(bg bgVar, byte b2) {
        this(bgVar);
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(android.support.v7.view.menu.i iVar) {
        if (this.f505a.c == null) {
            return false;
        }
        this.f505a.c.onMenuOpened(108, iVar);
        return true;
    }

    @Override // android.support.v7.view.menu.y
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        if (!this.f506b) {
            this.f506b = true;
            this.f505a.f501a.n();
            if (this.f505a.c != null) {
                this.f505a.c.onPanelClosed(108, iVar);
            }
            this.f506b = false;
        }
    }
}
