package com.google.android.finsky.setup;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardFinalHoldActivity f4668a;

    m(SetupWizardFinalHoldActivity setupWizardFinalHoldActivity) {
        this.f4668a = setupWizardFinalHoldActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b2;
        this.f4668a.c();
        b2 = this.f4668a.b();
        if (!b2) {
            this.f4668a.a(-1);
        }
    }
}
