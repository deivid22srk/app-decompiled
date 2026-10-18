package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.v;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class ForegroundRelativeLayout extends RelativeLayout implements l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6960a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6961b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private boolean f;
    int m;
    int n;
    int o;
    int p;

    static {
        f6960a = Build.VERSION.SDK_INT >= 11;
        f6961b = Build.VERSION.SDK_INT >= 17;
    }

    public ForegroundRelativeLayout(Context context) {
        this(context, null, 0);
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.d = new Rect();
        this.e = new Rect();
        this.f = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.foreground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View, com.google.android.play.layout.l
    public void setForeground(Drawable drawable) {
        if (this.c != drawable) {
            if (this.c != null) {
                this.c.setCallback(null);
                unscheduleDrawable(this.c);
            }
            this.c = drawable;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    this.m = rect.left;
                    this.n = rect.top;
                    this.o = rect.right;
                    this.p = rect.bottom;
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View, com.google.android.play.layout.l
    public Drawable getForeground() {
        return this.c;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (f6960a && this.c != null) {
            this.c.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.c != null) {
            this.c.setHotspot(f, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.c != null) {
            this.c.setVisible(i == 0, false);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f = true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c != null) {
            Drawable drawable = this.c;
            if (this.f) {
                this.f = false;
                Rect rect = this.d;
                Rect rect2 = this.e;
                rect.set(this.m, this.n, getWidth() - this.o, getHeight() - this.p);
                if (f6961b) {
                    v.a(119, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
                } else {
                    this.e.set(rect);
                }
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }
}
