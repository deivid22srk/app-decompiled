package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2086a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2087b;
    final /* synthetic */ ab c;

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
