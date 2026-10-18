package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.am;
import com.google.android.finsky.billing.an;
import com.google.android.finsky.protos.bk;
import com.google.android.finsky.protos.cn;
import com.google.android.finsky.protos.kw;
import com.google.android.finsky.protos.kz;
import com.google.android.finsky.protos.ma;
import com.google.android.finsky.protos.mb;
import com.google.android.finsky.protos.mc;
import com.google.android.finsky.protos.me;
import com.google.android.finsky.protos.mo;
import com.google.android.finsky.protos.mp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.jb;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends com.google.android.finsky.e.u {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.api.b f2381a;
    long ai;
    com.google.android.finsky.api.n<?> aj;
    Bundle ak;
    com.google.android.finsky.protos.k al;
    cn am;
    cn an;
    String ao;
    VolleyError ap;
    CheckoutPurchaseError aq;
    GiftEmailParams ar;
    private com.google.android.finsky.a.i av;
    private long aw;
    private com.google.android.finsky.api.n<?> ax;

    /* renamed from: b, reason: collision with root package name */
    byte[] f2382b;
    PurchaseParams c;
    public ma d;
    public boolean e;
    kw[] f;
    mc g;
    mb h;
    public boolean i;

    public e() {
        k();
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        this.f2381a = FinskyApp.a().b(this.r.getString("authAccount"));
        this.c = (PurchaseParams) this.r.getParcelable("CheckoutPurchaseSidecar.purchaseParams");
        this.av = FinskyApp.a().c(this.f2381a.b());
        super.a(bundle);
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("CheckoutPurchaseSidecar.authenticationInfo", ParcelableProto.a(this.d));
        bundle.putParcelable("CheckoutPurchaseSidecar.cart", ParcelableProto.a(this.g));
        bundle.putParcelable("CheckoutPurchaseSidecar.changeSubscription", ParcelableProto.a(this.h));
        bundle.putBoolean("CheckoutPurchaseSidecar.isInstantPurchase", this.e);
        bundle.putBoolean("CheckoutPurchaseSidecar.cartExpandedAtStart", this.i);
        bundle.putParcelable("CheckoutPurchaseSidecar.prepareChallenge", ParcelableProto.a(this.am));
        bundle.putParcelable("CheckoutPurchaseSidecar.completeChallenge", ParcelableProto.a(this.an));
        bundle.putBundle("CheckoutPurchaseSidecar.extraPurchaseData", this.ak);
        bundle.putParcelable("CheckoutPurchaseSidecar.post_acquisition_prompt", ParcelableProto.a(this.al));
        bundle.putParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError", this.aq);
        bundle.putByteArray("CheckoutPurchaseSidecar.serverLogsCookie", this.f2382b);
        bundle.putParcelable("CheckoutPurchaseSidecar.legalDocuments", ParcelableProtoArray.a(this.f));
        bundle.putParcelable("CheckoutPurchaseSidecar.giftEmailParams", this.ar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.u
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d = (ma) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.authenticationInfo");
        this.g = (mc) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.cart");
        this.h = (mb) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.changeSubscription");
        this.e = bundle.getBoolean("CheckoutPurchaseSidecar.isInstantPurchase");
        this.i = bundle.getBoolean("CheckoutPurchaseSidecar.cartExpandedAtStart");
        this.am = (cn) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.prepareChallenge");
        this.an = (cn) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.completeChallenge");
        this.ak = bundle.getBundle("CheckoutPurchaseSidecar.extraPurchaseData");
        this.al = (com.google.android.finsky.protos.k) ParcelableProto.a(bundle, "CheckoutPurchaseSidecar.post_acquisition_prompt");
        this.aq = (CheckoutPurchaseError) bundle.getParcelable("CheckoutPurchaseSidecar.checkoutPurchaseError");
        this.f2382b = bundle.getByteArray("CheckoutPurchaseSidecar.serverLogsCookie");
        this.f = (kw[]) ParcelableProtoArray.a(bundle, "CheckoutPurchaseSidecar.legalDocuments");
        this.ar = (GiftEmailParams) bundle.getParcelable("CheckoutPurchaseSidecar.giftEmailParams");
    }

    public final void a(String str, VoucherParams voucherParams, Bundle bundle, ma maVar, an anVar, Boolean bool, Map<String, String> map) {
        kz f;
        this.e = false;
        this.d = maVar;
        a(302, anVar);
        Map<String, String> i = i(bundle);
        i.putAll(map);
        this.aw = SystemClock.elapsedRealtime();
        if (FinskyApp.a().e().a(12603427L) && (f = jb.f(this.f2381a.c())) != null) {
            i.put("upc", com.google.android.finsky.api.s.a(com.google.protobuf.nano.c.a(f)));
        }
        String str2 = null;
        if (anVar != null) {
            str2 = anVar.a();
            byte[] bArr = anVar.c;
            if (bArr != null && bArr.length > 0) {
                i.put("upcsc", com.google.android.finsky.api.s.a(bArr));
            }
        }
        if (bool != null) {
            i.put("st", bool.toString());
        }
        this.ax = this.f2381a.a(this.c.f2282b, this.c.d, this.c.e, this.c.l, this.d, str, this.c.j, voucherParams, this.c.f, str2, i, new m(this, (byte) 0), new l(this, (byte) 0));
        this.ai = 0L;
        this.aj = null;
        a(1, 1);
    }

    public final void u() {
        if (this.c.c != null && this.c.c.E() != null && this.c.c.E().S) {
            FinskyApp.a().l.a(this.c.f2282b, this.c.c.E().R);
        }
        FinskyApp.a().r.b(this.c.f2282b, this.c.h);
        FinskyApp.a().k.a(this.c.f2282b, this.c.f, this.f2381a.c(), this.g.f4115a, false, "single_install", 2, this.c.c != null ? this.c.c.t() : null);
    }

    final void a(int i, an anVar) {
        this.av.b(b(i, anVar).f1473a);
    }

    final void a(int i, int i2, long j, long j2) {
        this.av.b(b(i, (an) null).a(i2).a(j).b(j2).f1473a);
    }

    private com.google.android.finsky.a.b b(int i, an anVar) {
        am amVar;
        byte[] bArr;
        am amVar2 = null;
        if (this.e) {
            amVar2 = new am();
            amVar2.c = 1;
            amVar2.d = true;
        }
        byte[] bArr2 = this.f2382b;
        if (anVar != null) {
            amVar = amVar2 == null ? new am() : amVar2;
            int[] iArr = new int[anVar.f2166a.size()];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= anVar.f2166a.size()) {
                    break;
                }
                iArr[i3] = anVar.f2166a.get(i3).intValue();
                i2 = i3 + 1;
            }
            amVar.e = iArr;
            bArr = anVar.c;
            if (bArr == null || bArr.length <= 0) {
                bArr = bArr2;
            }
        } else {
            amVar = amVar2;
            bArr = bArr2;
        }
        if (this.g != null && this.g.C != null) {
            if (amVar == null) {
                amVar = new am();
            }
            amVar.f = this.g.C.c;
            amVar.g = true;
        }
        com.google.android.finsky.a.b a2 = new com.google.android.finsky.a.b(i).a(this.c.f2282b).b(this.c.d).a(bArr);
        a2.f1473a.W = amVar;
        return a2;
    }

    public final void a(GiftEmailParams giftEmailParams) {
        if (this.ar == null) {
            this.ar = giftEmailParams;
            a(13, 0);
        } else {
            a(14, 0);
            this.ar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long w() {
        if (this.aw > 0) {
            return SystemClock.elapsedRealtime() - this.aw;
        }
        FinskyLog.e("Prepare not started.", new Object[0]);
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long x() {
        if (this.ax == null) {
            FinskyLog.e("Unexpected null prepare request.", new Object[0]);
            return -1L;
        }
        return this.ax.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long y() {
        if (this.ai > 0) {
            return SystemClock.elapsedRealtime() - this.ai;
        }
        FinskyLog.e("Complete not started: %b", Boolean.valueOf(this.e));
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long z() {
        if (this.aj == null) {
            FinskyLog.e("Unexpected null complete request: %b", Boolean.valueOf(this.e));
            return -1L;
        }
        return this.aj.n;
    }

    public final void a(mo moVar) {
        if (this.e) {
            this.e = false;
            a(302, (an) null);
        }
        this.am = null;
        this.g = null;
        this.h = null;
        this.aq = null;
        this.f2382b = moVar.f;
        mp mpVar = moVar.f4138a;
        a(303, mpVar.f4140a, x(), w());
        switch (mpVar.f4140a) {
            case 0:
                this.g = moVar.c;
                this.h = moVar.d;
                a(this.h != null ? 4 : 5, 0);
                break;
            case 1:
            default:
                FinskyLog.e("Unknown status returned from server: %d", Integer.valueOf(mpVar.f4140a));
                this.aq = new CheckoutPurchaseError();
                a(3, 5);
                break;
            case 2:
                this.am = moVar.f4139b;
                this.g = moVar.c;
                a(6, 0);
                break;
            case 3:
                this.aq = new CheckoutPurchaseError(mpVar.e, mpVar.c);
                a(3, 5);
                break;
        }
    }

    static Map<String, String> i(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public final void v() {
        if (this.as != 2 && this.at != 7) {
            FinskyLog.e("confirmAuthChoiceSelected() called in state %d and substate %d", Integer.valueOf(this.as), Integer.valueOf(this.at));
        }
        a(2, 8);
    }

    static /* synthetic */ void a(e eVar, me meVar, mo moVar) {
        eVar.an = null;
        eVar.al = null;
        eVar.aq = null;
        eVar.f2382b = meVar.e;
        mp mpVar = meVar.f4119a;
        eVar.a(305, mpVar.f4140a, eVar.z(), eVar.y());
        com.google.android.finsky.protos.jb[] jbVarArr = meVar.c;
        bk bkVar = meVar.l;
        FinskyApp.a().q.a(eVar.f2381a.b(), "CheckoutPurchaseSidecar.commit", new f(eVar, meVar, mpVar, moVar), jbVarArr);
        eVar.ak = com.google.android.finsky.billing.iab.m.a(jbVarArr, eVar.c.f2281a);
        if (bkVar == null) {
            return;
        }
        if (eVar.ak == null) {
            eVar.ak = new Bundle();
        }
        eVar.ak.putParcelable("purchase_total_price", ParcelableProto.a(bkVar));
    }
}
