package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.play.layout.PlayCardThumbnail;
import java.util.List;

/* loaded from: classes.dex */
public class DetailsSummary extends ViewGroup implements com.google.android.finsky.detailspage.bq, aj, ak, an {

    /* renamed from: a, reason: collision with root package name */
    private View f2960a;

    /* renamed from: b, reason: collision with root package name */
    private int f2961b;
    private int c;
    private PlayCardThumbnail d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private View o;
    private View p;
    private boolean q;
    private final int r;
    private final int s;
    private final int t;
    private final Rect u;
    private final Rect v;

    public DetailsSummary(Context context) {
        this(context, null);
    }

    public DetailsSummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.r = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
        this.c = resources.getDimensionPixelSize(R.dimen.summary_thumbnail_peek);
        this.s = resources.getDimensionPixelSize(R.dimen.details_title_offset);
        this.t = resources.getDimensionPixelSize(R.dimen.summary_wishlist_touch_extend);
        this.u = new Rect();
        this.v = new Rect();
        this.f2961b = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2960a = findViewById(R.id.title_background);
        this.d = (PlayCardThumbnail) findViewById(R.id.title_thumbnail_frame);
        this.e = findViewById(R.id.title_title);
        this.f = findViewById(R.id.title_wishlist_button);
        this.g = findViewById(R.id.title_creator_panel);
        this.h = findViewById(R.id.title_creator_block);
        this.j = findViewById(R.id.title_rating_size);
        this.k = findViewById(R.id.title_content_rating_panel);
        this.i = findViewById(R.id.title_app_size_rating_line);
        this.l = findViewById(R.id.title_tipper_sticker);
        this.m = findViewById(R.id.title_bylines);
        this.n = findViewById(R.id.title_extra_labels);
        this.o = findViewById(R.id.title_extra_labels_bottom);
        this.p = findViewById(R.id.title_details_summary_dynamic);
    }

    public void setThumbnailMode(int i) {
        if (this.f2961b != i) {
            this.f2961b = i;
            int color = getResources().getColor(R.color.white);
            if (this.f2961b == 1) {
                setBackgroundDrawable(new InsetDrawable((Drawable) new PaintDrawable(color), 0, this.c, 0, 0));
            } else {
                setBackgroundColor(color);
            }
            android.support.v4.view.by.a(this, 0, 0, 0, 0);
            requestLayout();
        }
    }

    @Override // com.google.android.finsky.layout.ak
    public int getTopPeekAmount() {
        if (this.f2961b == 1) {
            return this.c;
        }
        return 0;
    }

    @Override // com.google.android.finsky.layout.aj
    public final void b(List<View> list) {
        list.add(this.e);
        list.add(this.f);
        list.add(this.g);
        list.add(this.h);
        list.add(this.j);
        list.add(this.k);
        list.add(this.i);
        list.add(this.l);
        list.add(this.m);
        list.add(this.n);
        list.add(this.o);
        list.add(this.p);
    }

    @Override // com.google.android.finsky.layout.aj
    public final void a(List<Integer> list) {
        list.add(Integer.valueOf(R.id.title_title));
        list.add(Integer.valueOf(R.id.title_wishlist_button));
        list.add(Integer.valueOf(R.id.title_creator_panel));
        list.add(Integer.valueOf(R.id.title_creator_block));
        list.add(Integer.valueOf(R.id.title_rating_size));
        list.add(Integer.valueOf(R.id.title_content_rating));
        list.add(Integer.valueOf(R.id.title_app_size_rating_line));
        list.add(Integer.valueOf(R.id.title_tipper_sticker));
        list.add(Integer.valueOf(R.id.title_bylines));
        list.add(Integer.valueOf(R.id.title_extra_labels));
        list.add(Integer.valueOf(R.id.title_extra_labels_bottom));
        list.add(Integer.valueOf(R.id.title_details_summary_dynamic));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.f2960a != null) {
            this.f2960a.setPadding(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (this.f2960a != null) {
            android.support.v4.view.by.a(this.f2960a, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public Drawable getBackground() {
        if (this.f2960a == null) {
            return null;
        }
        return this.f2960a.getBackground();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f2960a != null) {
            this.f2960a.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    @TargetApi(16)
    public void setBackground(Drawable drawable) {
        if (this.f2960a != null) {
            this.f2960a.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.f2960a != null) {
            this.f2960a.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.f2960a != null) {
            this.f2960a.setBackgroundResource(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.DetailsSummary.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int i7 = this.r;
        int paddingTop = getPaddingTop();
        if (this.f2961b == 2) {
            paddingTop += this.r;
        }
        if (this.d == null || this.d.getVisibility() == 8) {
            i5 = i7;
        } else {
            int measuredWidth = this.d.getMeasuredWidth();
            int i8 = this.f2961b == 0 ? 0 : this.r;
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i8);
            this.d.layout(a2, paddingTop, a2 + measuredWidth, this.d.getMeasuredHeight() + paddingTop);
            i5 = i8 + measuredWidth + i7;
        }
        int topPeekAmount = paddingTop + getTopPeekAmount();
        if (this.f2961b != 2) {
            topPeekAmount += this.r;
        }
        if (this.f.getVisibility() != 8) {
            int measuredWidth2 = this.f.getMeasuredWidth();
            int b2 = com.google.android.play.utils.j.b(width, measuredWidth2, z2, this.r);
            this.f.layout(b2, topPeekAmount, measuredWidth2 + b2, this.f.getMeasuredHeight() + topPeekAmount);
            this.f.getHitRect(this.u);
            this.u.inset(-this.t, -this.t);
            if (!this.u.equals(this.v)) {
                setTouchDelegate(new com.google.android.play.utils.i(this.u, this.f));
                this.v.set(this.u);
            }
        } else {
            this.v.setEmpty();
            setTouchDelegate(null);
        }
        int i9 = topPeekAmount - this.s;
        int measuredWidth3 = this.e.getMeasuredWidth();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, i5);
        this.e.layout(a3, i9, measuredWidth3 + a3, this.e.getMeasuredHeight() + i9);
        int measuredHeight = i9 + this.e.getMeasuredHeight();
        if (this.g.getVisibility() != 8) {
            int measuredWidth4 = this.g.getMeasuredWidth();
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth4, z2, i5);
            this.g.layout(a4, measuredHeight, measuredWidth4 + a4, this.g.getMeasuredHeight() + measuredHeight);
            measuredHeight += this.g.getMeasuredHeight();
        }
        if (this.m.getVisibility() == 0) {
            int measuredWidth5 = this.m.getMeasuredWidth();
            int a5 = com.google.android.play.utils.j.a(width, measuredWidth5, z2, i5);
            this.m.layout(a5, measuredHeight, measuredWidth5 + a5, this.m.getMeasuredHeight() + measuredHeight);
            measuredHeight += this.m.getMeasuredHeight();
        }
        if (this.j.getVisibility() != 8) {
            int a6 = com.google.android.play.utils.j.a(width, this.j.getMeasuredWidth(), z2, i5);
            this.j.layout(a6, measuredHeight, this.j.getMeasuredWidth() + a6, this.j.getMeasuredHeight() + measuredHeight);
            measuredHeight += this.j.getMeasuredHeight();
        }
        if (this.l.getVisibility() == 0) {
            int measuredWidth6 = this.l.getMeasuredWidth();
            int a7 = com.google.android.play.utils.j.a(width, measuredWidth6, z2, i5);
            this.l.layout(a7, measuredHeight, measuredWidth6 + a7, this.l.getMeasuredHeight() + measuredHeight);
            measuredHeight += this.l.getMeasuredHeight();
        }
        if (this.h.getVisibility() != 8) {
            int measuredWidth7 = this.h.getMeasuredWidth();
            int a8 = com.google.android.play.utils.j.a(width, measuredWidth7, z2, i5);
            int i10 = measuredHeight + (this.r / 2);
            this.h.layout(a8, i10, measuredWidth7 + a8, this.h.getMeasuredHeight() + i10);
            measuredHeight = i10 + this.h.getMeasuredHeight();
        }
        if (this.q) {
            measuredHeight -= this.n.getMeasuredHeight();
        }
        int paddingBottom = height - getPaddingBottom();
        if (this.o.getVisibility() != 8) {
            int paddingTop2 = paddingBottom - this.o.getPaddingTop();
            this.o.layout(0, paddingTop2 - this.o.getMeasuredHeight(), this.o.getMeasuredWidth(), paddingTop2);
            i6 = paddingTop2 - this.o.getMeasuredHeight();
        } else {
            i6 = paddingBottom - this.r;
        }
        if (this.p.getVisibility() != 8) {
            int measuredHeight2 = this.p.getMeasuredHeight();
            int measuredWidth8 = this.p.getMeasuredWidth();
            int b3 = com.google.android.play.utils.j.b(width, measuredWidth8, z2, this.r);
            this.p.layout(b3, i6 - measuredHeight2, measuredWidth8 + b3, i6);
            measuredHeight = (i6 - measuredHeight2) - this.n.getMeasuredHeight();
        }
        if (this.n.getVisibility() != 8) {
            int measuredWidth9 = this.n.getMeasuredWidth();
            int b4 = com.google.android.play.utils.j.b(width, measuredWidth9, z2, this.r);
            this.n.layout(b4, measuredHeight, measuredWidth9 + b4, this.n.getMeasuredHeight() + measuredHeight);
        }
        if (this.f2960a.getVisibility() != 8) {
            this.f2960a.layout(0, 0, width, height);
        }
    }
}
