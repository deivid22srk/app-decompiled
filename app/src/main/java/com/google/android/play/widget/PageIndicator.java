package com.google.android.play.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.play.h;
import com.google.android.play.i;
import com.google.android.play.j;
import com.google.android.play.m;

/* loaded from: classes.dex */
public class PageIndicator extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f7086a;

    /* renamed from: b, reason: collision with root package name */
    private int f7087b;
    private int c;

    public PageIndicator(Context context) {
        this(context, null, 0);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7086a = -1;
        this.f7087b = h.play_onboard__page_indicator_dot_active;
        this.c = h.play_onboard__page_indicator_dot_inactive;
        setGravity(16);
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7086a = -1;
        this.f7087b = h.play_onboard__page_indicator_dot_active;
        this.c = h.play_onboard__page_indicator_dot_inactive;
        setGravity(16);
    }

    public int getPageCount() {
        return getChildCount();
    }

    public void setPageCount(int i) {
        com.google.android.play.utils.a.b(i >= 0, "numPages must be >=0");
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i2 = childCount;
            while (i2 < i) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(j.play_onboard_page_indicator_dot);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int dotHorizontalMargin = getDotHorizontalMargin();
                int dotVerticalMargin = getDotVerticalMargin();
                layoutParams.gravity = 16;
                layoutParams.setMargins(dotHorizontalMargin, dotVerticalMargin, dotHorizontalMargin, dotVerticalMargin);
                addView(imageView, layoutParams);
                a(imageView, i2 == this.f7086a, false, i2);
                i2++;
            }
        }
        a();
    }

    public int getSelectedPage() {
        return this.f7086a;
    }

    public void setSelectedPage(int i) {
        if (this.f7086a != i) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                a((ImageView) getChildAt(i2), i2 == i, true, i2);
                i2++;
            }
            this.f7086a = i;
            a();
        }
    }

    public void setSelectedColorResId(int i) {
        this.f7087b = i;
        invalidate();
    }

    public void setUnselectedColorResId(int i) {
        this.c = i;
        invalidate();
    }

    protected int getDotHorizontalMargin() {
        return getResources().getDimensionPixelSize(i.play_onboard__page_indicator_dot_diameter) / 2;
    }

    protected int getDotVerticalMargin() {
        return 0;
    }

    protected ImageView a(ImageView imageView, boolean z, boolean z2, int i) {
        ((GradientDrawable) imageView.getDrawable()).setColor(getResources().getColor(z ? this.f7087b : this.c));
        return imageView;
    }

    private void a() {
        setContentDescription(getResources().getString(m.play_content_description_page_indicator, Integer.valueOf(getSelectedPage() + 1), Integer.valueOf(getPageCount())));
    }
}
