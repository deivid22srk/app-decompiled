package android.support.v7.widget;

/* renamed from: android.support.v7.widget.do, reason: invalid class name */
/* loaded from: classes.dex */
final class Cdo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f770a;

    Cdo(RecyclerView recyclerView) {
        this.f770a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f770a.m != null) {
            this.f770a.m.a();
        }
        RecyclerView.e(this.f770a);
    }
}
