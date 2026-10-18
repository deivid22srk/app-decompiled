package android.support.v7.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.fx;

/* loaded from: classes.dex */
final class ai implements g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f477a;

    private ai(ah ahVar) {
        this.f477a = ahVar;
    }

    /* synthetic */ ai(ah ahVar, byte b2) {
        this(ahVar);
    }

    @Override // android.support.v7.a.g
    public final Context b() {
        return this.f477a.l();
    }

    @Override // android.support.v7.a.g
    public final boolean c() {
        a a2 = this.f477a.a();
        return (a2 == null || (a2.a() & 4) == 0) ? false : true;
    }

    @Override // android.support.v7.a.g
    public final void a(Drawable drawable, int i) {
        a a2 = this.f477a.a();
        if (a2 != null) {
            a2.c(drawable);
            a2.b(i);
        }
    }

    @Override // android.support.v7.a.g
    public final void a(int i) {
        a a2 = this.f477a.a();
        if (a2 != null) {
            a2.b(i);
        }
    }

    @Override // android.support.v7.a.g
    public final Drawable a() {
        fx a2 = fx.a(this.f477a.l(), null, new int[]{android.support.v7.b.b.homeAsUpIndicator});
        Drawable a3 = a2.a(0);
        a2.f836a.recycle();
        return a3;
    }
}
