package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.AppSecurityPermissions;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class AppsPermissionsActivity extends android.support.v7.a.ae implements View.OnClickListener, com.android.volley.s, gp, com.google.android.finsky.api.model.x, com.google.android.finsky.layout.play.da {
    private Document k;
    private AppSecurityPermissions l;
    private PlayActionButton m;
    private Bundle n;
    private com.google.android.finsky.api.model.h o;
    private String p;
    private boolean q;
    private com.google.android.finsky.apkg.i r;
    private final com.google.android.finsky.apkg.ai s = com.google.android.finsky.apkg.i.a(790);

    public static Intent a(String str, String str2, Document document, boolean z) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) AppsPermissionsActivity.class);
        intent.putExtra("AppsPermissionsActivity.accountName", str);
        intent.putExtra("AppsPermissionsActivity.docidStr", str2);
        intent.putExtra("AppsPermissionsActivity.doc", document);
        intent.putExtra("AppsPermissionsActivity.showDetailedPermissions", z);
        return intent;
    }

    public static Document a(Intent intent) {
        return (Document) intent.getParcelableExtra("AppsPermissionsActivity.doc");
    }

    public static int b(Intent intent) {
        return intent.getIntExtra("AppsPermissionsActivity.appVersion", 0);
    }

    public static String c(Intent intent) {
        return intent.getStringExtra("AppsPermissionsActivity.appTitle");
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("AppsPermissionsActivity.acceptedNewBuckets", false);
    }

    public static Bundle e(Intent intent) {
        return intent.getBundleExtra("AppsPermissionsActivity.appDownloadSizeWarningArguments");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.n = bundle;
        super.onCreate(bundle);
        setContentView(R.layout.light_purchase_app_permissions);
        Intent intent = getIntent();
        this.p = intent.getStringExtra("AppsPermissionsActivity.accountName");
        this.r = FinskyApp.a().f(this.p);
        this.q = intent.getBooleanExtra("AppsPermissionsActivity.showDetailedPermissions", false);
        String stringExtra = intent.getStringExtra("AppsPermissionsActivity.docidStr");
        this.k = (Document) intent.getParcelableExtra("AppsPermissionsActivity.doc");
        this.l = (AppSecurityPermissions) findViewById(R.id.app_permissions);
        if (this.k != null) {
            com.google.android.finsky.apkg.i.a(this.s, this.k.f1963a.R);
        }
        if (bundle == null) {
            this.r.a(0L, (com.google.android.finsky.layout.play.cy) this);
        }
        findViewById(R.id.contents).setVisibility(8);
        findViewById(R.id.loading_indicator).setVisibility(0);
        this.r.b(213, null, this);
        this.o = new com.google.android.finsky.api.model.h(FinskyApp.a().b(this.p), com.google.android.finsky.api.s.a(stringExtra));
        this.o.a((com.google.android.finsky.api.model.x) this);
        this.o.a((com.android.volley.s) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.l.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.o != null) {
            this.o.a((com.google.android.finsky.api.model.x) this);
            this.o.a((com.android.volley.s) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        FlushLogsReceiver.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        super.onPause();
        FlushLogsReceiver.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        if (this.o != null) {
            this.o.b((com.google.android.finsky.api.model.x) this);
            this.o.b((com.android.volley.s) this);
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.r != null) {
            this.r.b(603, null, this);
        }
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.r.a(792, (byte[]) null, this);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Bundle bundle;
        Intent intent = new Intent();
        intent.putExtra("AppsPermissionsActivity.doc", this.k);
        intent.putExtra("AppsPermissionsActivity.appVersion", this.k.E().e);
        intent.putExtra("AppsPermissionsActivity.appTitle", this.k.f1963a.i);
        com.google.android.finsky.installer.n nVar = FinskyApp.a().l;
        long j = nVar.d;
        long j2 = nVar.e;
        com.google.android.finsky.protos.ag E = this.k.E();
        if (E != null && nVar.d() && j > 0 && com.google.android.finsky.hpkg.a.a(E) >= j) {
            bundle = com.google.android.finsky.billing.ae.a(this.k.s() < j2, nVar.a());
        } else {
            bundle = null;
        }
        intent.putExtra("AppsPermissionsActivity.appDownloadSizeWarningArguments", bundle);
        intent.putExtra("AppsPermissionsActivity.acceptedNewBuckets", true);
        setResult(-1, intent);
        finish();
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        com.google.android.finsky.layout.cv cvVar;
        String b2;
        int i;
        this.k = this.o.b();
        if (this.k == null) {
            a(getString(R.string.item_unavailable_message));
            return;
        }
        if (a.a(this.k)) {
            a(getString(R.string.app_already_installed_other_user));
            return;
        }
        if (!this.q) {
            if (!com.google.android.finsky.utils.cy.a(this.k, FinskyApp.a().g, FinskyApp.a().p.a(com.google.android.finsky.api.a.a(this.p, this)))) {
                a(getString(com.google.android.finsky.utils.as.a(this.k)));
                return;
            }
            if (Build.VERSION.SDK_INT > 22 && this.k.T() > 22) {
                if (com.google.android.finsky.utils.bg.aI.a().booleanValue()) {
                    j();
                    return;
                }
                findViewById(R.id.loading_indicator).setVisibility(8);
                findViewById(R.id.contents).setVisibility(8);
                ViewGroup viewGroup = (ViewGroup) ((ViewStub) findViewById(R.id.optional_permissions_help_screen_stub)).inflate();
                ButtonBar buttonBar = (ButtonBar) viewGroup.findViewById(R.id.button_bar);
                buttonBar.setNegativeButtonVisible(false);
                buttonBar.setPositiveButtonEnabled(true);
                buttonBar.setPositiveButtonVisible(true);
                buttonBar.setPositiveButtonTitle(R.string.continue_text);
                buttonBar.setClickListener(new c(this));
                String b3 = com.google.android.finsky.cpkg.d.G.b();
                TextView textView = (TextView) viewGroup.findViewById(R.id.optional_permissions_help_text);
                textView.setText(com.google.android.finsky.utils.bc.a(getResources().getString(R.string.optional_permissions_help_text, b3)));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        findViewById(R.id.contents).setVisibility(0);
        findViewById(R.id.loading_indicator).setVisibility(8);
        String str = this.k.f1963a.c;
        String[] strArr = this.k.E().p;
        ((TextView) findViewById(R.id.title)).setText(this.k.f1963a.i);
        TextView textView2 = (TextView) findViewById(R.id.account);
        textView2.setVisibility(0);
        FifeImageView fifeImageView = (FifeImageView) findViewById(R.id.application_icon);
        com.google.android.finsky.protos.ds a2 = com.google.android.finsky.utils.apkg.a.a(this.k, fifeImageView.getWidth(), fifeImageView.getHeight(), com.google.android.finsky.utils.ex.f);
        if (a2 != null) {
            fifeImageView.a(a2.f, a2.l, FinskyApp.a().d);
            fifeImageView.setVisibility(0);
        } else {
            fifeImageView.setVisibility(8);
        }
        TextView textView3 = (TextView) findViewById(R.id.detailed_footer_text);
        if (this.q) {
            if (this.n == null) {
                com.google.android.finsky.apkg.i.a(this.s, this.k.f1963a.R);
                this.r.b(793, null, this);
            }
            if (Build.VERSION.SDK_INT > 22) {
                b2 = com.google.android.finsky.cpkg.d.F.b();
                i = R.string.detailed_optional_permissions_footer;
            } else {
                b2 = com.google.android.finsky.cpkg.d.E.b();
                i = R.string.detailed_permissions_footer;
            }
            if (!TextUtils.isEmpty(b2)) {
                textView3.setText(Html.fromHtml(getResources().getString(i, this.k.f1963a.i, b2)));
                textView3.setOnClickListener(new b(this, b2));
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
            boolean z = Build.VERSION.SDK_INT > 22 && this.k.T() > 22;
            com.google.android.finsky.layout.cv agVar = new com.google.android.finsky.layout.ag(this, str, strArr, (Build.VERSION.SDK_INT <= 22 || !com.google.android.finsky.cpkg.d.J.b().booleanValue()) ? z : true);
            String str2 = this.k.E().g;
            if (z) {
                textView2.setText(getResources().getString(R.string.version_may_request_access, str2));
            } else {
                textView2.setText(getResources().getString(R.string.version_can_access, str2));
            }
            findViewById(R.id.continue_button_bar).setVisibility(8);
            cvVar = agVar;
        } else {
            if (this.n == null) {
                com.google.android.finsky.apkg.i.a(this.s, this.k.f1963a.R);
                this.r.b(791, null, this);
            }
            textView3.setVisibility(8);
            boolean b4 = com.google.android.finsky.utils.er.b(FinskyApp.a().r, str);
            com.google.android.finsky.layout.h hVar = new com.google.android.finsky.layout.h(this, str, strArr, b4);
            textView2.setText((hVar.f3279a && b4) ? R.string.also_needs_access_to : R.string.needs_access_to);
            this.m = (PlayActionButton) findViewById(R.id.continue_button);
            this.m.a(3, R.string.accept, this);
            this.m.setEnabled(true);
            cvVar = hVar;
        }
        this.l.a(cvVar, this.k.f1963a.i, this.n);
        this.l.requestFocus();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        a(com.google.android.finsky.utils.aw.a(this, volleyError));
    }

    private void a(String str) {
        gn gnVar = new gn();
        gnVar.a(str).d(R.string.ok);
        gnVar.b().a(d(), "AppsPermissionsActivity.errorDialog");
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        setResult(0);
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void p_() {
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void i() {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }
}
