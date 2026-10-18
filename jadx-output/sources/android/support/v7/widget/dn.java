package android.support.v7.widget;

/* loaded from: classes.dex */
final class dn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f769a;

    dn(RecyclerView recyclerView) {
        this.f769a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        z = this.f769a.f;
        if (z && !this.f769a.isLayoutRequested()) {
            z2 = this.f769a.g;
            if (!z2) {
                this.f769a.j();
            } else {
                RecyclerView.c(this.f769a);
            }
        }
    }
}
