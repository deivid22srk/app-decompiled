package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ak implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2081b;
    public final /* synthetic */ ab c;

    ak(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2080a = str;
        this.f2081b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.e(this.f2080a, this.f2081b);
    }
}
