package com.google.android.finsky.setup;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardRestoreDeviceDialogView f4678a;

    u(SetupWizardRestoreDeviceDialogView setupWizardRestoreDeviceDialogView) {
        this.f4678a = setupWizardRestoreDeviceDialogView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4678a.f4648a = i;
    }
}
