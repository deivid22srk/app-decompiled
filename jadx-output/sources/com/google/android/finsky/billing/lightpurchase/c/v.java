package com.google.android.finsky.billing.lightpurchase.c;

import android.accounts.Account;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.GiftEmailParams;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.LabelEditText;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.lj;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class v extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> implements com.android.volley.s, com.android.volley.t<lj>, com.google.android.finsky.api.model.x, cy {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2374a = com.google.android.finsky.c.d.eY.b().intValue();

    /* renamed from: b, reason: collision with root package name */
    private static final int f2375b = com.google.android.finsky.c.d.eZ.b().intValue();
    private String ai;
    private String aj;
    private String ak;
    private String al;
    private com.google.android.finsky.api.model.h am;
    private View an;
    private TextView ao;
    private TextView ap;
    private LabelEditText aq;
    private LabelEditText ar;
    private EditText as;
    private final ai at = com.google.android.finsky.a.i.a(1310);
    private Account c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        lj ljVar2 = ljVar;
        if (ljVar2.f4082a != null) {
            this.ak = ljVar2.f4082a.i;
            A();
        } else {
            this.ak = "";
        }
    }

    public static v a(Account account, int i, String str, String str2, Document document, GiftEmailParams giftEmailParams) {
        Bundle bundle = new Bundle();
        v vVar = new v();
        bundle.putParcelable("GiftEmailStep.account", account);
        bundle.putInt("GiftEmailStep.backend", i);
        bundle.putString("GiftEmailStep.fullDocid", str);
        bundle.putString("GiftEmailStep.offerId", str2);
        if (giftEmailParams != null) {
            bundle.putString("GiftEmailStep.recipientEmailAddress", giftEmailParams.f2276b);
            bundle.putString("GiftEmailStep.senderName", giftEmailParams.f2275a);
            bundle.putString("GiftEmailStep.giftMessage", giftEmailParams.c);
        }
        if (document != null) {
            bundle.putInt("GiftEmailStep.documentType", document.f1963a.e);
            bundle.putString("GiftEmailStep.title", document.f1963a.i);
            bundle.putString("GiftEmailStep.offerTitle", document.a(str2).h);
        }
        vVar.f(bundle);
        return vVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.c = (Account) bundle2.getParcelable("GiftEmailStep.account");
        this.d = bundle2.getInt("GiftEmailStep.backend");
        this.e = bundle2.getInt("GiftEmailStep.documentType");
        this.f = bundle2.getString("GiftEmailStep.fullDocid");
        this.g = bundle2.getString("GiftEmailStep.offerId");
        this.ai = bundle2.getString("GiftEmailStep.recipientEmailAddress");
        this.aj = bundle2.getString("GiftEmailStep.senderName");
        this.al = bundle2.getString("GiftEmailStep.giftMessage");
        if (bundle != null) {
            this.h = bundle.getString("GiftEmailStep.title");
            this.i = bundle.getString("GiftEmailStep.offerTitle");
            this.ai = bundle.getString("GiftEmailStep.recipientEmailAddress");
            this.aj = bundle.getString("GiftEmailStep.senderName");
            this.al = bundle.getString("GiftEmailStep.giftMessage");
        } else {
            this.h = bundle2.getString("GiftEmailStep.title");
            this.i = bundle2.getString("GiftEmailStep.offerTitle");
            this.ai = bundle2.getString("GiftEmailStep.recipientEmailAddress");
            this.aj = bundle2.getString("GiftEmailStep.senderName");
            this.al = bundle2.getString("GiftEmailStep.giftMessage");
        }
        if (this.h == null) {
            this.am = new com.google.android.finsky.api.model.h(FinskyApp.a().b(this.c.name), com.google.android.finsky.api.s.a(this.f));
            this.am.a((com.google.android.finsky.api.model.x) this);
            this.am.a((com.android.volley.s) this);
        }
        if (this.ak == null) {
            FinskyApp.a().c().a(this.c).a(this, this, true);
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("GiftEmailStep.title", this.h);
        bundle.putString("GiftEmailStep.offerTitle", this.i);
        bundle.putString("GiftEmailStep.recipientEmailAddress", this.ar.getTextValue());
        bundle.putString("GiftEmailStep.senderName", this.aq.getTextValue());
        bundle.putString("GiftEmailStep.defaultSenderName", this.ak);
        bundle.putString("GiftEmailStep.giftMessage", this.as.getText().toString().trim());
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an = layoutInflater.inflate(R.layout.light_purchase_gift_email_step, viewGroup, false);
        boolean z = this.e == 48;
        this.an.findViewById(R.id.gift_dialog_header).setBackgroundColor(g().getColor(z ? R.color.play_credit_primary : com.google.android.finsky.utils.ai.a(this.d)));
        ScrollView scrollView = (ScrollView) this.an.findViewById(R.id.scroll_view);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new w(this, scrollView));
        ((LinearLayout) this.an.findViewById(R.id.item_title_container)).setOrientation(z ? 0 : 1);
        this.ao = (TextView) this.an.findViewById(R.id.item_title);
        this.ap = (TextView) this.an.findViewById(R.id.item_offer_title);
        ((TextView) this.an.findViewById(R.id.gift_email_copy)).setText(a(R.string.gift_email_copy_description, this.c.name));
        this.ar = (LabelEditText) this.an.findViewById(R.id.to_email_text);
        this.ar.setTextValue(this.ai);
        this.aq = (LabelEditText) this.an.findViewById(R.id.from_name_text);
        this.aq.setTextValue(this.aj);
        this.aq.setFilters(new InputFilter[]{new InputFilter.LengthFilter(f2375b)});
        this.as = (EditText) this.an.findViewById(R.id.gift_message_text);
        this.as.setText(this.al);
        this.as.setFilters(new InputFilter[]{new InputFilter.LengthFilter(f2374a)});
        TextView textView = (TextView) this.an.findViewById(R.id.character_count);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.al != null ? this.al.length() : 0);
        objArr[1] = Integer.valueOf(f2374a);
        textView.setText(a(R.string.character_count_format, objArr));
        this.as.addTextChangedListener(new x(this, textView));
        return this.an;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.an.getContext(), f_(R.string.send_gift), this.an);
        View findFocus = this.an.findFocus();
        if (TextUtils.isEmpty(this.ai)) {
            ik.a((Activity) f(), (EditText) this.ar);
        } else if (findFocus != null) {
            ik.a((Activity) f(), (EditText) findFocus);
        }
        z();
        A();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.continue_text);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        boolean z;
        boolean z2 = true;
        this.ai = this.ar.getTextValue();
        this.aj = this.aq.getTextValue();
        this.al = this.as.getText().toString().trim();
        if (TextUtils.isEmpty(this.ai)) {
            ik.a(this.ar, f_(R.string.to_email_hint_short), f_(R.string.to_email_hint));
            z = true;
        } else if (Patterns.EMAIL_ADDRESS.matcher(this.ai).matches()) {
            z = false;
        } else {
            ik.a(this.ar, f_(R.string.to_email_hint_short), f_(R.string.email_format_error));
            z = true;
        }
        if (TextUtils.isEmpty(this.aj)) {
            ik.a(this.aq, f_(R.string.from_name_hint_short), f_(R.string.from_name_hint));
        } else {
            z2 = z;
        }
        if (z2) {
            return;
        }
        a(1311, (aj) null);
        PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E);
        com.google.android.finsky.billing.lightpurchase.q qVar = new com.google.android.finsky.billing.lightpurchase.q();
        qVar.c = this.al;
        qVar.f2392a = this.aj;
        qVar.f2393b = this.ai;
        purchaseFragment.f2277a.a(new GiftEmailParams(qVar, (byte) 0));
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.at;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        ea a2;
        Document b2 = this.am.b();
        if (b2 == null) {
            FinskyLog.c("Got empty document for displaying gift item.", new Object[0]);
            return;
        }
        this.h = b2.f1963a.i;
        if (b2.f1963a.u.length > 1 && (a2 = b2.a(this.g)) != null) {
            this.i = a2.j;
        }
        if (j()) {
            z();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c(volleyError.toString(), new Object[0]);
    }

    private void z() {
        this.ao.setText(this.h);
        if (this.i != null) {
            this.ap.setText(this.i);
        }
    }

    private void A() {
        if (TextUtils.isEmpty(this.aj) && !this.aq.hasFocus()) {
            this.aq.setTextValue(this.ak);
        }
    }
}
