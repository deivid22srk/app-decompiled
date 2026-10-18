package android.support.v7.widget;

/* loaded from: classes.dex */
final class r implements android.support.v7.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f864a;

    private r(k kVar) {
        this.f864a = kVar;
    }

    /* synthetic */ r(k kVar, byte b2) {
        this(kVar);
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(android.support.v7.view.menu.i iVar) {
        if (iVar == null) {
            return false;
        }
        this.f864a.s = ((android.support.v7.view.menu.ad) iVar).getItem().getItemId();
        android.support.v7.view.menu.y yVar = this.f864a.f;
        if (yVar != null) {
            return yVar.a(iVar);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.y
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        if (iVar instanceof android.support.v7.view.menu.ad) {
            ((android.support.v7.view.menu.ad) iVar).l.a(false);
        }
        android.support.v7.view.menu.y yVar = this.f864a.f;
        if (yVar != null) {
            yVar.a(iVar, z);
        }
    }
}
