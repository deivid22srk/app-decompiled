package com.google.android.finsky.billing.refund;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.n;
import com.google.android.finsky.epkg.u;
import com.google.android.finsky.protos.qr;
import com.google.android.finsky.protos.qs;

/* loaded from: classes.dex */
public final class b extends u implements s, t<qs> {

    /* renamed from: a, reason: collision with root package name */
    qs f2424a;

    /* renamed from: b, reason: collision with root package name */
    VolleyError f2425b;
    private String c;
    private byte[] d;
    private n<?> e;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qs qsVar) {
        this.f2424a = qsVar;
        a(2, 0);
    }

    @Override // com.google.android.finsky.epkg.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.c = bundle2.getString("authAccount");
        this.d = bundle2.getByteArray("PrepareRefundSidecar.clientRefundContext");
        if (this.d == null) {
            throw new IllegalArgumentException("Client refund context is required.");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        if (this.as == 0 && this.e == null) {
            qr qrVar = new qr();
            qrVar.f4306a = this.d;
            qrVar.f4307b = true;
            this.e = FinskyApp.a().b(this.c).a(qrVar, this, this);
            a(1, 0);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2425b = volleyError;
        a(3, 0);
    }
}
