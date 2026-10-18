package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f2077b;
    public final /* synthetic */ ab c;

    ai(ab abVar, String str, String[] strArr) {
        this.c = abVar;
        this.f2076a = str;
        this.f2077b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.a(this.f2076a, this.f2077b);
    }
}
