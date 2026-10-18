package com.google.android.wallet.instrumentmanager.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.wallet.instrumentmanager.h;

/* loaded from: classes.dex */
public class InstrumentManagerRootLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f7328a;

    public InstrumentManagerRootLinearLayout(Context context) {
        super(context);
    }

    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    @TargetApi(11)
    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public InstrumentManagerRootLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        return FocusFinder.getInstance().findNextFocus(this, view, i);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.WalletImMaxWidthView);
        this.f7328a = obtainStyledAttributes.getDimensionPixelSize(h.WalletImMaxWidthView_maxWidth, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f7328a > 0 && this.f7328a < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f7328a, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
