package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f2089b;
    public final /* synthetic */ ab c;

    ao(ab abVar, String str, String[] strArr) {
        this.c = abVar;
        this.f2088a = str;
        this.f2089b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.b(this.f2088a, this.f2089b);
    }
}
