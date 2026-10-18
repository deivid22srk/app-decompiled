package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ah implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2075b;
    public final /* synthetic */ ab c;

    ah(ab abVar, String str, String str2) {
        this.c = abVar;
        this.f2074a = str;
        this.f2075b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.c(this.f2074a, this.f2075b);
    }
}
