package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3503a;

    l(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3503a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3503a.e();
    }
}
