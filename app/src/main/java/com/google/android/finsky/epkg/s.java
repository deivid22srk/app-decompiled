package com.google.android.finsky.epkg;

import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayHeaderListLayout f2769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2770b;

    s(q qVar, PlayHeaderListLayout playHeaderListLayout) {
        this.f2770b = qVar;
        this.f2769a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2769a.setHeaderShadowMode(this.f2770b.E());
    }
}
