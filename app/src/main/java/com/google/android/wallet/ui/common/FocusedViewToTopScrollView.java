package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;

@TargetApi(14)
/* loaded from: classes.dex */
public class FocusedViewToTopScrollView extends ScrollView implements Animator.AnimatorListener, ViewTreeObserver.OnGlobalLayoutListener, Runnable {
    private static final Interpolator i = new AccelerateDecelerateInterpolator();
    private static boolean j = false;

    /* renamed from: a, reason: collision with root package name */
    int f7444a;

    /* renamed from: b, reason: collision with root package name */
    int f7445b;
    ValueAnimator c;
    int d;
    Runnable e;
    boolean f;
    int g;
    boolean h;
    private DisplayMetrics k;
    private boolean l;
    private boolean m;
    private View n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Animator.AnimatorListener u;
    private boolean v;
    private boolean w;
    private Interpolator x;
    private float y;
    private long z;

    public FocusedViewToTopScrollView(Context context) {
        super(context);
        this.o = 0;
        this.r = true;
        this.s = false;
        this.t = Build.VERSION.SDK_INT >= 14;
        this.v = false;
        this.w = false;
        this.f7444a = -1;
        this.f7445b = -1;
        this.c = null;
        this.d = -1;
        this.x = i;
        this.z = 500L;
        this.e = null;
        a(context, (AttributeSet) null);
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 0;
        this.r = true;
        this.s = false;
        this.t = Build.VERSION.SDK_INT >= 14;
        this.v = false;
        this.w = false;
        this.f7444a = -1;
        this.f7445b = -1;
        this.c = null;
        this.d = -1;
        this.x = i;
        this.z = 500L;
        this.e = null;
        a(context, attributeSet);
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = 0;
        this.r = true;
        this.s = false;
        this.t = Build.VERSION.SDK_INT >= 14;
        this.v = false;
        this.w = false;
        this.f7444a = -1;
        this.f7445b = -1;
        this.c = null;
        this.d = -1;
        this.x = i;
        this.z = 500L;
        this.e = null;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.o = 0;
        this.r = true;
        this.s = false;
        this.t = Build.VERSION.SDK_INT >= 14;
        this.v = false;
        this.w = false;
        this.f7444a = -1;
        this.f7445b = -1;
        this.c = null;
        this.d = -1;
        this.x = i;
        this.z = 500L;
        this.e = null;
        a(context, attributeSet);
    }

    public void setMaxDuration(long j2) {
        this.z = j2;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.x = interpolator;
    }

    public void setAnimateScroll(boolean z) {
        if (this.t != z && Build.VERSION.SDK_INT >= 14) {
            this.t = z;
            a();
        }
    }

    public void setThresholdToScrollInPixels(int i2) {
        this.q = i2;
    }

    public void setFocusedViewOffsetInPixels(int i2) {
        this.p = i2;
    }

    public boolean getScrollToTop() {
        return this.r;
    }

    public boolean getAnimateScroll() {
        return this.t;
    }

    public boolean getInjectPaddingForScrollToTopWithAdjustPan() {
        return this.m;
    }

