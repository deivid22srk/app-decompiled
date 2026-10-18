package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.placesapi.WhitelistedCountriesFlagParser;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class BillingAddress extends LinearLayout implements co {

    /* renamed from: a, reason: collision with root package name */
    private static String f2929a = "address_spec";

    /* renamed from: b, reason: collision with root package name */
    private static String f2930b = "selected_country";
    private EditText c;
    private EditText d;
    private EditText e;
    private Spinner f;
    private EditText g;
    private EditText h;
    private e i;
    private co j;
    private List<sa> k;
    private sa l;
    private boolean m;
    private com.android.a.a.l n;
    private com.google.android.finsky.protos.aq o;
    private o p;
    private WhitelistedCountriesFlagParser q;
    private p r;

    public BillingAddress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.billing_address_fields, (ViewGroup) this, true);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (EditText) findViewById(R.id.name_entry);
        this.d = (EditText) findViewById(R.id.first_name);
        this.e = (EditText) findViewById(R.id.last_name);
        this.h = (EditText) findViewById(R.id.email_address);
        this.f = (Spinner) findViewById(R.id.country);
        this.g = (EditText) findViewById(R.id.phone_number);
        this.i = (e) findViewById(R.id.address_widget);
        com.google.android.finsky.placesapi.m mVar = new com.google.android.finsky.placesapi.m(com.google.android.finsky.c.d.cN.b(), Locale.getDefault().getLanguage(), new com.google.android.finsky.placesapi.a(getContext()));
        com.android.volley.o oVar = FinskyApp.a().f1434a;
        new com.google.android.finsky.utils.w();
        this.p = new o(this, mVar, oVar, com.google.android.finsky.utils.w.a(getContext()));
        this.q = new WhitelistedCountriesFlagParser(getContext());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.c.setEnabled(z);
        this.d.setEnabled(z);
        this.e.setEnabled(z);
        this.h.setEnabled(z);
        this.f.setEnabled(z);
        for (com.android.a.a.h hVar : this.n.f1117b.values()) {
            if (hVar.f != null) {
                hVar.f.setEnabled(z);
            }
        }
        this.g.setEnabled(z);
    }

    public final void a(Bundle bundle) {
        bundle.putParcelable(f2929a, ParcelableProto.a(this.o));
        bundle.putParcelable(f2930b, ParcelableProto.a(this.l));
        if (this.n != null) {
            this.n.a(bundle);
        }
    }

    public final void b(Bundle bundle) {
        com.google.android.finsky.protos.aq aqVar = (com.google.android.finsky.protos.aq) ParcelableProto.a(bundle, f2929a);
        if (aqVar != null) {
            this.o = aqVar;
            this.l = (sa) ParcelableProto.a(bundle, f2930b);
            a(this.l, this.o, null);
            this.n.b(bundle);
        }
    }

    public void setBillingCountryChangeListener(p pVar) {
        this.r = pVar;
    }

    public void setBillingCountries(List<sa> list) {
        this.k = list;
        this.f = (Spinner) findViewById(R.id.country);
        this.f.setPrompt(getResources().getText(R.string.select_location));
        this.f.setOnItemSelectedListener(null);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Iterator<sa> it = this.k.iterator();
        while (it.hasNext()) {
            arrayAdapter.add(new q(it.next()));
        }
        this.f.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f.setOnItemSelectedListener(new m(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.finsky.protos.sa r11, com.google.android.finsky.protos.aq r12, com.google.android.finsky.protos.v r13) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.BillingAddress.a(com.google.android.finsky.protos.sa, com.google.android.finsky.protos.aq, com.google.android.finsky.protos.v):void");
    }

    public final void a() {
        EditText editText;
        this.c.setError(null);
        this.d.setError(null);
        this.e.setError(null);
        this.g.setError(null);
        this.h.setError(null);
        com.android.a.a.l lVar = this.n;
        Iterator<com.android.a.a.e> it = lVar.d.a(lVar.g, lVar.f).iterator();
        while (it.hasNext()) {
            com.android.a.a.h hVar = lVar.f1117b.get(it.next());
            if (hVar != null && hVar.f1110b == com.android.a.a.j.EDIT && (editText = (EditText) hVar.f) != null) {
                editText.setError(null);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final TextView a(com.google.android.finsky.protos.db dbVar) {
        com.android.a.a.e eVar;
        EditText editText = null;
        Context context = getContext();
        String str = dbVar.c;
        switch (dbVar.f3715a) {
            case 4:
                EditText editText2 = this.c;
                ik.a(this.c, context.getString(R.string.name), str);
                editText = editText2;
                eVar = null;
                break;
            case 5:
                eVar = com.android.a.a.e.ADDRESS_LINE_1;
                break;
            case 6:
                eVar = com.android.a.a.e.ADDRESS_LINE_2;
                break;
            case 7:
                eVar = com.android.a.a.e.LOCALITY;
                break;
            case 8:
                eVar = com.android.a.a.e.ADMIN_AREA;
                break;
            case 9:
                eVar = com.android.a.a.e.POSTAL_CODE;
                break;
            case 10:
                eVar = com.android.a.a.e.COUNTRY;
                break;
            case 11:
                eVar = com.android.a.a.e.DEPENDENT_LOCALITY;
                break;
            case 12:
                EditText editText3 = this.g;
                ik.a(this.g, context.getString(R.string.phone_number), str);
                editText = editText3;
                eVar = null;
                break;
            case 13:
                FinskyLog.a("Input error ADDR_WHOLE_ADDRESS. Displaying at ADDRESS_LINE_1.", new Object[0]);
                eVar = com.android.a.a.e.ADDRESS_LINE_1;
                break;
            case 14:
            default:
                FinskyLog.a("InputValidationError that can't be displayed: type=%d, message=%s", Integer.valueOf(dbVar.f3715a), dbVar.c);
                eVar = null;
                break;
            case 15:
                EditText editText4 = this.d;
                ik.a(this.d, context.getString(R.string.first_name), str);
                editText = editText4;
                eVar = null;
                break;
            case 16:
                EditText editText5 = this.e;
                ik.a(this.e, context.getString(R.string.last_name), str);
                editText = editText5;
                eVar = null;
                break;
            case 17:
                EditText editText6 = this.h;
                ik.a(this.h, context.getString(R.string.email_address), str);
                editText = editText6;
                eVar = null;
                break;
        }
        if (eVar != null) {
            if (this.n.b(eVar) != null) {
                this.n.a(eVar);
                return editText;
            }
            EditText editText7 = this.c;
            ik.a(this.c, context.getString(R.string.name), str);
            return editText7;
        }
        return editText;
    }

    public com.google.android.finsky.protos.v getAddress() {
        com.google.android.finsky.protos.v a2 = com.google.android.finsky.billing.u.a(this.n.b(), this.o.c);
        a2.C = this.o.f3603a != 1;
        a2.D = true;
        if (this.g.getVisibility() == 0) {
            a2.y = this.g.getText().toString();
            a2.z = true;
        }
        if (this.c.getVisibility() == 0) {
            a2.f4415a = this.c.getText().toString();
            a2.f4416b = true;
        }
        if (this.d.getVisibility() == 0) {
            a2.c = this.d.getText().toString();
            a2.d = true;
        }
        if (this.e.getVisibility() == 0) {
            a2.e = this.e.getText().toString();
            a2.f = true;
        }
        if (this.h.getVisibility() == 0) {
            a2.A = this.h.getText().toString();
            a2.B = true;
        }
        return a2;
    }

    @Override // com.google.android.finsky.layout.co
    public final void a(float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.g.setTranslationY(f);
            this.h.setTranslationY(f);
        }
        if (this.j != null) {
            this.j.a(f);
        }
    }

    public List<com.google.android.finsky.protos.db> getAddressValidationErrors() {
        int i;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<com.android.a.a.e, com.android.a.a.f> entry : this.n.c().f1108a.entrySet()) {
            switch (n.f3288a[entry.getKey().ordinal()]) {
                case 1:
                    i = 8;
                    break;
                case 2:
                    i = 7;
                    break;
                case 3:
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 11;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                default:
                    FinskyLog.c("No equivalent for address widget field: %s", entry.getKey());
                    i = 13;
                    break;
            }
            arrayList.add(com.google.android.finsky.billing.u.b(i));
        }
        if (this.c.getVisibility() == 0 && jm.a(this.c.getText())) {
            arrayList.add(com.google.android.finsky.billing.u.a(4, getContext().getString(R.string.invalid_name)));
        }
        if (this.d.getVisibility() == 0 && jm.a(this.d.getText())) {
            arrayList.add(com.google.android.finsky.billing.u.a(15, getContext().getString(R.string.invalid_name)));
        }
        if (this.e.getVisibility() == 0 && jm.a(this.e.getText())) {
            arrayList.add(com.google.android.finsky.billing.u.a(16, getContext().getString(R.string.invalid_name)));
        }
        if (this.g.getVisibility() == 0 && jm.a(this.g.getText())) {
            arrayList.add(com.google.android.finsky.billing.u.a(12, getContext().getString(R.string.invalid_phone)));
        }
        if (this.h.getVisibility() == 0 && !Patterns.EMAIL_ADDRESS.matcher(this.h.getText()).matches()) {
            arrayList.add(com.google.android.finsky.billing.u.a(17, getContext().getString(R.string.invalid_email)));
        }
        return arrayList;
    }
}
