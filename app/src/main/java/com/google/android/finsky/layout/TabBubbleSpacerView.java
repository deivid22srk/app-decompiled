package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class TabBubbleSpacerView extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f3097a;

    public TabBubbleSpacerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabBubbleSpacerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.f3097a);
    }

    public void setHeight(int i) {
        this.f3097a = i;
    }
}
