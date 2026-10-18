package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.sv;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.au;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.jr;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class OfferResolutionActivity extends android.support.v7.a.ae implements View.OnClickListener, com.android.volley.s, gp, com.google.android.finsky.api.model.x, da {
    private DfeToc k;
    private Account l;
    private Document m;
    private com.google.android.finsky.api.model.h n;
    private au o;
    private com.google.android.finsky.a.i p;
    private final com.google.android.finsky.a.ai q = com.google.android.finsky.a.i.a(780);

    public static Intent a(DfeToc dfeToc, Account account, String str, Document document, au auVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) OfferResolutionActivity.class);
        intent.putExtra("OfferResolutionActivity.dfeToc", dfeToc);
        intent.putExtra("OfferResolutionActivity.account", account);
        intent.putExtra("OfferResolutionActivity.docid", str);
        intent.putExtra("OfferResolutionActivity.doc", document);
        if (auVar != null) {
            intent.putExtra("OfferResolutionActivity.offerFilter", auVar.name());
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = true;
        super.onCreate(bundle);
        setContentView(R.layout.light_purchase_offer_resolution);
        Intent intent = getIntent();
        this.k = (DfeToc) intent.getParcelableExtra("OfferResolutionActivity.dfeToc");
        this.l = (Account) intent.getParcelableExtra("OfferResolutionActivity.account");
        ((TextView) findViewById(R.id.title)).setText(R.string.offer_resolution_dialog_title);
        this.p = FinskyApp.a().c(this.l);
        String stringExtra = intent.getStringExtra("OfferResolutionActivity.docid");
        this.m = (Document) intent.getParcelableExtra("OfferResolutionActivity.doc");
        if (intent.hasExtra("OfferResolutionActivity.offerFilter")) {
            this.o = au.valueOf(intent.getStringExtra("OfferResolutionActivity.offerFilter"));
        }
        if (bundle == null) {
            this.p.a(0L, (cy) this);
        }
        if (this.m != null) {
            if (FinskyApp.a().e().a(12603117L)) {
                boolean z2 = this.m.f1963a.e == 20 || this.m.f1963a.e == 19;
                boolean a2 = jr.a(FinskyApp.a().p.a(this.l));
                if (!z2 || !a2) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                j();
                return;
            }
        }
        findViewById(R.id.contents).setVisibility(8);
        findViewById(R.id.loading_indicator).setVisibility(0);
        this.p.b(213, null, this);
        this.n = new com.google.android.finsky.api.model.h(FinskyApp.a().b(this.l.name), com.google.android.finsky.api.s.a(stringExtra), false, jr.b(FinskyApp.a().p.a(this.l)));
        this.n.a((com.google.android.finsky.api.model.x) this);
        this.n.a((com.android.volley.s) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.n != null) {
            this.n.a((com.google.android.finsky.api.model.x) this);
            this.n.a((com.android.volley.s) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        if (this.n != null) {
            this.n.b((com.google.android.finsky.api.model.x) this);
            this.n.b((com.android.volley.s) this);
        }
        super.onStop();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        aa aaVar = (aa) view.getTag();
        Intent intent = new Intent();
        intent.putExtra("OfferResolutionActivity.document", aaVar.f2304a);
        intent.putExtra("OfferResolutionActivity.offer", ParcelableProto.a(aaVar.f2305b));
        this.p.a(782, aaVar.f2304a.f1963a.R, this);
        setResult(-1, intent);
        finish();
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        this.m = this.n.b();
        if (this.m == null) {
            a(getString(R.string.item_unavailable_message));
        } else if (!com.google.android.finsky.utils.cy.a(this.m, FinskyApp.a().g, FinskyApp.a().p.a(this.l))) {
            a(getString(as.a(this.m)));
        } else {
            j();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        a(aw.a(this, volleyError));
    }

    private void a(String str) {
        gn gnVar = new gn();
        gnVar.a(str).d(R.string.ok);
        gnVar.b().a(d(), "OfferResolutionActivity.errorDialog");
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        setResult(0);
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    public static aa a(Intent intent) {
        return new aa((Document) intent.getParcelableExtra("OfferResolutionActivity.document"), (ea) ParcelableProto.a(intent, "OfferResolutionActivity.offer"), (byte) 0);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.q;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void p_() {
        FinskyLog.e("Not using impression id's.", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void i() {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.p != null) {
            this.p.b(603, null, this);
        }
        super.finish();
    }

    private void j() {
        boolean z;
        boolean z2;
        int i;
        ea a2;
        findViewById(R.id.contents).setVisibility(0);
        findViewById(R.id.loading_indicator).setVisibility(8);
        com.google.android.finsky.a.i.a(this.q, this.m.f1963a.R);
        this.p.b(781, null, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.offers);
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        if (FinskyApp.a().e().a(12602952L) && ((i = this.m.f1963a.e) == 16 || i == 17)) {
            Document a3 = i == 16 ? this.m.a(0) : this.m;
            if (a3 != null) {
                if (!(com.google.android.finsky.utils.cy.a(a3, FinskyApp.a().p, this.l) != null) && (a2 = as.a(a3, this.k, FinskyApp.a().p.a(this.l), 1)) != null && a2.A != 2 && a2.d > 0) {
                    arrayList.add(new aa(a3, a2, (byte) 0));
                }
            }
        }
        if (this.m.aM()) {
            as.c(this.m, this.k, FinskyApp.a().p.a(this.l));
            for (Document document : this.m.aN()) {
                ea d = document.d(1);
                if (d == null) {
                    FinskyLog.c("Skipping subscription doc, no PURCHASE offer: %s", document.f1963a.f3890a);
                } else {
                    arrayList.add(new aa(document, d, (byte) 0));
                }
            }
        } else {
            for (ea eaVar : this.m.f1963a.u) {
                if (eaVar.A != 2) {
                    arrayList.add(new aa(this.m, eaVar, (byte) 0));
                }
            }
        }
        if (this.o != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!this.o.a(((aa) it.next()).f2305b.A)) {
                    it.remove();
                }
            }
        }
        if (arrayList.isEmpty()) {
            a(getString(R.string.item_unavailable_message));
            return;
        }
        int i2 = this.m.f1963a.g;
        com.google.android.finsky.g.a a4 = FinskyApp.a().p.a(this.l);
        boolean z3 = false;
        int size = arrayList.size();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i3 = 0;
        while (i3 < size) {
            aa aaVar = (aa) arrayList.get(i3);
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.light_purchase_offer_resolution_entry, viewGroup, false);
            TextView textView = (TextView) viewGroup2.findViewById(R.id.title);
            TextView textView2 = (TextView) viewGroup2.findViewById(R.id.price);
            TextView textView3 = (TextView) viewGroup2.findViewById(R.id.full_price);
            TextView textView4 = (TextView) viewGroup2.findViewById(R.id.byline);
            textView.setText(aaVar.f2305b.j);
            textView2.setText(aaVar.f2305b.h);
            textView2.setTextColor(com.google.android.finsky.utils.ai.c(this, i2));
            boolean a5 = FinskyApp.a().e().a(12603136L);
            if (as.a(aaVar.f2305b) && !a5) {
                textView3.setVisibility(0);
                textView3.setText(aaVar.f2305b.t);
                textView3.setPaintFlags(textView3.getPaintFlags() | 16);
                textView3.setContentDescription(getResources().getString(R.string.content_description_full_price, aaVar.f2305b.t));
                textView2.setContentDescription(getResources().getString(R.string.content_description_current_price, aaVar.f2305b.h));
            } else {
                textView3.setVisibility(8);
            }
            if (!TextUtils.isEmpty(aaVar.f2305b.l)) {
                textView4.setText(aaVar.f2305b.l);
            } else {
                textView4.setVisibility(8);
            }
            viewGroup2.setTag(aaVar);
            viewGroup2.setOnClickListener(this);
            viewGroup.addView(viewGroup2);
            if (i3 < size - 1) {
                viewGroup.addView(layoutInflater.inflate(R.layout.light_purchase_separator, viewGroup, false));
            }
            if (z3) {
                z = z3;
            } else {
                Document document2 = this.m;
                int i4 = aaVar.f2305b.A;
                if (document2.v()) {
                    for (sv svVar : document2.w()) {
                        if (jr.a(svVar.f4406a.c, a4)) {
                            ea[] eaVarArr = svVar.f4407b;
                            for (ea eaVar2 : eaVarArr) {
                                if (eaVar2.A == i4) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                z2 = false;
                z = z2 && !com.google.android.finsky.utils.cy.a(document2, a4, i4);
            }
            i3++;
            z3 = z;
        }
        if (z3 && this.m.x()) {
            findViewById(R.id.voucher_section).setVisibility(0);
            ((ImageView) findViewById(R.id.voucher_icon)).setImageResource(com.google.android.finsky.utils.ai.j(i2));
            ColorStateList c = com.google.android.finsky.utils.ai.c(this, i2);
            TextView textView5 = (TextView) findViewById(R.id.voucher_message);
            textView5.setText(this.m.y());
            textView5.setTextColor(c);
        }
    }
}
