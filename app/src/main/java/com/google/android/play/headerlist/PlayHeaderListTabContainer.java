package com.google.android.play.headerlist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class PlayHeaderListTabContainer extends LinearLayout {
    private static int[] d = new int[2];
    private static int[] e = new int[2];

    /* renamed from: a, reason: collision with root package name */
    int f6891a;

    /* renamed from: b, reason: collision with root package name */
    float f6892b;
    boolean c;
    private final Paint f;
    private int g;
    private boolean h;
    private int i;

    public PlayHeaderListTabContainer(Context context) {
        this(context, null);
    }

    public PlayHeaderListTabContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.g = context.getResources().getDimensionPixelSize(com.google.android.play.i.play_header_list_tab_strip_selected_underline_height);
        this.f = new Paint();
    }

    public void setSelectedIndicatorColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public void setSelectedUnderlineThickness(int i) {
        this.g = i;
        invalidate();
    }

    void setStripWidth(int i) {
        if (this.i != i || !this.c) {
            this.i = i;
            a();
        }
    }

    private void a() {
        int i;
        int i2;
        if (this.h) {
            i2 = getResources().getDimensionPixelSize(com.google.android.play.i.play_header_list_tab_floating_padding);
            i = i2;
        } else {
            int i3 = this.i / 2;
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.measure(-2, -2);
                i = i3 - (childAt.getMeasuredWidth() / 2);
            } else {
                i = 0;
            }
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null) {
                childAt2.measure(-2, -2);
                i2 = i3 - (childAt2.getMeasuredWidth() / 2);
            } else {
                i2 = 0;
            }
            if (by.h(this) != 0) {
                int i4 = i;
                i = i2;
                i2 = i4;
            }
        }
        by.a(this, i, 0, i2, 0);
        this.c = true;
    }

    public void setUseFloatingTabPadding(boolean z) {
        if (this.h != z) {
            this.h = z;
            a();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getChildCount() > 0 && this.f6891a < getChildCount()) {
            a(getChildAt(this.f6891a), d);
            if (this.f6892b > 0.0f && this.f6891a < getChildCount() - 1) {
                a(getChildAt(this.f6891a + 1), e);
                d[0] = (int) ((this.f6892b * e[0]) + ((1.0f - this.f6892b) * d[0]));
                d[1] = (int) ((this.f6892b * e[1]) + ((1.0f - this.f6892b) * d[1]));
            }
            canvas.drawRect(d[0], r0 - this.g, d[1], getHeight(), this.f);
        }
    }

    private static void a(View view, int[] iArr) {
        if (!(view instanceof TextView)) {
            iArr[0] = view.getLeft();
            iArr[1] = view.getRight();
            return;
        }
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            iArr[0] = (textView.getLeft() + textView.getRight()) / 2;
            iArr[1] = iArr[0];
        } else {
            iArr[0] = textView.getLeft();
            iArr[1] = textView.getRight();
        }
    }
}
