package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public class SetupWizardPromptForFopActivity extends a {
    private SetupWizardUtils.SetupWizardParams m;

    public static Intent a(Account account) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SetupWizardPromptForFopActivity.class);
        a(account, (byte[]) null, intent);
        intent.putExtra("via_create_intent", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.a
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (!intent.getBooleanExtra("via_create_intent", false) && "com.deivid22srk.store.billing.ADD_CREDIT_CARD".equals(intent.getAction())) {
            if (!intent.hasExtra("authAccount")) {
                FinskyLog.d("No account name passed.", new Object[0]);
                setResult(-1);
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("authAccount");
            Account a2 = com.google.android.finsky.api.a.a(stringExtra, this);
            if (a2 == null) {
                FinskyLog.d("Cannot find the account: %s", stringExtra);
                setResult(-1);
                finish();
                return;
            }
            a(a2, (byte[]) null, intent);
        }
        this.m = (SetupWizardUtils.SetupWizardParams) intent.getParcelableExtra("setup_wizard_params");
        if (this.m == null) {
            this.m = new SetupWizardUtils.SetupWizardParams(intent);
        }
        setTheme(this.m.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        super.onCreate(bundle);
        ((TextView) findViewById(R.id.title)).setText(R.string.setup_wizard_play_add_fop_title);
        SetupWizardUtils.a(this, this.m, 0, false, false, false);
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int g() {
        return R.layout.setup_wizard_play_frame;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final Fragment i() {
        return h.a(this.k, this.l, this.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 892;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final void a(int i, int i2) {
        setResult(-1);
        finish();
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int j() {
        return 364;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int k() {
        return 366;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int l() {
        return 365;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        SetupWizardUtils.a((Activity) this, false);
    }
}
