package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2087b;
    public final /* synthetic */ ab c;

    an(ab abVar, String str, String str2) {
        this.c = abVar;
        this.f2086a = str;
        this.f2087b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.d(this.f2086a, this.f2087b);
    }
}
