package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class dt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScreenshotGallery f3240a;

    dt(ScreenshotGallery screenshotGallery) {
        this.f3240a = screenshotGallery;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.adapters.ag agVar;
        agVar = this.f3240a.h;
        agVar.d.notifyInvalidated();
    }
}
