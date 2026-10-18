package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.protos.cr;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class k extends com.google.android.finsky.billing.lightpurchase.bpkg.f<PurchaseFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final ai f2360a = com.google.android.finsky.apkg.i.a(1270);

    /* renamed from: b, reason: collision with root package name */
    public cr f2361b;
    public com.google.android.finsky.billing.bpkg.a c;
    public EditText d;
    public View e;

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2361b = (cr) ParcelableProto.a(this.r, "CvcChallengeStep.challenge");
        this.c = com.google.android.finsky.billing.bpkg.a.a(this.f2361b.e);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = layoutInflater.inflate(R.layout.light_purchase_cvc_challenge_step, viewGroup, false);
        TextView textView = (TextView) this.e.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2361b.f3693a)) {
            textView.setText(this.f2361b.f3693a);
        }
        TextView textView2 = (TextView) this.e.findViewById(R.id.message);
        if (!TextUtils.isEmpty(this.f2361b.c)) {
            textView2.setText(Html.fromHtml(this.f2361b.c));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setLinkTextColor(textView2.getTextColors());
        } else {
            textView2.setVisibility(8);
        }
        this.d = (EditText) this.e.findViewById(R.id.cvc_entry);
        this.d.addTextChangedListener(new l(this));
        if (this.c != null) {
            this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.c.g)});
        }
        this.d.setOnEditorActionListener(new m(this));
        ((ImageView) this.e.findViewById(R.id.cvc_image)).setOnClickListener(new n(this));
        y();
        return this.e;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        ik.a((Activity) f(), this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        boolean z = false;
        if (this.c != null) {
            if (this.d.getText().length() == this.c.g) {
                z = true;
            }
        } else if (!TextUtils.isEmpty(this.d.getText())) {
            z = true;
        }
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a(z);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        return resources.getString(R.string.verify);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        aj ajVar;
        byte b2 = 0;
        if (!z) {
            ajVar = null;
        } else {
            aj ajVar2 = new aj();
            ajVar2.f = true;
            ajVar2.g = true;
            ajVar = ajVar2;
        }
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a(1271, ajVar, this);
        PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
        String obj = this.d.getText().toString();
        purchaseFragment.d = this.f2361b.g;
        com.google.android.finsky.billing.lightpurchase.e eVar = purchaseFragment.f2277a;
        if (eVar.as == 1) {
            FinskyLog.e("escrowCvcCode() called while RUNNING.", new Object[0]);
        }
        FinskyApp.a().f1434a.a(new com.google.android.finsky.billing.bpkg.b(obj, new com.google.android.finsky.billing.lightpurchase.j(eVar, b2), new com.google.android.finsky.billing.lightpurchase.i(eVar, b2)));
        eVar.a(1, 6);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2360a;
    }

    public static /* synthetic */ com.google.android.finsky.billing.lightpurchase.bpkg.a b(k kVar) {
        return (com.google.android.finsky.billing.lightpurchase.bpkg.a) kVar.E;
    }
}
