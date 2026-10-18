package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class bp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f6358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f6359b;

    bp(bm bmVar, u uVar) {
        this.f6359b = bmVar;
        this.f6358a = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6359b.c.b()) {
            return;
        }
        this.f6359b.c.l().f.a("Connected to remote service");
        this.f6359b.c.a(this.f6358a);
    }
}
