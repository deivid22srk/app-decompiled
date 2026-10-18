package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class bz extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eq f722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f723b;
    final /* synthetic */ int c;
    final /* synthetic */ android.support.v4.view.dy d;
    final /* synthetic */ bt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bz(bt btVar, eq eqVar, int i, int i2, android.support.v4.view.dy dyVar) {
        super((byte) 0);
        this.e = btVar;
        this.f722a = eqVar;
        this.f723b = i;
        this.c = i2;
        this.d = dyVar;
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void a(View view) {
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void c(View view) {
        if (this.f723b != 0) {
            android.support.v4.view.by.a(view, 0.0f);
        }
        if (this.c != 0) {
            android.support.v4.view.by.b(view, 0.0f);
        }
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void b(View view) {
        this.d.a((android.support.v4.view.eo) null);
        this.e.e(this.f722a);
        this.e.e.remove(this.f722a);
        this.e.c();
    }
}
