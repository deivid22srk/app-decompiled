package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.deivid22srk.store.R;
import com.google.android.finsky.billing.v;
import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public abstract class a extends com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c implements e {
    protected Account k;
    protected byte[] l;

    protected abstract void a(int i, int i2);

    protected abstract int g();

    protected abstract Fragment i();

    protected abstract int j();

    protected abstract int k();

    protected abstract int l();

    protected static void a(Account account, byte[] bArr, Intent intent) {
        intent.putExtra("PromptForFopBaseActivity.account", account);
        a(intent, account.name);
        intent.putExtra("PromptForFopBaseActivity.server_logs_cookie", bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        setContentView(g());
        this.k = (Account) getIntent().getParcelableExtra("PromptForFopBaseActivity.account");
        if (this.k == null) {
            this.k = com.google.android.finsky.api.a.a(this.p, this);
        }
        this.l = getIntent().getByteArrayExtra("PromptForFopBaseActivity.server_logs_cookie");
        if (bundle == null) {
            o<Integer> b2 = bg.M.b(this.k.name);
            b2.a((o<Integer>) Integer.valueOf(b2.a().intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        if (d().a("PromptForFopBaseActivity.fragment") == null) {
            d().a().a(R.id.content_frame, i(), "PromptForFopBaseActivity.fragment").b();
        }
    }

    @Override // com.google.android.finsky.billing.promptforfop.e
    public final void n() {
        bg.N.b(this.k.name).a((o<Boolean>) true);
        a(R.string.setup_account_success, 1005);
    }

    @Override // com.google.android.finsky.billing.promptforfop.e
    public final void o() {
        this.q.a(j(), this.l);
        v.b(this.k.name);
        setResult(-1);
        finish();
    }

    @Override // com.google.android.finsky.billing.promptforfop.e
    public final void p() {
        this.q.a(k(), this.l);
        a(R.string.setup_account_fatal_error, 1004);
    }

    @Override // com.google.android.finsky.billing.promptforfop.e
    public final void q() {
        this.q.a(l(), this.l);
        v.a(this.k.name);
        a(R.string.setup_account_success, 1003);
    }
}
