package com.google.android.finsky.detailspage;

import com.google.android.finsky.utils.hh;

/* loaded from: classes.dex */
final class ch implements hh {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cb f2580b;

    ch(cb cbVar, boolean z) {
        this.f2580b = cbVar;
        this.f2579a = z;
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a(int i) {
        ((ci) this.f2580b.f2559b).k = false;
        if (this.f2579a) {
            this.f2580b.j();
        } else {
            this.f2580b.k();
        }
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a() {
        boolean z;
        ((ci) this.f2580b.f2559b).k = false;
        z = this.f2580b.w;
        if (z) {
            cb.e(this.f2580b);
        } else {
            this.f2580b.a(false);
        }
    }
}
