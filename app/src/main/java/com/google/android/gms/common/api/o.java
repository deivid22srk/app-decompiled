package com.google.android.gms.common.api;

import com.google.android.gms.internal.mk;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f5581a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f5582b;

    o(n nVar, m mVar) {
        this.f5582b = nVar;
        this.f5581a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5582b.f5579a.isFinishing() || this.f5582b.f5579a.d().h()) {
            return;
        }
        this.f5582b.a(mk.b(this.f5582b.f5579a), this.f5581a);
    }
}
