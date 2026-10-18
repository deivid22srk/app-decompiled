package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.finsky.activities.gq;

/* loaded from: classes.dex */
public class SpacerHeightAwareFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private gq f3090a;

    public SpacerHeightAwareFrameLayout(Context context) {
        super(context);
    }

    public SpacerHeightAwareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpacerHeightAwareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SpacerHeightAwareFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setSpacerHeightProvider(gq gqVar) {
        this.f3090a = gqVar;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int a2;
        if (this.f3090a != null && (a2 = this.f3090a.a()) != getPaddingTop()) {
            setPadding(getPaddingLeft(), a2, getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
    }
}
