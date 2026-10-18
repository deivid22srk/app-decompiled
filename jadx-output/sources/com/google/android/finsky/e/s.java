package com.google.android.finsky.e;

import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f2769a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f2770b;

    s(q qVar, PlayHeaderListLayout playHeaderListLayout) {
        this.f2770b = qVar;
        this.f2769a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2769a.setHeaderShadowMode(this.f2770b.E());
    }
}
