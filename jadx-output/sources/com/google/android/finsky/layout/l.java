package com.google.android.finsky.layout;

import android.widget.ProgressBar;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppScreenshot f3286a;

    private l(AppScreenshot appScreenshot) {
        this.f3286a = appScreenshot;
    }

    /* synthetic */ l(AppScreenshot appScreenshot, byte b2) {
        this(appScreenshot);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar;
        progressBar = this.f3286a.d;
        progressBar.setVisibility(0);
    }
}
