package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public class SetupWizardRedeemCodeActivity extends d {
    private TextView k;
    private SetupWizardUtils.SetupWizardParams l;

    public static Intent a(String str, SetupWizardUtils.SetupWizardParams setupWizardParams) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SetupWizardRedeemCodeActivity.class);
        a(intent, str, 4, -1, null, 0, null, null);
        intent.putExtra("setup_wizard_params", setupWizardParams);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.a
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.l = (SetupWizardUtils.SetupWizardParams) getIntent().getParcelableExtra("setup_wizard_params");
        setTheme(this.l.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        super.onCreate(bundle);
        this.k = (TextView) findViewById(R.id.title);
        SetupWizardUtils.a(this, this.l, 0, true, true, true);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int g() {
        return R.layout.setup_wizard_play_frame;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int i() {
        return 1;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int j() {
        return u.a(this.l);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d, android.app.Activity
    public void finish() {
        super.finish();
        SetupWizardUtils.a((Activity) this, true);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    protected final int f() {
        return 898;
    }
}
