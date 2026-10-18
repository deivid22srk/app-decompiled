package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f2115a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2116b;
    final /* synthetic */ int c;
    final /* synthetic */ c d;

    h(c cVar, k kVar, int i, int i2) {
        this.d = cVar;
        this.f2115a = kVar;
        this.f2116b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2115a.a(this.f2116b == this.c);
    }
}
