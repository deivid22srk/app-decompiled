package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5140a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f5141b;

    o(n nVar, int i) {
        this.f5141b = nVar;
        this.f5140a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5141b.f5139b.a(this.f5141b.f5138a, m.a(this.f5140a));
    }
}
