package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class ju implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jt f5044a;

    ju(jt jtVar) {
        this.f5044a = jtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        js.a(this.f5044a.f5043b, !this.f5044a.c, true);
    }
}
