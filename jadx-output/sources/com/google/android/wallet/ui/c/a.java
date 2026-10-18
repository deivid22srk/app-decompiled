package com.google.android.wallet.ui.c;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.e.c;
import com.google.android.wallet.e.g;
import com.google.android.wallet.e.h;
import com.google.android.wallet.ui.common.FormSpinner;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bd;
import com.google.android.wallet.ui.common.bj;
import com.google.b.a.a.a.b.a.a.e.b;
import com.google.b.a.a.a.b.a.b.x;
import com.google.b.a.a.a.b.a.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<b> implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    FormSpinner f7408a;

    /* renamed from: b, reason: collision with root package name */
    protected LinearLayout f7409b;
    protected ArrayList<ai<View>> c = new ArrayList<>();
    private final f d = new f(1666);

    public static a a(b[] bVarArr, int i, int i2) {
        if (bVarArr == null || bVarArr.length == 0) {
            throw new IllegalArgumentException("At least one tax form should be provided");
        }
        if (i < 0 || i >= bVarArr.length) {
            throw new IllegalArgumentException(new StringBuilder(88).append("Initial tax form index: ").append(i).append(" is outside of tax forms valid range: [0,").append(bVarArr.length).append(")").toString());
        }
        a aVar = new a();
        Bundle c = ah.c(i2);
        c.putParcelableArrayList("formProtos", ParcelableProto.a(bVarArr));
        c.putInt("initialFormProtoIndex", i);
        aVar.f(c);
        return aVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.ay != i) {
            this.ay = i;
            x();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    private void x() {
        this.f7409b.removeAllViews();
        this.c.clear();
        x[] xVarArr = ((b) this.ax.get(this.ay)).c;
        int length = xVarArr.length;
        for (int i = 0; i < length; i++) {
            bd bdVar = new bd(xVarArr[i], this.aK, this.f7409b);
            bdVar.f7507b = i + 1;
            View a2 = bdVar.a();
            this.c.add(new ai<>(xVarArr[i].f7693b, a2, bj.a(xVarArr[i])));
            this.f7409b.addView(a2);
        }
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai<View>> w() {
        return this.c;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        b bVar = (b) this.ax.get(this.ay);
        if (!jVar.f7704a.f7650a.equals(bVar.f7620a)) {
            return false;
        }
        if (jVar.f7704a.f7651b != 1) {
            throw new IllegalArgumentException(new StringBuilder(55).append("TaxInfoForm does not support field with id: ").append(jVar.f7704a.f7651b).toString());
        }
        int i = jVar.f7704a.c;
        if (i < 0 || i >= bVar.c.length) {
            throw new IllegalArgumentException(new StringBuilder(80).append("FormFieldMessage repeatedFieldIndex: ").append(i).append(" is out of range [0,").append(bVar.c.length).append(")").toString());
        }
        bj.a(b(i), jVar.f7705b);
        return true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.f7408a == null) {
            return;
        }
        boolean z = this.av;
        this.f7408a.setEnabled(z);
        int childCount = this.f7409b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            b(i).setEnabled(z);
        }
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return true;
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.d;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<e> getChildren() {
        return null;
    }

    public final View b(int i) {
        return this.f7409b.getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.aJ.obtainStyledAttributes(new int[]{c.internalUicTaxInfoEntryRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, h.fragment_tax_info_entry);
        obtainStyledAttributes.recycle();
        View inflate = layoutInflater.inflate(resourceId, (ViewGroup) null, false);
        this.f7408a = (FormSpinner) inflate.findViewById(g.tax_info_forms_spinner);
        this.f7409b = (LinearLayout) inflate.findViewById(g.tax_info_fields_container);
        x();
        if (this.ax.size() > 1) {
            this.f7408a.setVisibility(0);
            int size = this.ax.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((b) this.ax.get(i)).f7621b;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(f(), h.view_row_spinner, g.description, strArr);
            arrayAdapter.setDropDownViewResource(h.view_spinner_dropdown);
            this.f7408a.setAdapter((SpinnerAdapter) arrayAdapter);
            this.f7408a.setNonUserInputSelection(this.ay);
            this.f7408a.setOnItemSelectedListener(this);
        }
        u();
        return inflate;
    }
}
