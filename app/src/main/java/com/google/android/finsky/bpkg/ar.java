package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ar implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2095b;
    public final /* synthetic */ ab c;

    ar(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2094a = str;
        this.f2095b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.b(this.f2094a, this.f2095b);
    }
}
