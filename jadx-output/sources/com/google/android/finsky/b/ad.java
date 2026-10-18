package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2066a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2067b;
    final /* synthetic */ ab c;

    ad(ab abVar, String str, String str2) {
        this.c = abVar;
        this.f2066a = str;
        this.f2067b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.a(this.f2066a, this.f2067b);
    }
}
