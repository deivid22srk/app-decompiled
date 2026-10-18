package android.support.v7.widget;

/* loaded from: classes.dex */
final class ea implements dy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f781a;

    private ea(RecyclerView recyclerView) {
        this.f781a = recyclerView;
    }

    /* synthetic */ ea(RecyclerView recyclerView, byte b2) {
        this(recyclerView);
    }

    @Override // android.support.v7.widget.dy
    public final void a(eq eqVar) {
        eqVar.a(true);
        if (eqVar.g != null && eqVar.h == null) {
            eqVar.g = null;
        }
        eqVar.h = null;
        if (!eq.g(eqVar) && !RecyclerView.c(this.f781a, eqVar.f795a) && eqVar.n()) {
            this.f781a.removeDetachedView(eqVar.f795a, false);
        }
    }
}
