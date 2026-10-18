package com.google.android.finsky.wear;

import android.content.Intent;

/* loaded from: classes.dex */
final class ah implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5078a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5079b;
    private int c;

    ah(WearSupportService wearSupportService, Intent intent) {
        this.f5079b = wearSupportService;
        this.f5078a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 2) {
            WearSupportService.a(this.f5079b);
            WearSupportService.a(this.f5079b, this.f5078a);
        }
    }
}
