package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.by;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class SelectFieldView extends LinearLayout implements AdapterView.OnItemSelectedListener, com.google.android.wallet.b.c, com.google.android.wallet.b.d, ao, t {

    /* renamed from: a, reason: collision with root package name */
    FormSpinner f7461a;

    /* renamed from: b, reason: collision with root package name */
    InlineSelectView f7462b;
    InfoMessageTextView c;
    ImageWithCaptionView d;
    TextView e;
    private com.google.b.a.a.a.b.a.bpkg.x f;
    private boolean g;
    private int h;
    private com.google.android.wallet.b.e i;
    private LinkedList<com.google.b.a.a.a.b.a.bpkg.i> j;

    public SelectFieldView(Context context) {
        super(context);
        this.j = new LinkedList<>();
    }

    public SelectFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new LinkedList<>();
    }

    @TargetApi(11)
    public SelectFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new LinkedList<>();
    }

    @TargetApi(21)
    public SelectFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = new LinkedList<>();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7461a = (FormSpinner) findViewById(com.google.android.wallet.e.g.ui_field_spinner);
        this.f7462b = (InlineSelectView) findViewById(com.google.android.wallet.e.g.ui_field_inline_select);
        this.c = (InfoMessageTextView) findViewById(com.google.android.wallet.e.g.ui_field_info_message_description);
        this.d = (ImageWithCaptionView) findViewById(com.google.android.wallet.e.g.ui_field_read_only_text_icon);
        this.e = (TextView) findViewById(com.google.android.wallet.e.g.ui_field_read_only_text);
    }

    public final void a(com.google.b.a.a.a.b.a.bpkg.x xVar, com.android.volley.apkg.n nVar) {
        ArrayAdapter arrayAdapter;
        if (xVar.l.f7652a.length == 0) {
            throw new IllegalArgumentException("SelectField must contain options.");
        }
        boolean z = be.a(xVar) || xVar.e;
        if (z && xVar.l.f7652a.length > 1 && TextUtils.isEmpty(xVar.l.f7653b)) {
            throw new IllegalArgumentException("Read-only field does not have clear indication of which option to display.");
        }
        this.f = xVar;
        com.google.b.a.a.a.b.a.bpkg.aa aaVar = this.f.l;
        if ((z || aaVar.f7652a.length == 1) && aaVar.d == 1) {
            this.f7461a.setVisibility(8);
            this.f7462b.setVisibility(8);
            this.e.setVisibility(0);
            com.google.b.a.a.a.b.a.bpkg.ab abVar = aaVar.f7652a[getInitialSelection()];
            if (TextUtils.isEmpty(abVar.f7654a)) {
                throw new IllegalArgumentException("Each option must be provided a display value.");
            }
            this.e.setText(abVar.f7654a);
            this.c.setInfoMessage(abVar.d);
            if (abVar.e != null) {
                if (TextUtils.isEmpty(abVar.e.f7684a)) {
                    String valueOf = String.valueOf(abVar.f7654a);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Empty option icon url for option: ".concat(valueOf) : new String("Empty option icon url for option: "));
                }
                this.d.setVisibility(0);
                this.d.a(abVar.e, nVar, com.google.android.wallet.a.d.f7228a.b().booleanValue());
                return;
            }
            return;
        }
        if (aaVar.d == 1) {
            this.f7461a.setVisibility(0);
            this.f7462b.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.g = TextUtils.isEmpty(aaVar.f7653b) && !(TextUtils.isEmpty(aaVar.c) && TextUtils.isEmpty(xVar.f));
            ArrayList arrayList = new ArrayList(aaVar.f7652a.length);
            for (com.google.b.a.a.a.b.a.bpkg.ab abVar2 : aaVar.f7652a) {
                if (TextUtils.isEmpty(abVar2.f7654a)) {
                    throw new IllegalArgumentException(new StringBuilder(49).append("Option at index ").append(arrayList.size()).append(" has no display value.").toString());
                }
                arrayList.add(new aw(abVar2.f7655b, abVar2.f7654a));
            }
            if (this.g) {
                arrayAdapter = new com.google.android.wallet.ui.address.u(getContext(), com.google.android.wallet.e.h.view_row_spinner, com.google.android.wallet.e.g.description, arrayList, new aw("", TextUtils.isEmpty(aaVar.c) ? xVar.f : aaVar.c));
            } else {
                arrayAdapter = new ArrayAdapter(getContext(), com.google.android.wallet.e.h.view_row_spinner, com.google.android.wallet.e.g.description, arrayList);
            }
            arrayAdapter.setDropDownViewResource(com.google.android.wallet.e.h.view_spinner_dropdown);
            this.f7461a.setAdapter((SpinnerAdapter) arrayAdapter);
            this.f7461a.setOnItemSelectedListener(this);
            this.h = getInitialSelection();
            this.f7461a.setNonUserInputSelection(getInitialSelection());
            this.f7461a.setRequired(this.f.d ? false : true);
            this.f7461a.setPrompt(this.f.f);
            return;
        }
        if (aaVar.d == 2) {
            this.f7461a.setVisibility(8);
            this.f7462b.setVisibility(0);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            LayoutInflater from = LayoutInflater.from(getContext());
            for (com.google.b.a.a.a.b.a.bpkg.ab abVar3 : aaVar.f7652a) {
                View inflate = from.inflate(com.google.android.wallet.e.h.view_row_inline_select_field, (ViewGroup) null);
                ((TextView) inflate.findViewById(com.google.android.wallet.e.g.description)).setText(abVar3.f7654a);
                if (abVar3.e != null) {
                    ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) inflate.findViewById(com.google.android.wallet.e.g.icon);
                    imageWithCaptionView.setVisibility(0);
                    imageWithCaptionView.setLazyLoad(true);
                    imageWithCaptionView.a(abVar3.e, nVar, com.google.android.wallet.a.d.f7228a.b().booleanValue());
                }
                InlineSelectView inlineSelectView = this.f7462b;
                String str = abVar3.f7654a;
                inlineSelectView.addView(inflate);
                inflate.setContentDescription(str);
                by.a(inflate, inlineSelectView.f7457a);
            }
            this.f7462b.setOnItemSelectedListener(this);
            this.f7462b.setRequired(this.f.d ? false : true);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(45).append("Unknown SelectField display type: ").append(aaVar.d).toString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        a(c(i), view == null);
    }

    @Override // com.google.android.wallet.ui.common.ao
    public final void a(int i) {
        a(i, false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        this.c.setInfoMessage(null);
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        if (this.f7461a.getVisibility() == 0) {
            return this.f7461a.af_();
        }
        if (this.f7462b.getVisibility() == 0) {
            return this.f7462b.af_();
        }
        return true;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        if (this.f7461a.getVisibility() == 0) {
            return this.f7461a.ag_();
        }
        if (this.f7462b.getVisibility() == 0) {
            return this.f7462b.ag_();
        }
        return true;
    }

    public int getCount() {
        if (this.f != null) {
            return this.f.l.f7652a.length;
        }
        return 0;
    }

    public String getValue() {
        if (ag_()) {
            if (this.f7461a.getVisibility() == 0) {
                return b(c(this.f7461a.getSelectedItemPosition()));
            }
            if (this.f7462b.getVisibility() == 0) {
                return b(this.f7462b.getSelectedItemIndex());
            }
            return b(getInitialSelection());
        }
        return "";
    }

    private String b(int i) {
        return i < 0 ? "" : this.f.l.f7652a[i].f7655b;
    }

    public View getDisplayedFieldView() {
        return this.f7461a.getVisibility() == 0 ? this.f7461a : this.e;
    }

    @Override // com.google.android.wallet.ui.common.t
    public void setError(CharSequence charSequence) {
        if (this.f7461a.getVisibility() == 0) {
            this.f7461a.setError(charSequence);
        } else {
            if (this.e.getVisibility() == 0) {
                throw new IllegalArgumentException("Should never set error on a read only TextView.");
            }
            if (this.f7462b.getVisibility() == 0) {
                throw new IllegalArgumentException("Errors on inline list views are not supported");
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        if (this.f7461a.getVisibility() == 0) {
            return this.f7461a.getError();
        }
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7461a.setEnabled(z);
        this.f7462b.setEnabled(z);
    }

    private int getInitialSelection() {
        com.google.b.a.a.a.b.a.bpkg.aa aaVar = this.f.l;
        if (!TextUtils.isEmpty(aaVar.f7653b)) {
            int length = aaVar.f7652a.length;
            for (int i = 0; i < length; i++) {
                if (aaVar.f7652a[i].f7655b.equals(aaVar.f7653b)) {
                    return i;
                }
            }
        }
        return 0;
    }

    private int c(int i) {
        return this.g ? i - 1 : i;
    }

    private void a(int i, boolean z) {
        if (i >= 0) {
            com.google.b.a.a.a.b.a.bpkg.ab abVar = this.f.l.f7652a[i];
            this.c.setInfoMessage(abVar.d);
            boolean z2 = i == this.h && this.f7461a.getVisibility() == 0;
            if (!z && !z2) {
                Iterator<com.google.b.a.a.a.b.a.bpkg.i> it = this.j.iterator();
                while (it.hasNext()) {
                    com.google.b.a.a.a.b.a.bpkg.i next = it.next();
                    if (next.c.f7679a == null) {
                        this.i.a(next);
                    } else {
                        int[] iArr = next.c.f7679a.f7677a;
                        int length = iArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (iArr[i2] != abVar.c) {
                                i2++;
                            } else {
                                this.i.a(next);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.c.setInfoMessage(null);
        }
        this.h = i;
    }

    @Override // com.google.android.wallet.b.c
    public final void a(com.google.b.a.a.a.b.a.bpkg.f fVar, com.google.b.a.a.a.b.a.bpkg.i[] iVarArr) {
        switch (fVar.f7670a) {
            case 2:
                if (this.f7461a.getVisibility() == 0) {
                    this.f7461a.setNonUserInputSelection(getInitialSelection());
                }
                if (this.f7462b.getVisibility() == 0) {
                    this.f7462b.setSelection(-1);
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(56).append("Unknown ResultingActionReference action type ").append(fVar.f7670a).toString());
        }
    }

    @Override // com.google.android.wallet.b.d
    public void setTriggerListener(com.google.android.wallet.b.e eVar) {
        this.i = eVar;
    }

    @Override // com.google.android.wallet.b.d
    public final void a(ArrayList<com.google.b.a.a.a.b.a.bpkg.i> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.b.a.a.a.b.a.bpkg.i iVar = arrayList.get(i);
            switch (iVar.f7676b) {
                case 1:
                    this.j.add(iVar);
                default:
                    throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
            }
        }
    }

    @Override // com.google.android.wallet.b.d
    public final boolean a(com.google.b.a.a.a.b.a.bpkg.i iVar) {
        switch (iVar.f7676b) {
            case 1:
                return false;
            default:
                throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
        }
    }
}
