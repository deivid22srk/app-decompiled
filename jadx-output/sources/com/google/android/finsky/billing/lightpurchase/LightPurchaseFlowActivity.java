package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.AppsPermissionsActivity;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.ap;
import com.google.android.finsky.billing.aq;
import com.google.android.finsky.billing.promptforfop.PromptForFopActivity;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.au;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.er;
import com.google.android.finsky.utils.ib;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class LightPurchaseFlowActivity extends com.google.android.finsky.activities.d implements gp, aq {
    private String A;
    private int B;
    private String C;
    private boolean D;
    private boolean E;
    private boolean F;
    private String G;
    private boolean H;
    private boolean I;
    private boolean J;
    private final Handler K = new Handler();
    private Bundle o;
    private Account p;
    private String q;
    private dp r;
    private int s;
    private String t;
    private boolean u;
    private au v;
    private boolean w;
    private int x;
    private String y;
    private Document z;

    public static Intent a(Account account, Document document, String str, int i, au auVar, byte[] bArr, String str2, int i2, String str3, boolean z) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) LightPurchaseFlowActivity.class);
        intent.putExtra("LightPurchaseFlowActivity.account", account);
        intent.putExtra("LightPurchaseFlowActivity.doc", document);
        if (str != null) {
            intent.putExtra("LightPurchaseFlowActivity.offerId", str);
        }
        intent.putExtra("LightPurchaseFlowActivity.offerType", i);
        if (auVar != null) {
            intent.putExtra("LightPurchaseFlowActivity.offerFilter", auVar.name());
        }
        intent.putExtra("LightPurchaseFlowActivity.appsContinueUrl", str2);
        intent.putExtra("LightPurchaseFlowActivity.serverLogsCookie", bArr);
        intent.putExtra("LightPurchaseFlowActivity.indirectProvisioningType", i2);
        intent.putExtra("LightPurchaseFlowActivity.voucherId", str3);
        intent.putExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", z);
        return intent;
    }

    public static Intent a(Document document) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) LightPurchaseFlowActivity.class);
        intent.setAction("com.deivid22srk.store.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("backend", document.f1963a.g);
        intent.putExtra("document_type", document.f1963a.e);
        intent.putExtra("backend_docid", document.f1963a.c);
        intent.putExtra("full_docid", document.f1963a.f3890a);
        intent.putExtra("offer_type", 1);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        Intent intent = getIntent();
        if (o()) {
            if (!b(intent)) {
                p();
            }
        } else {
            String callingPackage = getCallingPackage();
            if (callingPackage == null || !callingPackage.equals(getPackageName())) {
                FinskyLog.c("Blocked request from external package: %s", callingPackage);
                z = false;
            } else {
                this.w = true;
                this.p = (Account) intent.getParcelableExtra("LightPurchaseFlowActivity.account");
                this.r = (dp) ParcelableProto.a(intent, "LightPurchaseFlowActivity.docid");
                this.z = (Document) intent.getParcelableExtra("LightPurchaseFlowActivity.doc");
                this.r = this.z.c();
                this.q = this.z.f1963a.f3890a;
                this.s = intent.getIntExtra("LightPurchaseFlowActivity.offerType", 0);
                this.t = intent.getStringExtra("LightPurchaseFlowActivity.offerId");
                if (intent.hasExtra("LightPurchaseFlowActivity.offerFilter")) {
                    this.v = au.valueOf(intent.getStringExtra("LightPurchaseFlowActivity.offerFilter"));
                }
                if (this.s != 0) {
                    ea d = this.z.d(this.s);
                    if (d == null) {
                        FinskyLog.d("Offer type not available: %d", Integer.valueOf(this.s));
                        z = false;
                    } else {
                        this.u = d.w;
                    }
                }
                this.A = intent.getStringExtra("LightPurchaseFlowActivity.appsContinueUrl");
                this.x = intent.getIntExtra("LightPurchaseFlowActivity.indirectProvisioningType", 0);
                this.y = intent.getStringExtra("LightPurchaseFlowActivity.voucherId");
                this.J = intent.getBooleanExtra("LightPurchaseFlowActivity.bypassAcquisitionWarnings", false);
                z = true;
            }
            if (!z) {
                p();
            }
        }
        if (bundle != null) {
            this.r = (dp) ParcelableProto.a(bundle, "LightPurchaseFlowActivity.docid");
            this.q = bundle.getString("LightPurchaseFlowActivity.docidStr");
            this.z = (Document) bundle.getParcelable("LightPurchaseFlowActivity.doc");
            this.s = bundle.getInt("LightPurchaseFlowActivity.offerType", 0);
            this.t = bundle.getString("LightPurchaseFlowActivity.offerId");
            this.u = bundle.getBoolean("LightPurchaseFlowActivity.offerRequiresCheckout");
            this.C = bundle.getString("LightPurchaseFlowActivity.appTitle");
            this.B = bundle.getInt("LightPurchaseFlowActivity.appVersionCode");
            this.D = bundle.getBoolean("LightPurchaseFlowActivity.failed");
            this.E = bundle.getBoolean("LightPurchaseFlowActivity.purchasePerformed");
            this.F = bundle.getBoolean("LightPurchaseFlowActivity.postSuccessItemOpened");
            this.H = bundle.getBoolean("LightPurchaseFlowActivity.tosLaunched");
            this.I = bundle.getBoolean("LightPurchaseFlowActivity.appPermissionsLaunched");
            this.x = bundle.getInt("LightPurchaseFlowActivity.indirectProvisioningType");
        }
        this.o = bundle;
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LightPurchaseFlowActivity.docid", ParcelableProto.a(this.r));
        bundle.putString("LightPurchaseFlowActivity.docidStr", this.q);
        bundle.putParcelable("LightPurchaseFlowActivity.doc", this.z);
        bundle.putInt("LightPurchaseFlowActivity.offerType", this.s);
        bundle.putString("LightPurchaseFlowActivity.offerId", this.t);
        bundle.putBoolean("LightPurchaseFlowActivity.offerRequiresCheckout", this.u);
        bundle.putBoolean("LightPurchaseFlowActivity.purchasePerformed", this.E);
        bundle.putBoolean("LightPurchaseFlowActivity.postSuccessItemOpened", this.F);
        bundle.putString("LightPurchaseFlowActivity.appTitle", this.C);
        bundle.putInt("LightPurchaseFlowActivity.appVersionCode", this.B);
        bundle.putBoolean("LightPurchaseFlowActivity.failed", this.D);
        bundle.putBoolean("LightPurchaseFlowActivity.tosLaunched", this.H);
        bundle.putBoolean("LightPurchaseFlowActivity.appPermissionsLaunched", this.I);
        bundle.putInt("LightPurchaseFlowActivity.indirectProvisioningType", this.x);
    }

    private boolean b(Intent intent) {
        this.w = ib.a((Activity) this);
        if (!com.google.android.finsky.c.d.aB.b().booleanValue() && !this.w) {
            FinskyLog.c("Called from untrusted package.", new Object[0]);
            return false;
        }
        if (!intent.hasExtra("backend") || !intent.hasExtra("document_type") || !intent.hasExtra("backend_docid") || !intent.hasExtra("full_docid")) {
            FinskyLog.d("Missing argument.", new Object[0]);
            return false;
        }
        if (intent.hasExtra("authAccount")) {
            String stringExtra = intent.getStringExtra("authAccount");
            this.p = com.google.android.finsky.api.a.a(stringExtra, this);
            if (this.p == null) {
                FinskyLog.a("Invalid account passed: %s", stringExtra);
                return false;
            }
        } else {
            this.p = FinskyApp.a().i();
        }
        this.r = as.a(intent.getIntExtra("backend", 0), intent.getIntExtra("document_type", 0), intent.getStringExtra("backend_docid"));
        this.q = intent.getStringExtra("full_docid");
        this.z = null;
        this.s = intent.getIntExtra("offer_type", 0);
        this.t = intent.getStringExtra("offer_id");
        this.u = true;
        String stringExtra2 = intent.getStringExtra("offer_filter");
        if (stringExtra2 != null) {
            try {
                this.v = au.valueOf(stringExtra2);
            } catch (IllegalArgumentException e) {
                FinskyLog.d("Invalid offer types passed: %s", stringExtra2);
                return false;
            }
        }
        bb.a(this.p.name, intent.getStringExtra("family_consistency_token"));
        this.G = intent.getStringExtra("referral_url");
        this.x = intent.getIntExtra("indirect_provisioning_type", 0);
        return true;
    }

    private boolean o() {
        return "com.deivid22srk.store.billing.PURCHASE".equals(getIntent().getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (com.google.android.finsky.c.d.dg.b().booleanValue() != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.os.Bundle r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity.a(android.os.Bundle, boolean):void");
    }

    private void p() {
        this.D = true;
        setResult(0);
        d(false);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        com.google.android.finsky.protos.ag E;
        String str;
        if (this.w) {
            Intent intent = new Intent();
            intent.putExtra("authAccount", this.p.name);
            intent.putExtra("backend", this.r.e);
            intent.putExtra("document_type", this.r.c);
            intent.putExtra("backend_docid", this.r.f3740a);
            intent.putExtra("offer_type", this.s);
            intent.putExtra("offer_id", this.t);
            intent.putExtra("involved_heavy_dialogs", this.E);
            intent.putExtra("post_success_item_opened", this.F);
            Document document = this.z;
            if (document != null && (E = document.E()) != null && (str = E.D) != null && str.equalsIgnoreCase("game")) {
                intent.putExtra("is_game", true);
                if (document.ad()) {
                    intent.putExtra("has_game_features", true);
                }
            }
            setResult(-1, intent);
        } else {
            setResult(-1);
        }
        d(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        FinskyApp.a().e(this.p.name).a(this.q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                this.K.post(new x(this, i2, intent));
                break;
            case 2:
                this.K.post(new v(this, i2, intent));
                break;
            case 3:
                this.K.post(new w(this, i2, intent));
                break;
            case 7:
                this.K.post(new u(this, i2));
                break;
            case 8:
                this.K.post(new t(this, i2));
                break;
            case 9:
                this.K.post(new y(this, i2, intent));
                break;
            case 25:
                this.K.post(new z(this, i2));
                break;
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    private void a(Bundle bundle) {
        com.google.android.finsky.billing.ae.a((Fragment) null, bundle).a(d(), "LightPurchaseFlowActivity.appDownloadSizeWarningDialog");
    }

    private void s() {
        com.google.android.finsky.billing.y.a((Fragment) null, this.z.s()).a(d(), "LightPurchaseFlowActivity.appDownloadNetworkDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!com.google.android.finsky.navigationmanager.a.a(this, this.p, this.z, d(), null, 5, null)) {
            this.F = true;
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // com.google.android.finsky.activities.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r10) {
        /*
            r9 = this;
            r8 = 1
            r7 = 0
            r3 = 0
            super.b(r10)
            boolean r0 = r9.D
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            android.os.Bundle r0 = r9.o
            if (r0 != 0) goto La
            r0 = 600(0x258, float:8.41E-43)
            com.google.android.finsky.a.y r1 = r9.b(r0)
            com.google.android.finsky.FinskyApp r0 = com.google.android.finsky.FinskyApp.a()
            android.accounts.Account r2 = r9.p
            com.google.android.finsky.a.i r0 = r0.c(r2)
            r0.b(r1)
            java.lang.String r1 = r9.G
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L34
            r1 = 9
            java.lang.String r2 = r9.G
            r4 = r3
            r5 = r3
            r6 = r3
            r0.a(r1, r2, r3, r4, r5, r6)
        L34:
            com.google.android.finsky.FinskyApp r0 = com.google.android.finsky.FinskyApp.a()
            android.accounts.Account r1 = r9.p
            java.lang.String r1 = r1.name
            com.google.android.finsky.utils.ac r0 = r0.a(r1)
            boolean r0 = r0.a()
            if (r0 != 0) goto L61
            r0 = r7
        L47:
            if (r0 == 0) goto L98
            android.accounts.Account r0 = r9.p
            java.lang.String r0 = r0.name
            com.google.android.finsky.protos.dp r1 = r9.r
            int r1 = r1.e
            com.google.android.finsky.api.model.Document r2 = r9.z
            if (r2 != 0) goto L57
            java.lang.String r3 = r9.q
        L57:
            android.content.Intent r0 = com.google.android.finsky.billing.lightpurchase.AgeVerificationActivity.a(r0, r1, r3)
            r1 = 8
            r9.startActivityForResult(r0, r1)
            goto La
        L61:
            com.google.android.finsky.FinskyApp r0 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.g.h r0 = r0.p
            com.google.android.finsky.protos.dp r1 = r9.r
            int r1 = r1.c
            if (r1 != r8) goto L7b
            java.lang.String r1 = r9.q
            java.util.List r0 = r0.a(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8b
            r0 = r7
            goto L47
        L7b:
            com.google.android.finsky.protos.dp r1 = r9.r
            android.accounts.Account r2 = r9.p
            com.google.android.finsky.g.a r0 = r0.a(r2)
            boolean r0 = com.google.android.finsky.utils.cy.a(r1, r0)
            if (r0 == 0) goto L8b
            r0 = r7
            goto L47
        L8b:
            com.google.android.finsky.api.model.Document r0 = r9.z
            if (r0 != 0) goto L91
            r0 = r8
            goto L47
        L91:
            com.google.android.finsky.api.model.Document r0 = r9.z
            com.google.android.finsky.protos.gx r0 = r0.f1963a
            boolean r0 = r0.T
            goto L47
        L98:
            r9.u()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity.b(boolean):void");
    }

    private void d(boolean z) {
        com.google.android.finsky.a.y b2 = b(601);
        b2.z = z;
        b2.A = true;
        FinskyApp.a().c(this.p).b(b2);
    }

    private com.google.android.finsky.a.y b(int i) {
        com.google.android.finsky.a.b d = new com.google.android.finsky.a.b(i).a(this.q).d(getCallingPackage());
        if (this.s != 0) {
            d.b(this.s);
            d.f1473a.F = this.u;
            d.f1473a.G = true;
        }
        return d.f1473a;
    }

    private void v() {
        if (!ik.a()) {
            if (this.r.c == 1) {
                startActivityForResult(AppsPermissionsActivity.a(this.p.name, this.q, this.z, false), 2);
                return;
            } else if (TextUtils.isEmpty(this.t) && this.s == 0) {
                startActivityForResult(OfferResolutionActivity.a(FinskyApp.a().g, this.p, this.q, this.z, this.v), 3);
                return;
            } else {
                a((Bundle) null, false);
                return;
            }
        }
        ah ahVar = new ah();
        ahVar.f2311a = this.r;
        ahVar.f2312b = this.q;
        ahVar.d = this.s;
        ahVar.e = this.t;
        PurchaseParams a2 = ahVar.a(this.B, this.C, this.A).a();
        Account account = this.p;
        au auVar = this.v;
        String w = w();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TvIntentUtils.account", account);
        bundle.putParcelable("TvIntentUtils.purchaseParams", a2);
        if (auVar != null) {
            bundle.putString("TvIntentUtils.offerFilter", auVar.name());
        }
        bundle.putBoolean("TvIntentUtils.showOfferResolution", true);
        bundle.putString("TvIntentUtils.breadCrumb", w);
        Intent intent = new Intent("com.google.android.finsky.tv.PURCHASE");
        intent.putExtras(bundle);
        startActivityForResult(intent, 9);
    }

    @Override // android.app.Activity
    public String getCallingPackage() {
        return com.google.android.wallet.common.util.a.a((Activity) this);
    }

    private String w() {
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            return null;
        }
        PackageManager packageManager = getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(callingPackage, 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 4:
                p();
                break;
            case 5:
                startActivity(cr.a(this, bundle.getString("dialog_details_url")));
                p();
                break;
            case 6:
                startActivityForResult(PromptForFopActivity.a(FinskyApp.a().i(), getIntent().getByteArrayExtra("LightPurchaseFlowActivity.serverLogsCookie")), 7);
                break;
            default:
                FinskyLog.e("Unknown dialog callback: %d", Integer.valueOf(i));
                break;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        p();
    }

    @Override // com.google.android.finsky.billing.aq
    public final void a(boolean z, boolean z2) {
        String str = this.r.f3740a;
        FinskyLog.a("Will queue %s to be downloaded on wifi only = %b", str, Boolean.valueOf(z));
        if (z) {
            FinskyApp.a().k.e(str);
        } else {
            FinskyApp.a().k.a(str);
        }
        if (z2 && !bg.w.a().booleanValue()) {
            com.google.android.finsky.billing.ab.u().a(d(), "LightPurchaseFlowActivity.appDownloadNetworkSettingsDialog");
            bg.w.a((com.google.android.finsky.c.o<Boolean>) true);
        } else {
            a((Bundle) null, false);
        }
    }

    @Override // com.google.android.finsky.billing.aq
    public final void T_() {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        p();
    }

    @Override // com.google.android.finsky.billing.aq
    public final void U_() {
        FinskyLog.a("Download pre-acquisition warning dismissed for app = %s", this.z.f1963a.c);
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u() {
        /*
            r8 = this;
            r5 = 0
            r2 = 0
            r3 = -1
            r1 = 1
            boolean r0 = r8.o()
            if (r0 != 0) goto Lc2
            com.google.android.finsky.api.model.Document r0 = r8.z
            if (r0 == 0) goto L16
            com.google.android.finsky.api.model.Document r0 = r8.z
            com.google.android.finsky.protos.gx r0 = r0.f1963a
            int r0 = r0.e
            if (r0 == r1) goto L77
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto Lc5
            r8.E = r1
            com.google.android.finsky.activities.gn r6 = new com.google.android.finsky.activities.gn
            r6.<init>()
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "LightPurchaseFlowActivity.serverLogsCookie"
            byte[] r2 = r0.getByteArrayExtra(r1)
            r0 = 2131362758(0x7f0a03c6, float:1.8345306E38)
            com.google.android.finsky.activities.gn r0 = r6.c(r0)
            r1 = 2131362687(0x7f0a037f, float:1.8345162E38)
            com.google.android.finsky.activities.gn r0 = r0.a(r1)
            r1 = 2131362068(0x7f0a0114, float:1.8343906E38)
            com.google.android.finsky.activities.gn r0 = r0.d(r1)
            r1 = 6
            com.google.android.finsky.activities.gn r0 = r0.a(r5, r1, r5)
            r1 = 1000(0x3e8, float:1.401E-42)
            android.accounts.Account r5 = r8.p
            r4 = r3
            r0.a(r1, r2, r3, r4, r5)
            com.google.android.finsky.activities.gj r1 = r6.b()
            android.accounts.Account r0 = r8.p
            java.lang.String r0 = r0.name
            com.google.android.finsky.c.n<java.lang.Integer> r2 = com.google.android.finsky.utils.bg.L
            com.google.android.finsky.c.o r2 = r2.b(r0)
            java.lang.Object r0 = r2.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.a(r0)
            android.support.v4.app.aa r0 = r8.d()
            java.lang.String r2 = "LightPurchaseFlowActivity.fopRequiredDialog"
            r1.a(r0, r2)
        L76:
            return
        L77:
            boolean r0 = r8.u
            if (r0 != 0) goto Lc2
            com.google.android.finsky.FinskyApp r0 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.g.h r0 = r0.p
            java.lang.String r4 = r8.q
            java.util.List r0 = r0.a(r4)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            boolean r0 = com.google.android.finsky.utils.ik.a()
            if (r0 != 0) goto Lc2
            android.accounts.Account r0 = r8.p
            java.lang.String r4 = r0.name
            long r6 = java.lang.System.currentTimeMillis()
            boolean r0 = com.google.android.finsky.billing.v.c(r4)
            if (r0 == 0) goto Lc2
            boolean r0 = com.google.android.finsky.billing.v.b(r4, r6)
            if (r0 == 0) goto Lc2
            com.google.android.finsky.c.n<java.lang.Boolean> r0 = com.google.android.finsky.utils.bg.G
            com.google.android.finsky.c.o r0 = r0.b(r4)
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lc2
            boolean r0 = com.google.android.finsky.billing.v.a(r4, r6)
            if (r0 != 0) goto Lc2
            r0 = r1
            goto L17
        Lc2:
            r0 = r2
            goto L17
        Lc5:
            r8.v()
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity.u():void");
    }

    @Override // com.google.android.finsky.billing.aq
    public final void V_() {
        a((Bundle) null, false);
    }

    static /* synthetic */ void a(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        if (i == -1) {
            FinskyLog.a("Age verification activity success: %s", lightPurchaseFlowActivity.q);
            lightPurchaseFlowActivity.u();
        } else {
            FinskyLog.a("Age verification activity canceled: %s", lightPurchaseFlowActivity.q);
            lightPurchaseFlowActivity.p();
        }
    }

    static /* synthetic */ void b(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        if (i == -1) {
            FinskyLog.a("Prompt for FOP activity success: %s", lightPurchaseFlowActivity.q);
            lightPurchaseFlowActivity.v();
        } else {
            FinskyLog.a("Prompt for FOP activity canceled: %s", lightPurchaseFlowActivity.q);
            lightPurchaseFlowActivity.p();
        }
    }

    static /* synthetic */ void a(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        boolean z = false;
        if (i == -1) {
            FinskyLog.a("Permissions accepted: %s", lightPurchaseFlowActivity.q);
            lightPurchaseFlowActivity.z = AppsPermissionsActivity.a(intent);
            ea d = lightPurchaseFlowActivity.z.d(lightPurchaseFlowActivity.s);
            if (d == null) {
                FinskyLog.d("Offer not found: type=%d", Integer.valueOf(lightPurchaseFlowActivity.s));
                lightPurchaseFlowActivity.p();
                return;
            }
            lightPurchaseFlowActivity.u = d.w;
            lightPurchaseFlowActivity.B = AppsPermissionsActivity.b(intent);
            lightPurchaseFlowActivity.C = AppsPermissionsActivity.c(intent);
            boolean d2 = AppsPermissionsActivity.d(intent);
            String str = lightPurchaseFlowActivity.r.f3740a;
            if (d2) {
                er.a(FinskyApp.a().r, str);
            }
            Bundle bundle = null;
            if (lightPurchaseFlowActivity.J) {
                FinskyApp.a().k.a(str);
            } else {
                z = ap.a(lightPurchaseFlowActivity.z.f1963a.e);
                ap.a(str);
                if (!z && (bundle = AppsPermissionsActivity.e(intent)) == null) {
                    FinskyApp.a().k.a(str);
                }
            }
            lightPurchaseFlowActivity.a(bundle, z);
            return;
        }
        FinskyLog.a("Permissions declined: %s", lightPurchaseFlowActivity.q);
        lightPurchaseFlowActivity.p();
    }

    static /* synthetic */ void b(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        if (i == -1) {
            aa a2 = OfferResolutionActivity.a(intent);
            lightPurchaseFlowActivity.z = a2.f2304a;
            lightPurchaseFlowActivity.r = lightPurchaseFlowActivity.z.c();
            lightPurchaseFlowActivity.q = lightPurchaseFlowActivity.z.f1963a.f3890a;
            ea eaVar = a2.f2305b;
            lightPurchaseFlowActivity.s = eaVar.A;
            lightPurchaseFlowActivity.t = eaVar.S;
            lightPurchaseFlowActivity.u = eaVar.w;
            FinskyLog.a("Offer resolution: %s, offerType=%d, checkoutFlowRequired=%b", lightPurchaseFlowActivity.q, Integer.valueOf(lightPurchaseFlowActivity.s), Boolean.valueOf(lightPurchaseFlowActivity.u));
            if (lightPurchaseFlowActivity.r.e == 6 && lightPurchaseFlowActivity.r.c == 15 && !lightPurchaseFlowActivity.u) {
                lightPurchaseFlowActivity.t();
                return;
            } else {
                lightPurchaseFlowActivity.a((Bundle) null, false);
                return;
            }
        }
        FinskyLog.a("Offer resolution canceled: %s", lightPurchaseFlowActivity.q);
        lightPurchaseFlowActivity.p();
    }

    static /* synthetic */ void c(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        FinskyLog.a("Payment screen finished with result: %d", Integer.valueOf(i));
        if (i == -1) {
            lightPurchaseFlowActivity.E = true;
            lightPurchaseFlowActivity.F = PurchaseActivity.a(intent);
            lightPurchaseFlowActivity.q();
            return;
        }
        lightPurchaseFlowActivity.p();
    }

    static /* synthetic */ void d(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        FinskyLog.a("TV payment screen finished with result: %d", Integer.valueOf(i));
        if (i == -1) {
            if (lightPurchaseFlowActivity.w) {
                Intent intent2 = new Intent();
                intent2.putExtra("authAccount", lightPurchaseFlowActivity.p.name);
                intent2.putExtras(intent.getExtras());
                lightPurchaseFlowActivity.setResult(-1, intent2);
            } else {
                lightPurchaseFlowActivity.setResult(-1);
            }
            lightPurchaseFlowActivity.q();
            return;
        }
        lightPurchaseFlowActivity.p();
    }

    static /* synthetic */ void c(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        if (i == -1) {
            lightPurchaseFlowActivity.q();
        } else {
            lightPurchaseFlowActivity.p();
        }
    }
}
