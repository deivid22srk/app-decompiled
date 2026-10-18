package com.google.android.finsky.setup;

import android.view.View;

/* loaded from: classes.dex */
final class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardNavBar f4673a;

    q(SetupWizardNavBar setupWizardNavBar) {
        this.f4673a = setupWizardNavBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4673a.getActivity().onBackPressed();
    }
}
