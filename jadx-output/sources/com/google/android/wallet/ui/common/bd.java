package com.google.android.wallet.ui.common;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public Activity f7506a;

    /* renamed from: b, reason: collision with root package name */
    public int f7507b = -1;
    public bb c;
    private final com.google.b.a.a.a.b.a.b.x d;
    private final LayoutInflater e;
    private final ViewGroup f;

    public bd(com.google.b.a.a.a.b.a.b.x xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = xVar;
        this.e = layoutInflater;
        this.f = viewGroup;
    }

    public final <T extends View> T a() {
        FormCheckBox formCheckBox;
        com.android.volley.a.n b2 = this.f7506a == null ? null : com.google.android.wallet.common.util.i.b(this.f7506a.getApplicationContext());
        if (this.d.k != null) {
            if (be.a(this.d)) {
                if (TextUtils.isEmpty(this.d.k.g)) {
                    String valueOf = String.valueOf(this.d.f7692a);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Read only text field without an initial value. Name=".concat(valueOf) : new String("Read only text field without an initial value. Name="));
                }
                formCheckBox = (T) this.e.inflate(com.google.android.wallet.e.h.view_form_non_editable_text, this.f, false);
                ((TextView) formCheckBox).setText(this.d.k.g);
            } else {
                formCheckBox = (T) this.e.inflate(com.google.android.wallet.e.h.view_form_edit_text, this.f, false);
                bj.a(this.d, (FormEditText) formCheckBox, this.f7506a);
            }
        } else if (this.d.n != null) {
            if (be.a(this.d) || this.d.e) {
                throw new IllegalArgumentException("Date fields don't support disabled/read-only as it has no initial value.");
            }
            if (this.d.n.f7696a != 2) {
                throw new IllegalArgumentException(new StringBuilder(57).append("Date fields only support month and year. type=").append(this.d.n.f7696a).toString());
            }
            if (!TextUtils.isEmpty(this.d.f)) {
                throw new IllegalArgumentException("Date fields do not support labels.");
            }
            formCheckBox = (T) this.e.inflate(com.google.android.wallet.e.h.view_exp_edit_text, this.f, false);
            this.d.f = this.e.getContext().getString(com.google.android.wallet.e.j.wallet_uic_exp_date);
            bj.a(this.d, (FormEditText) formCheckBox, this.f7506a);
            this.d.f = "";
        } else if (this.d.l != null) {
            formCheckBox = (T) this.e.inflate(com.google.android.wallet.e.h.view_select_field, this.f, false);
            ((SelectFieldView) formCheckBox).a(this.d, b2);
        } else if (this.d.m != null) {
            if (be.a(this.d) || this.d.e) {
                throw new IllegalArgumentException("Checkbox field does not support disabled/read-only.");
            }
            if (TextUtils.isEmpty(this.d.f)) {
                throw new IllegalArgumentException("Checkbox field must have a label.");
            }
            FormCheckBox formCheckBox2 = (FormCheckBox) this.e.inflate(com.google.android.wallet.e.h.view_form_checkbox, (ViewGroup) null);
            formCheckBox2.setText(this.d.f);
            formCheckBox2.setState(this.d.m.f7694a);
            formCheckBox2.setRequired(!this.d.d);
            formCheckBox2.setRequiredErrorString(this.d.m.f7695b);
            formCheckBox = formCheckBox2;
        } else {
            String valueOf2 = String.valueOf(this.d);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 26).append("UiField is not supported: ").append(valueOf2).toString());
        }
        if (this.f7507b != -1) {
            formCheckBox.setId(this.f7507b);
        }
        if (this.d.g == null) {
            return formCheckBox;
        }
        if (this.c == null) {
            throw new IllegalArgumentException("An OnTooltipIconClickListener is required if the UI field has a tooltip.");
        }
        ba baVar = new ba(this.e.getContext());
        baVar.a(formCheckBox, this.d.g, b2);
        baVar.setOnTooltipIconClickListener(this.c);
        return baVar;
    }
}
