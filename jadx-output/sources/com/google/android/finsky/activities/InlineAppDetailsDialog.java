package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pj;
import com.google.android.finsky.utils.ExternalReferrer;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ib;

/* loaded from: classes.dex */
public class InlineAppDetailsDialog extends d implements com.google.android.finsky.e.t {
    View o;
    private du p;
    private cj q = new cj(this);

    public static Intent a(Uri uri) {
        String queryParameter = uri.getQueryParameter("id");
        String queryParameter2 = uri.getQueryParameter("referrer");
        String queryParameter3 = uri.getQueryParameter("pcampaignid");
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) InlineAppDetailsDialog.class);
        intent.putExtra("external_url", uri.toString());
        intent.putExtra("docid", queryParameter);
        if (!TextUtils.isEmpty(queryParameter2)) {
            intent.putExtra("referrer", queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            intent.putExtra("pcampaignid", queryParameter3);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("docid");
        if (TextUtils.isEmpty(stringExtra)) {
            FinskyLog.d("Missing docid.", new Object[0]);
            finish();
            return;
        }
        this.o = View.inflate(this, R.layout.inline_app_dialog, null);
        setContentView(this.o);
        this.q.f3539b = d();
        Fragment a2 = d().a(R.id.content_frame);
        if (a2 != null && (a2 instanceof du)) {
            this.p = (du) a2;
            return;
        }
        String stringExtra2 = intent.getStringExtra("external_url");
        String a3 = com.google.android.wallet.common.util.a.a((Activity) this);
        if (a3 == null) {
            a3 = com.google.android.finsky.utils.a.b(this);
        }
        if (TextUtils.isEmpty(stringExtra2) || !stringExtra2.startsWith("market:")) {
            if (!(ib.a((Activity) this) || com.google.android.finsky.c.d.aA.b().booleanValue())) {
                FinskyLog.c("Called from untrusted package.", new Object[0]);
                finish();
                return;
            }
            String stringExtra3 = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra3)) {
                FinskyApp.a().b((String) null).c(stringExtra, stringExtra3, new ds(), new dt());
            }
            String a4 = com.google.android.finsky.api.s.a(stringExtra);
            Bundle bundleExtra = intent.getBundleExtra("extra_logging_params");
            if (bundle == null) {
                Uri.Builder buildUpon = Uri.parse("http://market.android.com/details").buildUpon();
                buildUpon.appendQueryParameter("id", stringExtra);
                if (!TextUtils.isEmpty(stringExtra3)) {
                    buildUpon.appendQueryParameter("referrer", stringExtra3);
                }
                if (bundleExtra != null) {
                    for (String str : bundleExtra.keySet()) {
                        Object obj = bundleExtra.get(str);
                        if (obj == null) {
                            FinskyLog.c("Null value associated with key %s in extra params", str);
                        } else if ((obj instanceof Boolean) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String)) {
                            buildUpon.appendQueryParameter(str, obj.toString());
                        }
                    }
                }
                com.google.android.finsky.a.i h = FinskyApp.a().h();
                String uri = buildUpon.build().toString();
                h.a(11, uri, stringExtra, stringExtra3, a3, (byte[]) null);
                ExternalReferrer.b(stringExtra3, stringExtra, "inline_install");
                FinskyApp.a().c.a(uri, 2);
            }
            a(a4, (String) null, intent.getStringExtra("authAccount"));
            return;
        }
        com.google.android.finsky.a.a aVar = FinskyApp.a().c;
        intent.getAction();
        aVar.a(stringExtra2, 1);
        this.q.a(Uri.parse(stringExtra2).buildUpon().scheme("http").authority("market.android.com").path("details").build(), a3);
    }

    public final void a(String str, String str2, String str3) {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("docid");
        String stringExtra2 = intent.getStringExtra("referrer");
        if (str3 == null) {
            str3 = a.a(stringExtra, FinskyApp.a().j(), FinskyApp.a().s, FinskyApp.a().p);
        }
        FinskyLog.a("Select %s for details of %s", FinskyLog.a(str3), stringExtra);
        this.p = du.a(stringExtra2, str3, str, str2);
        android.support.v4.app.ap a2 = d().a();
        a2.a(R.id.content_frame, this.p);
        a2.b();
        if (((d) this).m) {
            return;
        }
        this.p.A_();
    }

    @Override // com.google.android.finsky.activities.d
    protected final void a(VolleyError volleyError) {
        if (this.p != null) {
            du duVar = this.p;
            duVar.e(com.google.android.finsky.utils.aw.a(duVar.ap, volleyError));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d
    public final void b(boolean z) {
        super.b(z);
        if (this.p != null) {
            this.p.A_();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 33 && i2 == -1) {
            setResult(-1);
            if (FinskyApp.a().e().a(12604322L)) {
                startActivity(InlineAppPostPurchaseDialog.a(this.p.f1695a));
            } else {
                Toast.makeText(this, getResources().getString(R.string.installing), 0).show();
            }
        }
        finish();
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return this.q;
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return null;
    }

    @Override // com.google.android.finsky.e.t
    public final void b_(String str) {
    }

    @Override // com.google.android.finsky.e.t
    public final void a(int i, boolean z) {
    }

    @Override // com.google.android.finsky.e.t
    public final void s_() {
    }

    @Override // com.google.android.finsky.e.t
    public final void b(int i) {
    }

    @Override // com.google.android.finsky.e.t
    public final void c(int i) {
    }

    @Override // com.google.android.finsky.e.t
    public final void j() {
        finish();
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.api.b a_(String str) {
        return FinskyApp.a().b(str);
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.play.image.e k() {
        return FinskyApp.a().d;
    }

    @Override // com.google.android.finsky.e.t
    public final void a(String str, String str2, boolean z) {
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.gms.common.api.m l() {
        return null;
    }

    @Override // com.google.android.finsky.e.t
    public final void a(com.google.android.finsky.e.q qVar) {
    }

    @Override // com.google.android.finsky.e.t
    public final void a(pj pjVar) {
    }

    @Override // com.google.android.finsky.e.t
    public final void m() {
    }
}
