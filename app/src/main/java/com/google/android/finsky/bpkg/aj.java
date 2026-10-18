package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2079b;
    public final /* synthetic */ ab c;

    aj(ab abVar, String str, long j) {
        this.c = abVar;
        this.f2078a = str;
        this.f2079b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.c(this.f2078a, this.f2079b);
    }
}
