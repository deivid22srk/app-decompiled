package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class dq implements gk {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f771a;

    dq(RecyclerView recyclerView) {
        this.f771a = recyclerView;
    }

    @Override // android.support.v7.widget.gk
    public final void a(eq eqVar, dz dzVar, dz dzVar2) {
        this.f771a.f627a.b(eqVar);
        RecyclerView.a(this.f771a, eqVar, dzVar, dzVar2);
    }

    @Override // android.support.v7.widget.gk
    public final void b(eq eqVar, dz dzVar, dz dzVar2) {
        RecyclerView.b(this.f771a, eqVar, dzVar, dzVar2);
    }

    @Override // android.support.v7.widget.gk
    public final void c(eq eqVar, dz dzVar, dz dzVar2) {
        boolean z;
        eqVar.a(false);
        z = this.f771a.h;
        if (z) {
            if (this.f771a.m.a(eqVar, eqVar, dzVar, dzVar2)) {
                this.f771a.r();
            }
        } else if (this.f771a.m.c(eqVar, dzVar, dzVar2)) {
            this.f771a.r();
        }
    }

    @Override // android.support.v7.widget.gk
    public final void a(eq eqVar) {
        ec ecVar = this.f771a.e;
        View view = eqVar.f795a;
        eh ehVar = this.f771a.f627a;
        bn bnVar = ecVar.p;
        int a2 = bnVar.f706a.a(view);
        if (a2 >= 0) {
            if (bnVar.f707b.d(a2)) {
                bnVar.b(view);
            }
            bnVar.f706a.a(a2);
        }
        ehVar.a(view);
    }
}
