package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class ak implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2080a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2081b;
    final /* synthetic */ ab c;

    ak(ab abVar, String str, int i) {
        this.c = abVar;
        this.f2080a = str;
        this.f2081b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.e(this.f2080a, this.f2081b);
    }
}
