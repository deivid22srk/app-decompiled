package com.android.a.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.AddressAutoComplete;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements AdapterView.OnItemSelectedListener {
    private static final Map<String, Integer> r;
    private static final Map<String, Integer> s;
    private static final ah u = new ai().a();

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.layout.e f1116a;
    public af c;
    public aj d;
    public ah e;
    public String f;
    public at g;
    public a h;
    public r i;
    private Context k;
    private LayoutInflater l;
    private u m;
    private ba n;
    private com.google.android.finsky.layout.g o;
    private String p;
    private String q;
    private Map<e, String> t;
    private t v;

    /* renamed from: b, reason: collision with root package name */
    public final EnumMap<e, h> f1117b = new EnumMap<>(e.class);
    final Handler j = new Handler();
    private ArrayList<q> w = new ArrayList<>();

    static {
        HashMap hashMap = new HashMap(15);
        hashMap.put("area", Integer.valueOf(R.string.i18n_area));
        hashMap.put("county", Integer.valueOf(R.string.i18n_county_label));
        hashMap.put("department", Integer.valueOf(R.string.i18n_department));
        hashMap.put("district", Integer.valueOf(R.string.i18n_dependent_locality_label));
        hashMap.put("do_si", Integer.valueOf(R.string.i18n_do_si));
        hashMap.put("emirate", Integer.valueOf(R.string.i18n_emirate));
        hashMap.put("island", Integer.valueOf(R.string.i18n_island));
        hashMap.put("parish", Integer.valueOf(R.string.i18n_parish));
        hashMap.put("prefecture", Integer.valueOf(R.string.i18n_prefecture));
        hashMap.put("province", Integer.valueOf(R.string.i18n_province));
        hashMap.put("state", Integer.valueOf(R.string.i18n_state_label));
        r = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(15);
        hashMap2.put("area", Integer.valueOf(R.string.invalid_area));
        hashMap2.put("county", Integer.valueOf(R.string.invalid_county_label));
        hashMap2.put("department", Integer.valueOf(R.string.invalid_department));
        hashMap2.put("district", Integer.valueOf(R.string.invalid_dependent_locality_label));
        hashMap2.put("do_si", Integer.valueOf(R.string.invalid_do_si));
        hashMap2.put("emirate", Integer.valueOf(R.string.invalid_emirate));
        hashMap2.put("island", Integer.valueOf(R.string.invalid_island));
        hashMap2.put("parish", Integer.valueOf(R.string.invalid_parish));
        hashMap2.put("prefecture", Integer.valueOf(R.string.invalid_prefecture));
        hashMap2.put("province", Integer.valueOf(R.string.invalid_province));
        hashMap2.put("state", Integer.valueOf(R.string.invalid_state_label));
        s = Collections.unmodifiableMap(hashMap2);
    }

    private q a(View view) {
        Iterator<q> it = this.w.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (next.f1123a == view) {
                return next;
            }
        }
        return null;
    }

    private List<av> d(e eVar) {
        a b2 = b();
        if (this.c.a(b2.k)) {
            c cVar = new c(b2);
            cVar.f1101b = null;
            b2 = cVar.a();
        }
        aq a2 = af.a(b2).a(eVar);
        if (a2 == null) {
            Log.w(toString(), "Can't build key with parent field " + eVar + ". One of the ancestor fields might be empty");
            return new ArrayList(1);
        }
        return this.c.a(a2);
    }

    public l(Context context, com.google.android.finsky.layout.e eVar, ah ahVar, z zVar, String str) {
        if (str != null && a(str)) {
            this.f = str;
        } else {
            this.f = a(context);
        }
        this.k = context;
        this.f1116a = eVar;
        this.e = ahVar;
        this.m = new u(zVar);
        this.l = (LayoutInflater) context.getSystemService("layout_inflater");
        this.c = new af(new aa(this.m), this.p, this.f);
        this.d = new aj(this.e);
        this.n = new ba(new ad(new aa(this.m)));
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.h = aVar;
            this.f1116a.e();
        }
        a();
    }

    public final void a(a aVar, boolean z) {
        int position;
        for (e eVar : this.d.a(this.g, this.f)) {
            h hVar = this.f1117b.get(eVar);
            if (hVar != null) {
                String a2 = aVar.a(eVar);
                String str = a2 == null ? "" : a2;
                View view = hVar.f;
                if (view != null) {
                    if (hVar.f1110b == j.SPINNER) {
                        q a3 = a(view);
                        if (a3 != null) {
                            if (z) {
                                av a4 = a3.a(str);
                                if (a4 != null && (position = a3.d.getPosition(a4.a())) >= 0) {
                                    a3.f1123a.setSelection(position);
                                }
                            } else {
                                av a5 = a3.a(str);
                                if (a5 == null) {
                                    Iterator<av> it = a3.e.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            a5 = it.next();
                                            if (a5.a().equalsIgnoreCase(str)) {
                                                break;
                                            }
                                        } else {
                                            a5 = null;
                                            break;
                                        }
                                    }
                                    if (a5 != null) {
                                    }
                                }
                                int position2 = a3.d.getPosition(a5.a());
                                if (position2 >= 0) {
                                    a3.f1123a.setSelection(position2);
                                }
                            }
                        }
                    } else {
                        ((EditText) view).setText(str);
                    }
                }
            }
        }
    }

    private void a(Map<e, String> map) {
        View view;
        String str;
        for (e eVar : map.keySet()) {
            h hVar = this.f1117b.get(eVar);
            if (hVar != null && (view = hVar.f) != null && hVar.f1110b == j.EDIT && (str = map.get(eVar)) != null) {
                ik.a((EditText) view, hVar.f1109a, str);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.a.a.a b() {
        /*
            r7 = this;
            com.android.a.a.c r3 = new com.android.a.a.c
            r3.<init>()
            java.lang.String r0 = r7.f
            r3.a(r0)
            com.android.a.a.aj r0 = r7.d
            com.android.a.a.at r1 = r7.g
            java.lang.String r2 = r7.f
            java.util.List r0 = r0.a(r1, r2)
            java.util.Iterator r4 = r0.iterator()
        L18:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r4.next()
            com.android.a.a.e r0 = (com.android.a.a.e) r0
            java.util.EnumMap<com.android.a.a.e, com.android.a.a.h> r1 = r7.f1117b
            java.lang.Object r1 = r1.get(r0)
            com.android.a.a.h r1 = (com.android.a.a.h) r1
            if (r1 == 0) goto L18
            android.view.View r2 = r1.f
            if (r2 != 0) goto L7a
            java.util.List<com.android.a.a.av> r2 = r1.c
            int r2 = r2.size()
            if (r2 == 0) goto L87
            java.util.List<com.android.a.a.av> r2 = r1.c
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            com.android.a.a.av r2 = (com.android.a.a.av) r2
            java.lang.String r2 = r2.a()
        L47:
            com.android.a.a.j r1 = r1.f1110b
            com.android.a.a.j r5 = com.android.a.a.j.SPINNER
            if (r1 != r5) goto L76
            android.view.View r1 = r7.b(r0)
            com.android.a.a.q r1 = r7.a(r1)
            if (r1 == 0) goto L76
            java.util.List<com.android.a.a.av> r1 = r1.e
            java.util.Iterator r5 = r1.iterator()
        L5d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r5.next()
            com.android.a.a.av r1 = (com.android.a.a.av) r1
            java.lang.String r6 = r1.a()
            boolean r6 = r6.endsWith(r2)
            if (r6 == 0) goto L5d
            java.lang.String r1 = r1.f1087a
        L75:
            r2 = r1
        L76:
            r3.a(r0, r2)
            goto L18
        L7a:
            int[] r2 = com.android.a.a.i.f1112b
            com.android.a.a.j r5 = r1.f1110b
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L8a;
                case 2: goto L99;
                default: goto L87;
            }
        L87:
            java.lang.String r2 = ""
            goto L47
        L8a:
            android.view.View r2 = r1.f
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            java.lang.Object r2 = r2.getSelectedItem()
            if (r2 == 0) goto L87
            java.lang.String r2 = r2.toString()
            goto L47
        L99:
            android.view.View r2 = r1.f
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            goto L47
        La6:
            java.lang.String r1 = ""
            goto L75
        La9:
            java.lang.String r0 = r7.p
            r3.f1101b = r0
            com.android.a.a.a r0 = r3.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.a.a.l.b():com.android.a.a.a");
    }

    public static List<String> a(a aVar, Context context) {
        aj ajVar = new aj(u);
        String a2 = a(context);
        be.a(aVar, "null input address not allowed");
        String str = aVar.f1055a;
        if (a(str)) {
            a2 = str;
        }
        String str2 = aVar.k;
        at atVar = at.LOCAL;
        if (str2 != null) {
            atVar = be.a(str2) ? at.LATIN : at.LOCAL;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (String str3 : ajVar.b(atVar, a2)) {
            if (str3.equals("%n")) {
                String a3 = aj.a(sb.toString());
                if (a3.length() > 0) {
                    arrayList.add(a3);
                    sb.setLength(0);
                }
            } else if (str3.startsWith("%")) {
                char charAt = str3.charAt(1);
                e a4 = e.a(charAt);
                be.a(a4, "null address field for character " + charAt);
                String str4 = null;
                switch (al.f1074a[a4.ordinal()]) {
                    case 1:
                        str4 = be.a("\n", aVar.f1056b, aVar.c);
                        break;
                    case 3:
                        str4 = aVar.d;
                        break;
                    case 4:
                        str4 = aVar.e;
                        break;
                    case 5:
                        str4 = aVar.f;
                        break;
                    case 6:
                        str4 = aVar.j;
                        break;
                    case 7:
                        str4 = aVar.i;
                        break;
                    case 8:
                        str4 = aVar.g;
                        break;
                }
                if (str4 != null) {
                    sb.append(str4);
                }
            } else {
                sb.append(str3);
            }
        }
        String a5 = aj.a(sb.toString());
        if (a5.length() > 0) {
            arrayList.add(a5);
        }
        return arrayList;
    }

    public final g c() {
        g gVar = new g();
        a b2 = b();
        ba baVar = this.n;
        au auVar = new au(baVar);
        com.google.android.finsky.utils.t.a(new bb(baVar, b2, gVar, auVar)).start();
        try {
            auVar.b();
            gVar.f1108a.keySet().removeAll(this.e.f1066a);
            if (this.e.a(e.ADMIN_AREA)) {
                if (gVar.f1108a.get(e.POSTAL_CODE) != f.MISSING_REQUIRED_FIELD) {
                    gVar.f1108a.remove(e.POSTAL_CODE);
                }
            }
            return gVar;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public final TextView a(e eVar) {
        int i;
        h hVar = this.f1117b.get(eVar);
        if (hVar == null || hVar.f1110b != j.EDIT) {
            return null;
        }
        switch (p.f1122a[eVar.ordinal()]) {
            case 1:
                i = s.get(this.q).intValue();
                break;
            case 2:
                i = R.string.invalid_locality_label;
                break;
            case 3:
                i = R.string.invalid_dependent_locality_label;
                break;
            case 4:
                if (this.v != t.POSTAL) {
                    i = R.string.invalid_zip_code_label;
                    break;
                } else {
                    i = R.string.invalid_postal_code_label;
                    break;
                }
            default:
                i = R.string.invalid_entry;
                break;
        }
        EditText editText = (EditText) hVar.f;
        ik.a(editText, hVar.f1109a, this.k.getString(i));
        return editText;
    }

    public final View b(e eVar) {
        h hVar = this.f1117b.get(eVar);
        if (hVar == null) {
            return null;
        }
        return hVar.f;
    }

    public final String c(e eVar) {
        h hVar = this.f1117b.get(eVar);
        if (hVar == null) {
            return null;
        }
        return hVar.f1109a;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public final void a(com.google.android.finsky.layout.g gVar) {
        this.o = gVar;
        View b2 = b(e.ADDRESS_LINE_1);
        if (b2 != null && (b2 instanceof AddressAutoComplete)) {
            ((AddressAutoComplete) b2).setSuggestionProvider(this.o);
        }
    }

    private static boolean a(String str) {
        return ax.a().containsKey(str);
    }

    private static String a(Context context) {
        if (context == null) {
            return "US";
        }
        String upperCase = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso().toUpperCase();
        if (upperCase == null || upperCase.length() != 2) {
            return "US";
        }
        return upperCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Bundle bundle) {
        View view;
        CharSequence error;
        bundle.putSerializable("address_data", b());
        HashMap hashMap = new HashMap();
        for (e eVar : this.d.a(this.g, this.f)) {
            h hVar = this.f1117b.get(eVar);
            if (hVar != null && (view = hVar.f) != null && hVar.f1110b == j.EDIT && (error = ((EditText) view).getError()) != null) {
                hashMap.put(eVar, error.toString());
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (e eVar2 : hashMap.keySet()) {
            arrayList.add(Integer.valueOf(eVar2.ordinal()));
            arrayList2.add(hashMap.get(eVar2));
        }
        bundle.putIntegerArrayList("address_error_fields", arrayList);
        bundle.putStringArrayList("address_error_values", arrayList2);
    }

    public final void b(Bundle bundle) {
        this.h = (a) bundle.getSerializable("address_data");
        a(this.h, true);
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("address_error_fields");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("address_error_values");
        if (integerArrayList != null && stringArrayList != null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < integerArrayList.size()) {
                    int intValue = integerArrayList.get(i2).intValue();
                    hashMap.put(e.values()[intValue], stringArrayList.get(i2));
                    i = i2 + 1;
                } else {
                    this.t = hashMap;
                    a(hashMap);
                    return;
                }
            }
        }
    }

    public final void a() {
        this.p = be.a(Locale.getDefault(), this.f);
        this.c.f1062a = this.p;
        this.g = be.a(this.p) ? at.LATIN : at.LOCAL;
        c a2 = new c().a(this.f);
        a2.f1101b = this.p;
        this.c.a(a2.a(), new n(this));
        this.f1116a.d();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        q a2 = a(adapterView);
        if (a2 == null) {
            return;
        }
        e eVar = a2.f1124b;
        if (eVar != e.ADMIN_AREA && eVar != e.LOCALITY) {
            return;
        }
        this.c.a(b(), new m(this, eVar));
    }

    static /* synthetic */ void a(l lVar, e eVar) {
        Iterator<q> it = lVar.w.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (next.c == eVar) {
                next.a(lVar.d(next.c), "");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(l lVar) {
        String string;
        boolean z;
        Spinner spinner;
        k b2 = new aa(lVar.m).b(new ar(as.DATA).a(new c().a(lVar.f).a()).a().toString());
        h hVar = new h(e.ADMIN_AREA);
        String b3 = b2.b(d.STATE_NAME_TYPE);
        lVar.q = b3;
        Integer num = r.get(b3);
        if (num == null) {
            num = Integer.valueOf(R.string.i18n_province);
        }
        hVar.f1109a = lVar.k.getString(num.intValue());
        lVar.f1117b.put((EnumMap<e, h>) e.ADMIN_AREA, (e) hVar);
        h hVar2 = new h(e.LOCALITY);
        hVar2.f1109a = lVar.k.getString(R.string.i18n_locality_label);
        lVar.f1117b.put((EnumMap<e, h>) e.LOCALITY, (e) hVar2);
        h hVar3 = new h(e.DEPENDENT_LOCALITY);
        hVar3.f1109a = lVar.k.getString(R.string.i18n_dependent_locality_label);
        lVar.f1117b.put((EnumMap<e, h>) e.DEPENDENT_LOCALITY, (e) hVar3);
        h hVar4 = new h(e.ADDRESS_LINE_1);
        hVar4.f1109a = lVar.k.getString(R.string.i18n_address_line1_label);
        lVar.f1117b.put((EnumMap<e, h>) e.ADDRESS_LINE_1, (e) hVar4);
        lVar.f1117b.put((EnumMap<e, h>) e.STREET_ADDRESS, (e) hVar4);
        h hVar5 = new h(e.ADDRESS_LINE_2);
        hVar5.f1109a = lVar.k.getString(R.string.i18n_address_line2_label);
        lVar.f1117b.put((EnumMap<e, h>) e.ADDRESS_LINE_2, (e) hVar5);
        h hVar6 = new h(e.ORGANIZATION);
        hVar6.f1109a = lVar.k.getString(R.string.i18n_organization_label);
        lVar.f1117b.put((EnumMap<e, h>) e.ORGANIZATION, (e) hVar6);
        h hVar7 = new h(e.RECIPIENT);
        hVar7.f1109a = lVar.k.getString(R.string.i18n_recipient_label);
        lVar.f1117b.put((EnumMap<e, h>) e.RECIPIENT, (e) hVar7);
        h hVar8 = new h(e.POSTAL_CODE);
        if (b2.b(d.ZIP_NAME_TYPE) == null) {
            lVar.v = t.POSTAL;
            string = lVar.k.getString(R.string.i18n_postal_code_label);
        } else {
            lVar.v = t.ZIP;
            string = lVar.k.getString(R.string.i18n_zip_code_label);
        }
        hVar8.f1109a = string;
        lVar.f1117b.put((EnumMap<e, h>) e.POSTAL_CODE, (e) hVar8);
        h hVar9 = new h(e.SORTING_CODE);
        hVar9.f1109a = "CEDEX";
        lVar.f1117b.put((EnumMap<e, h>) e.SORTING_CODE, (e) hVar9);
        lVar.f1117b.get(e.ADMIN_AREA).a(lVar.d(e.COUNTRY));
        lVar.f1117b.get(e.LOCALITY).a(lVar.d(e.ADMIN_AREA));
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (e eVar : lVar.d.a(lVar.g, lVar.f)) {
            if (!lVar.e.a(eVar)) {
                com.google.android.finsky.layout.e eVar2 = lVar.f1116a;
                h hVar10 = lVar.f1117b.get(eVar);
                boolean contains = lVar.e.f1067b.contains(eVar);
                String str = hVar10.f1109a;
                if (z2 && !contains && hVar10.f1110b.equals(j.EDIT) && hVar10.d == e.ADDRESS_LINE_1 && lVar.o != null) {
                    AddressAutoComplete addressAutoComplete = (AddressAutoComplete) lVar.l.inflate(R.layout.address_autocomplete, (ViewGroup) eVar2, false);
                    hVar10.f = addressAutoComplete;
                    addressAutoComplete.setHint(str);
                    addressAutoComplete.setSuggestionProvider(lVar.o);
                    spinner = addressAutoComplete;
                } else if (hVar10.f1110b.equals(j.EDIT)) {
                    View inflate = lVar.l.inflate(R.layout.address_edittext, (ViewGroup) eVar2, false);
                    hVar10.f = inflate;
                    EditText editText = (EditText) inflate;
                    editText.setEnabled(!contains);
                    if (str.length() > 0) {
                        editText.setHint(str);
                    }
                    spinner = editText;
                    if (hVar10.d == e.POSTAL_CODE) {
                        editText.setInputType(editText.getInputType() | 4096);
                        spinner = editText;
                    }
                } else if (hVar10.f1110b.equals(j.SPINNER)) {
                    View inflate2 = lVar.l.inflate(R.layout.address_spinner, (ViewGroup) eVar2, false);
                    hVar10.f = inflate2;
                    Spinner spinner2 = (Spinner) inflate2;
                    q qVar = new q(spinner2, hVar10.d, hVar10.e);
                    qVar.d = new ArrayAdapter<>(lVar.k, android.R.layout.simple_spinner_item);
                    qVar.d.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner2.setAdapter((SpinnerAdapter) qVar.d);
                    qVar.a(hVar10.c, "");
                    if (str.length() > 0) {
                        spinner2.setPrompt(str);
                    }
                    spinner2.setOnItemSelectedListener(lVar);
                    lVar.w.add(qVar);
                    spinner = spinner2;
                } else {
                    spinner = null;
                }
                if (spinner != null) {
                    arrayList.add(spinner);
                    z = false;
                    z2 = z;
                }
            }
            z = z2;
            z2 = z;
        }
        lVar.f1116a.setFields(arrayList);
        if (lVar.h != null) {
            lVar.a(lVar.h, true);
        }
        if (lVar.t != null) {
            lVar.a(lVar.t);
        }
        lVar.f1116a.c();
    }
}
