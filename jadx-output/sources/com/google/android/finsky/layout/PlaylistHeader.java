package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class PlaylistHeader extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f3047a;

    /* renamed from: b, reason: collision with root package name */
    private View f3048b;
    private View c;
    private final int d;

    public PlaylistHeader(Context context) {
        this(context, null);
    }

    public PlaylistHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.play_cluster_header_height);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3047a = findViewById(R.id.header);
        this.f3048b = findViewById(R.id.subheader);
        this.c = findViewById(R.id.song_list_control);
    }

    private boolean a() {
        return this.f3048b.getVisibility() == 8 && this.c.getVisibility() == 8;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        if (a()) {
            this.f3047a.measure(i, 0);
            int measuredHeight = this.f3047a.getMeasuredHeight();
            int i3 = measuredHeight + paddingTop + paddingBottom;
            if (i3 <= this.d) {
                i3 = paddingTop + measuredHeight + ((((this.d - measuredHeight) - paddingTop) - paddingBottom) / 2) + paddingBottom;
            }
            setMeasuredDimension(size, i3);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        this.c.measure(0, 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - this.c.getMeasuredWidth()) - android.support.v4.view.ao.b(marginLayoutParams), 1073741824);
        this.f3047a.measure(makeMeasureSpec, 0);
        int measuredHeight2 = this.f3047a.getMeasuredHeight() + paddingTop;
        if (this.f3048b.getVisibility() != 8) {
            this.f3048b.measure(makeMeasureSpec, 0);
            measuredHeight2 += this.f3048b.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(measuredHeight2 + paddingBottom, this.d));
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (a()) {
            int height = getHeight() - getPaddingBottom();
            this.f3047a.layout(0, height - this.f3047a.getMeasuredHeight(), this.f3047a.getMeasuredWidth(), height);
            return;
        }
        int width = getWidth();
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int paddingTop = getPaddingTop();
        int paddingTop2 = getPaddingTop();
        int measuredHeight = this.f3047a.getMeasuredHeight();
        if (this.f3048b.getVisibility() != 8) {
            measuredHeight += this.f3048b.getMeasuredHeight();
        }
        int height2 = paddingTop + ((((getHeight() - paddingTop) - measuredHeight) - paddingTop2) / 2);
        int measuredWidth = this.f3047a.getMeasuredWidth();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, 0);
        this.f3047a.layout(a2, height2, measuredWidth + a2, this.f3047a.getMeasuredHeight() + height2);
        int b2 = com.google.android.play.utils.j.b(width, this.c.getMeasuredWidth(), z2, android.support.v4.view.ao.b((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()));
        int baseline = (height2 + this.f3047a.getBaseline()) - this.c.getBaseline();
        this.c.layout(b2, baseline, this.c.getMeasuredWidth() + b2, this.c.getMeasuredHeight() + baseline);
        if (this.f3048b.getVisibility() != 8) {
            int bottom = this.f3047a.getBottom();
            int measuredWidth2 = this.f3048b.getMeasuredWidth();
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, 0);
            this.f3048b.layout(a3, bottom, a3 + measuredWidth2, this.f3048b.getMeasuredHeight() + bottom);
        }
    }
}
