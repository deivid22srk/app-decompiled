package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class ek implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1719a;

    ek(MainActivity mainActivity) {
        this.f1719a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dj.a(this.f1719a.getResources(), this.f1719a.d(), "dialog.gaia_recovery_migration");
    }
}
