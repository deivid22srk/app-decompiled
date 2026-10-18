package com.google.android.finsky.setup;

import android.view.View;

/* loaded from: classes.dex */
final class aa implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardNavBar f4651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ VpaSelectionActivity f4652b;

    aa(VpaSelectionActivity vpaSelectionActivity, SetupWizardNavBar setupWizardNavBar) {
        this.f4652b = vpaSelectionActivity;
        this.f4651a = setupWizardNavBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4651a.f4642a.setOnClickListener(null);
        VpaSelectionActivity.f(this.f4652b);
        this.f4652b.h();
    }
}
