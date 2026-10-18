package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public class SuggestionBarLayout extends bq {

    /* renamed from: a, reason: collision with root package name */
    private LinearLayout f3095a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3096b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;

    public SuggestionBarLayout(Context context) {
        this(context, null);
    }

    public SuggestionBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = getResources().getDimensionPixelSize(R.dimen.suggestion_bar_underline_padding);
        this.j = getResources().getDimensionPixelSize(R.dimen.suggestion_bar_vertical_padding);
        this.k = getResources().getDimensionPixelSize(R.dimen.play_cluster_header_height);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3095a = (LinearLayout) findViewById(R.id.suggestion_line_full);
        this.f3096b = (TextView) findViewById(R.id.suggestion_line_text);
        this.c = (TextView) findViewById(R.id.suggestion_line_query);
        this.d = (TextView) findViewById(R.id.suggestion_line1);
        this.e = (TextView) findViewById(R.id.suggestion_line2);
        this.f = findViewById(R.id.suggestion_underline);
    }

    public final void a(String str, String str2) {
        String f = jm.f(str2);
        this.d.setText(str);
        this.e.setText(f);
        this.e.setSelected(true);
        this.f3096b.setText(str);
        this.c.setText(f);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        this.f3095a.measure(0, 0);
        this.d.measure(makeMeasureSpec, 0);
        this.e.measure(makeMeasureSpec, 0);
        this.f.measure(0, View.MeasureSpec.makeMeasureSpec(this.f.getLayoutParams().height, 1073741824));
        this.g = this.f3095a.getMeasuredWidth() <= size;
        this.h = this.g ? this.f3095a.getMeasuredHeight() : this.d.getMeasuredHeight() + this.e.getMeasuredHeight();
        this.h += this.j * 2;
        this.h += this.f.getMeasuredHeight();
        if (this.h < this.k) {
            this.h = this.k;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.h);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int measuredWidth = this.f3095a.getMeasuredWidth();
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredWidth3 = this.e.getMeasuredWidth();
        int measuredHeight = (height - this.f.getMeasuredHeight()) / 2;
        if (this.g) {
            this.f3095a.setVisibility(0);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            int measuredHeight2 = this.f3095a.getMeasuredHeight();
            this.f3095a.layout(paddingLeft, measuredHeight - (measuredHeight2 / 2), measuredWidth + paddingLeft, measuredHeight + (measuredHeight2 / 2));
        } else {
            this.f3095a.setVisibility(8);
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            int measuredHeight3 = this.d.getMeasuredHeight();
            int measuredHeight4 = this.e.getMeasuredHeight();
            int i5 = measuredHeight - ((measuredHeight3 + measuredHeight4) / 2);
            int i6 = measuredHeight3 + i5;
            this.d.layout(paddingLeft, i5, measuredWidth2 + paddingLeft, i6);
            this.e.layout(paddingLeft, i6, paddingLeft + measuredWidth3, i6 + measuredHeight4);
        }
        this.f.layout(this.i, this.h - this.f.getMeasuredHeight(), width - this.i, this.h);
    }
}
