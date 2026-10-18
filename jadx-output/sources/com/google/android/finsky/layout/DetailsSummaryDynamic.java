package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class DetailsSummaryDynamic extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private View f2962a;

    /* renamed from: b, reason: collision with root package name */
    private View f2963b;
    private View c;

    public DetailsSummaryDynamic(Context context) {
        this(context, null);
    }

    public DetailsSummaryDynamic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2962a = findViewById(R.id.button_container);
        this.f2963b = findViewById(R.id.download_progress_panel);
        this.c = findViewById(R.id.summary_dynamic_status);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        this.f2962a.measure(i, i2);
        int measuredWidth = this.f2962a.getMeasuredWidth();
        int measuredHeight = this.f2962a.getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        if (this.f2963b.getVisibility() == 0 && mode == 1073741824) {
            this.f2963b.measure(i, i2);
        } else {
            this.f2963b.measure(makeMeasureSpec, i2);
        }
        int max = Math.max(measuredWidth, this.f2963b.getMeasuredWidth());
        int max2 = Math.max(measuredHeight, this.f2963b.getMeasuredHeight());
        if (this.c.getVisibility() == 0 && mode == 1073741824) {
            this.c.measure(i, i2);
        } else {
            this.c.measure(makeMeasureSpec, i2);
        }
        setMeasuredDimension(Math.max(max, this.c.getMeasuredWidth()), Math.max(max2, this.c.getMeasuredHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }
}
