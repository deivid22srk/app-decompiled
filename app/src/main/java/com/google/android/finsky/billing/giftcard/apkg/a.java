package com.google.android.finsky.billing.giftcard.apkg;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.layout.BillingAddress;
import com.google.android.finsky.protos.aq;
import com.google.android.finsky.protos.cj;
import com.google.android.finsky.protos.cq;
import com.google.android.finsky.protos.cv;
import com.google.android.finsky.protos.db;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.protos.v;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.lightpurchase.bpkg.f<com.google.android.finsky.billing.giftcard.a> {

    /* renamed from: a, reason: collision with root package name */
    public ai f2209a = com.google.android.finsky.apkg.i.a(1104);

    /* renamed from: b, reason: collision with root package name */
    public cj f2210b;
    public aq c;
    public BillingAddress d;
    public ViewGroup e;
    public List<sa> f;
    public Bundle g;
    public int h;

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2210b = (cj) ParcelableProto.a(this.r, "ConfirmationStep.challenge");
        this.h = this.r.getInt("ui_mode");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = bundle;
        this.e = (ViewGroup) layoutInflater.inflate(this.h == 0 ? R.layout.redeem_addresschallenge_step : R.layout.setup_wizard_redeem_address_step, viewGroup, false);
        this.c = new aq();
        int length = this.f2210b.n.length;
        this.c.c = new int[length];
        System.arraycopy(this.f2210b.n, 0, this.c.c, 0, length);
        if (!TextUtils.isEmpty(this.f2210b.l) && bundle == null) {
            this.e.post(new b(this));
        }
        TextView textView = (TextView) this.e.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f2210b.e)) {
            if (textView != null) {
                textView.setText(this.f2210b.e);
            }
            if (this.h == 1) {
                f().setTitle(this.f2210b.e);
            }
        }
        TextView textView2 = (TextView) this.e.findViewById(R.id.description);
        if (!TextUtils.isEmpty(this.f2210b.g)) {
            textView2.setText(Html.fromHtml(this.f2210b.g));
            textView2.setLinkTextColor(textView2.getTextColors());
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView2.setVisibility(8);
        }
        LayoutInflater from = LayoutInflater.from(f());
        ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(R.id.content);
        int indexOfChild = viewGroup2.indexOfChild(textView2) + 1;
        for (int i = 0; i < this.f2210b.i.length; i++) {
            cv cvVar = this.f2210b.i[i];
            CheckBox checkBox = (CheckBox) from.inflate(R.layout.billing_addresschallenge_checkbox, this.e, false);
            checkBox.setText(cvVar.f3701a);
            checkBox.setTag(cvVar);
            checkBox.setChecked(cvVar.c);
            viewGroup2.addView(checkBox, indexOfChild + i);
        }
        this.d = (BillingAddress) this.e.findViewById(R.id.billing_address);
        this.d.setBillingCountryChangeListener(new c(this));
        if (this.f2210b.o.length > 0) {
            this.f = cz.a(this.f2210b.o.length);
            for (cq cqVar : this.f2210b.o) {
                sa saVar = new sa();
                saVar.f4367a = cqVar.f3691a;
                saVar.f4368b = true;
                saVar.c = cqVar.c;
                saVar.d = true;
                this.f.add(saVar);
            }
            c(this.g);
        } else {
            new com.google.android.finsky.billing.ai().a(this.r.getString("authAccount"), new d(this));
        }
        return this.e;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.d != null) {
            this.d.a(bundle);
        }
    }

    public void c(Bundle bundle) {
        this.d.setBillingCountries(this.f);
        if (bundle != null) {
            this.d.b(bundle);
            return;
        }
        if (this.f2210b.j != null && !TextUtils.isEmpty(this.f2210b.j.q)) {
            this.d.a(u.a(this.f2210b.j.q, this.f), this.c, this.f2210b.j);
        } else {
            this.d.a(u.a(u.a(f(), (String) null), this.f), this.c, null);
        }
        new Handler(Looper.getMainLooper()).post(new e(this));
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        return f_(R.string.continue_text);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2209a;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        a(1105, (aj) null);
        List<db> addressValidationErrors = this.d.getAddressValidationErrors();
        this.d.a();
        ArrayList arrayList = new ArrayList();
        Iterator<db> it = addressValidationErrors.iterator();
        while (it.hasNext()) {
            TextView a2 = this.d.a(it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        TextView textView = (TextView) u.a(this.e, arrayList);
        if (textView != null) {
            textView.requestFocus();
        }
        v address = addressValidationErrors.size() == 0 ? this.d.getAddress() : null;
        if (address != null) {
            com.google.android.finsky.billing.giftcard.a aVar = (com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
            ArrayList arrayList2 = new ArrayList();
            int length = this.f2210b.i.length;
            for (int i = 0; i < length; i++) {
                if (((CheckBox) this.e.findViewWithTag(this.f2210b.i[i])).isChecked()) {
                    arrayList2.add(this.f2210b.i[i].g);
                }
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            com.google.android.finsky.billing.giftcard.e eVar = aVar.f2208b;
            if (eVar.as != 4) {
                FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar.as));
                return;
            }
            eVar.f2225a.e = address;
            eVar.f2225a.f = strArr;
            eVar.u();
        }
    }

    public static /* synthetic */ void d(a aVar) {
        if (aVar.q_()) {
            aVar.f = com.google.android.finsky.billing.k.f();
            if (aVar.f != null && aVar.f.size() > 0) {
                aVar.c(aVar.g);
            } else {
                FinskyLog.e("BillingCountries not loaded.", new Object[0]);
            }
        }
    }
}