    public void setPriorityScrollingAnimationListener(Animator.AnimatorListener animatorListener) {
        this.u = animatorListener;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i2, int i3) {
        if (this.t && this.w) {
            a(i3, true);
        } else {
            a(i3);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (!this.t) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = computeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                a(computeScrollDeltaToGetChildRectOnScreen + getScrollY(), false);
                return z2;
            }
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            return z2;
        }
        return z2;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.s) {
            return true;
        }
        a();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.v = true;
        super.onLayout(z, i2, i3, i4, i5);
        this.v = false;
        this.w = true;
    }

    @Override // android.widget.ScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putInt("thresholdToScroll", this.q);
        bundle.putBoolean("scrollToTop", this.r);
        bundle.putInt("focusedViewOffset", this.p);
        return bundle;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.q = bundle.getInt("thresholdToScroll");
        this.r = bundle.getBoolean("scrollToTop");
        this.p = bundle.getInt("focusedViewOffset");
    }

    @Override // android.widget.ScrollView
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.r) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        int scrollY = getScrollY();
        int height = scrollY + getHeight();
        int max = Math.max((rect.top - scrollY) - this.p, -getScrollY());
        if (rect.bottom > height + max) {
            if (rect.height() > getHeight()) {
                max = rect.top - scrollY;
            } else {
                max = rect.bottom - height;
            }
        }
        if (Math.abs(max) <= this.q) {
            return 0;
        }
        return max;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (b() && !a(view)) {
            view = b(view);
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // java.lang.Runnable
    public void run() {
        float f;
        this.e = null;
        if (this.f) {
            int i2 = this.g;
            int abs = Math.abs(i2 - getScrollY());
            if (this.c == null || !this.c.isRunning()) {
                f = 0.0f;
            } else {
                ValueAnimator valueAnimator = this.c;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                TimeInterpolator interpolator = valueAnimator.getInterpolator();
                float f2 = animatedFraction + 0.001f > 1.0f ? -0.001f : 0.001f;
                f = (((interpolator.getInterpolation(animatedFraction + f2) - interpolator.getInterpolation(animatedFraction)) / f2) * this.d) / this.c.getDuration();
                this.c.cancel();
                this.c.removeAllUpdateListeners();
            }
            this.c = ValueAnimator.ofInt(getScrollY(), i2);
            this.c.addListener(this);
            this.c.addUpdateListener(new w(this));
            long min = Math.min((long) (Math.abs(i2 - getScrollY()) / this.y), this.z);
            this.c.setDuration(min);
            float f3 = (f * min) / abs;
            this.c.setInterpolator(Float.compare(f3, 0.0f) == 0 ? this.x : new x(this.x, f3));
            this.f7444a = i2;
            this.f7445b = getScrollY();
            this.d = abs;
            if (this.h) {
                this.s = true;
                if (this.u != null) {
                    this.c.addListener(this.u);
                }
            }
            this.c.start();
            return;
        }
        a();
        a(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.s = false;
        this.f7444a = -1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.WalletUicFocusedViewToTopScrollView);
        this.p = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.wallet.e.k.WalletUicFocusedViewToTopScrollView_internalUicFocusedViewOffset, 0);
        this.q = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.wallet.e.k.WalletUicFocusedViewToTopScrollView_internalUicThresholdToScroll, 0);
        setMaxDuration(obtainStyledAttributes.getInteger(com.google.android.wallet.e.k.WalletUicFocusedViewToTopScrollView_internalUicMaxDuration, 500));
        setAverageSpeed(obtainStyledAttributes.getDimension(com.google.android.wallet.e.k.WalletUicFocusedViewToTopScrollView_internalUicAverageSpeed, 250.0f));
        obtainStyledAttributes.recycle();
        setSmoothScrollingEnabled(false);
        this.k = getContext().getResources().getDisplayMetrics();
    }

    private void a(int i2, boolean z) {
        if (this.v && getScrollY() == i2) {
            a(i2);
            return;
        }
        if (this.e != null) {
            removeCallbacks(this.e);
            this.e = null;
        }
        if (this.f7444a == -1 || Math.abs(this.f7444a - i2) > this.q || this.f7445b != getScrollY()) {
            this.g = i2;
            this.f = z;
            this.h = false;
            this.e = this;
            post(this.e);
        }
    }

    private void a(int i2) {
        super.scrollTo(getScrollX(), i2);
    }

    private void a() {
        if (this.c != null) {
            this.c.cancel();
        }
    }

    private boolean b() {
        return this.r && this.m && (this.o & 32) != 0;
    }

    private static boolean a(View view) {
        return (view instanceof LinearLayout) && ((LinearLayout) view).getOrientation() == 1;
    }

    private ViewGroup b(View view) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        return linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Rect rect = new Rect();
        boolean a2 = bj.a(rect, this, this.k);
        if (j) {
            Log.v("FocusedViewToTopScr", new StringBuilder(35).append("onGlobalLayout softKeyboardUp=").append(a2).toString());
        }
        if ((a2 && this.n == null) || a2 != this.l) {
            this.l = a2;
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (this.n != null) {
                viewGroup.removeView(this.n);
                this.n = null;
            }
            if (a2) {
                int i2 = rect.bottom - rect.top;
                View findViewById = getRootView().findViewById(R.id.content);
                int height = findViewById.getHeight();
                int[] iArr = new int[2];
                bj.a(iArr, this, findViewById);
                int height2 = ((this.k.heightPixels - i2) - (height - (iArr[1] + getHeight()))) - ((this.k.heightPixels - height) / 2);
                if (height2 < 0) {
                    Log.i("FocusedViewToTopScr", new StringBuilder(42).append("paddingToInsert=").append(height2).append(" < 0. Aborting.").toString());
                    return;
                }
                if (bj.a(viewGroup) == getHeight()) {
                    int i3 = ((int) (this.k.heightPixels * 0.98f)) - height;
                    if (j) {
                        Log.v("FocusedViewToTopScr", new StringBuilder(24).append("paddingToAdd=").append(i3).toString());
                    }
                    height2 += i3;
                }
                if (j) {
                    Log.v("FocusedViewToTopScr", new StringBuilder(27).append("paddingToInsert=").append(height2).toString());
                }
                this.n = new View(getContext());
                viewGroup.addView(this.n, 0, height2);
            }
        }
    }

    public void setAverageSpeed(float f) {
        this.y = ((int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics())) / 1000.0f;
    }

    public void setScrollToTop(boolean z) {
        this.r = z;
        this.m = false;
        this.o = 0;
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (this.n != null) {
            removeView(this.n);
            this.n = null;
        }
        if (!b()) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        View childAt = getChildAt(0);
        if (childAt == null || a(childAt)) {
            return;
        }
        removeView(childAt);
        addView(b(childAt));
    }

    static /* synthetic */ void a(FocusedViewToTopScrollView focusedViewToTopScrollView, int i2) {
        focusedViewToTopScrollView.f7445b = i2;
        focusedViewToTopScrollView.a(i2);
    }
}
