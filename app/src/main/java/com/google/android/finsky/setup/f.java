package com.google.android.finsky.setup;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySetupService f4659a;

    f(PlaySetupService playSetupService) {
        this.f4659a = playSetupService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyApp.a().k.a();
    }
}
