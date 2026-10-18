package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class gn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gm f4910a;

    gn(gm gmVar) {
        this.f4910a = gmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4910a.f4909b.a(this.f4910a.c.i, this.f4910a.c.h, false);
    }
}
