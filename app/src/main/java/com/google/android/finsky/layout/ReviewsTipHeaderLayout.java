package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ReviewsTipHeaderLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    boolean f3064a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3065b;
    private TextView c;
    private TextView d;
    private View e;
    private TextView f;
    private TextView g;

    public ReviewsTipHeaderLayout(Context context) {
        this(context, null);
    }

    public ReviewsTipHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.tip_header_fullline);
        this.c = (TextView) findViewById(R.id.tip_title);
        this.d = (TextView) findViewById(R.id.tip_info);
        this.f = (TextView) findViewById(R.id.tip_title_line1);
        this.g = (TextView) findViewById(R.id.tip_info_line2);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        this.c.setText(charSequence);
        this.f.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence2)) {
            this.d.setVisibility(0);
            this.d.setText(charSequence2);
            this.g.setVisibility(0);
            this.g.setText(charSequence2);
            return;
        }
        this.d.setVisibility(4);
        this.g.setVisibility(4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        if (!this.f3065b) {
            this.e.measure(0, 0);
        }
        this.f3064a = !this.f3065b && this.e.getMeasuredWidth() <= size;
        if (this.f3064a) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        } else {
            this.f.measure(makeMeasureSpec, 0);
            this.g.measure(makeMeasureSpec, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f3064a ? this.e.getMeasuredHeight() : this.f.getMeasuredHeight() + this.g.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        if (this.f3064a) {
            int measuredWidth = this.e.getMeasuredWidth();
            this.e.setVisibility(0);
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            int measuredHeight = this.e.getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.e.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
            return;
        }
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        int measuredHeight2 = this.f.getMeasuredHeight();
        int measuredHeight3 = this.g.getMeasuredHeight();
        int paddingTop2 = getPaddingTop();
        int i5 = measuredHeight2 + paddingTop2;
        int paddingLeft2 = ((width - getPaddingLeft()) - getPaddingRight()) / 2;
        int measuredWidth2 = paddingLeft2 - (this.f.getMeasuredWidth() / 2);
        int measuredWidth3 = paddingLeft2 - (this.g.getMeasuredWidth() / 2);
        this.f.layout(measuredWidth2, paddingTop2, measuredWidth2 + width, i5);
        this.g.layout(measuredWidth3, i5, width + measuredWidth3, measuredHeight3 + i5);
    }
}
