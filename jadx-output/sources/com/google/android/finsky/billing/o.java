package com.google.android.finsky.billing;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.layout.SeparatorLinearLayout;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends m implements gp {
    private ViewGroup ai;
    private ViewGroup aj;
    private TextView ak;
    private View al;
    private TextView am;
    private final com.google.android.finsky.a.ai h = com.google.android.finsky.a.i.a(800);
    private final ArrayList<Runnable> i = new ArrayList<>();

    public static o a(Account account, String str, dp dpVar, int i, com.google.android.finsky.protos.as asVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileFragment.account", account);
        bundle.putString("BillingProfileFragment.purchaseContextToken", str);
        bundle.putParcelable("BillingProfileFragment.docid", ParcelableProto.a(dpVar));
        bundle.putInt("BillingProfileFragment.offer_type", i);
        bundle.putParcelable("BillingProfileFragment.prefetchedBillingProfile", ParcelableProto.a(asVar));
        o oVar = new o();
        oVar.f(bundle);
        return oVar;
    }

    @Override // com.google.android.finsky.billing.m, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null) {
            this.d.a(0L, (cy) this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.billing_profile, viewGroup, false);
        this.ai = (ViewGroup) viewGroup2.findViewById(R.id.existing_instruments);
        this.aj = (ViewGroup) viewGroup2.findViewById(R.id.actions);
        this.f = viewGroup2.findViewById(R.id.loading_indicator);
        this.e = viewGroup2.findViewById(R.id.profile);
        this.ak = (TextView) viewGroup2.findViewById(R.id.actions_header);
        this.ak.setText(f_(R.string.billing_profile_other_options).toUpperCase());
        this.al = viewGroup2.findViewById(R.id.actions_header_separator);
        this.am = (TextView) viewGroup2.findViewById(R.id.description);
        return viewGroup2;
    }

    private void a(ViewGroup viewGroup, com.google.android.finsky.billing.lightpurchase.billingprofile.g gVar, boolean z, String str, byte[] bArr) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (str == null) {
            View inflate2 = from.inflate(R.layout.billing_profile_entry, viewGroup, false);
            if (z) {
                inflate2.findViewById(R.id.checkmark).setVisibility(0);
            }
            inflate2.setOnClickListener(gVar.f);
            inflate = inflate2;
        } else {
            inflate = from.inflate(R.layout.billing_profile_disabled_entry, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.byline)).setText(str);
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(gVar.f2334a);
        TextView textView = (TextView) inflate.findViewById(R.id.subtitle);
        if (!TextUtils.isEmpty(gVar.f2335b)) {
            textView.setText(gVar.f2335b);
            textView.setVisibility(0);
        }
        FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(R.id.image_icon);
        ds dsVar = gVar.c;
        if (dsVar == null) {
            fifeImageView.setVisibility(8);
        } else {
            fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
        }
        viewGroup.addView(inflate);
        this.i.add(new p(this, gVar));
        if (!TextUtils.isEmpty(gVar.d) && gVar.e != null && gVar.e.length > 0) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.edit_button);
            textView2.setText(gVar.d.toUpperCase());
            inflate.setOnClickListener(new q(this, gVar, bArr));
            textView2.setVisibility(0);
        }
    }

    @Override // com.google.android.finsky.billing.m
    protected final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.am.setText(Html.fromHtml(str));
            this.am.setMovementMethod(LinkMovementMethod.getInstance());
            this.am.setVisibility(0);
        }
    }

    @Override // com.google.android.finsky.billing.m
    protected final void x() {
        this.ai.removeAllViews();
        this.aj.removeAllViews();
        this.i.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(List<com.google.android.finsky.billing.lightpurchase.billingprofile.g> list) {
        Iterator<com.google.android.finsky.billing.lightpurchase.billingprofile.g> it = list.iterator();
        while (it.hasNext()) {
            a(this.aj, it.next(), false, (String) null, (byte[]) null);
        }
        if (this.aj.getChildCount() > 0) {
            ((SeparatorLinearLayout) this.aj.getChildAt(this.aj.getChildCount() - 1)).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(io[] ioVarArr, byte[] bArr) {
        if (ioVarArr.length == 0) {
            this.ak.setVisibility(8);
            this.al.setVisibility(8);
        } else {
            this.ak.setVisibility(0);
            this.al.setVisibility(0);
        }
        String str = this.f2411b.f3606b;
        for (io ioVar : ioVarArr) {
            String str2 = ioVar.s.length > 0 ? ioVar.s[0].c : null;
            String str3 = ioVar.f3961a;
            a(this.ai, new com.google.android.finsky.billing.lightpurchase.billingprofile.g(ioVar.c, ioVar.C, ioVar.e, ioVar.x, ioVar.v, new r(this, ioVar, str3), ioVar.z, 802), str3.equals(str), str2, bArr);
        }
        if (this.ai.getChildCount() > 0) {
            ((SeparatorLinearLayout) this.ai.getChildAt(this.ai.getChildCount() - 1)).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void c(String str) {
        f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void d(String str) {
        f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void e(String str) {
        if (str != null) {
            f(str);
        } else {
            this.e.post(new s(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(String str) {
        v();
        gn gnVar = new gn();
        gnVar.b(str).d(R.string.ok).a(this, 1, null);
        gnVar.b().a(this.B, "BillingProfileFragment.errorDialog");
    }

    protected final void f(String str) {
        t J = J();
        if (J != null) {
            J.a(str);
        }
    }

    private void I() {
        t J = J();
        if (J != null) {
            J.a();
        }
    }

    private t J() {
        if (f() instanceof t) {
            return (t) f();
        }
        FinskyLog.e("No listener registered.", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int A() {
        return 320;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int B() {
        return 321;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int C() {
        return 322;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int D() {
        return 323;
    }

    @Override // com.google.android.finsky.billing.m
    protected final int E() {
        return 325;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int F() {
        return 324;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final byte[] G() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final int H() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void u() {
        this.d.b(213, null, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void w() {
        this.d.b(801, null, this);
        Iterator<Runnable> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            I();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        if (i == 1) {
            I();
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final void a(RedeemCodeResult redeemCodeResult) {
        t J = J();
        if (J == null) {
            return;
        }
        J.a(redeemCodeResult);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.m
    public final Intent z() {
        Bundle bundle = this.r;
        return RedeemCodeActivity.a(this.c.name, 0, (dp) ParcelableProto.a(bundle, "BillingProfileFragment.docid"), bundle.getInt("BillingProfileFragment.offer_type"));
    }
}
