package com.google.android.finsky.billing.carrierbilling.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.setup.SetupWizardNavBar;

/* loaded from: classes.dex */
public final class n extends com.google.android.finsky.e.m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public p f2192a;

    /* renamed from: b, reason: collision with root package name */
    private Button f2193b;

    public static n a(String str) {
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        nVar.f(bundle);
        return nVar;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.setup_wizard_task_progress_view, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.verbose_message)).setText(g().getString(R.string.associating_device_message));
        SetupWizardNavBar setupWizardNavBar = ((com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b) f()).o;
        if (setupWizardNavBar != null) {
            setupWizardNavBar.f4642a.setEnabled(false);
            this.f2193b = setupWizardNavBar.f4643b;
        } else {
            this.f2193b = (Button) inflate.findViewById(R.id.cancel_button);
        }
        this.f2193b.setOnClickListener(this);
        this.f2193b.setText(R.string.device_association_back_button);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f2193b && this.f2192a != null) {
            this.f2192a.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return 897;
    }
}
