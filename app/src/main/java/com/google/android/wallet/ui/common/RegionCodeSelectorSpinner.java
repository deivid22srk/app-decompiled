package com.google.android.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class RegionCodeSelectorSpinner extends FormSpinner {
    private ContextThemeWrapper d;
    private as e;

    public RegionCodeSelectorSpinner(Context context) {
        super(context);
        setThemedContext(context);
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setThemedContext(context);
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setThemedContext(context);
    }

    private void setThemedContext(Context context) {
        if (context instanceof ContextThemeWrapper) {
            this.d = (ContextThemeWrapper) context;
            return;
        }
        throw new IllegalArgumentException("RegionCodeSelectorSpinner must be used with a ContextThemeWrapper");
    }

    public int getSelectedRegionCode() {
        return ((Integer) getSelectedItem()).intValue();
    }

    public void setRegionCodes(int[] iArr) {
        at atVar = new at(this.d, com.google.android.wallet.e.h.view_row_spinner, com.google.android.wallet.e.g.description, com.google.android.wallet.common.util.b.a(iArr));
        atVar.setDropDownViewResource(com.google.android.wallet.e.h.view_spinner_dropdown);
        setAdapter((SpinnerAdapter) atVar);
        setOnItemSelectedListener(new ar(this));
    }

    public int getRegionCodeCount() {
        return getCount();
    }

    public void setRegionCodeSelectedListener(as asVar) {
        this.e = asVar;
    }

    @Override // com.google.android.wallet.ui.common.FormSpinner, com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return super.ag_() && getSelectedRegionCode() != 0;
    }
}
