package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class at implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.finsky.protos.aa f2099b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ab d;

    at(ab abVar, String str, com.google.android.finsky.protos.aa aaVar, long j) {
        this.d = abVar;
        this.f2098a = str;
        this.f2099b = aaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f2063a.a(this.f2098a, this.f2099b, this.c);
    }
}
