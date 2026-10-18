package com.google.android.wallet.instrumentmanager.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.wallet.instrumentmanager.h;

/* loaded from: classes.dex */
public class InstrumentManagerRootFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f7327a;

    public InstrumentManagerRootFrameLayout(Context context) {
        super(context);
    }

    public InstrumentManagerRootFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public InstrumentManagerRootFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        return FocusFinder.getInstance().findNextFocus(this, view, i);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.WalletImMaxWidthView);
        this.f7327a = obtainStyledAttributes.getDimensionPixelSize(h.WalletImMaxWidthView_maxWidth, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f7327a > 0 && this.f7327a < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f7327a, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
