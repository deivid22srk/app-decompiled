package com.google.android.finsky.activities;

import com.google.android.finsky.layout.play.PlayHighlightsBannerView;

/* loaded from: classes.dex */
final class dq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Cdo f1692a;

    dq(Cdo cdo) {
        this.f1692a = cdo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn dnVar;
        PlayHighlightsBannerView playHighlightsBannerView;
        dn dnVar2;
        int i;
        dnVar = this.f1692a.d;
        if (dnVar != null) {
            playHighlightsBannerView = this.f1692a.c;
            if (!playHighlightsBannerView.b(this.f1692a.e)) {
                dnVar2 = this.f1692a.d;
                i = this.f1692a.r;
                dnVar2.b(i);
            }
        }
    }
}
