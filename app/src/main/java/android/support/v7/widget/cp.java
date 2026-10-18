package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class cp {

    /* renamed from: a, reason: collision with root package name */
    int f742a;

    /* renamed from: b, reason: collision with root package name */
    int f743b;
    boolean c;
    final /* synthetic */ LinearLayoutManager d;

    cp(LinearLayoutManager linearLayoutManager) {
        this.d = linearLayoutManager;
    }

    final void a() {
        this.f743b = this.c ? this.d.j.c() : this.d.j.b();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f742a + ", mCoordinate=" + this.f743b + ", mLayoutFromEnd=" + this.c + '}';
    }

    public final void a(View view) {
        if (this.c) {
            this.f743b = this.d.j.b(view) + this.d.j.a();
        } else {
            this.f743b = this.d.j.a(view);
        }
        this.f742a = LinearLayoutManager.a(view);
    }
}
