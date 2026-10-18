package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class b implements android.support.v4.view.eo {

    /* renamed from: a, reason: collision with root package name */
    int f682a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f683b;
    private boolean c = false;

    protected b(a aVar) {
        this.f683b = aVar;
    }

    public final b a(android.support.v4.view.dy dyVar, int i) {
        this.f683b.f = dyVar;
        this.f682a = i;
        return this;
    }

    @Override // android.support.v4.view.eo
    public final void a(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.c = false;
    }

    @Override // android.support.v4.view.eo
    public final void b(View view) {
        if (!this.c) {
            this.f683b.f = null;
            super/*android.view.View*/.setVisibility(this.f682a);
        }
    }

    @Override // android.support.v4.view.eo
    public final void c(View view) {
        this.c = true;
    }
}
