package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class p extends cy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar, View view, k kVar) {
        super(view);
        this.f863b = oVar;
        this.f862a = kVar;
    }

    @Override // android.support.v7.widget.cy
    public final cu a() {
        if (this.f863b.f860a.o == null) {
            return null;
        }
        return this.f863b.f860a.o.c;
    }

    @Override // android.support.v7.widget.cy
    public final boolean b() {
        this.f863b.f860a.c();
        return true;
    }

    @Override // android.support.v7.widget.cy
    public final boolean c() {
        if (this.f863b.f860a.q != null) {
            return false;
        }
        this.f863b.f860a.d();
        return true;
    }
}
