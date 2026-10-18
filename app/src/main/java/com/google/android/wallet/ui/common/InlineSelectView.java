package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class InlineSelectView extends LinearLayout implements View.OnClickListener, t {

    /* renamed from: a, reason: collision with root package name */
    an f7457a;

    /* renamed from: b, reason: collision with root package name */
    private ao f7458b;
    private boolean c;
    private int d;

    public InlineSelectView(Context context) {
        super(context);
        this.f7457a = new an(this);
        this.c = true;
        this.d = -1;
    }

    public InlineSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7457a = new an(this);
        this.c = true;
        this.d = -1;
    }

    @TargetApi(11)
    public InlineSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7457a = new an(this);
        this.c = true;
        this.d = -1;
    }

    @TargetApi(21)
    public InlineSelectView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7457a = new an(this);
        this.c = true;
        this.d = -1;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putInt("selectedItemIndex", this.d);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.d = bundle.getInt("selectedItemIndex", -1);
        setSelection(this.d);
    }

    public int getSelectedItemIndex() {
        return this.d;
    }

    public void setSelection(int i) {
        a(this.d, false);
        this.d = i;
        a(this.d, true);
        if (this.f7458b != null) {
            this.f7458b.a(this.d);
        }
    }

    private void a(int i, boolean z) {
        View findViewById;
        if (i >= 0 && i < getChildCount() && (findViewById = getChildAt(i).findViewById(com.google.android.wallet.e.g.selection_indicator)) != null) {
            findViewById.setVisibility(z ? 0 : 4);
        }
    }

    public void setRequired(boolean z) {
        this.c = z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        int childCount = getChildCount();
        super.addView(view);
        view.setTag(Integer.valueOf(childCount));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        setSelection(((Integer) view.getTag()).intValue());
    }

    public void setOnItemSelectedListener(ao aoVar) {
        this.f7458b = aoVar;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        return ag_();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            bj.d(getChildAt(i), z);
        }
    }

    @Override // com.google.android.wallet.ui.common.t
    public void setError(CharSequence charSequence) {
        throw new IllegalArgumentException("Errors not supported on InlineSelectView.");
    }

    @Override // com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return !this.c || this.d >= 0;
    }
}
