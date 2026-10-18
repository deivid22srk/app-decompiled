package com.google.android.wallet.ui.address;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.FormSpinner;
import com.google.android.wallet.ui.common.RegionCodeView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.as;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.aw;
import com.google.android.wallet.ui.common.bf;
import com.google.android.wallet.ui.common.bj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends ah<com.google.b.a.a.a.b.a.a.b> implements View.OnClickListener, View.OnFocusChangeListener, CompoundButton.OnCheckedChangeListener, t {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseBooleanArray f7378a;
    private static final Comparator<Object> aB;
    private static final SparseIntArray au;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseBooleanArray f7379b;
    private LinearLayout aC;
    private boolean aD;
    private ArrayList<com.google.c.a.b> aE;
    private JSONObject aF;
    private JSONObject aG;
    private int aH;
    private com.google.c.a.b aL;
    private com.google.android.wallet.ui.common.b.c aM;
    private com.google.android.wallet.common.a.i aP;
    private int aQ;
    private boolean aR;
    ImageButton ai;
    int[] ak;
    int al;
    boolean am;
    public as an;
    com.google.b.a.a.a.b.a.a.c ao;
    ArrayList<com.google.android.wallet.common.a.c> aq;
    public p ar;
    public t as;
    public q at;
    CheckBox c;
    TextView d;
    RegionCodeView e;
    DynamicAddressFieldsLayout f;
    TextView g;
    View h;
    TextView i;
    ArrayList<View> aj = new ArrayList<>();
    private final com.google.android.wallet.analytics.f aN = new com.google.android.wallet.analytics.f(1667);
    String ap = Locale.getDefault().toString();
    private final TextWatcher aO = new f(this);

    static /* synthetic */ com.google.android.wallet.common.a.i g(b bVar) {
        bVar.aP = null;
        return null;
    }

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(7);
        f7378a = sparseBooleanArray;
        sparseBooleanArray.put(83, true);
        f7378a.put(82, true);
        f7378a.put(67, true);
        f7378a.put(49, true);
        f7378a.put(50, true);
        f7378a.put(90, true);
        f7378a.put(88, true);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(2);
        f7379b = sparseBooleanArray2;
        sparseBooleanArray2.put(82, true);
        f7379b.put(90, true);
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        au = sparseIntArray;
        sparseIntArray.put(82, 1);
        au.put(78, 2);
        au.put(49, 3);
        au.put(50, 4);
        au.put(67, 5);
        au.put(83, 6);
        au.put(90, 7);
        au.put(88, 9);
        au.put(68, 10);
        au.put(79, 11);
        aB = new c();
    }

    public static b b(com.google.b.a.a.a.b.a.a.b bVar, int i) {
        b bVar2 = new b();
        bVar2.f(a(i, bVar));
        return bVar2;
    }

    private static String a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        if (view instanceof Spinner) {
            Object selectedItem = ((Spinner) view).getSelectedItem();
            if (selectedItem instanceof au) {
                return ((au) selectedItem).a();
            }
            if (selectedItem != null) {
                return String.valueOf(selectedItem);
            }
            return null;
        }
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown input type: ").append(valueOf).toString());
    }

    private static void a(View view, String str, boolean z) {
        boolean z2;
        boolean z3;
        if (view == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        if (view instanceof FormEditText) {
            ((FormEditText) view).b(str, z);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
            return;
        }
        if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (str == null) {
                if ((spinner instanceof FormSpinner) && !z) {
                    ((FormSpinner) spinner).setNonUserInputSelection(0);
                    return;
                } else {
                    spinner.setSelection(0);
                    return;
                }
            }
            if (spinner.getAdapter() instanceof ArrayAdapter) {
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                if (!arrayAdapter.isEmpty()) {
                    int count = arrayAdapter.getCount();
                    int i = 0;
                    boolean z4 = false;
                    while (true) {
                        if (i >= count) {
                            z2 = z4;
                            break;
                        }
                        Object item = arrayAdapter.getItem(i);
                        if ((item instanceof au) && str.equalsIgnoreCase(((au) item).a())) {
                            z3 = true;
                        } else {
                            z3 = (item == null || !str.equalsIgnoreCase(item.toString())) ? z4 : true;
                        }
                        if (!z3) {
                            i++;
                            z4 = z3;
                        } else if ((spinner instanceof FormSpinner) && !z) {
                            ((FormSpinner) spinner).setNonUserInputSelection(i);
                            z2 = z3;
                        } else {
                            spinner.setSelection(i);
                            z2 = z3;
                        }
                    }
                    if (!z2) {
                        if ((spinner instanceof FormSpinner) && !z) {
                            ((FormSpinner) spinner).setNonUserInputSelection(0);
                            return;
                        } else {
                            spinner.setSelection(0);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unknown input type: ").append(valueOf).toString());
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicAddressRootLayout, com.google.android.wallet.e.c.internalUicValidateFieldsWhenNotVisible});
        this.aQ = obtainStyledAttributes.getResourceId(0, K());
        this.aR = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        int i = ((com.google.b.a.a.a.b.a.a.b) this.aw).h;
        if (i >= 0 && i < ((com.google.b.a.a.a.b.a.a.b) this.aw).g.length) {
            this.ao = ((com.google.b.a.a.a.b.a.a.b) this.aw).g[i].f7625a;
        } else {
            this.ao = ((com.google.b.a.a.a.b.a.a.b) this.aw).e;
        }
        if (bundle == null) {
            try {
                this.aF = new JSONObject(((com.google.b.a.a.a.b.a.a.b) this.aw).f);
                String a2 = com.google.android.wallet.common.a.o.a(com.google.android.wallet.common.a.f.a(this.aF));
                if (!a2.equals(this.ao.c.f7728a)) {
                    throw new IllegalArgumentException(String.format("JSON provided for country %s but initial value has country %s", a2, this.ao.c.f7728a));
                }
                a(this.ao.c);
                this.ak = com.google.android.wallet.common.a.f.a(com.google.android.wallet.common.a.f.a(((com.google.b.a.a.a.b.a.a.b) this.aw).j));
                if (this.ak.length <= 0) {
                    throw new IllegalArgumentException("Array length of allowedCountryCodes must be > 0");
                }
                if (TextUtils.isEmpty(((com.google.b.a.a.a.b.a.a.b) this.aw).m)) {
                    throw new IllegalArgumentException("Recipient field hint must be specified!");
                }
                this.am = ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 2 || ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 3 || ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 4;
            } catch (JSONException e) {
                throw new RuntimeException("Could not construct JSONObject from mFormProto.initialCountryI18NDataJson", e);
            }
        } else {
            this.ak = bundle.getIntArray("regionCodes");
            this.am = bundle.getBoolean("isReadOnlyMode");
        }
        this.aE = new ArrayList<>(((com.google.b.a.a.a.b.a.a.b) this.aw).g.length);
        for (com.google.b.a.a.a.b.a.a.f fVar : ((com.google.b.a.a.a.b.a.a.b) this.aw).g) {
            this.aE.add(fVar.f7625a.c);
        }
        this.aD = ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 3 || ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    @TargetApi(11)
    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.aQ, viewGroup, false);
        this.aC = (LinearLayout) inflate.findViewById(com.google.android.wallet.e.g.container);
        if (!TextUtils.isEmpty(((com.google.b.a.a.a.b.a.a.b) this.aw).d)) {
            TextView textView = (TextView) this.aC.findViewById(com.google.android.wallet.e.g.address_title);
            textView.setText(((com.google.b.a.a.a.b.a.a.b) this.aw).d);
            textView.setVisibility(0);
        }
        this.c = (CheckBox) this.aC.findViewById(com.google.android.wallet.e.g.hide_address_checkbox);
        if (!TextUtils.isEmpty(((com.google.b.a.a.a.b.a.a.b) this.aw).i)) {
            this.c.setText(((com.google.b.a.a.a.b.a.a.b) this.aw).i);
            this.c.setChecked(true);
            this.c.setVisibility(0);
            this.c.setOnCheckedChangeListener(this);
        }
        if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).n, 2)) {
            this.d = (TextView) layoutInflater.inflate(com.google.android.wallet.e.h.view_form_non_editable_text, (ViewGroup) this.aC, false);
        } else {
            this.d = (TextView) layoutInflater.inflate(com.google.android.wallet.e.h.view_form_edit_text, (ViewGroup) this.aC, false);
            this.d.setHint(a('N'));
            this.d.setInputType(8289);
            if (((com.google.b.a.a.a.b.a.a.b) this.aw).q) {
                this.d.setOnFocusChangeListener(this);
            }
            ((FormEditText) this.d).setShouldValidateWhenNotVisible(!com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 2));
            ((FormEditText) this.d).i.add(this.aO);
        }
        this.d.setTag('N');
        this.d.setId(com.google.android.wallet.e.g.address_field_recipient);
        this.aC.addView(this.d, this.aC.indexOfChild(this.c) + 1);
        this.e = (RegionCodeView) this.aC.findViewById(com.google.android.wallet.e.g.region_code_view);
        this.f = (DynamicAddressFieldsLayout) this.aC.findViewById(com.google.android.wallet.e.g.dynamic_address_fields_layout);
        if (((com.google.b.a.a.a.b.a.a.b) this.aw).l) {
            if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).n, 8)) {
                this.g = (TextView) layoutInflater.inflate(com.google.android.wallet.e.h.view_form_non_editable_text, (ViewGroup) this.aC, false);
            } else {
                this.g = (TextView) layoutInflater.inflate(com.google.android.wallet.e.h.view_form_edit_text, (ViewGroup) this.aC, false);
                this.g.setHint(com.google.android.wallet.e.j.wallet_uic_phone_number);
                this.g.setInputType(3);
                if (((com.google.b.a.a.a.b.a.a.b) this.aw).q) {
                    this.g.setOnFocusChangeListener(this);
                }
                ((FormEditText) this.g).setShouldValidateWhenNotVisible(!com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 8));
            }
            this.g.setId(com.google.android.wallet.e.g.address_field_phone_number);
            if (Build.VERSION.SDK_INT >= 17) {
                this.g.setTextDirection(3);
            }
            if (Build.VERSION.SDK_INT >= 11) {
                this.g.setLayerType(2, null);
            }
            this.aC.addView(this.g, this.aC.indexOfChild(this.f) + 1);
            if (bundle == null && TextUtils.isEmpty(this.g.getText())) {
                if (!TextUtils.isEmpty(this.ao.d)) {
                    b(this.ao.d);
                } else {
                    bj.a((Activity) f(), this.g);
                }
                if (this.g instanceof FormEditText) {
                    this.ao.d = ((FormEditText) this.g).getValue();
                } else {
                    this.ao.d = this.g.getText().toString();
                }
            }
        }
        this.f.setOnHeightOffsetChangedListener(this);
        this.h = this.aC.findViewById(com.google.android.wallet.e.g.address_read_only_container);
        this.i = (TextView) this.aC.findViewById(com.google.android.wallet.e.g.address_read_only_text);
        this.ai = (ImageButton) this.aC.findViewById(com.google.android.wallet.e.g.edit_address_icon);
        if (this.am) {
            this.i.setText(a(this.ao));
            if (this.aD) {
                TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{((com.google.b.a.a.a.b.a.a.b) this.aw).p == 4 ? com.google.android.wallet.e.c.uicClearDrawable : com.google.android.wallet.e.c.uicEditDrawable});
                this.ai.setImageDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
                this.ai.setVisibility(0);
                this.ai.setOnClickListener(this);
            }
        }
        return inflate;
    }

    private void b(String str) {
        bj.a(this.g, str);
    }

    public final void a(String str) {
        if (this.d != null) {
            if (this.d instanceof FormEditText) {
                ((FormEditText) this.d).a((CharSequence) str, true);
            } else {
                this.d.setText(str);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            if (bundle.containsKey("pendingAddress")) {
                a((com.google.c.a.b) ParcelableProto.a(bundle, "pendingAddress"));
            }
            if (this.al == 0) {
                this.al = bundle.getInt("selectedCountry");
            }
            if (bundle.containsKey("countryData")) {
                try {
                    this.aF = new JSONObject(bundle.getString("countryData"));
                    int a2 = com.google.android.wallet.common.a.f.a(this.aF);
                    if (a2 != 0 && a2 != 858 && a2 != this.al) {
                        int i = this.al;
                        this.al = a2;
                        a(this.aF);
                        this.al = i;
                    }
                } catch (JSONException e) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_COUNTRY_DATA json string", e);
                }
            }
            if (bundle.containsKey("languageCode")) {
                this.ap = bundle.getString("languageCode");
            }
            if (bundle.containsKey("adminAreaData")) {
                try {
                    this.aG = new JSONObject(bundle.getString("adminAreaData"));
                } catch (JSONException e2) {
                    throw new RuntimeException("Could not construct JSONObject from KEY_ADMIN_AREA_DATA json string", e2);
                }
            }
        }
        Y();
        u();
        this.e.setRegionCodes(this.ak);
        this.e.setRegionCodeSelectedListener(new j(this));
        y();
        if (this.c.getVisibility() == 0) {
            onCheckedChanged(this.c, this.c.isChecked());
        }
        if (this.an != null && this.al != 0) {
            this.an.a(this.al, this.F, false);
        }
    }

    private void a(int i, String str, String str2, ArrayList<com.google.c.a.b> arrayList) {
        this.aG = null;
        R();
        com.google.android.wallet.common.a.h hVar = new com.google.android.wallet.common.a.h(X(), i, str, new g(this, arrayList), new h(this));
        a(true);
        this.f.b();
        hVar.a(str2);
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("selectedCountry", this.al);
        bundle.putIntArray("regionCodes", this.ak);
        if (this.aL != null) {
            bundle.putParcelable("pendingAddress", ParcelableProto.a(this.aL));
        }
        if (this.aF != null) {
            bundle.putString("countryData", this.aF.toString());
        }
        bundle.putString("languageCode", this.ap);
        if (this.aG != null) {
            bundle.putString("adminAreaData", this.aG.toString());
        }
        bundle.putBoolean("isReadOnlyMode", this.am);
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        super.d();
        this.aH = 0;
        u();
    }

    @Override // android.support.v4.app.Fragment
    public final void E_() {
        super.E_();
        this.an = null;
        R();
        X().a(new i(this));
    }

    public final com.google.b.a.a.a.b.a.a.c L() {
        com.google.b.a.a.a.b.a.a.c cVar = new com.google.b.a.a.a.b.a.a.c();
        cVar.f7604a = ((com.google.b.a.a.a.b.a.a.b) this.aw).f7559a;
        cVar.f7605b = ((com.google.b.a.a.a.b.a.a.b) this.aw).c;
        if (M()) {
            cVar.e = true;
            return cVar;
        }
        cVar.c = b(x());
        String U = U();
        if (!TextUtils.isEmpty(U)) {
            cVar.c.c = U;
        }
        if (this.g != null && !TextUtils.isEmpty(this.g.getText())) {
            cVar.d = this.g.getText().toString();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.c.a.b b(SparseArray<String> sparseArray) {
        com.google.c.a.b bVar = new com.google.c.a.b();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            char keyAt = (char) sparseArray.keyAt(i);
            String valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                switch (keyAt) {
                    case '1':
                    case '2':
                        bVar.q = (String[]) com.google.android.wallet.common.util.b.a(bVar.q, valueAt);
                        break;
                    case 'C':
                        bVar.f = valueAt;
                        break;
                    case 'N':
                        bVar.s = valueAt;
                        break;
                    case 'O':
                        bVar.r = valueAt;
                        break;
                    case 'R':
                        bVar.f7728a = valueAt;
                        break;
                    case 'S':
                        bVar.d = valueAt;
                        break;
                    case 'X':
                        bVar.m = valueAt;
                        break;
                    case 'Z':
                        bVar.k = valueAt.toUpperCase();
                        break;
                }
            }
        }
        return bVar;
    }

    protected final String a(com.google.b.a.a.a.b.a.a.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i : ((com.google.b.a.a.a.b.a.a.b) this.aw).o) {
            int indexOfValue = au.indexOfValue(i);
            if (indexOfValue >= 0) {
                arrayList.add(Character.valueOf((char) au.keyAt(indexOfValue)));
            }
        }
        String a2 = com.google.android.wallet.common.a.b.a(cVar.c, "\n", null, com.google.android.wallet.common.util.b.a(arrayList));
        if (!((com.google.b.a.a.a.b.a.a.b) this.aw).l || com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 8)) {
            return a2;
        }
        String valueOf = String.valueOf(a2);
        String valueOf2 = String.valueOf("\n");
        String valueOf3 = String.valueOf(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf4 = String.valueOf(cVar.d);
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.google.c.a.b r7) {
        /*
            r6 = this;
            r0 = 1
            r5 = 0
            r1 = 0
            if (r7 != 0) goto L1d
            android.widget.LinearLayout r2 = r6.aC
            if (r2 != 0) goto L18
            r6.aL = r5
            r6.al = r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toString()
            r6.ap = r0
        L17:
            return
        L18:
            com.google.c.a.b r7 = new com.google.c.a.b
            r7.<init>()
        L1d:
            java.lang.String r2 = r7.f7728a
            int r2 = com.google.android.wallet.common.a.o.a(r2)
            r6.aL = r7
            com.google.c.a.b r3 = r6.aL
            java.lang.String r3 = r3.c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L35
            com.google.c.a.b r3 = r6.aL
            java.lang.String r3 = r3.c
            r6.ap = r3
        L35:
            android.widget.LinearLayout r3 = r6.aC
            if (r3 != 0) goto L3c
            r6.al = r2
            goto L17
        L3c:
            int r3 = r6.al
            if (r2 != r3) goto La1
            boolean r2 = r6.V()
            if (r2 != 0) goto L17
            org.json.JSONObject r2 = r6.aF
            if (r2 == 0) goto L9f
            org.json.JSONObject r2 = r6.aF
            java.lang.String r3 = r6.ap
            java.lang.String r2 = com.google.android.wallet.common.a.f.e(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L6d
            int r1 = r6.al
            java.lang.String r3 = r6.ap
            java.util.ArrayList r4 = r6.W()
            r6.a(r1, r3, r2, r4)
        L63:
            if (r0 != 0) goto L17
            com.google.c.a.b r0 = r6.aL
            r6.b(r0)
            r6.aL = r5
            goto L17
        L6d:
            org.json.JSONObject r2 = r6.aF
            java.lang.String r3 = "id"
            java.lang.String r2 = com.google.android.wallet.common.a.f.a(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L9f
            java.lang.String r3 = "--"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L9f
            org.json.JSONObject r2 = r6.aF
            java.lang.String r3 = "lang"
            java.lang.String r2 = com.google.android.wallet.common.a.f.a(r2, r3)
            java.lang.String r3 = r6.ap
            boolean r2 = com.google.android.wallet.common.a.f.a(r2, r3)
            if (r2 != 0) goto L9f
            int r1 = r6.al
            java.lang.String r2 = r6.ap
            java.util.ArrayList r3 = r6.W()
            r6.a(r1, r2, r5, r3)
            goto L63
        L9f:
            r0 = r1
            goto L63
        La1:
            int r0 = r6.al
            if (r0 != 0) goto La9
            r6.al = r2
            goto L17
        La9:
            r6.a(r2, r1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.address.b.a(com.google.c.a.b):void");
    }

    private SparseArray<String> x() {
        if (this.aC == null) {
            return null;
        }
        int size = this.aj.size();
        SparseArray<String> sparseArray = new SparseArray<>(size);
        for (int i = 0; i < size; i++) {
            View view = this.aj.get(i);
            sparseArray.put(((Character) view.getTag()).charValue(), a(view));
        }
        if (this.al != 0) {
            sparseArray.put(82, com.google.android.wallet.common.a.o.a(this.al));
        }
        return sparseArray;
    }

    private void c(SparseArray<String> sparseArray) {
        if (this.aC != null && sparseArray != null) {
            int size = this.aj.size();
            for (int i = 0; i < size; i++) {
                View view = this.aj.get(i);
                String str = sparseArray.get(((Character) view.getTag()).charValue());
                if (str != null) {
                    a(view, str, false);
                }
            }
        }
    }

    private void b(com.google.c.a.b bVar) {
        if (this.aC != null) {
            int size = this.aj.size();
            for (int i = 0; i < size; i++) {
                View view = this.aj.get(i);
                a(view, com.google.android.wallet.common.a.b.a(bVar, ((Character) view.getTag()).charValue()), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r0 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.google.b.a.a.a.b.a.j r6) {
        /*
            r5 = this;
            r1 = 0
            com.google.b.a.a.a.b.a.b r0 = r6.f7704a
            java.lang.String r2 = r0.f7650a
            T extends com.google.protobuf.nano.c r0 = r5.aw
            com.google.b.a.a.a.b.a.a.b r0 = (com.google.b.a.a.a.b.a.a.b) r0
            java.lang.String r0 = r0.f7559a
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L13
            r0 = r1
        L12:
            return r0
        L13:
            T extends com.google.protobuf.nano.c r0 = r5.aw
            com.google.b.a.a.a.b.a.a.b r0 = (com.google.b.a.a.a.b.a.a.b) r0
            int r0 = r0.p
            r2 = 2
            if (r0 != r2) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "FormFieldMessage should not be received for read-only address form"
            r0.<init>(r1)
            throw r0
        L24:
            boolean r0 = r5.am
            if (r0 == 0) goto L2d
            r5.am = r1
            r5.Y()
        L2d:
            android.widget.LinearLayout r0 = r5.aC
            com.google.b.a.a.a.b.a.b r1 = r6.f7704a
            int r1 = r1.f7651b
            int r1 = com.google.android.wallet.common.a.f.a(r1)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L4e
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L90
            boolean r0 = r1 instanceof com.google.android.wallet.ui.common.FormEditText
            if (r0 == 0) goto L83
            r0 = r1
            com.google.android.wallet.ui.common.FormEditText r0 = (com.google.android.wallet.ui.common.FormEditText) r0
            boolean r0 = r0.n
        L4c:
            if (r0 != 0) goto L90
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.b.a.a.a.b.a.b r2 = r6.f7704a
            int r2 = r2.f7651b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + 63
            r3.<init>(r4)
            java.lang.String r4 = "FormFieldMessage received for invalid field: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " view: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L83:
            boolean r0 = r1 instanceof com.google.android.wallet.ui.common.FormSpinner
            if (r0 == 0) goto L8d
            r0 = r1
            com.google.android.wallet.ui.common.FormSpinner r0 = (com.google.android.wallet.ui.common.FormSpinner) r0
            boolean r0 = r0.c
            goto L4c
        L8d:
            boolean r0 = r5.aR
            goto L4c
        L90:
            boolean r0 = r1 instanceof android.widget.EditText
            if (r0 == 0) goto Lac
            r0 = r1
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r2 = r6.f7705b
            r0.setError(r2)
            android.widget.TextView r0 = r5.d
            if (r1 != r0) goto La9
            com.google.android.wallet.ui.address.q r0 = r5.at
            if (r0 == 0) goto La9
            com.google.android.wallet.ui.address.q r0 = r5.at
            r0.y()
        La9:
            r0 = 1
            goto L12
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.b.a.a.a.b.a.b r1 = r6.f7704a
            int r1 = r1.f7651b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 61
            r2.<init>(r3)
            java.lang.String r3 = "FormFieldMessage received for non-EditText field: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.address.b.a(com.google.b.a.a.a.b.a.j):boolean");
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.y
    public final boolean a(String str, int i) {
        if (!str.equals(((com.google.b.a.a.a.b.a.a.b) this.aw).f7559a)) {
            return false;
        }
        if (i == 1000) {
            String str2 = null;
            if (this.aF != null) {
                str2 = com.google.android.wallet.common.a.f.e(this.aF, this.ap);
            }
            a(this.al, this.ap, str2, W());
            return true;
        }
        throw new IllegalArgumentException(new StringBuilder(35).append("Unrecognized errorType: ").append(i).toString());
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai<View>> w() {
        ArrayList arrayList = new ArrayList(this.aj.size());
        com.google.c.a.b bVar = this.ao.c;
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            View view = this.aj.get(i);
            arrayList.add(new ai(0, view, com.google.android.wallet.common.a.b.a(bVar, ((Character) view.getTag()).charValue())));
        }
        if (this.g != null) {
            arrayList.add(new ai(0, this.g, this.ao.d));
        }
        return arrayList;
    }

    public final void a(int i, boolean z) {
        if (i != this.al) {
            this.al = i;
            y();
            if (this.an != null && i != 0) {
                this.an.a(i, this.F, z);
            }
        }
    }

    private void y() {
        if (!com.google.android.wallet.common.util.g.a(com.google.android.wallet.common.a.o.a(this.al), this.ao.c.f7728a)) {
            Bundle bundle = new Bundle();
            bundle.putString("FormEventListener.EXTRA_FORM_ID", ((com.google.b.a.a.a.b.a.a.b) this.aw).f7559a);
            bundle.putInt("FormEventListener.EXTRA_FIELD_ID", 1);
            a(3, bundle);
        }
        this.e.setSelectedRegionCode$2563266(this.al);
        if (com.google.android.wallet.common.a.f.a(this.aF) == this.al) {
            a(this.aF);
        } else {
            a(this.al, this.ap, (String) null, W());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (com.google.android.wallet.common.a.f.a(jSONObject) == this.al) {
            SparseArray<String> C = this.aL == null ? C() : null;
            this.aF = jSONObject;
            this.aq = new ArrayList<>();
            if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).s, 2) && this.aE != null && !this.aE.isEmpty()) {
                this.aq.add(new com.google.android.wallet.common.a.n(f(), this.aE));
            }
            if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).s, 1)) {
                this.aq.add(new com.google.android.wallet.common.a.k(f()));
            }
            if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).s, 3) && com.google.android.wallet.common.a.l.a(this.al)) {
                this.aq.add(new com.google.android.wallet.common.a.l(f(), X()));
            }
            I();
            c(C);
            if (this.aL != null) {
                b(this.aL);
                this.aL = null;
            }
            View b2 = b('S');
            if (b2 instanceof Spinner) {
                Spinner spinner = (Spinner) b2;
                if (spinner.getSelectedItemPosition() == 0 && ((n) spinner.getItemAtPosition(1)).f7394b) {
                    if (spinner instanceof FormSpinner) {
                        ((FormSpinner) spinner).setNonUserInputSelection(1);
                    } else {
                        spinner.setSelection(1);
                    }
                }
            }
            this.f.a();
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SparseArray<String> C() {
        SparseArray<String> x = x();
        for (int size = x.size() - 1; size >= 0; size--) {
            char keyAt = (char) x.keyAt(size);
            if (b(keyAt) instanceof Spinner) {
                x.remove(keyAt);
            }
        }
        return x;
    }

    private ArrayList<n> F() {
        String[] strArr;
        String[] strArr2;
        boolean d = com.google.android.wallet.common.a.f.d(this.aF, this.ap);
        String[] b2 = com.google.android.wallet.common.a.f.b(this.aF, "sub_keys");
        String[] b3 = com.google.android.wallet.common.a.f.b(this.aF, "sub_mores");
        String[] strArr3 = null;
        if (d) {
            strArr3 = com.google.android.wallet.common.a.f.b(this.aF, "sub_lnames");
        }
        if (strArr3 == null) {
            strArr3 = b2;
        }
        if (strArr3 == null || strArr3.length == 0) {
            return null;
        }
        String[] b4 = d ? strArr3 : com.google.android.wallet.common.a.f.b(this.aF, "sub_names");
        String[] strArr4 = (b4 == null || b4.length != strArr3.length) ? strArr3 : b4;
        String[] b5 = com.google.android.wallet.common.a.f.b(this.aF, "sub_zips");
        String[] strArr5 = (b5 == null || b5.length == strArr3.length) ? b5 : null;
        if (b2 == null || b2.length == strArr3.length) {
            strArr = b3;
            strArr2 = b2;
        } else {
            strArr = null;
            strArr2 = null;
        }
        String[] strArr6 = (strArr == null || strArr.length == strArr3.length) ? strArr : null;
        ArrayList<n> arrayList = new ArrayList<>(strArr3.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr3.length) {
                break;
            }
            arrayList.add(new n(strArr2 != null ? strArr2[i2] : null, strArr6 != null && Boolean.parseBoolean(strArr6[i2]), strArr3[i2], strArr4[i2], strArr5 != null ? strArr5[i2] : null));
            i = i2 + 1;
        }
        if (d) {
            Collections.sort(arrayList, aB);
        }
        return arrayList;
    }

    private ArrayList<aw> G() {
        boolean d = com.google.android.wallet.common.a.f.d(this.aF, this.ap);
        String[] b2 = d ? com.google.android.wallet.common.a.f.b(this.aG, "sub_lnames") : null;
        if (b2 == null) {
            b2 = com.google.android.wallet.common.a.f.b(this.aG, "sub_keys");
        }
        if (b2 == null || b2.length == 0) {
            return null;
        }
        String[] b3 = d ? b2 : com.google.android.wallet.common.a.f.b(this.aG, "sub_names");
        if (b3 == null || b3.length != b2.length) {
            b3 = b2;
        }
        ArrayList<aw> arrayList = new ArrayList<>(b2.length);
        for (int i = 0; i < b2.length; i++) {
            arrayList.add(new aw(b2[i], b3[i]));
        }
        if (d) {
            Collections.sort(arrayList, aB);
        }
        return arrayList;
    }

    protected void I() {
        String E = E();
        String a2 = com.google.android.wallet.common.a.f.a(this.aF, "require");
        ArrayList<View> arrayList = new ArrayList<>(E.length());
        this.aj = new ArrayList<>(E.length());
        int length = E.length();
        for (int i = 0; i < length; i++) {
            char charAt = E.charAt(i);
            char[] charArray = E.substring(i).toCharArray();
            if (charAt == 'N') {
                if (this.d instanceof FormEditText) {
                    a('N', charArray, a2, (FormEditText) this.d);
                    this.d.setEnabled(this.av);
                }
                this.aj.add(this.d);
            } else {
                View a3 = a(charAt, charArray, a2, (View) null);
                arrayList.add(a3);
                this.aj.add(a3);
            }
        }
        this.f.setFields(arrayList);
        Q();
        H();
    }

    private void H() {
        View view = null;
        int size = this.aj.size();
        int i = 0;
        while (i < size) {
            View view2 = this.aj.get(i);
            if (!view2.isFocusableInTouchMode()) {
                view2 = view;
            } else if (view != null) {
                if (Build.VERSION.SDK_INT >= 11) {
                    view.setNextFocusForwardId(view2.getId());
                    view2.setNextFocusForwardId(-1);
                } else {
                    view.setNextFocusDownId(view2.getId());
                    view2.setNextFocusDownId(-1);
                }
            }
            i++;
            view = view2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.google.android.wallet.ui.common.FormSpinner] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.google.android.wallet.ui.common.FormSpinner] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    private View a(char c, char[] cArr, String str, View view) {
        FormEditText formEditText;
        ArrayList<aw> G;
        ?? r4;
        Spinner spinner;
        FormEditText formEditText2;
        View view2 = (view == null || Character.valueOf(c).equals(view.getTag())) ? view : null;
        if (c == 'N') {
            throw new IllegalArgumentException("Recipient name should not be created dynamically");
        }
        boolean a2 = com.google.android.wallet.common.a.f.a(c, this.aF);
        String a3 = a(c);
        LayoutInflater layoutInflater = this.aK;
        FormEditText formEditText3 = null;
        formEditText3 = null;
        int i = au.get(c);
        if (com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).n, i)) {
            formEditText = layoutInflater.inflate(com.google.android.wallet.e.h.view_form_non_editable_text, (ViewGroup) null);
        } else if (c == 'S') {
            ArrayList<n> F = F();
            if (F != null && !F.isEmpty()) {
                if (view2 instanceof FormSpinner) {
                    spinner = (FormSpinner) view2;
                } else {
                    spinner = (FormSpinner) layoutInflater.inflate(com.google.android.wallet.e.h.view_default_spinner, (ViewGroup) null);
                }
                spinner.setRequired(a2);
                spinner.setPrompt(a3);
                spinner.setLabel(a3);
                u uVar = new u(this.aJ, com.google.android.wallet.e.h.view_row_spinner, com.google.android.wallet.e.g.description, F, new n(null, false, null, a3, null));
                uVar.setDropDownViewResource(com.google.android.wallet.e.h.view_spinner_dropdown);
                spinner.setAdapter((SpinnerAdapter) uVar);
                spinner.setOnItemSelectedListener(new k(this));
                formEditText3 = spinner;
            }
            formEditText = formEditText3;
        } else if (c != 'C' || (G = G()) == null || G.isEmpty()) {
            formEditText = null;
        } else {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.aJ, com.google.android.wallet.e.h.view_row_spinner, com.google.android.wallet.e.g.description, G);
            arrayAdapter.setDropDownViewResource(com.google.android.wallet.e.h.view_spinner_dropdown);
            if (view2 instanceof FormSpinner) {
                r4 = (FormSpinner) view2;
            } else {
                r4 = (FormSpinner) layoutInflater.inflate(com.google.android.wallet.e.h.view_default_spinner, (ViewGroup) null);
            }
            r4.setRequired(a2);
            r4.setPrompt(a3);
            r4.setAdapter(arrayAdapter);
            formEditText = r4;
        }
        if (formEditText == null) {
            if (view2 instanceof FormEditText) {
                formEditText2 = (FormEditText) view2;
            } else {
                formEditText2 = (FormEditText) layoutInflater.inflate(com.google.android.wallet.e.h.view_form_edit_text, (ViewGroup) null);
            }
            a(c, cArr, str, formEditText2);
            formEditText2.setRequired(a2);
            formEditText2.setHint(a3);
            int i2 = 1;
            switch (c) {
                case '1':
                case '2':
                case '3':
                case 'A':
                    i2 = 8305;
                    break;
                case 'C':
                    i2 = 8193;
                    break;
                case 'S':
                    i2 = 8193;
                    break;
                case 'Z':
                    if (com.google.android.wallet.common.a.f.c(this.aF)) {
                        i2 = 3;
                        if (Build.VERSION.SDK_INT >= 17) {
                            formEditText2.setTextDirection(3);
                            break;
                        }
                    } else {
                        i2 = 528385;
                        break;
                    }
                    break;
            }
            formEditText2.setInputType(i2);
            if (((com.google.b.a.a.a.b.a.a.b) this.aw).q) {
                formEditText2.setOnFocusChangeListener(this);
            }
            formEditText = formEditText2;
        }
        boolean a4 = com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, i);
        if (a4) {
            formEditText.setVisibility(8);
        }
        if (formEditText instanceof FormEditText) {
            formEditText.setShouldValidateWhenNotVisible(!a4);
        } else if (formEditText instanceof FormSpinner) {
            ((FormSpinner) formEditText).setShouldValidateWhenNotVisible(!a4);
        }
        formEditText.setId(com.google.android.wallet.common.a.f.a(c));
        formEditText.setTag(Character.valueOf(c));
        formEditText.setEnabled(this.av);
        return formEditText;
    }

    private String a(char c) {
        switch (c) {
            case 'N':
                return ((com.google.b.a.a.a.b.a.a.b) this.aw).m;
            default:
                return com.google.android.wallet.common.a.f.a(f(), c, this.aF);
        }
    }

    private boolean P() {
        View findFocus = this.f.findFocus();
        if (findFocus == null) {
            return false;
        }
        bj.b(f(), findFocus);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q() {
        Pattern b2;
        KeyEvent.Callback b3 = b('Z');
        if (!(b3 instanceof com.google.android.wallet.ui.common.t)) {
            this.aM = null;
            return;
        }
        bf bfVar = (bf) b3;
        if (this.aM != null) {
            bfVar.c(this.aM);
            this.aM = null;
        }
        this.aM = new com.google.android.wallet.ui.common.b.b(new com.google.android.wallet.ui.common.b.a[0]);
        String a2 = a(com.google.android.wallet.e.j.wallet_uic_error_address_field_invalid, a('Z'));
        Pattern b4 = com.google.android.wallet.common.a.f.b(this.aF);
        if (b4 != null) {
            this.aM.a(new com.google.android.wallet.ui.common.b.f(a2, b4));
        }
        n T = T();
        if (T != null && (b2 = com.google.android.wallet.common.a.f.b(T.e)) != null) {
            this.aM.a(new com.google.android.wallet.ui.common.b.f(a2, b2));
        }
        if (this.aM.b()) {
            this.aM = null;
            return;
        }
        bfVar.a(this.aM);
        if (bfVar instanceof TextView) {
            TextView textView = (TextView) bfVar;
            if (!TextUtils.isEmpty(textView.getText()) || !TextUtils.isEmpty(textView.getError())) {
                bfVar.af_();
                return;
            }
            return;
        }
        bfVar.af_();
    }

    private void R() {
        if (this.aP != null) {
            this.aP.d();
            this.aP = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        int c = c('C');
        View view = this.aj.get(c);
        String a2 = a(view);
        View a3 = a('C', E().substring(c).toCharArray(), com.google.android.wallet.common.a.f.a(this.aF, "require"), view);
        if (a3 != view) {
            this.f.a(view, a3);
            this.aj.set(c, a3);
            H();
        }
        a(a3, a2, false);
    }

    private n T() {
        View b2 = b('S');
        if (b2 != null && (b2 instanceof Spinner)) {
            return (n) ((Spinner) b2).getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String U() {
        return com.google.android.wallet.common.a.f.d(this.aF, this.ap) ? this.ap : com.google.android.wallet.common.a.f.a(this.aF, "lang");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public void u() {
        if (this.aC != null) {
            boolean z = this.av && !V();
            this.c.setEnabled(z);
            this.e.setEnabled(z);
            int size = this.aj.size();
            for (int i = 0; i < size; i++) {
                this.aj.get(i).setEnabled(z);
            }
            if (this.g != null) {
                this.g.setEnabled(z);
            }
        }
    }

    protected final boolean M() {
        return this.c.getVisibility() == 0 && this.c.isChecked();
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return true;
    }

    private boolean V() {
        return this.aH > 0;
    }

    final void a(boolean z) {
        this.aH = Math.max(0, (z ? 1 : -1) + this.aH);
        if ((z && this.aH == 1) || (!z && this.aH == 0)) {
            u();
        }
    }

    private View b(char c) {
        int c2 = c(c);
        if (c2 >= 0) {
            return this.aj.get(c2);
        }
        return null;
    }

    private int c(char c) {
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            Character ch = (Character) this.aj.get(i).getTag();
            if (ch != null && ch.charValue() == c) {
                return i;
            }
        }
        return -1;
    }

    private ArrayList<com.google.c.a.b> W() {
        ArrayList<com.google.c.a.b> arrayList = new ArrayList<>();
        arrayList.add(this.aL);
        if (this.aE != null) {
            arrayList.addAll(this.aE);
        }
        return arrayList;
    }

    private com.android.volley.o X() {
        return com.google.android.wallet.common.c.a.a(f().getApplicationContext());
    }

    @Override // com.google.android.wallet.ui.address.t
    @TargetApi(11)
    public final void a(float f) {
        if (this.g != null && this.g.getVisibility() == 0) {
            this.g.setTranslationY(f);
        }
        if (this.as != null) {
            this.as.a(f);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Y();
        if (this.ar != null) {
            this.ar.a(!z);
        }
        for (ai<View> aiVar : w()) {
            if (aiVar.f7482b instanceof com.google.android.wallet.ui.common.t) {
                ((com.google.android.wallet.ui.common.t) aiVar.f7482b).setError(null);
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            view.post(new e(this));
        }
    }

    void J() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.ai) {
            if (((com.google.b.a.a.a.b.a.a.b) this.aw).p == 4) {
                N();
            } else {
                D();
            }
        }
    }

    protected boolean D() {
        if (!this.am || !this.aD) {
            return false;
        }
        this.am = false;
        Y();
        this.aC.requestFocus(130);
        return true;
    }

    protected final void N() {
        if (!this.am || this.aD) {
            com.google.c.a.b bVar = new com.google.c.a.b();
            bVar.f7728a = com.google.android.wallet.common.a.o.a(this.al);
            bVar.c = this.ap;
            a(bVar);
            if (((com.google.b.a.a.a.b.a.a.b) this.aw).l) {
                b("");
            }
            D();
        }
    }

    private void Y() {
        boolean z = this.c.getVisibility() == 0 && this.c.isChecked();
        if (z || this.am || com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 2)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        if (z || this.am || com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 1)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
        if (z || this.am) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        if (((com.google.b.a.a.a.b.a.a.b) this.aw).l) {
            if (z || this.am || com.google.android.wallet.common.util.b.a(((com.google.b.a.a.a.b.a.a.b) this.aw).o, 8)) {
                this.g.setVisibility(8);
            } else {
                this.g.setVisibility(0);
            }
        }
        if (z || !this.am) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.f getUiElement() {
        return this.aN;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        return null;
    }

    protected int K() {
        return com.google.android.wallet.e.h.fragment_address_entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final boolean a(int[] iArr, boolean z) {
        if (this.I) {
            return true;
        }
        if (this.av && !V() && this.aC != null) {
            if (M()) {
                return true;
            }
            if (this.al == 0) {
                return false;
            }
            boolean a2 = super.a(iArr, z);
            if (this.d != null && this.at != null && !TextUtils.isEmpty(this.d.getError())) {
                this.at.y();
            }
            if (!a2 && ((com.google.b.a.a.a.b.a.a.b) this.aw).p == 2) {
                throw new IllegalArgumentException("Read-only address form has invalid value.");
            }
            if (z && !a2 && this.am) {
                this.am = false;
                Y();
            }
            return a2;
        }
        return false;
    }

    private String E() {
        int i;
        String str = null;
        if (com.google.android.wallet.common.a.f.d(this.aF, this.ap)) {
            str = com.google.android.wallet.common.a.f.a(this.aF, "lfmt");
        }
        if (TextUtils.isEmpty(str)) {
            str = com.google.android.wallet.common.a.f.a(this.aF, "fmt");
        }
        char[] a2 = com.google.android.wallet.common.a.f.a(str);
        String[] strArr = ((com.google.b.a.a.a.b.a.a.b) this.aw).k;
        String a3 = com.google.android.wallet.common.a.o.a(this.al);
        int length = strArr != null ? strArr.length : 0;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (com.google.android.wallet.common.util.g.a(strArr[i2], a3)) {
                    i = i2;
                    break;
                }
                i2++;
            } else {
                i = -1;
                break;
            }
        }
        boolean z = i >= 0;
        StringBuilder sb = new StringBuilder(a2.length);
        sb.append('N');
        for (char c : a2) {
            if (f7378a.get(c) && (!z || f7379b.get(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private void a(char c, char[] cArr, String str, FormEditText formEditText) {
        boolean z;
        if (this.aq != null && !this.aq.isEmpty()) {
            switch (c) {
                case '2':
                case '3':
                case 'X':
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            z = false;
        }
        if (z && com.google.android.wallet.common.util.i.a(f())) {
            formEditText.setAdapter(new r(this.aJ, com.google.android.wallet.e.h.view_row_address_hint_spinner, this.al, U(), c, cArr, str, this.aq));
            formEditText.setThreshold(0);
            formEditText.setOnItemClickListener(new l(this, formEditText));
        }
    }

    static /* synthetic */ void e(b bVar) {
        if (bVar.al != 0) {
            bVar.Q();
            n T = bVar.T();
            if (bVar.aG != null && com.google.android.wallet.common.util.g.a(com.google.android.wallet.common.a.f.a(bVar.aG, "key"), T.f7393a)) {
                T.f = bVar.aG;
                return;
            }
            bVar.aG = T.f;
            bVar.R();
            if (bVar.b('C') != null) {
                n T2 = bVar.T();
                if (!T2.f7394b || T2.f != null) {
                    bVar.S();
                } else {
                    bVar.aP = new com.google.android.wallet.common.a.i(bVar.al, T2.f7393a, new m(bVar, T2), new d(bVar));
                    bVar.X().a(bVar.aP);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b bVar, View view, com.google.c.a.b bVar2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int size = bVar.aj.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            View view2 = bVar.aj.get(i);
            boolean z3 = (z2 || view2 != view) ? z2 : true;
            if (z3) {
                char charValue = ((Character) view2.getTag()).charValue();
                String a2 = com.google.android.wallet.common.a.b.a(bVar2, charValue);
                if (!TextUtils.isEmpty(a2) || !com.google.android.wallet.common.a.f.a(charValue, bVar.aF) || TextUtils.isEmpty(a(view2))) {
                    a(view2, a2, true);
                    arrayList.add(Integer.valueOf(i));
                }
            }
            i++;
            z2 = z3;
        }
        if (z2) {
            EditText editText = null;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View view3 = bVar.aj.get(((Integer) arrayList.get(i2)).intValue());
                boolean isEmpty = TextUtils.isEmpty(a(view3));
                boolean z4 = isEmpty || !(view3 instanceof com.google.android.wallet.ui.common.t) || ((com.google.android.wallet.ui.common.t) view3).af_();
                if (editText == null && (!z4 || isEmpty)) {
                    editText = view3;
                }
            }
            if (editText != null) {
                editText.requestFocus();
                if (!(editText instanceof EditText)) {
                    return;
                }
                EditText editText2 = editText;
                editText2.setSelection(editText2.getText().length());
                return;
            }
            View focusSearch = bVar.f.focusSearch(130);
            if (focusSearch != null) {
                focusSearch.requestFocus();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            bVar.P();
        }
    }

    static /* synthetic */ void a(b bVar, View view) {
        boolean z;
        View focusSearch;
        if (view != null && (focusSearch = view.focusSearch(130)) != null) {
            focusSearch.requestFocus();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        bVar.P();
    }
}
