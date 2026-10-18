package com.google.android.finsky.activities;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;

/* loaded from: classes.dex */
final class cj extends com.google.android.finsky.navigationmanager.b {
    private Activity d;

    public cj(Activity activity) {
        super(null);
        this.d = activity;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(MainActivity mainActivity) {
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final boolean a() {
        this.d.onBackPressed();
        return true;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final boolean b() {
        this.d.onBackPressed();
        return true;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(android.support.v4.app.ac acVar) {
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(String str) {
        a(str, (String) null, (String) null, (String) null);
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(String str, String str2, String str3, String str4) {
        Intent a2 = com.google.android.finsky.utils.cr.a(this.d, str);
        if (str2 != null) {
            a2.putExtra("continue_url", str2);
        }
        if (str3 != null) {
            a2.putExtra("override_account", str3);
        }
        if (str4 != null) {
            a2.putExtra("original_url", str4);
        }
        this.d.startActivity(a2);
        this.d.finish();
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(String str, String str2, int i, DfeToc dfeToc, com.google.android.finsky.layout.play.cy cyVar) {
        this.d.startActivity(com.google.android.finsky.utils.cr.a(this.d, str, str2, i, false));
        this.d.finish();
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final com.google.android.finsky.e.q f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.navigationmanager.b
    public final Activity g() {
        return this.d;
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(Account account, Document document, int i, com.google.android.finsky.utils.au auVar, String str, boolean z) {
        this.d.startActivityForResult(LightPurchaseFlowActivity.a(account, document, null, i, auVar, document.f1963a.R, str, 0, null, false), 33);
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(Account account, Document document, boolean z) {
        if ((com.google.android.finsky.navigationmanager.a.a(this.d, account, document, this.f3539b, null, 1, null) ? false : true) && z) {
            this.d.finish();
        }
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(Document document, int i, int i2, boolean z) {
        if (this.d != null) {
            if (FinskyApp.a().e().a(12602819L)) {
                ScreenshotsActivityV2.a(this.d, document, i, i2);
            } else {
                ScreenshotsActivity.a(this.d, document, i, i2, false);
            }
        }
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void b(String str, String str2, String str3, String str4) {
        if (this.d != null && (this.d instanceof InlineAppDetailsDialog)) {
            ((InlineAppDetailsDialog) this.d).a(str, str2, str3);
        } else {
            super.b(str, str2, str3, str4);
        }
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(DfeToc dfeToc) {
        this.d.startActivity(com.google.android.finsky.utils.cr.a(this.d));
        this.d.finish();
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(Document document) {
        a(document.f1963a.D);
    }

    @Override // com.google.android.finsky.navigationmanager.b
    public final void a(Document document, View view) {
        a(document.f1963a.D);
    }
}
