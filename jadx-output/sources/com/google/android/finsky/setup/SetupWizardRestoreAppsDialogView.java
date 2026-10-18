package com.google.android.finsky.setup;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.go;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.utils.ParcelableProtoArray;

/* loaded from: classes.dex */
public class SetupWizardRestoreAppsDialogView extends LinearLayout implements go {

    /* renamed from: a, reason: collision with root package name */
    private a f4645a;

    public SetupWizardRestoreAppsDialogView(Context context) {
        super(context);
    }

    public SetupWizardRestoreAppsDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        this.f4645a = new a((nv[]) ((ParcelableProtoArray) bundle.getParcelable("SetupWizardAppListDialog.backupDocs")).f4713a);
        this.f4645a.a(bundle);
        this.f4645a.a(getContext(), (ListView) findViewById(R.id.restore_apps_list));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SetupWizardRestoreAppsDialogView.parent_instance_state", super.onSaveInstanceState());
        this.f4645a.b(bundle);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f4645a.a(bundle);
            super.onRestoreInstanceState(bundle.getParcelable("SetupWizardRestoreAppsDialogView.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        Bundle bundle = new Bundle();
        this.f4645a.b(bundle);
        return bundle;
    }
}
