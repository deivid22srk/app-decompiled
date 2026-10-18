package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class bn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f6354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f6355b;

    bn(bm bmVar, u uVar) {
        this.f6355b = bmVar;
        this.f6354a = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6355b.c.b()) {
            return;
        }
        this.f6355b.c.l().f.a("Connected to service");
        this.f6355b.c.a(this.f6354a);
    }
}
