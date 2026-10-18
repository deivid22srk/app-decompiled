package com.google.android.finsky.activities;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1717a;

    ei(MainActivity mainActivity) {
        this.f1717a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new com.google.android.finsky.billing.ai().a(FinskyApp.a().j(), null);
    }
}
