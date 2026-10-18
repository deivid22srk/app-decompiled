package com.google.android.finsky.setup;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.vending.R;
import com.google.android.finsky.activities.go;
import com.google.android.finsky.protos.nu;
import com.google.android.finsky.utils.ParcelableProtoArray;

/* loaded from: classes.dex */
public class SetupWizardRestoreDeviceDialogView extends LinearLayout implements go {

    /* renamed from: a, reason: collision with root package name */
    private int f4648a;

    public SetupWizardRestoreDeviceDialogView(Context context) {
        super(context);
    }

    public SetupWizardRestoreDeviceDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        this.f4648a = bundle.getInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition", 0) + 1;
        nu[] nuVarArr = (nu[]) ((ParcelableProtoArray) bundle.getParcelable("SetupWizardRestoreDeviceDialogView.selectedDevices")).f4713a;
        ListView listView = (ListView) findViewById(R.id.setup_wizard_device_list);
        listView.setChoiceMode(1);
        listView.setAdapter((ListAdapter) new v(getContext(), nuVarArr));
        listView.setItemChecked(this.f4648a, true);
        listView.setOnItemClickListener(new u(this));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SetupWizardRestoreDeviceDialogView.parent_instance_state", super.onSaveInstanceState());
        bundle.putInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition", this.f4648a);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f4648a = bundle.getInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition");
            super.onRestoreInstanceState(bundle.getParcelable("SetupWizardRestoreDeviceDialogView.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        Bundle bundle = new Bundle();
        bundle.putInt("SetupWizardRestoreDeviceDialogView.selectedDevicePosition", this.f4648a - 1);
        return bundle;
    }
}
