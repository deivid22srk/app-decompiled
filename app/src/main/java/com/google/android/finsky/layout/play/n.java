package com.google.android.finsky.layout.play;

import android.os.Handler;

/* loaded from: classes.dex */
public final class n implements android.support.v4.app.ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3505a;

    public n(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3505a = finskyDrawerLayout;
    }

    @Override // android.support.v4.app.ac
    public final void a() {
        Handler handler;
        Runnable runnable;
        handler = this.f3505a.C;
        runnable = this.f3505a.B;
        handler.post(runnable);
    }
}
