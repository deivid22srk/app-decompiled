package com.google.android.wallet.c.b;

import android.accounts.Account;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.t;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.l;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.common.util.m;
import com.google.android.wallet.instrumentmanager.g;
import com.google.android.wallet.instrumentmanager.ui.redirect.PopupRedirectActivity;
import com.google.android.wallet.ui.common.ah;
import com.google.b.a.a.a.b.a.apkg.h;
import com.google.b.a.a.a.b.a.bpkg.ae;
import com.google.b.a.a.a.b.a.bpkg.p;
import com.google.b.a.a.a.b.a.bpkg.r;
import com.google.b.a.a.a.b.a.k;
import com.google.d.b.a.a.b;
import com.google.d.b.a.a.d;
import com.google.d.b.a.b.c;
import com.google.d.b.a.b.e;
import com.google.d.b.a.b.f;
import com.google.d.b.a.b.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.common.pub.a<com.google.android.wallet.c.c.a> {
    private c aH;
    private e aL;
    private b aM;
    private boolean aN;
    private String aO;
    private k aP;
    private boolean aQ;
    private d[] aR;

    public static a a(Account account, SecurePaymentsPayload securePaymentsPayload, int i, Bundle bundle) {
        if (account == null) {
            throw new IllegalArgumentException("Account is a required parameter");
        }
        if (securePaymentsPayload == null) {
            throw new IllegalArgumentException("SecurePaymentsPayload is a required parameter");
        }
        a aVar = new a();
        Bundle a2 = a(i, account, bundle);
        a2.putParcelable("securePaymentsPayload", securePaymentsPayload);
        aVar.f(a2);
        return aVar;
    }

    @Override // com.google.android.wallet.common.pub.a, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null) {
            SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) this.r.getParcelable("securePaymentsPayload");
            i iVar = (i) m.a(securePaymentsPayload.f7282a, i.class);
            m.a(iVar, "actionToken=");
            com.google.d.b.a.b.b bVar = iVar.f7755b;
            this.aq = bVar.f7744b;
            this.as = bVar.c;
            this.aL = iVar.f7754a;
            this.aM = iVar.c;
            this.aQ = iVar.e;
            this.aR = iVar.f;
            switch (bVar.d) {
                case 1:
                    this.aH = bVar.e;
                    break;
                case 2:
                case 3:
                default:
                    throw new IllegalArgumentException(new StringBuilder(41).append("Unsupported flow instruction: ").append(bVar.d).toString());
                case 4:
                    this.aH = bVar.e;
                    this.aN = true;
                    this.aO = bVar.f;
                    a(bVar.f, true);
                    break;
                case 5:
                    this.aH = new c();
                    this.aP = bVar.f7743a;
                    if (this.aP.f7707b != 2) {
                        throw new IllegalArgumentException(new StringBuilder(44).append("Invalid initialize error action: ").append(this.aP.f7707b).toString());
                    }
                    break;
            }
            if (this.aH.i != null) {
                com.google.android.wallet.instrumentmanager.bpkg.a.a.a(this.aH.i, securePaymentsPayload.f7283b, iVar.d);
                return;
            }
            return;
        }
        this.aH = (c) ParcelableProto.a(bundle, "page");
        this.aL = (e) ParcelableProto.a(bundle, "purchaseManagerParameters");
        this.aM = (b) ParcelableProto.a(bundle, "androidEnvironmentConfig");
        this.aN = bundle.getBoolean("queuedIsFlowComplete");
        this.aO = bundle.getString("queuedCheckoutOrderId");
        this.aQ = bundle.getBoolean("returnSecurePayloadToIntegrator");
        ArrayList b2 = ParcelableProto.b(bundle, "forwardSecureDataMappings");
        this.aR = (d[]) b2.toArray(new d[b2.size()]);
    }

    @Override // com.google.android.wallet.common.pub.a, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (this.aN) {
            a(this.aO, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final ah E() {
        ah a2;
        if (this.aP != null) {
            t f = f();
            int i = this.aI;
            k kVar = this.aP;
            com.google.android.wallet.common.e.a aVar = new com.google.android.wallet.common.e.a();
            Bundle a3 = com.google.android.wallet.common.e.a.a(i, (com.google.protobuf.nano.c) null);
            Bundle bundle = new Bundle();
            com.google.android.wallet.common.util.e.a(bundle, kVar.f7707b, f.getString(g.wallet_im_error_title), kVar.f7706a, null, kVar.d, f.getString(R.string.ok));
            a3.putBundle("errorDetails", bundle);
            aVar.f(a3);
            a2 = aVar;
        } else {
            if (com.google.android.wallet.instrumentmanager.bpkg.a.a.a(this.aH.i) && Build.VERSION.SDK_INT < 14) {
                throw new IllegalStateException("Redirect form is not supported on API < 14.");
            }
            if (com.google.android.wallet.instrumentmanager.bpkg.a.a.a(this.aH.i) && this.aH.i.f.f == 2) {
                if (!this.an) {
                    throw new IllegalStateException("Server requested popup redirect form, but popup UI is not supported.");
                }
                b(PopupRedirectActivity.a(f(), this.aH.i.f, this.aH.f7745a, this.am, this.aI, this.aq.c), 501);
                a2 = com.google.android.wallet.instrumentmanager.ui.redirect.a.a(this.aH.i.f, this.aI);
            } else if (this.aH.i != null) {
                a2 = com.google.android.wallet.instrumentmanager.bpkg.a.a.a(this.aH.i, this.aI);
            } else {
                throw new IllegalStateException("No form specified");
            }
        }
        h().a().b(com.google.android.wallet.instrumentmanager.e.sub_form_holder, a2).b();
        return a2;
    }

    @Override // com.google.android.wallet.common.pub.a, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("page", ParcelableProto.a(this.aH));
        bundle.putParcelable("purchaseManagerParameters", ParcelableProto.a(this.aL));
        bundle.putParcelable("androidEnvironmentConfig", ParcelableProto.a(this.aM));
        bundle.putBoolean("queuedIsFlowComplete", this.aN);
        bundle.putString("queuedCheckoutOrderId", this.aO);
        bundle.putBoolean("returnSecurePayloadToIntegrator", this.aQ);
        bundle.putParcelableArrayList("forwardSecureDataMappings", ParcelableProto.a(this.aR));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void a(int[] iArr, Bundle bundle, byte[] bArr) {
        String str;
        if (!this.f.b(iArr)) {
            com.google.android.wallet.common.bpkg.a.a.a(this.f, 1623);
            this.f.c();
            return;
        }
        this.au = bundle;
        this.av = bArr;
        f fVar = new f();
        fVar.f7751b = a(bundle, bArr);
        if (this.aQ) {
            com.google.b.a.a.a.b.a.apkg.bpkg.c cVar = fVar.f7751b.f7747a;
            d[] dVarArr = this.aR;
            int length = dVarArr.length;
            com.google.android.wallet.common.pub.g[] gVarArr = new com.google.android.wallet.common.pub.g[length];
            for (int i = 0; i < length; i++) {
                d dVar = dVarArr[i];
                if (cVar.d != null && dVar.f7742b.f7650a.equals(cVar.d.f7642a) && dVar.f7742b.f7651b == 1) {
                    ae aeVar = cVar.d.c[dVar.f7742b.c].f7645b.f7636a;
                    if (!TextUtils.isEmpty(aeVar.e)) {
                        str = aeVar.e;
                        aeVar.e = "";
                    } else {
                        str = aeVar.f7661b;
                        aeVar.f7661b = "";
                    }
                    gVarArr[i] = new com.google.android.wallet.common.pub.g(dVar.f7741a, str);
                } else {
                    throw new IllegalArgumentException(String.format("Unsupported SecureDataMapping FormFieldReference formId=%s fieldId=%d repeatedFieldIndex=%d", dVar.f7742b.f7650a, Integer.valueOf(dVar.f7742b.f7651b), Integer.valueOf(dVar.f7742b.c)));
                }
            }
            SecurePaymentsPayload securePaymentsPayload = new SecurePaymentsPayload(com.google.protobuf.nano.c.a(fVar), gVarArr);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
            a(50, bundle2, false);
            return;
        }
        a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void a(Bundle bundle, byte[] bArr, com.google.b.a.a.a.b.a.b bVar) {
        throw new UnsupportedOperationException("PurchaseManager API doesn't support refresh.");
    }

    private com.google.d.b.a.b.d a(Bundle bundle, byte[] bArr) {
        com.google.d.b.a.b.d dVar = new com.google.d.b.a.b.d();
        dVar.f7747a = com.google.android.wallet.instrumentmanager.bpkg.a.a.a(this.f, bundle);
        if (bArr != null) {
            dVar.f7748b = bArr;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void H() {
        com.google.d.b.a.b.g gVar = ((com.google.android.wallet.c.c.a) this.ap).i;
        switch (gVar.d) {
            case 1:
                this.aH = gVar.e;
                this.aQ = false;
                this.aR = null;
                u();
                v();
                return;
            case 2:
                a(4, Bundle.EMPTY);
                return;
            case 3:
                a(gVar.f, false);
                return;
            case 4:
                this.aH = gVar.e;
                this.aQ = false;
                this.aR = null;
                u();
                v();
                this.aN = true;
                this.aO = gVar.f;
                a(gVar.f, true);
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(37).append("Unknown flow instruction: ").append(gVar.d).toString());
        }
    }

    private void a(String str, boolean z) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("com.google.android.wallet.purchasemanager.CHECKOUT_ORDER_ID", str);
        }
        a(50, bundle, z);
    }

    @Override // com.google.android.wallet.common.pub.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.aN || view.getId() != com.google.android.wallet.instrumentmanager.e.positive_btn || this.aA != null) {
            super.onClick(view);
        } else {
            com.google.android.wallet.common.bpkg.a.a.a(this.f, -1, 1621);
            a(this.aO, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final boolean I() {
        com.google.d.b.a.b.g gVar = ((com.google.android.wallet.c.c.a) this.ap).i;
        switch (((com.google.android.wallet.c.c.a) this.ap).g) {
            case 4:
                a(gVar.f7752a.c);
                break;
            case 5:
                k kVar = gVar.f7752a;
                c(com.google.android.wallet.common.util.e.a(new Bundle(), kVar.f7707b, f_(g.wallet_im_error_title), kVar.f7706a, null, kVar.d, f_(R.string.ok)));
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void J() {
        com.google.d.b.a.b.g gVar = ((com.google.android.wallet.c.c.a) this.ap).i;
        if (gVar != null) {
            this.aq = gVar.f7753b;
            this.as = gVar.c;
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public final com.google.android.wallet.analytics.f getUiElement() {
        return new com.google.android.wallet.analytics.f(1619, this.aq.c);
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        ArrayList arrayList = new ArrayList();
        if (this.aH.c != null) {
            arrayList.add(this.ai);
        }
        arrayList.add(this.f);
        return arrayList;
    }

    private void a(f fVar) {
        this.ao = fVar;
        Map<String, String> a2 = com.google.android.wallet.common.util.i.a(this.as.f7702a);
        com.google.android.wallet.c.c.a aVar = (com.google.android.wallet.c.c.a) this.ap;
        com.google.b.a.a.a.b.a.f fVar2 = this.aq;
        if (fVar.f7750a != null) {
            throw new IllegalArgumentException("SubmitRequest's RequestContext should not be set by the caller");
        }
        com.google.android.wallet.common.d.c cVar = new com.google.android.wallet.common.d.c(aVar, fVar2.c);
        com.google.android.wallet.c.a.a.a aVar2 = new com.google.android.wallet.c.a.a.a(aVar.d, fVar, a2, fVar2.f7701b, new com.google.android.wallet.c.c.b(aVar), cVar);
        cVar.f7275a = aVar2;
        aVar.a((l<?>) aVar2, true);
        com.google.android.wallet.common.bpkg.a.a.a(724, 1, fVar2.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void G() {
        f fVar = (f) this.ao;
        fVar.f7751b = a(this.au, this.av);
        a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String w() {
        return this.aH.f7745a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final p x() {
        return this.aH.f7746b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String y() {
        return this.aH.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final String z() {
        return this.aH.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.b.a.a.a.b.a.bpkg.e A() {
        return this.aH.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final com.google.d.b.a.a.bpkg.b B() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final h C() {
        return this.aH.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final r D() {
        return this.aH.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final boolean K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void L() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final void M() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.pub.a
    public final /* synthetic */ com.google.android.wallet.c.c.a F() {
        Account account = this.ax;
        b bVar = this.aM;
        com.google.android.wallet.c.c.a aVar = new com.google.android.wallet.c.c.a();
        aVar.f(com.google.android.wallet.c.c.a.a(account, bVar));
        return aVar;
    }
}
