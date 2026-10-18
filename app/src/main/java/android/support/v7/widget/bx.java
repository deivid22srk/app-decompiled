package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class bx extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eq f718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.support.v4.view.dy f719b;
    final /* synthetic */ bt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(bt btVar, eq eqVar, android.support.v4.view.dy dyVar) {
        super((byte) 0);
        this.c = btVar;
        this.f718a = eqVar;
        this.f719b = dyVar;
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void a(View view) {
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void b(View view) {
        this.f719b.a((android.support.v4.view.eo) null);
        android.support.v4.view.by.c(view, 1.0f);
        this.c.e(this.f718a);
        this.c.f.remove(this.f718a);
        this.c.c();
    }
}
