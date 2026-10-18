package com.google.android.finsky.billing.giftcard;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.b.y;
import com.google.android.finsky.billing.at;
import com.google.android.finsky.billing.giftcard.a.h;
import com.google.android.finsky.billing.giftcard.a.i;
import com.google.android.finsky.billing.iab.m;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.ah;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.protos.jd;
import com.google.android.finsky.protos.k;
import com.google.android.finsky.protos.l;
import com.google.android.finsky.protos.lu;
import com.google.android.finsky.protos.pb;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.lightpurchase.b.a implements gp, v {

    /* renamed from: a, reason: collision with root package name */
    public int f2207a;

    /* renamed from: b, reason: collision with root package name */
    public e f2208b;
    public RedeemCodeResult c;
    private String d;
    private int e;
    private dp f;
    private int g;
    private boolean h;

    public static a a(String str, int i, int i2, int i3, dp dpVar, int i4, String str2, int i5, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putInt("RedeemCodeFragment.redemption_context", i);
        bundle.putInt("RedeemCodeFragment.backend", i2);
        bundle.putInt("ui_mode", i3);
        bundle.putParcelable("RedeemCodeFragment.docid", ParcelableProto.a(dpVar));
        bundle.putInt("RedeemCodeFragment.offer_type", i4);
        bundle.putString("RedeemCodeFragment.prefill_code", str2);
        bundle.putInt("RedeemCodeSidecar.im_theme_res_id", i5);
        bundle.putString("RedeemCodeFragment.partner_payload", str3);
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.d = this.r.getString("authAccount");
        this.f2207a = this.r.getInt("ui_mode");
        this.e = this.r.getInt("RedeemCodeFragment.redemption_context");
        this.f = (dp) ParcelableProto.a(this.r, "RedeemCodeFragment.docid");
        if (this.e == 1 && this.f == null) {
            throw new IllegalStateException("Null docid in purchase context.");
        }
        if (bundle != null) {
            this.g = bundle.getInt("RedeemCodeFragment.last_state_instance");
            this.c = (RedeemCodeResult) bundle.getParcelable("RedeemCodeFragment.redeem_code_result");
            this.h = bundle.getBoolean("RedeemCodeFragment.code_screen_skipped");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("RedeemCodeFragment.last_state_instance", this.g);
        bundle.putParcelable("RedeemCodeFragment.redeem_code_result", this.c);
        bundle.putBoolean("RedeemCodeFragment.code_screen_skipped", this.h);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.f2207a == 0 ? R.layout.light_purchase : R.layout.setup_wizard_redeem_code_fragment, viewGroup, false);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        Button button = (Button) this.ak.findViewById(R.id.cancel_button);
        if (button != null) {
            button.setText(R.string.cancel);
            button.setOnClickListener(new b(this));
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.f2208b = (e) this.B.a("RedeemCodeFragment.sidecar");
        if (this.f2208b == null) {
            Bundle bundle = this.r;
            String str = this.d;
            int i = this.e;
            dp dpVar = this.f;
            int i2 = bundle.getInt("RedeemCodeFragment.offer_type");
            int i3 = bundle.getInt("RedeemCodeSidecar.im_theme_res_id");
            String string = bundle.getString("RedeemCodeFragment.partner_payload");
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", str);
            bundle2.putInt("RedeemCodeSidecar.redemption_context", i);
            bundle2.putParcelable("RedeemCodeSidecar.docid", ParcelableProto.a(dpVar));
            bundle2.putInt("RedeemCodeSidecar.offer_type", i2);
            bundle2.putInt("RedeemCodeSidecar.im_theme_res_id", i3);
            bundle2.putString("RedeemCodeSidecar.partner_payload", string);
            e eVar = new e();
            eVar.f(bundle2);
            this.f2208b = eVar;
            this.B.a().a(this.f2208b, "RedeemCodeFragment.sidecar").b();
        }
        this.f2208b.a(this);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void h_() {
        this.f2208b.a((v) null);
        super.h_();
    }

    public final void a(String str) {
        e eVar = this.f2208b;
        eVar.f2225a.f4095a = str;
        eVar.f2225a.f4096b = true;
        eVar.u();
    }

    public final void u() {
        if (this.c != null) {
            k v = this.f2208b.v();
            if (v.f4021a != null) {
                if (this.f2207a == 1) {
                    FinskyLog.e("Cannot perform success action during Setup Wizard", new Object[0]);
                } else if (a(v.f4021a)) {
                    FinskyLog.a("Dialog shown, waiting for user input.", new Object[0]);
                    return;
                }
            }
        }
        v();
    }

    public final boolean a(l lVar) {
        Account a2 = com.google.android.finsky.api.a.a(this.d, f());
        if (lVar.c != null) {
            Document document = new Document(lVar.c.f3855a);
            if (this.e == 1 && as.a(this.f)) {
                return false;
            }
            String str = document.E().w;
            int i = document.E().e;
            y a3 = FinskyApp.a().v.a(str);
            if (!(a3 != null && a3.c >= i)) {
                return a(a2, document, (String) null);
            }
            Intent launchIntentForPackage = f().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                launchIntentForPackage = cr.b(f(), document);
            }
            a(launchIntentForPackage);
            return false;
        }
        if (lVar.f4066a != null) {
            return com.google.android.finsky.navigationmanager.a.a(f(), a2, new Document(lVar.f4066a.f3938a), this.B, this, 1, null);
        }
        if (lVar.f4067b != null) {
            a(cr.a(f()));
        } else if (lVar.d != null) {
            Document w = this.f2208b.w();
            Document document2 = new Document(lVar.d.f4109a);
            if (document2.f1963a.e == 11) {
                PurchaseParams a4 = m.a(e(), document2.c(), w.f1963a.f3890a);
                if (a4 != null) {
                    a(PurchaseActivity.a(a2, a4, document2.f1963a.R, (Bundle) null));
                    return false;
                }
            } else if (document2.f1963a.e == 1) {
                return a(a2, document2, w.f1963a.f3890a);
            }
            ah a5 = PurchaseParams.a().a(document2);
            a5.d = lVar.d.f4110b;
            a5.i = w.f1963a.f3890a;
            a(PurchaseActivity.a(this.i, a5.a(), document2.f1963a.R, (Bundle) null));
        } else if (lVar.e != null) {
            jd jdVar = lVar.e.f3896a;
            if (jdVar != null) {
                this.c = new RedeemCodeResult(this.c.f2205a, this.c.f2206b, this.c.c, jdVar, this.c.a());
            } else {
                FinskyLog.e("Unexpected missing link", new Object[0]);
            }
        } else {
            FinskyLog.c("Unsupported PostSuccessAction.", new Object[0]);
        }
        return false;
    }

    private boolean a(Account account, Document document, String str) {
        if (this.e == 1 && this.f.c == 1) {
            this.c = new RedeemCodeResult(this.c.f2205a, true, this.c.c, this.c.d, str);
            return false;
        }
        a(LightPurchaseFlowActivity.a(account, document, null, 1, null, document.f1963a.R, null, 0, str, false), 2);
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        switch (i) {
            case 2:
                if (i2 == -1) {
                    a(cr.b(f(), new Document(this.f2208b.v().f4021a.c.f3855a)));
                }
                v();
                break;
            default:
                super.a(i, i2, intent);
                break;
        }
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        String str;
        jb[] jbVarArr;
        String str2;
        lu luVar = null;
        cj cjVar = null;
        pb pbVar = null;
        if (uVar != this.f2208b) {
            FinskyLog.e("Received state change for unknown fragment: %s", uVar);
            return;
        }
        if (this.f2208b.au <= this.g) {
            FinskyLog.a("Already received state instance %d, ignore.", Integer.valueOf(this.g));
            return;
        }
        FinskyLog.b("State changed: %d", Integer.valueOf(this.f2208b.as));
        this.g = this.f2208b.au;
        switch (this.f2208b.as) {
            case 0:
                String string = this.r.getString("RedeemCodeFragment.prefill_code");
                if (!TextUtils.isEmpty(string)) {
                    this.h = true;
                    a(string);
                    return;
                } else {
                    a(i.a(this.d, string, (String) null, this.f2207a));
                    return;
                }
            case 1:
                z();
                return;
            case 2:
                e eVar = this.f2208b;
                if (eVar.as != 2) {
                    FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar.as));
                    jbVarArr = null;
                } else {
                    jbVarArr = eVar.f2226b.s;
                }
                e eVar2 = this.f2208b;
                if (eVar2.as != 2) {
                    FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar2.as));
                    str2 = null;
                } else {
                    str2 = eVar2.f2226b.k;
                }
                this.c = new RedeemCodeResult(str2, false, this.e == 1 ? m.a(jbVarArr, this.f) : null, null, null);
                if (this.e == 3) {
                    Document w = this.f2208b.w();
                    e eVar3 = this.f2208b;
                    dp dpVar = eVar3.f2226b != null ? eVar3.f2226b.n : null;
                    if (w != null && as.a(w.c()) && dpVar != null && dpVar.e == 3) {
                        m.a((Activity) f(), dpVar.f3740a);
                    }
                }
                k v = this.f2208b.v();
                int a2 = at.a(v);
                if (a2 == 0) {
                    u();
                    return;
                }
                boolean z = this.f2207a == 1;
                if (z && v.f == null) {
                    throw new IllegalArgumentException("Setup Wizard template is required for the Setup Wizard success step.");
                }
                Bundle a3 = at.a(v, a2);
                a3.putBoolean("RedeemSuccessStep.in_setup_wizard", z);
                com.google.android.finsky.billing.lightpurchase.b.f<?> lVar = new com.google.android.finsky.billing.giftcard.a.l();
                lVar.f(a3);
                a(lVar);
                return;
            case 3:
                if (this.f2208b.at == 1 && this.f2208b.d != null) {
                    str = aw.a(f(), this.f2208b.d);
                } else {
                    str = this.f2208b.c;
                }
                FinskyLog.a("Redemption error: %s", str);
                if (this.ai instanceof i) {
                    A();
                    i iVar = (i) this.ai;
                    iVar.f2220b = str;
                    ik.a((Activity) iVar.f(), iVar.f2219a);
                    iVar.Q_();
                    iVar.w();
                    return;
                }
                this.h = false;
                String str3 = this.d;
                e eVar4 = this.f2208b;
                a(i.a(str3, eVar4.f2225a != null ? eVar4.f2225a.f4095a : null, str, this.f2207a));
                return;
            case 4:
                String str4 = this.d;
                e eVar5 = this.f2208b;
                if (eVar5.as != 4) {
                    FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar5.as));
                } else {
                    cjVar = eVar5.f2226b.f;
                }
                int i = this.f2207a;
                Bundle bundle = new Bundle();
                bundle.putString("authAccount", str4);
                bundle.putParcelable("ConfirmationStep.challenge", ParcelableProto.a(cjVar));
                bundle.putInt("ui_mode", i);
                com.google.android.finsky.billing.lightpurchase.b.f<?> aVar = new com.google.android.finsky.billing.giftcard.a.a();
                aVar.f(bundle);
                a(aVar);
                return;
            case 5:
                e eVar6 = this.f2208b;
                if (eVar6.as != 5) {
                    FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar6.as));
                } else {
                    luVar = eVar6.f2226b.e;
                }
                int i2 = this.f2207a;
                boolean z2 = this.h;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ConfirmationStep.challenge", ParcelableProto.a(luVar));
                bundle2.putInt("ui_mode", i2);
                bundle2.putBoolean("ConfirmationStep.code_screen_skipped", z2);
                com.google.android.finsky.billing.giftcard.a.f fVar = new com.google.android.finsky.billing.giftcard.a.f();
                fVar.f2215a = luVar;
                fVar.f(bundle2);
                a((com.google.android.finsky.billing.lightpurchase.b.f<?>) fVar);
                return;
            case 6:
                String str5 = this.d;
                e eVar7 = this.f2208b;
                if (eVar7.as != 6) {
                    FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar7.as));
                } else {
                    pbVar = eVar7.f2226b.q;
                }
                int i3 = this.r.getInt("RedeemCodeSidecar.im_theme_res_id");
                com.google.android.finsky.billing.lightpurchase.b.f<?> hVar = new h();
                hVar.f(h.a(str5, pbVar, i3));
                a(hVar);
                return;
            default:
                FinskyLog.e("Unknown sidecar state: %d", Integer.valueOf(this.f2208b.as));
                return;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            a(cr.a(f(), bundle.getString("dialog_details_url")));
            v();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        if (i == 1) {
            v();
        }
    }

    public final void v() {
        c cVar;
        if (this.s instanceof c) {
            cVar = (c) this.s;
        } else if (f() instanceof c) {
            cVar = (c) f();
        } else {
            cVar = null;
        }
        if (cVar == null) {
            FinskyLog.e("No listener.", new Object[0]);
        } else {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.b.a
    public final int w() {
        Document w;
        int i = this.r.getInt("RedeemCodeFragment.backend");
        if (this.f2208b == null || (w = this.f2208b.w()) == null) {
            return i;
        }
        return w.f1963a.g;
    }
}
