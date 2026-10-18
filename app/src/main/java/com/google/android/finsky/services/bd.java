package com.google.android.finsky.services;

import com.google.android.finsky.protos.lo;

/* loaded from: classes.dex */
final class bd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lo f4611a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.a f4612b;
    final /* synthetic */ bc c;

    bd(bc bcVar, lo loVar, com.google.android.finsky.bpkg.a aVar) {
        this.c = bcVar;
        this.f4611a = loVar;
        this.f4612b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VpaService.a(this.f4611a, this.f4612b, this.c.f4609a);
        VpaService.d(this.c.f4610b);
        VpaService.c(this.c.f4610b);
    }
}
