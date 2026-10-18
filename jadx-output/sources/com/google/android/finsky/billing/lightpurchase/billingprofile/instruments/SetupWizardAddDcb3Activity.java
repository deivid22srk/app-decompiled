package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public class SetupWizardAddDcb3Activity extends a {
    public static Intent a(String str, cd cdVar, SetupWizardUtils.SetupWizardParams setupWizardParams) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SetupWizardAddDcb3Activity.class);
        a(str, cdVar, intent);
        intent.putExtra("InstrumentActivity.setup_wizard_params", setupWizardParams);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.a
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.a, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SetupWizardUtils.SetupWizardParams setupWizardParams = (SetupWizardUtils.SetupWizardParams) getIntent().getParcelableExtra("InstrumentActivity.setup_wizard_params");
        setTheme(setupWizardParams.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        super.onCreate(bundle);
        SetupWizardUtils.a(this, setupWizardParams, 0, true, true, true);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        SetupWizardUtils.a((Activity) this, true);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b
    protected final int j() {
        return R.layout.setup_wizard_play_frame;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b
    protected final int k() {
        return 1;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b, com.google.android.finsky.billing.g
    public final void b(int i) {
        findViewById(R.id.divider).setVisibility(4);
        findViewById(R.id.progress).setVisibility(0);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b, com.google.android.finsky.billing.g
    public final void S_() {
        findViewById(R.id.divider).setVisibility(0);
        findViewById(R.id.progress).setVisibility(4);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.a, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    protected final int f() {
        return 894;
    }
}
