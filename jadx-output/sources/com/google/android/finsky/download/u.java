package com.google.android.finsky.download;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f2736a;

    u(s sVar) {
        this.f2736a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2736a.c.a();
        this.f2736a.f2733a.quit();
    }
}
