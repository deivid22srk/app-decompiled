package com.google.android.finsky.setup;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SetupWizardFinalHoldActivity f4667b;

    l(SetupWizardFinalHoldActivity setupWizardFinalHoldActivity, View view) {
        this.f4667b = setupWizardFinalHoldActivity;
        this.f4666a = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f4666a.setSystemUiVisibility(this.f4666a.getSystemUiVisibility() | 5634);
        return true;
    }
}
