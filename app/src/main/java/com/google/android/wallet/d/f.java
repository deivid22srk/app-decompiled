package com.google.android.wallet.d;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f7318a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7319b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ d e;

    f(d dVar, g gVar, String str, int i, String str2) {
        this.e = dVar;
        this.f7318a = gVar;
        this.f7319b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7318a.b(this.c);
    }
}
