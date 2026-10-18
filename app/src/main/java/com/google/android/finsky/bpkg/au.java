package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class au implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2101b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ab d;

    au(ab abVar, String str, int i, String str2) {
        this.d = abVar;
        this.f2100a = str;
        this.f2101b = i;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.f2063a.a(this.f2100a, this.f2101b, this.c);
    }
}
