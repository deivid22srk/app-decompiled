package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2076a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f2077b;
    final /* synthetic */ ab c;

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
