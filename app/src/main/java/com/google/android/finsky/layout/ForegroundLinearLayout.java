package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ForegroundLinearLayout extends LinearLayout implements com.google.android.play.layout.l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2991a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2992b;
    private Drawable c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final Rect h;
    private final Rect i;
    private boolean j;

    static {
        f2991a = Build.VERSION.SDK_INT >= 11;
        f2992b = Build.VERSION.SDK_INT >= 17;
    }

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = new Rect();
        this.i = new Rect();
        this.j = false;
        a(context, attributeSet);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = new Rect();
        this.i = new Rect();
        this.j = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
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
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    this.d = rect.left;
                    this.e = rect.top;
                    this.f = rect.right;
                    this.g = rect.bottom;
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
        if (f2991a && this.c != null) {
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

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.j = true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c != null) {
            Drawable drawable = this.c;
            if (this.j) {
                this.j = false;
                Rect rect = this.h;
                Rect rect2 = this.i;
                rect.set(this.d, this.e, getWidth() - this.f, getHeight() - this.g);
                if (f2992b) {
                    android.support.v4.view.v.a(119, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, android.support.v4.view.by.h(this));
                } else {
                    this.i.set(rect);
                }
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }
}
