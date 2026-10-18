package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.vending.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class ExpandedDescriptionMarginBox extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2981a;

    /* renamed from: b, reason: collision with root package name */
    private DetailsExpandedFrame f2982b;

    public ExpandedDescriptionMarginBox(Context context) {
        this(context, null);
    }

    public ExpandedDescriptionMarginBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2981a = context.getResources().getBoolean(R.bool.use_wide_layout);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2982b = (DetailsExpandedFrame) findViewById(R.id.details_expanded_frame);
        this.f2982b.setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f2982b.setScrollerWidth(Math.min(size, this.f2981a ? ik.b(getResources()) : size));
        this.f2982b.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
