package com.google.android.finsky.g;

/* loaded from: classes.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f2784a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2785b;
    final /* synthetic */ x c;

    aa(x xVar, af afVar, String str) {
        this.c = xVar;
        this.f2784a = afVar;
        this.f2785b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2784a.a(this.f2785b);
    }
}
