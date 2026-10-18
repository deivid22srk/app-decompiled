package com.google.android.finsky.setup;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardFinalHoldActivity f4669a;

    n(SetupWizardFinalHoldActivity setupWizardFinalHoldActivity) {
        this.f4669a = setupWizardFinalHoldActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        FinskyLog.c("Watchdog fired, skipping hold.", new Object[0]);
        this.f4669a.a(1);
        com.google.android.finsky.a.y b2 = com.google.android.finsky.a.i.b();
        b2.f1511a = 126;
        b2.f1512b = true;
        str = this.f4669a.j;
        if (str != null) {
            str2 = this.f4669a.j;
            b2.c = str2;
            b2.d = true;
        }
        FinskyApp.a().h().b(b2);
    }
}
