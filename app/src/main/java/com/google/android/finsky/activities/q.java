package com.google.android.finsky.activities;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1866a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1867b;

    q(d dVar, boolean z) {
        this.f1867b = dVar;
        this.f1866a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1867b.l) {
            FinskyLog.a("onSaveInstanceState() called, not firing onReady().", new Object[0]);
            d.a(this.f1867b);
            this.f1867b.u = this.f1866a;
            return;
        }
        this.f1867b.b(this.f1866a);
    }
}
