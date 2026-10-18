package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class am implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2085b;
    public final /* synthetic */ ab c;

    am(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2084a = str;
        this.f2085b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.f(this.f2084a, this.f2085b);
    }
}
