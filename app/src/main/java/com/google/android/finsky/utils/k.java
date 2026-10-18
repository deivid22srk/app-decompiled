package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f5049a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5050b;
    final /* synthetic */ m c;

    k(boolean z, String str, m mVar) {
        this.f5049a = z;
        this.f5050b = str;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dh.f4825a = System.currentTimeMillis();
        if (this.f5049a) {
            FinskyApp.a().k.b(this.f5050b, false);
        }
        if (this.c != null) {
            this.c.a(true);
        }
    }
}
