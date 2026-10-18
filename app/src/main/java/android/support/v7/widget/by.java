package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class by extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eq f720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.support.v4.view.dy f721b;
    final /* synthetic */ bt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(bt btVar, eq eqVar, android.support.v4.view.dy dyVar) {
        super((byte) 0);
        this.c = btVar;
        this.f720a = eqVar;
        this.f721b = dyVar;
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void a(View view) {
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void c(View view) {
        android.support.v4.view.by.c(view, 1.0f);
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void b(View view) {
        this.f721b.a((android.support.v4.view.eo) null);
        this.c.e(this.f720a);
        this.c.d.remove(this.f720a);
        this.c.c();
    }
}
