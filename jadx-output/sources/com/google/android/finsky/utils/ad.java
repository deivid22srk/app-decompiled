package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4727a;

    ad(ac acVar) {
        this.f4727a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.c.a(new ae(this.f4727a));
    }
}
