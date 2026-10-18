package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class ProportionalOuterFrame extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private float f3050a;

    /* renamed from: b, reason: collision with root package name */
    private int f3051b;

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.ProportionalOuterFrame);
        this.f3050a = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProportionalOuterFrame(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int width = (getWidth() - childAt.getMeasuredWidth()) / 2;
            childAt.layout(width, 0, childAt.getMeasuredWidth() + width, getHeight());
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3051b = 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f3051b = Math.max(this.f3051b, (int) (getContext().getResources().getFraction(R.fraction.setup_wizard_title_height_fraction, 1, 1) * size2));
        if (getChildCount() > 0) {
            measureChild(getChildAt(0), View.MeasureSpec.makeMeasureSpec((int) (size * this.f3050a), 1073741824), i2);
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById != null) {
            findViewById.setMinimumHeight(this.f3051b);
        }
        setMeasuredDimension(size, size2);
    }
}
