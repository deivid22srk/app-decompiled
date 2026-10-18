package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2071b;
    public final /* synthetic */ ab c;

    af(ab abVar, String str, String str2) {
        this.c = abVar;
        this.f2070a = str;
        this.f2071b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.b(this.f2070a, this.f2071b);
    }
}
