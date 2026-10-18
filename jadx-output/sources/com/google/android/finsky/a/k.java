package com.google.android.finsky.a;

import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f1488a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f1489b;

    k(long j, cy cyVar) {
        this.f1488a = j;
        this.f1489b = cyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a(this.f1488a, this.f1489b, false);
    }
}
