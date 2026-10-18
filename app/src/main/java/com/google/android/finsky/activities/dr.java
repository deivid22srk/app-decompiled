package com.google.android.finsky.activities;

import com.google.android.finsky.layout.play.PlayHighlightsBannerView;

/* loaded from: classes.dex */
final class dr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Cdo f1694b;

    dr(Cdo cdo, int i) {
        this.f1694b = cdo;
        this.f1693a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn dnVar;
        PlayHighlightsBannerView playHighlightsBannerView;
        dn dnVar2;
        int i;
        dnVar = this.f1694b.d;
        if (dnVar != null) {
            playHighlightsBannerView = this.f1694b.c;
            if (playHighlightsBannerView.b(this.f1693a)) {
                dnVar2 = this.f1694b.d;
                i = this.f1694b.r;
                dnVar2.a(i, this.f1694b.b(this.f1693a));
            }
        }
    }
}
