package com.google.android.play.headerlist;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6900a;

    d(PlayHeaderListLayout playHeaderListLayout) {
        this.f6900a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        runnable = this.f6900a.aF;
        if (runnable != null) {
            runnable2 = this.f6900a.aF;
            runnable2.run();
            PlayHeaderListLayout.g(this.f6900a);
        }
        this.f6900a.setBannerText((CharSequence) null);
    }
}
