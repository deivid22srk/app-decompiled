package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class cb extends ce {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.support.v4.view.dy f728b;
    final /* synthetic */ View c;
    final /* synthetic */ bt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cb(bt btVar, cc ccVar, android.support.v4.view.dy dyVar, View view) {
        super((byte) 0);
        this.d = btVar;
        this.f727a = ccVar;
        this.f728b = dyVar;
        this.c = view;
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void a(View view) {
    }

    @Override // android.support.v7.widget.ce, android.support.v4.view.eo
    public final void b(View view) {
        this.f728b.a((android.support.v4.view.eo) null);
        android.support.v4.view.by.c(this.c, 1.0f);
        android.support.v4.view.by.a(this.c, 0.0f);
        android.support.v4.view.by.b(this.c, 0.0f);
        this.d.e(this.f727a.f730b);
        this.d.g.remove(this.f727a.f730b);
        this.d.c();
    }
}
