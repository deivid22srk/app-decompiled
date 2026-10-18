package com.google.android.finsky.setup;

import android.content.Intent;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f4656a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySetupService f4657b;

    d(PlaySetupService playSetupService, Intent intent) {
        this.f4657b = playSetupService;
        this.f4656a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlaySetupService.f(this.f4657b);
        if (!PlaySetupService.a(this.f4657b, this.f4656a)) {
            this.f4657b.b();
        }
    }
}
