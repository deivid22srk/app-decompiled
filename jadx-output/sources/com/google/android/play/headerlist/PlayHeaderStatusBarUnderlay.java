package com.google.android.play.headerlist;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

@TargetApi(21)
/* loaded from: classes.dex */
class PlayHeaderStatusBarUnderlay extends View implements Animator.AnimatorListener {
    private static Interpolator d;

    /* renamed from: a, reason: collision with root package name */
    int f6895a;

    /* renamed from: b, reason: collision with root package name */
    int f6896b;
    boolean c;
    private final Paint e;
    private int f;
    private int g;
    private int h;
    private ObjectAnimator i;

    public PlayHeaderStatusBarUnderlay(Context context) {
        this(context, null);
    }

    public PlayHeaderStatusBarUnderlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PlayHeaderListLayout.f6889b) {
            this.e = new Paint();
            this.e.setAntiAlias(false);
            setAlpha(0.0f);
            return;
        }
        this.e = null;
    }

    public final void a(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (PlayHeaderListLayout.f6889b) {
            int width = getWidth();
            this.e.setColor(this.g);
            canvas.drawRect(0.0f, 0.0f, width, this.h, this.e);
            if (this.h > this.f6895a) {
                this.e.setColor(this.f);
                canvas.drawRect(0.0f, this.f6895a, width, this.h, this.e);
            }
        }
    }

    final void a(int i) {
        if (this.h != i) {
            this.h = i;
            invalidate();
        }
    }

    final void a(int i, boolean z) {
        float alpha = getAlpha();
        if (this.i != null && this.i.isStarted()) {
            alpha = ((Float) this.i.getAnimatedValue()).floatValue();
            this.i.cancel();
        }
        float f = alpha;
        float f2 = i == 1 ? 1.0f : 0.0f;
        if (z && f != f2) {
            if (d == null) {
                d = new LinearInterpolator();
            }
            this.f6896b = i;
            this.i = ObjectAnimator.ofFloat(this, (Property<PlayHeaderStatusBarUnderlay, Float>) ALPHA, f, f2);
            this.i.setDuration((long) (Math.abs(f2 - f) * 300.0f));
            this.i.setInterpolator(d);
            this.i.addListener(this);
            this.i.start();
            return;
        }
        setAlpha(f2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        setLayerType(2, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (animator == this.i) {
            boolean z = this.f6896b == 2;
            this.f6896b = 0;
            this.i = null;
            if (z) {
                setMinimumHeight(0);
            }
            setLayerType(0, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (animator == this.i) {
            this.f6896b = 0;
            this.i = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }
}
