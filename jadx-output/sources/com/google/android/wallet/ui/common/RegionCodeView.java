package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class RegionCodeView extends FrameLayout implements com.google.android.wallet.b.d, as {

    /* renamed from: a, reason: collision with root package name */
    public TextView f7459a;

    /* renamed from: b, reason: collision with root package name */
    public RegionCodeSelectorSpinner f7460b;
    private com.google.b.a.a.a.b.a.a.j c;
    private boolean d;
    private boolean e;
    private int f;
    private as g;
    private com.google.android.wallet.b.e h;
    private ArrayList<com.google.b.a.a.a.b.a.b.i> i;

    public RegionCodeView(Context context) {
        super(context);
        this.i = new ArrayList<>();
    }

    public RegionCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new ArrayList<>();
    }

    public RegionCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new ArrayList<>();
    }

    @TargetApi(21)
    public RegionCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new ArrayList<>();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7460b = (RegionCodeSelectorSpinner) findViewById(com.google.android.wallet.e.g.region_code_spinner);
        this.f7459a = (TextView) findViewById(com.google.android.wallet.e.g.region_code_text);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7460b.setEnabled(z);
        this.f7459a.setEnabled(z);
    }

    public void setFormHeader(com.google.b.a.a.a.b.a.a.j jVar) {
        this.c = jVar;
    }

    public void setRegionCodes(int[] iArr) {
        if (iArr.length == 1) {
            this.f7460b.setRegionCodeSelectedListener(null);
            this.f7460b.setVisibility(8);
            this.f7459a.setText(com.google.android.wallet.common.a.f.b(iArr[0]));
            a(iArr[0], getId(), false);
            this.f7459a.setVisibility(0);
            this.d = true;
        } else {
            this.f7460b.setRegionCodeSelectedListener(this);
            this.f7460b.setRegionCodes(iArr);
            this.f7460b.setVisibility(0);
            this.f7459a.setVisibility(8);
            this.d = false;
        }
        this.e = true;
    }

    public final void setSelectedRegionCode$2563266(int i) {
        int position;
        if (!this.e) {
            throw new IllegalStateException("setRegionCodes() must be called before setSelectedRegionCode()");
        }
        this.f = i;
        if (!this.d) {
            RegionCodeSelectorSpinner regionCodeSelectorSpinner = this.f7460b;
            if (regionCodeSelectorSpinner.getAdapter() == null) {
                throw new IllegalStateException("Populate selector with region codes before setting the selected Region Code");
            }
            if (i == 0 || i == regionCodeSelectorSpinner.getSelectedRegionCode() || (position = ((at) regionCodeSelectorSpinner.getAdapter()).getPosition(Integer.valueOf(i))) < 0) {
                return;
            }
            regionCodeSelectorSpinner.setNonUserInputSelection(position);
        }
    }

    public void setRegionCodeSelectedListener(as asVar) {
        this.g = asVar;
    }

    public int getSelectedRegionCode() {
        return this.d ? this.f : this.f7460b.getSelectedRegionCode();
    }

    public com.google.b.a.a.a.b.a.a.e getFieldValue() {
        com.google.b.a.a.a.b.a.a.e eVar = new com.google.b.a.a.a.b.a.a.e();
        eVar.f7618a = this.c.f7628a;
        eVar.f7619b = this.c.c;
        eVar.c = com.google.android.wallet.common.a.o.a(getSelectedRegionCode());
        return eVar;
    }

    @Override // com.google.android.wallet.ui.common.as
    public final void a(int i, int i2, boolean z) {
        boolean z2 = z && i != this.f;
        this.f = i;
        if (this.g != null) {
            this.g.a(i, getId(), z2);
        }
        if (z2) {
            int size = this.i.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.google.b.a.a.a.b.a.b.i iVar = this.i.get(i3);
                if (iVar.c.f7679a == null) {
                    this.h.a(iVar);
                } else if (Pattern.compile(iVar.c.f7679a.f7678b).matcher(com.google.android.wallet.common.a.o.a(this.f)).matches()) {
                    this.h.a(iVar);
                }
            }
        }
    }

    @Override // com.google.android.wallet.b.d
    public void setTriggerListener(com.google.android.wallet.b.e eVar) {
        this.h = eVar;
    }

    @Override // com.google.android.wallet.b.d
    public final void a(ArrayList<com.google.b.a.a.a.b.a.b.i> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.b.a.a.a.b.a.b.i iVar = arrayList.get(i);
            if (iVar.f7676b == 1) {
                this.i.add(iVar);
            } else {
                throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
            }
        }
    }

    @Override // com.google.android.wallet.b.d
    public final boolean a(com.google.b.a.a.a.b.a.b.i iVar) {
        if (iVar.f7676b == 1) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
    }
}
