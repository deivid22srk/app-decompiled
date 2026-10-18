package com.google.android.finsky.billing.carrierbilling.b;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.carrierbilling.model.SubscriberInfo;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import com.google.android.play.layout.PlayActionButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends com.google.android.finsky.e.m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public m f2189a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2190b;
    private EditText c;
    private ViewGroup d;
    private com.android.a.a.l e;
    private int f;
    private int g;
    private Button h;
    private Button i;

    public static k a(String str, int i, SubscriberInfo subscriberInfo, ArrayList<Integer> arrayList, int i2) {
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("prefill_address", subscriberInfo);
        bundle.putInt("type", i);
        bundle.putIntegerArrayList("highlight_address", arrayList);
        bundle.putInt("ui_mode", i2);
        kVar.f(bundle);
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return this.g == 0 ? 845 : 896;
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.e.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.e.b(bundle);
        }
    }

    private void a(View view, com.android.a.a.a aVar) {
        this.e = new com.android.a.a.l(f(), (com.google.android.finsky.layout.e) view.findViewById(R.id.address_widget), u.a(this.f), new com.google.android.finsky.billing.a(FinskyApp.a().f1435b), aVar == null ? null : aVar.f1055a);
        this.e.i = new l(this);
        this.e.a(aVar);
    }

    private void a(String str) {
        this.c.setVisibility(0);
        if (!jm.a((CharSequence) str)) {
            this.c.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Collection<java.lang.Integer> r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.carrierbilling.b.k.a(java.util.Collection):void");
    }

    private void a(TextView textView, String str, int i) {
        ik.a(textView, str, f_(i));
    }

    private SubscriberInfo v() {
        com.android.a.a.a b2 = this.e.b();
        com.google.android.finsky.billing.carrierbilling.model.b bVar = new com.google.android.finsky.billing.carrierbilling.model.b();
        bVar.f2197a = this.f2190b.getText().toString();
        bVar.g = b2.g;
        bVar.h = b2.f1055a;
        bVar.f2198b = w();
        if (this.f == 0) {
            bVar.c = b2.f1056b;
            bVar.d = b2.c;
            bVar.e = b2.e;
            bVar.f = b2.d;
        }
        return bVar.a();
    }

    private String w() {
        return this.c.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (view == this.h) {
            String charSequence = this.f2190b.getText().toString();
            String w = w();
            com.android.a.a.g c = this.e.c();
            int i2 = this.f;
            ArrayList arrayList = new ArrayList();
            if (jm.a((CharSequence) charSequence)) {
                arrayList.add(0);
            }
            if (jm.a((CharSequence) w)) {
                arrayList.add(7);
            }
            for (Map.Entry<com.android.a.a.e, com.android.a.a.f> entry : c.f1108a.entrySet()) {
                if (1 == i2) {
                    switch (entry.getKey()) {
                    }
                }
                switch (entry.getKey()) {
                    case STREET_ADDRESS:
                        i = 3;
                        break;
                    case ADDRESS_LINE_2:
                        i = 4;
                        break;
                    case LOCALITY:
                        i = 5;
                        break;
                    case ADMIN_AREA:
                        i = 6;
                        break;
                    case POSTAL_CODE:
                        i = 2;
                        break;
                    case COUNTRY:
                        i = 1;
                        break;
                    default:
                        i = -1;
                        break;
                }
                arrayList.add(Integer.valueOf(i));
            }
            b(846);
            if (arrayList.isEmpty()) {
                ik.a(f(), this.d);
                this.f2189a.a(v());
                return;
            } else {
                a((Collection<Integer>) arrayList);
                return;
            }
        }
        if (view == this.i) {
            b(847);
            this.f2189a.a(null);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.r;
        this.g = this.r.getInt("ui_mode");
        View inflate = layoutInflater.inflate(this.g == 0 ? R.layout.billing_info_edit : R.layout.setup_wizard_billing_info_edit, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.edit_section);
        viewGroup2.setFocusableInTouchMode(true);
        viewGroup2.requestFocus();
        this.d = viewGroup2;
        this.f2190b = (EditText) viewGroup2.findViewById(R.id.name);
        this.c = (EditText) viewGroup2.findViewById(R.id.phone_number_edit);
        SetupWizardNavBar setupWizardNavBar = ((com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.b) f()).o;
        if (setupWizardNavBar != null) {
            this.h = setupWizardNavBar.f4642a;
            this.i = setupWizardNavBar.f4643b;
        } else {
            this.h = (Button) inflate.findViewById(R.id.positive_button);
            this.i = (Button) inflate.findViewById(R.id.negative_button);
        }
        if (this.h instanceof PlayActionButton) {
            ((PlayActionButton) this.h).a(3, R.string.save, this);
        } else {
            this.h.setOnClickListener(this);
            this.h.setText(R.string.save);
        }
        if (FinskyApp.a().d(bundle2.getString("authAccount")).a(12603132L)) {
            this.i.setVisibility(8);
        } else if (this.i instanceof PlayActionButton) {
            ((PlayActionButton) this.i).a(0, R.string.cancel, this);
        } else {
            this.i.setOnClickListener(this);
            this.i.setText(R.string.cancel);
        }
        this.f = bundle2.getInt("type");
        SubscriberInfo subscriberInfo = (SubscriberInfo) bundle2.getParcelable("prefill_address");
        if (subscriberInfo != null) {
            this.f2190b.setText(subscriberInfo.f2195a);
            String str = subscriberInfo.f2196b;
            if (jm.a((CharSequence) str)) {
                str = PhoneNumberUtils.formatNumber(com.google.android.finsky.billing.k.c());
            }
            a(str);
            a(viewGroup2, new com.android.a.a.c().e(subscriberInfo.c).f(subscriberInfo.d).c(subscriberInfo.e).b(subscriberInfo.f).d(subscriberInfo.g).a(subscriberInfo.h).a());
        } else {
            a(PhoneNumberUtils.formatNumber(com.google.android.finsky.billing.k.c()));
            a(viewGroup2, (com.android.a.a.a) null);
        }
        return inflate;
    }

    static /* synthetic */ Collection a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            switch (num.intValue()) {
                case 4:
                    arrayList2.add(0);
                    continue;
                case 5:
                    break;
                case 6:
                    arrayList2.add(4);
                    continue;
                case 7:
                    arrayList2.add(5);
                    continue;
                case 8:
                    arrayList2.add(6);
                    continue;
                case 9:
                    arrayList2.add(2);
                    continue;
                case 10:
                    arrayList2.add(1);
                    continue;
                case 11:
                default:
                    FinskyLog.c("InputValidationError that can't be displayed: type=%d", num);
                    continue;
                case 12:
                    arrayList2.add(7);
                    continue;
                case 13:
                    FinskyLog.a("Input error ADDR_WHOLE_ADDRESS. Displaying at ADDRESS_LINE_1.", new Object[0]);
                    break;
            }
            arrayList2.add(3);
        }
        return arrayList2;
    }
}
