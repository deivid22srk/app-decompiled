package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.billing.instrumentmanager.InstrumentManagerActivity;
import com.google.android.finsky.billing.instrumentmanager.SetupWizardInstrumentManagerActivity;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.AddDcb3Activity;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.SetupWizardAddDcb3Activity;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.SetupWizardRedeemCodeActivity;
import com.google.android.finsky.billing.storedvalue.StoredValueTopUpActivity;
import com.google.android.finsky.billing.switchfamilyinstrument.SwitchFamilyInstrumentActivity;
import com.google.android.finsky.cpkg.o;
import com.google.android.finsky.epkg.u;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.protos.at;
import com.google.android.finsky.protos.bo;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.protos.py;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.SetupWizardUtils;
import com.google.android.finsky.utils.bg;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends u implements s, t<bo> {
    private static final Uri g = Uri.parse(com.google.android.finsky.cpkg.d.as.b());

    /* renamed from: a, reason: collision with root package name */
    public as f2322a;
    private String ai;
    private SetupWizardUtils.SetupWizardParams aj;
    private Intent ak;
    private Map<String, String> al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int av;
    private byte[] aw;
    private i ax;

    /* renamed from: b, reason: collision with root package name */
    public String f2323b;
    public VolleyError c;
    public RedeemCodeResult d;
    public String e;
    public String f;
    private Account h;
    private com.google.android.finsky.api.b i;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bo boVar) {
        bo boVar2 = boVar;
        switch (boVar2.f3640a) {
            case 1:
                a(0, (Throwable) null);
                this.f2322a = boVar2.c;
                if (this.f2322a.f3605a != null && this.f2322a.f3605a.length > 0) {
                    bg.G.b(this.i.b().name).a((o<Boolean>) true);
                }
                a(2, 0);
                break;
            case 2:
                a(2, (Throwable) null);
                this.f2323b = boVar2.d;
                a(3, 3);
                break;
            default:
                a(3, (Throwable) null);
                this.f2323b = f_(R.string.error);
                a(3, 3);
                break;
        }
    }

    public static a a(Account account, String str, SetupWizardUtils.SetupWizardParams setupWizardParams, Intent intent, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileSidecar.account", account);
        bundle.putString("BillingProfileSidecar.purchaseContextToken", str);
        bundle.putParcelable("BillingProfileSidecar.setupWizardParams", setupWizardParams);
        bundle.putParcelable("BillingProfileSidecar.redeemCodeIntent", intent);
        bundle.putInt("BillingProfileSidecar.billingProfileFlow", i);
        bundle.putInt("BillingProfileSidecar.creditCardEventType", i2);
        bundle.putInt("BillingProfileSidecar.dcbEventType", i3);
        bundle.putInt("BillingProfileSidecar.paypalEventType", i4);
        bundle.putInt("BillingProfileSidecar.redeemEventType", i5);
        bundle.putInt("BillingProfileSidecar.topupEventType", i6);
        bundle.putInt("BillingProfileSidecar.editEventType", i7);
        bundle.putByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies", bArr);
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.epkg.u, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("BillingProfileSidecar.billingProfile", ParcelableProto.a(this.f2322a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.u
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f2322a = (as) ParcelableProto.a(bundle, "BillingProfileSidecar.billingProfile");
    }

    public final boolean v() {
        return !f().isFinishing();
    }

    public final g a(at atVar, byte[] bArr, cy cyVar) {
        int i;
        int i2 = 811;
        switch (atVar.f3607a) {
            case 2:
                if (atVar.l != null && atVar.l.g == 3) {
                    return new g(atVar, new b(this, atVar, cyVar), 811);
                }
                FinskyLog.c("Skipping unknown DCB type, displayTitle=%s", atVar.c);
                return null;
            case 3:
                return new g(atVar, new c(this, atVar, cyVar), 812);
            case 4:
                return new g(atVar, new d(this, atVar, cyVar), 813);
            case 5:
            default:
                FinskyLog.c("Skipping unknown option: type=%d, displayTitle=%s", Integer.valueOf(atVar.f3607a), atVar.c);
                return null;
            case 6:
                if ("CREDIT_CARD".equals(atVar.h)) {
                    i2 = 810;
                    i = 7;
                } else if ("PAYPAL".equals(atVar.h)) {
                    i2 = 814;
                    i = 8;
                } else if ("CARRIER_BILLING".equals(atVar.h)) {
                    i = 9;
                } else {
                    FinskyLog.e("Unexpected typeName=%s", atVar.h);
                    i2 = -1;
                    i = 6;
                }
                return new g(atVar, new e(this, i2, atVar, cyVar, bArr, i), i2);
        }
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        a(InstrumentManagerActivity.a(this.h.name, bArr2, bArr, Bundle.EMPTY), 10);
    }

    public final void w() {
        a(new Intent("android.intent.action.VIEW", g));
    }

    public final void a(io[] ioVarArr) {
        if (this.aj == null) {
            a(SwitchFamilyInstrumentActivity.a(this.h.name, ioVarArr), 11);
        } else {
            FinskyLog.e("Switching family instrument is not supported for Setup Wizard.", new Object[0]);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        int i3;
        if (i2 == -1) {
            switch (i) {
                case 2:
                case 9:
                    i3 = this.ao;
                    break;
                case 3:
                case 6:
                default:
                    FinskyLog.e("Unexpected requestCode=%d", Integer.valueOf(i));
                    i3 = -1;
                    break;
                case 4:
                    i3 = this.aq;
                    break;
                case 5:
                    i3 = this.ar;
                    break;
                case 7:
                    i3 = this.an;
                    break;
                case 8:
                    i3 = this.ap;
                    break;
                case 10:
                    i3 = this.av;
                    break;
                case 11:
                    i3 = -1;
                    break;
            }
            switch (i) {
                case 2:
                    String stringExtra = intent.getStringExtra("instrument_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        this.ax.a(i3, this.aw);
                        this.f = stringExtra;
                        a(4, 0);
                        break;
                    }
                    break;
                case 4:
                    RedeemCodeResult redeemCodeResult = (RedeemCodeResult) intent.getParcelableExtra("RedeemCodeBaseActivity.redeem_code_result");
                    if (redeemCodeResult != null) {
                        this.ax.a(i3, this.aw);
                        this.d = redeemCodeResult;
                        String str = this.d.f2205a;
                        if (TextUtils.isEmpty(str)) {
                            a(6, 0);
                            break;
                        } else {
                            this.e = str;
                            a(5, 1);
                            break;
                        }
                    }
                    break;
                case 5:
                    this.ax.a(i3, this.aw);
                    a(5, 2);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    String stringExtra2 = intent.getStringExtra("instrument_id");
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        this.ax.a(i3, this.aw);
                        this.f = stringExtra2;
                        a(4, 0);
                        break;
                    }
                    break;
                case 10:
                    String stringExtra3 = intent.getStringExtra("instrument_id");
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        this.ax.a(i3, this.aw);
                        this.f = stringExtra3;
                        a(7, 0);
                        break;
                    }
                    break;
                case 11:
                    a(8, 0);
                    break;
            }
        }
        super.a(i, i2, intent);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        a(1, volleyError);
        this.c = volleyError;
        a(3, 4);
    }

    private void a(int i, Throwable th) {
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(344);
        if (i == 0) {
            bVar.a(true);
        } else {
            bVar.a(false).a(i).a(th);
        }
        bVar.d(this.am);
        this.ax.b(bVar.f1473a);
    }

    @Override // com.google.android.finsky.epkg.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.r;
        this.h = (Account) bundle2.getParcelable("BillingProfileSidecar.account");
        this.ai = bundle2.getString("BillingProfileSidecar.purchaseContextToken");
        this.aj = (SetupWizardUtils.SetupWizardParams) bundle2.getParcelable("BillingProfileSidecar.setupWizardParams");
        this.ak = (Intent) bundle2.getParcelable("BillingProfileSidecar.redeemCodeIntent");
        this.i = FinskyApp.a().b(this.h.name);
        this.am = bundle2.getInt("BillingProfileSidecar.billingProfileFlow");
        this.an = bundle2.getInt("BillingProfileSidecar.creditCardEventType");
        this.ao = bundle2.getInt("BillingProfileSidecar.dcbEventType");
        this.ap = bundle2.getInt("BillingProfileSidecar.paypalEventType");
        this.aq = bundle2.getInt("BillingProfileSidecar.redeemEventType");
        this.ar = bundle2.getInt("BillingProfileSidecar.topupEventType");
        this.av = bundle2.getInt("BillingProfileSidecar.editEventType");
        this.aw = bundle2.getByteArray("BillingProfileSidecar.backgroundEventServerLogsCookies");
        this.ax = FinskyApp.a().c(this.h);
        super.a(bundle);
    }

    public final void u() {
        if (this.al == null) {
            this.al = new HashMap();
            int a2 = com.google.android.finsky.billing.u.a(this.aj);
            com.google.android.finsky.billing.carrierbilling.a.a(true, this.al);
            this.al.put("bpif", String.valueOf(this.am));
            this.al.put("bppcc", Base64.encodeToString(com.google.android.wallet.common.pub.e.a(f(), a2), 8));
        }
        Map<String, String> map = this.al;
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(343);
        bVar.d(this.am);
        this.ax.b(bVar.f1473a);
        a(1, 0);
        this.i.a(this.ai, map, this, this);
    }

    static /* synthetic */ void a(a aVar, cd cdVar) {
        if (aVar.aj == null) {
            aVar.a(AddDcb3Activity.a(aVar.h.name, cdVar), 2);
        } else {
            aVar.a(SetupWizardAddDcb3Activity.a(aVar.h.name, cdVar, aVar.aj), 2);
            SetupWizardUtils.a((Activity) aVar.f(), false);
        }
    }

    static /* synthetic */ void b(a aVar) {
        if (aVar.aj == null) {
            aVar.a(aVar.ak, 4);
        } else {
            aVar.a(SetupWizardRedeemCodeActivity.a(aVar.h.name, aVar.aj), 4);
            SetupWizardUtils.a((Activity) aVar.f(), false);
        }
    }

    static /* synthetic */ void a(a aVar, py pyVar) {
        if (aVar.aj == null) {
            aVar.a(StoredValueTopUpActivity.a(aVar.h.name, pyVar), 5);
        } else {
            FinskyLog.e("Top-up is not supported for Setup Wizard.", new Object[0]);
        }
    }

    static /* synthetic */ void a(a aVar, byte[] bArr, byte[] bArr2, int i) {
        if (aVar.aj == null) {
            aVar.a(InstrumentManagerActivity.a(aVar.h.name, bArr, bArr2, Bundle.EMPTY), i);
            return;
        }
        Bundle bundle = new Bundle();
        if (aVar.f().getResources().getBoolean(R.bool.setup_wizard_use_tablet_graphic) && SetupWizardUtils.a()) {
            bundle.putString("com.google.android.wallet.orchestration.TITLE_IMAGE_FIFE_URL", SetupWizardUtils.a(aVar.f(), 0));
        }
        aVar.a(SetupWizardInstrumentManagerActivity.a(aVar.h.name, bArr, bArr2, bundle, aVar.aj), i);
        SetupWizardUtils.a((Activity) aVar.f(), false);
    }
}
