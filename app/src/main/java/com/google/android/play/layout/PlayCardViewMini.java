package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ao;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class PlayCardViewMini extends a {
    private int E;
    private final int F;
    private int G;
    private int H;
    private boolean I;

    /* renamed from: a, reason: collision with root package name */
    protected View f6970a;

    public PlayCardViewMini(Context context) {
        this(context, null);
    }

    public PlayCardViewMini(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = -1;
        Resources resources = context.getResources();
        this.E = resources.getDimensionPixelSize(com.google.android.play.i.play_mini_card_content_height);
        this.F = resources.getDimensionPixelSize(com.google.android.play.i.play_mini_card_label_threshold);
        this.H = 2;
    }

    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6970a = findViewById(com.google.android.play.k.li_ad_label_container);
    }

    public void setTitleMaxLines(int i) {
        if (this.H != i) {
            this.H = i;
            this.h.setMaxLines(i);
        }
    }

    public void setTallTextContent(boolean z) {
        this.I = z;
        this.E = -1;
    }

    private int getTextContentHeight() {
        if (this.E == -1) {
            this.E = getResources().getDimensionPixelSize(this.I ? com.google.android.play.i.play_mini_card_content_height_tall : com.google.android.play.i.play_mini_card_content_height);
        }
        return this.E;
    }

    private boolean c(int i) {
        return i <= (this.I ? 4 : 3) + (-2);
    }

    @Override // com.google.android.play.layout.a
    public final boolean c() {
        if (c(this.H)) {
            return true;
        }
        return super.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:
    
        if ((r13.q.getMeasuredWidth() + com.google.android.play.utils.j.a(r13.q)) > r3) goto L46;
     */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.PlayCardViewMini.onMeasure(int, int):void");
    }

    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = by.h(this) == 0;
        int n = by.n(this);
        int o = by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = this.f6970a != null ? (ViewGroup.MarginLayoutParams) this.f6970a.getLayoutParams() : null;
        int measuredWidth = this.b_.getMeasuredWidth();
        int measuredHeight = this.b_.getMeasuredHeight();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n);
        this.b_.layout(a2, paddingTop, measuredWidth + a2, paddingTop + measuredHeight);
        if (this.f6970a != null && this.f6970a.getVisibility() != 8) {
            int measuredWidth2 = this.f6970a.getMeasuredWidth();
            int a3 = ao.a(marginLayoutParams6);
            int paddingTop2 = ((paddingTop + measuredHeight) - this.b_.getPaddingTop()) - this.f6970a.getMeasuredHeight();
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, a3 + by.n(this.b_) + n);
            this.f6970a.layout(a4, paddingTop2, this.f6970a.getMeasuredWidth() + a4, this.f6970a.getMeasuredHeight() + paddingTop2);
        }
        int a5 = ao.a(marginLayoutParams);
        int measuredWidth3 = this.h.getMeasuredWidth();
        int i5 = ((measuredHeight + paddingTop) + marginLayoutParams.topMargin) - this.G;
        int a6 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, a5 + n);
        this.h.layout(a6, i5, measuredWidth3 + a6, this.h.getMeasuredHeight() + i5);
        int b2 = ao.b(marginLayoutParams5);
        int measuredWidth4 = this.v.getMeasuredWidth();
        int i6 = marginLayoutParams5.topMargin + i5;
        int b3 = com.google.android.play.utils.j.b(width, measuredWidth4, z2, b2 + o);
        this.v.layout(b3, i6, measuredWidth4 + b3, this.v.getMeasuredHeight() + i6);
        int b4 = ao.b(marginLayoutParams4);
        int measuredWidth5 = this.t.getMeasuredWidth();
        int i7 = ((height - paddingBottom) - marginLayoutParams4.bottomMargin) + this.G;
        int b5 = com.google.android.play.utils.j.b(width, measuredWidth5, z2, b4 + o);
        this.t.layout(b5, i7 - this.t.getMeasuredHeight(), measuredWidth5 + b5, i7);
        if (this.k.getVisibility() == 0) {
            int a7 = ao.a(marginLayoutParams2);
            int measuredWidth6 = this.k.getMeasuredWidth();
            int a8 = com.google.android.play.utils.j.a(width, measuredWidth6, z2, a7 + n);
            if (c(this.h.getLineCount())) {
                int measuredHeight2 = marginLayoutParams.bottomMargin + this.h.getMeasuredHeight() + i5 + marginLayoutParams2.topMargin;
                this.k.layout(a8, measuredHeight2, a8 + measuredWidth6, this.k.getMeasuredHeight() + measuredHeight2);
            } else {
                int measuredHeight3 = ((i7 - this.t.getMeasuredHeight()) + this.t.getBaseline()) - this.k.getBaseline();
                this.k.layout(a8, measuredHeight3, a8 + measuredWidth6, this.k.getMeasuredHeight() + measuredHeight3);
            }
        }
        if (this.q.getVisibility() == 0) {
            int a9 = ao.a(marginLayoutParams3);
            int measuredWidth7 = this.q.getMeasuredWidth();
            int top = (this.t.getTop() + this.t.getBaseline()) - this.q.getBaseline();
            int a10 = com.google.android.play.utils.j.a(width, measuredWidth7, z2, a9 + n);
            this.q.layout(a10, top, measuredWidth7 + a10, this.q.getMeasuredHeight() + top);
        }
        int measuredWidth8 = ((((width - n) - o) - this.y.getMeasuredWidth()) / 2) + n;
        int measuredHeight4 = ((((height - paddingTop) - paddingBottom) - this.y.getMeasuredHeight()) / 2) + paddingTop;
        this.y.layout(measuredWidth8, measuredHeight4, this.y.getMeasuredWidth() + measuredWidth8, this.y.getMeasuredHeight() + measuredHeight4);
        e();
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 0;
    }
}
