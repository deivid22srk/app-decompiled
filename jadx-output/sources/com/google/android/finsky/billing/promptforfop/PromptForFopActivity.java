package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class PromptForFopActivity extends a implements g {
    public static Intent a(Account account, byte[] bArr) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) PromptForFopActivity.class);
        a(account, bArr, intent);
        return intent;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int g() {
        return R.layout.prompt_for_fop_activity;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final Fragment i() {
        return b.a(this.k, this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 1001;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final void a(int i, int i2) {
        d().a().b(R.id.content_frame, f.a(this.k.name, getString(i), i2), "PromptForFopBaseActivity.fragment").b();
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int j() {
        return 354;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int k() {
        return 356;
    }

    @Override // com.google.android.finsky.billing.promptforfop.a
    protected final int l() {
        return 355;
    }

    @Override // com.google.android.finsky.billing.promptforfop.g
    public final void m() {
        setResult(-1);
        finish();
    }
}
