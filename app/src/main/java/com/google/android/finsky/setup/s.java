package com.google.android.finsky.setup;

import android.view.View;
import com.google.android.finsky.protos.nu;

/* loaded from: classes.dex */
final class s implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardRestoreAppsActivity f4676a;

    s(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        this.f4676a = setupWizardRestoreAppsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.apkg.i iVar;
        i iVar2;
        boolean i;
        nu[] nuVarArr;
        int i2;
        i iVar3;
        iVar = this.f4676a.z;
        iVar.a(2510, (byte[]) null, this.f4676a);
        iVar2 = this.f4676a.o;
        if (iVar2.as == 5) {
            this.f4676a.g();
            return;
        }
        i = this.f4676a.i();
        if (!i) {
            nuVarArr = this.f4676a.v;
            i2 = this.f4676a.r;
            long j = nuVarArr[i2].f4185a;
            SetupWizardRestoreAppsActivity.i(this.f4676a);
            SetupWizardRestoreAppsActivity.j(this.f4676a);
            iVar3 = this.f4676a.o;
            iVar3.a(j);
        }
    }
}
