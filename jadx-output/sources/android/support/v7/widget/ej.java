package android.support.v7.widget;

/* loaded from: classes.dex */
final class ej extends dv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f787a;

    private ej(RecyclerView recyclerView) {
        this.f787a = recyclerView;
    }

    /* synthetic */ ej(RecyclerView recyclerView, byte b2) {
        this(recyclerView);
    }

    @Override // android.support.v7.widget.dv
    public final void a() {
        this.f787a.a((String) null);
        dt unused = this.f787a.x;
        this.f787a.n.f = true;
        RecyclerView.n(this.f787a);
        if (!this.f787a.f628b.d()) {
            this.f787a.requestLayout();
        }
    }

    @Override // android.support.v7.widget.dv
    public final void a(int i) {
        this.f787a.a((String) null);
        af afVar = this.f787a.f628b;
        afVar.f648a.add(afVar.a(4, i, 1, null));
        afVar.g |= 4;
        if (afVar.f648a.size() == 1) {
            c();
        }
    }

    @Override // android.support.v7.widget.dv
    public final void a(int i, int i2) {
        this.f787a.a((String) null);
        af afVar = this.f787a.f628b;
        afVar.f648a.add(afVar.a(1, i, i2, null));
        afVar.g |= 1;
        if (afVar.f648a.size() == 1) {
            c();
        }
    }

    @Override // android.support.v7.widget.dv
    public final void b(int i) {
        this.f787a.a((String) null);
        af afVar = this.f787a.f628b;
        afVar.f648a.add(afVar.a(2, i, 1, null));
        afVar.g |= 2;
        if (afVar.f648a.size() == 1) {
            c();
        }
    }

    private void c() {
        boolean z;
        boolean z2;
        boolean z3;
        Runnable runnable;
        z = this.f787a.J;
        if (z) {
            z2 = this.f787a.D;
            if (z2) {
                z3 = this.f787a.C;
                if (z3) {
                    RecyclerView recyclerView = this.f787a;
                    runnable = this.f787a.v;
                    android.support.v4.view.by.a(recyclerView, runnable);
                    return;
                }
            }
        }
        RecyclerView.s(this.f787a);
        this.f787a.requestLayout();
    }
}
