package com.google.android.play.headerlist;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6899a;

    c(PlayHeaderListLayout playHeaderListLayout) {
        this.f6899a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6899a.a(true, true);
    }
}
