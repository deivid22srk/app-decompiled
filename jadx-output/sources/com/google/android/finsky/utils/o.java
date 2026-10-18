package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f5054a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5055b;
    final /* synthetic */ n c;

    o(n nVar, Runnable runnable, int i) {
        this.c = nVar;
        this.f5054a = runnable;
        this.f5055b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.a()) {
            this.f5054a.run();
        } else {
            this.c.a(this.f5054a, this.f5055b);
        }
    }
}
