package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
public class ErrorFooter extends br {

    /* renamed from: a, reason: collision with root package name */
    private TextView f2979a;

    /* renamed from: b, reason: collision with root package name */
    private Button f2980b;

    public ErrorFooter(Context context) {
        this(context, null);
    }

    public ErrorFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2979a = (TextView) findViewById(R.id.error_message);
        this.f2980b = (Button) findViewById(R.id.retry_button);
    }

    public final void a(String str, View.OnClickListener onClickListener) {
        this.f2979a.setText(str);
        this.f2980b.setText(R.string.network_retry);
        this.f2980b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.f2980b.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft / 2, Integer.MIN_VALUE), 0);
        this.f2979a.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft - this.f2980b.getMeasuredWidth(), Integer.MIN_VALUE), 0);
        setMeasuredDimension(size, getPaddingTop() + getPaddingBottom() + Math.max(this.f2979a.getMeasuredHeight(), this.f2980b.getMeasuredHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = this.f2980b.getMeasuredWidth();
        int measuredHeight = this.f2980b.getMeasuredHeight();
        int measuredWidth2 = this.f2979a.getMeasuredWidth();
        int measuredHeight2 = this.f2979a.getMeasuredHeight();
        int i5 = ((((height - paddingTop) - paddingBottom) - measuredHeight) / 2) + paddingTop;
        this.f2980b.layout((width - paddingRight) - measuredWidth, i5, width - paddingRight, measuredHeight + i5);
        int i6 = ((((height - paddingTop) - paddingBottom) - measuredHeight2) / 2) + paddingTop;
        int i7 = (((((width - paddingLeft) - paddingRight) - measuredWidth) - measuredWidth2) / 2) + paddingLeft;
        this.f2979a.layout(i7, i6, i7 + measuredWidth2, i6 + measuredHeight2);
    }
}
