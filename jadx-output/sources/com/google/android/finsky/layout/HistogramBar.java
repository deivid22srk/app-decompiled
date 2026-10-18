package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class HistogramBar extends View {

    /* renamed from: a, reason: collision with root package name */
    private double f2999a;

    /* renamed from: b, reason: collision with root package name */
    private double f3000b;
    private int c;

    public HistogramBar(Context context) {
        this(context, null);
    }

    public HistogramBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setMaxBarWidth(double d) {
        this.f3000b = d;
    }

    public void setWidthPercentage(double d) {
        this.f2999a = d;
    }

    public void setBarHeight(int i) {
        this.c = i;
    }

    public void setColor(int i) {
        super.setBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.f2999a * this.f3000b);
        if (i3 >= 0) {
            setMeasuredDimension(i3, this.c);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight();
    }
}
