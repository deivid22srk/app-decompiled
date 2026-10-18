package com.google.android.finsky.billing.refund;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.n;
import com.google.android.finsky.e.u;
import com.google.android.finsky.protos.qp;
import com.google.android.finsky.protos.qq;

/* loaded from: classes.dex */
public final class a extends u implements s, t<qq> {

    /* renamed from: a, reason: collision with root package name */
    qq f2422a;

    /* renamed from: b, reason: collision with root package name */
    VolleyError f2423b;
    private String c;
    private byte[] d;
    private String e;
    private n<?> f;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qq qqVar) {
        this.f2422a = qqVar;
        a(2, 0);
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.c = bundle2.getString("authAccount");
        this.d = bundle2.getByteArray("CommitRefundSidecar.clientRefundContext");
        this.e = bundle2.getString("CommitRefundSidecar.refundReasonId");
        if (this.d == null) {
            throw new IllegalArgumentException("Client refund context is required.");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        if (this.as == 0 && this.f == null) {
            qp qpVar = new qp();
            qpVar.f4302a = this.d;
            qpVar.f4303b = true;
            if (!TextUtils.isEmpty(this.e)) {
                qpVar.c = this.e;
                qpVar.d = true;
            }
            this.f = FinskyApp.a().b(this.c).a(qpVar, this, this);
            a(1, 0);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2423b = volleyError;
        a(3, 0);
    }
}
