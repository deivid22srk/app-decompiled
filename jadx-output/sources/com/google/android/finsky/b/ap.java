package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class ap implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2091b;
    final /* synthetic */ ab c;

    ap(ab abVar, String str, String str2) {
        this.c = abVar;
        this.f2090a = str;
        this.f2091b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.e(this.f2090a, this.f2091b);
    }
}
