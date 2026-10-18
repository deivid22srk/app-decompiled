package com.google.android.finsky.setup;

import android.os.Bundle;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.utils.ParcelableProtoArray;

/* loaded from: classes.dex */
final class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardRestoreAppsActivity f4677a;

    t(SetupWizardRestoreAppsActivity setupWizardRestoreAppsActivity) {
        this.f4677a = setupWizardRestoreAppsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.a.i iVar;
        int i;
        ParcelableProtoArray parcelableProtoArray;
        iVar = this.f4677a.z;
        iVar.a(2509, (byte[]) null, this.f4677a);
        gn gnVar = new gn();
        gnVar.b(R.layout.setup_wizard_restore_device_list_dialog).d(R.string.done).e(R.string.cancel).a(2501, null, 2503, 2504, FinskyApp.a().i()).a(null, 1, null);
        Bundle bundle = new Bundle();
        i = this.f4677a.r;
        bundle.putInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition", i);
        parcelableProtoArray = this.f4677a.w;
        bundle.putParcelable("SetupWizardRestoreDeviceDialogView.selectedDevices", parcelableProtoArray);
        gnVar.a(bundle);
        gnVar.b().a(this.f4677a.d(), "SetupWizardRestoreAppsActivity.backupDeviceDialog");
    }
}
