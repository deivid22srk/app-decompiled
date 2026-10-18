package com.google.android.finsky.setup;

import android.content.Intent;
import android.view.View;
import com.google.android.finsky.protos.nu;

/* loaded from: classes.dex */
final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardNavBar f4674a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SetupWizardRestoreAppsActivity f4675b;

    r(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity, SetupWizardNavBar setupWizardNavBar) {
        this.f4675b = setupWizardRestoreAppsActivity;
        this.f4674a = setupWizardNavBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean i;
        nu[] nuVarArr;
        int i2;
        this.f4674a.f4642a.setOnClickListener(null);
        i = this.f4675b.i();
        if (i) {
            SetupWizardRestoreAppsActivity.b(this.f4675b);
            return;
        }
        SetupWizardRestoreAppsActivity.c(this.f4675b);
        Intent intent = new Intent();
        nuVarArr = this.f4675b.v;
        i2 = this.f4675b.r;
        intent.putExtra("restoreToken", nuVarArr[i2].e);
        this.f4675b.setResult(-1, intent);
        this.f4675b.finish();
    }
}
