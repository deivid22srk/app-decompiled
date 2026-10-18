package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f6290b;

    aa(z zVar, String str) {
        this.f6290b = zVar;
        this.f6289a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai d = this.f6290b.h.d();
        if (!d.t() || d.i) {
            this.f6290b.a(6, "Persisted config not initialized . Not logging error/warn.");
        } else {
            d.f6302b.a(this.f6289a, 1L);
        }
    }
}
