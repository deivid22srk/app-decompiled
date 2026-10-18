package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final b f640a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f641b;
    protected ActionMenuView c;
    protected k d;
    protected int e;
    protected android.support.v4.view.dy f;
    private boolean g;
    private boolean h;

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f640a = new b(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.support.v7.b.b.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f641b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f641b = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, android.support.v7.b.l.ActionBar, android.support.v7.b.b.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(android.support.v7.b.l.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.d != null) {
            k kVar = this.d;
            if (!kVar.m) {
                kVar.l = kVar.f585b.getResources().getInteger(android.support.v7.b.h.abc_max_action_buttons);
            }
            if (kVar.c == null) {
                return;
            }
            kVar.c.b(true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a2 == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (a2 == 1 || a2 == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a2 == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (a2 == 10 || a2 == 3) {
            this.h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.e;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.f640a.f682a : getVisibility();
    }

    public android.support.v4.view.dy a(int i, long j) {
        if (this.f != null) {
            this.f.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                android.support.v4.view.by.c((View) this, 0.0f);
            }
            android.support.v4.view.dy a2 = android.support.v4.view.by.t(this).a(1.0f);
            a2.a(j);
            a2.a(this.f640a.a(a2, i));
            return a2;
        }
        android.support.v4.view.dy a3 = android.support.v4.view.by.t(this).a(0.0f);
        a3.a(j);
        a3.a(this.f640a.a(a3, i));
        return a3;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f != null) {
                this.f.a();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.d != null) {
            return this.d.c();
        }
        return false;
    }

    protected static int a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) + 0);
    }

    protected static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected static int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
