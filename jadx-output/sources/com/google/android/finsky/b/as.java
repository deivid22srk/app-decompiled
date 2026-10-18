package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class as implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2096a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2097b;
    final /* synthetic */ ab c;

    as(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2096a = str;
        this.f2097b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.c(this.f2096a, this.f2097b);
    }
}
