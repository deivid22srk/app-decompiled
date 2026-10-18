package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class ca extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f725a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.support.v4.view.dy f726b;
    final /* synthetic */ bt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ca(bt btVar, cc ccVar, android.support.v4.view.dy dyVar) {
        super((byte) 0);
        this.c = btVar;
        this.f725a = ccVar;
        this.f726b = dyVar;
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void a(View view) {
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void b(View view) {
        this.f726b.a((android.support.v4.view.eo) null);
        android.support.v4.view.by.c(view, 1.0f);
        android.support.v4.view.by.a(view, 0.0f);
        android.support.v4.view.by.b(view, 0.0f);
        this.c.e(this.f725a.f729a);
        this.c.g.remove(this.f725a.f729a);
        this.c.c();
    }
}
