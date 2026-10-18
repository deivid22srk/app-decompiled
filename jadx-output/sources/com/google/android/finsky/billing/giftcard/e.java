package com.google.android.finsky.billing.giftcard;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.e.u;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.k;
import com.google.android.finsky.protos.ls;
import com.google.android.finsky.protos.lt;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public final class e extends u {

    /* renamed from: b, reason: collision with root package name */
    lt f2226b;
    String c;
    VolleyError d;
    private com.google.android.finsky.api.b e;
    private i f;
    private final f g = new f(this, 0);

    /* renamed from: a, reason: collision with root package name */
    public ls f2225a = new ls();

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("RedeemCodeSidecar.request", ParcelableProto.a(this.f2225a));
        bundle.putParcelable("RedeemCodeSidecar.last_redeem_code_response", ParcelableProto.a(this.f2226b));
        bundle.putString("RedeemCodeSidecar.error_html", this.c);
    }

    public final void u() {
        this.f.a(800, (byte[]) null);
        if (this.f2226b != null && this.f2226b.d) {
            this.f2225a.g = this.f2226b.c;
            this.f2225a.h = true;
        } else {
            this.f2225a.g = "";
            this.f2225a.h = false;
        }
        this.f2225a.p = 0L;
        this.f2225a.q = false;
        if (this.f2226b != null && this.f2226b.n != null && this.f2226b.n.e == 3) {
            if (FinskyApp.a().v.a(this.f2226b.n.f3740a) != null) {
                this.f2225a.p = r0.c;
                this.f2225a.q = true;
            }
        }
        this.f2226b = null;
        this.d = null;
        this.c = null;
        this.e.a(this.f2225a, this.g, this.g);
        a(1, 0);
    }

    public final Document w() {
        if (this.f2226b == null || this.f2226b.m == null) {
            return null;
        }
        return new Document(this.f2226b.m);
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        String string = this.r.getString("authAccount");
        this.e = FinskyApp.a().b(string);
        this.f = FinskyApp.a().f(string);
        if (bundle != null) {
            this.f2225a = (ls) ParcelableProto.a(bundle, "RedeemCodeSidecar.request");
            this.f2226b = (lt) ParcelableProto.a(bundle, "RedeemCodeSidecar.last_redeem_code_response");
            this.c = bundle.getString("RedeemCodeSidecar.error_html");
        } else {
            this.f2225a.i = this.r.getInt("RedeemCodeSidecar.redemption_context");
            this.f2225a.j = true;
            this.f2225a.m = (dp) ParcelableProto.a(this.r, "RedeemCodeSidecar.docid");
            int i = this.r.getInt("RedeemCodeSidecar.offer_type");
            if (i != 0) {
                this.f2225a.n = i;
                this.f2225a.o = true;
            }
            String string2 = this.r.getString("RedeemCodeSidecar.partner_payload");
            if (string2 != null) {
                this.f2225a.k = string2;
                this.f2225a.l = true;
            }
        }
        this.f2225a.r = com.google.android.wallet.common.pub.e.a(f(), this.r.getInt("RedeemCodeSidecar.im_theme_res_id"));
        this.f2225a.s = true;
        super.a(bundle);
    }

    public final k v() {
        if (this.as == 2) {
            return this.f2226b.r;
        }
        FinskyLog.e("Invalid state: %d", Integer.valueOf(this.as));
        return null;
    }

    static /* synthetic */ void a(e eVar, int i, byte[] bArr) {
        com.google.android.finsky.a.b a2 = new com.google.android.finsky.a.b(801).a(bArr);
        if (i != 1) {
            a2.a(i);
        }
        eVar.f.b(a2.f1473a);
    }
}
