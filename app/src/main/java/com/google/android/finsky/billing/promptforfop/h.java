package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public final class h extends b {
    private SetupWizardUtils.SetupWizardParams h;

    public static Fragment a(Account account, byte[] bArr, SetupWizardUtils.SetupWizardParams setupWizardParams) {
        h hVar = new h();
        Bundle b2 = b(account, bArr);
        b2.putParcelable("setup_wizard_params", setupWizardParams);
        hVar.f(b2);
        return hVar;
    }

    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.h = (SetupWizardUtils.SetupWizardParams) this.r.getParcelable("setup_wizard_params");
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final int K() {
        return R.layout.setup_wizard_prompt_for_fop_fragment;
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final void a(View view) {
        if (view instanceof Button) {
            ((Button) view).setText(f_(R.string.continue_text));
        } else {
            FinskyLog.e("Unexpected continue button type: %s", view.getClass().getSimpleName());
        }
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final int L() {
        return R.string.setup_wizard_setup_account_primer;
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final int M() {
        return R.layout.setup_wizard_fop_entry;
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final int I() {
        return 893;
    }

    @Override // com.google.android.finsky.billing.promptforfop.b
    protected final int J() {
        return SetupWizardUtils.a() ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final SetupWizardUtils.SetupWizardParams y() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int A() {
        return 360;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int B() {
        return 361;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int C() {
        return 362;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int D() {
        return 363;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int F() {
        return 367;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.promptforfop.b, com.google.android.finsky.billing.m
    public final int H() {
        return 3;
    }
}
