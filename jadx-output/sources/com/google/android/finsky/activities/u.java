package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1872a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1873b;

    u(d dVar, boolean z) {
        this.f1873b = dVar;
        this.f1872a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1873b.e(this.f1872a);
    }
}
