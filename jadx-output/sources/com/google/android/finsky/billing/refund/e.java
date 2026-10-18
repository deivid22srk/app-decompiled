package com.google.android.finsky.billing.refund;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.qq;
import com.google.android.finsky.protos.qs;
import com.google.android.finsky.protos.qt;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.aw;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes.dex */
public final class e extends com.google.android.finsky.billing.lightpurchase.b.a implements v {

    /* renamed from: a, reason: collision with root package name */
    int f2428a = 0;
    private a ao;
    private String ap;
    private String aq;

    /* renamed from: b, reason: collision with root package name */
    qq f2429b;
    f c;
    private byte[] d;
    private String e;
    private int f;
    private b g;
    private qs h;

    public static e a(String str, byte[] bArr, String str2, int i) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putByteArray("RefundFragment.clientRefundContext", bArr);
        bundle.putString("RefundFragment.documentId", str2);
        bundle.putInt("RefundFragment.backendId", i);
        eVar.f(bundle);
        return eVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.d = bundle2.getByteArray("RefundFragment.clientRefundContext");
        if (this.d == null) {
            throw new IllegalArgumentException("Client refund context is required.");
        }
        this.e = bundle2.getString("RefundFragment.documentId");
        if (this.e == null) {
            throw new IllegalArgumentException("Document ID is required.");
        }
        this.f = bundle2.getInt("RefundFragment.backendId", 0);
        if (bundle != null) {
            this.f2428a = bundle.getInt("RefundFragment.state");
            this.h = (qs) ParcelableProto.a(bundle, "RefundFragment.prepareRefundResponse");
            this.f2429b = (qq) ParcelableProto.a(bundle, "RefundFragment.commitRefundResponse");
            this.ap = bundle.getString("RefundFragment.errorTitle");
            this.aq = bundle.getString("RefundFragment.errorMessage");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("RefundFragment.state", this.f2428a);
        bundle.putParcelable("RefundFragment.prepareRefundResponse", ParcelableProto.a(this.h));
        bundle.putParcelable("RefundFragment.commitRefundResponse", ParcelableProto.a(this.f2429b));
        bundle.putString("RefundFragment.errorTitle", this.ap);
        bundle.putString("RefundFragment.errorMessage", this.aq);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.refund_fragment, viewGroup, false);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        u();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void h_() {
        if (this.g != null) {
            this.g.a((v) null);
            this.g = null;
        }
        if (this.ao != null) {
            this.ao.a((v) null);
            this.ao = null;
        }
        super.h_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.b.a
    public final int w() {
        return this.f;
    }

    final void u() {
        String str;
        String str2 = null;
        switch (this.f2428a) {
            case 0:
                b(0);
                c(1);
                return;
            case 1:
                b(1);
                if (this.g == null) {
                    ad adVar = this.B;
                    this.g = (b) adVar.a("RefundFragment.prepareRefundSidecar");
                    if (this.g == null) {
                        String str3 = this.i.name;
                        byte[] bArr = this.d;
                        b bVar = new b();
                        Bundle bundle = new Bundle();
                        bundle.putString("authAccount", str3);
                        bundle.putByteArray("PrepareRefundSidecar.clientRefundContext", bArr);
                        bVar.f(bundle);
                        this.g = bVar;
                        adVar.a().a(this.g, "RefundFragment.prepareRefundSidecar").b();
                    }
                    this.g.a(this);
                    return;
                }
                int i = this.g.as;
                switch (i) {
                    case 0:
                    case 1:
                        z();
                        return;
                    case 2:
                        this.h = this.g.f2424a;
                        a(this.h.f4308a);
                        c(3);
                        return;
                    case 3:
                        a(this.g.f2425b);
                        c(7);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown prepare refund state: %d", Integer.valueOf(i)));
                }
            case 2:
            default:
                throw new IllegalStateException(String.format("Unknown state: %d", Integer.valueOf(this.f2428a)));
            case 3:
                b(3);
                if (!(this.ai instanceof c)) {
                    String str4 = this.h.e;
                    String str5 = this.h.g;
                    String str6 = this.h.i;
                    String str7 = this.h.k;
                    String str8 = this.h.m;
                    c cVar = new c();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("RefundStep.title", str4);
                    bundle2.putString("RefundStep.subtitle", str5);
                    bundle2.putString("RefundStep.messageHtml", str6);
                    bundle2.putString("RefundStep.continueButtonLabel", str7);
                    bundle2.putString("RefundStep.secondaryButtonLabel", str8);
                    cVar.f(bundle2);
                    a((com.google.android.finsky.billing.lightpurchase.b.f<?>) cVar);
                    return;
                }
                int i2 = ((c) this.ai).f2431a;
                switch (i2) {
                    case 0:
                        return;
                    case 1:
                        c(4);
                        return;
                    case 2:
                        c(8);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown refund details state: %d", Integer.valueOf(i2)));
                }
            case 4:
                b(4);
                if (!(this.ai instanceof i)) {
                    if (this.h != null && this.h.w != null && this.h.w.length > 0) {
                        a((com.google.android.finsky.billing.lightpurchase.b.f<?>) i.a(this.h.o, this.h.q, this.h.w, this.h.s, this.h.u));
                        return;
                    } else {
                        c(5);
                        return;
                    }
                }
                int i3 = ((i) this.ai).f2431a;
                switch (i3) {
                    case 0:
                        return;
                    case 1:
                        c(5);
                        return;
                    case 2:
                        c(8);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown refund survey state: %d", Integer.valueOf(i3)));
                }
            case 5:
                b(5);
                if (this.ao == null) {
                    ad adVar2 = this.B;
                    this.ao = (a) adVar2.a("RefundFragment.commitRefundSidecar");
                    if (this.ao == null) {
                        String str9 = this.i.name;
                        byte[] bArr2 = this.h.c;
                        i iVar = (i) this.ai;
                        if (iVar.f2433b == null) {
                            str = null;
                        } else {
                            int checkedRadioButtonId = iVar.f2433b.getCheckedRadioButtonId();
                            str = checkedRadioButtonId < 0 ? null : ((qt) iVar.f2433b.findViewById(checkedRadioButtonId).getTag()).c;
                        }
                        a aVar = new a();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("authAccount", str9);
                        bundle3.putByteArray("CommitRefundSidecar.clientRefundContext", bArr2);
                        bundle3.putString("CommitRefundSidecar.refundReasonId", str);
                        aVar.f(bundle3);
                        this.ao = aVar;
                        adVar2.a().a(this.ao, "RefundFragment.commitRefundSidecar").b();
                    }
                    this.ao.a(this);
                    return;
                }
                int i4 = this.ao.as;
                switch (i4) {
                    case 0:
                    case 1:
                        z();
                        return;
                    case 2:
                        this.f2429b = this.ao.f2422a;
                        a(this.f2429b.f4304a);
                        j.a().b(this.i.name, this.e);
                        c(6);
                        return;
                    case 3:
                        a(this.ao.f2423b);
                        c(7);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown commit refund state: %d", Integer.valueOf(i4)));
                }
            case 6:
                b(6);
                if (!(this.ai instanceof g)) {
                    if (!TextUtils.isEmpty(this.f2429b.i) && (!TextUtils.isEmpty(this.f2429b.k) || !TextUtils.isEmpty(this.f2429b.m))) {
                        str2 = this.f2429b.i;
                    }
                    String str10 = this.f2429b.c;
                    String str11 = this.f2429b.e;
                    String str12 = this.f2429b.g;
                    g gVar = new g();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("RefundStep.title", str10);
                    bundle4.putString("RefundStep.messageHtml", str11);
                    bundle4.putString("RefundStep.continueButtonLabel", str12);
                    bundle4.putString("RefundStep.secondaryButtonLabel", str2);
                    gVar.f(bundle4);
                    a((com.google.android.finsky.billing.lightpurchase.b.f<?>) gVar);
                    return;
                }
                g gVar2 = (g) this.ai;
                int i5 = gVar2.f2431a;
                switch (i5) {
                    case 0:
                        return;
                    case 1:
                        c(8);
                        return;
                    case 2:
                        if (!TextUtils.isEmpty(this.f2429b.k)) {
                            GoogleHelp googleHelp = new GoogleHelp(this.f2429b.k);
                            googleHelp.c = this.i;
                            if (!TextUtils.isEmpty(this.f2429b.m)) {
                                googleHelp.q = Uri.parse(this.f2429b.m);
                            }
                            new com.google.android.gms.googlehelp.a(f()).a(googleHelp.a());
                        } else if (!TextUtils.isEmpty(this.f2429b.m)) {
                            a(new Intent("android.intent.action.VIEW", Uri.parse(this.f2429b.m)));
                        } else {
                            throw new IllegalStateException("No help action");
                        }
                        gVar2.b(0);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown refund result state: %d", Integer.valueOf(i5)));
                }
            case 7:
                b(7);
                if (!(this.ai instanceof d)) {
                    String str13 = this.ap;
                    String str14 = this.aq;
                    d dVar = new d();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("RefundStep.title", str13);
                    bundle5.putString("RefundStep.messageHtml", str14);
                    bundle5.putString("RefundStep.continueButtonLabel", null);
                    dVar.f(bundle5);
                    a((com.google.android.finsky.billing.lightpurchase.b.f<?>) dVar);
                    return;
                }
                int i6 = ((d) this.ai).f2431a;
                switch (i6) {
                    case 0:
                        return;
                    case 1:
                    case 2:
                        c(8);
                        return;
                    default:
                        throw new IllegalStateException(String.format("Unknown refund error state: %d", Integer.valueOf(i6)));
                }
            case 8:
                b(8);
                if (this.c == null) {
                    return;
                }
                this.c.g();
                return;
        }
    }

    private void b(int i) {
        if (this.f2428a != i) {
            throw new IllegalStateException(String.format("Current state is %d; expected state is %d", Integer.valueOf(this.f2428a), Integer.valueOf(i)));
        }
    }

    private void c(int i) {
        FinskyLog.a("Moving from state %d to state %d.", Integer.valueOf(this.f2428a), Integer.valueOf(i));
        this.f2428a = i;
        u();
    }

    private void a(byte[] bArr) {
        com.google.android.finsky.a.i.a(((cy) f()).getPlayStoreUiElement(), bArr);
    }

    private void a(VolleyError volleyError) {
        Context e = e();
        this.ap = aw.b(e, volleyError);
        this.aq = aw.a(e, volleyError);
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        u();
    }
}
