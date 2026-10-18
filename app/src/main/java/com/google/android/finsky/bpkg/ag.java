package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2073b;
    public final /* synthetic */ ab c;

    ag(ab abVar, String str, long j) {
        this.c = abVar;
        this.f2072a = str;
        this.f2073b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.b(this.f2072a, this.f2073b);
    }
}
