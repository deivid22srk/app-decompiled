package com.google.android.play.headerlist;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6898a;

    b(PlayHeaderListLayout playHeaderListLayout) {
        this.f6898a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6898a.a(false, true);
    }
}
