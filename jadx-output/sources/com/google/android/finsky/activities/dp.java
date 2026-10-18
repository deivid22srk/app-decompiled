package com.google.android.finsky.activities;

import com.google.android.finsky.layout.play.PlayHighlightsBannerView;

/* loaded from: classes.dex */
final class dp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Cdo f1691a;

    dp(Cdo cdo) {
        this.f1691a = cdo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn dnVar;
        PlayHighlightsBannerView playHighlightsBannerView;
        dn dnVar2;
        int i;
        dnVar = this.f1691a.d;
        if (dnVar != null) {
            playHighlightsBannerView = this.f1691a.c;
            if (!playHighlightsBannerView.b(this.f1691a.e)) {
                dnVar2 = this.f1691a.d;
                i = this.f1691a.r;
                dnVar2.b(i);
            }
        }
    }
}
