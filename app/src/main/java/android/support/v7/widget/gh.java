package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class gh extends android.support.v4.view.ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gf f850b;
    private boolean c = false;

    gh(gf gfVar, int i) {
        this.f850b = gfVar;
        this.f849a = i;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        this.f850b.f845a.setVisibility(0);
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        if (!this.c) {
            this.f850b.f845a.setVisibility(this.f849a);
        }
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void c(View view) {
        this.c = true;
    }
}
