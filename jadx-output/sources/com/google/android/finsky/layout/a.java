package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected float f3104a;

    /* renamed from: b, reason: collision with root package name */
    protected float f3105b;
    protected int c;
    protected int d;
    protected final float e;
    protected Context f;
    private VelocityTracker g;
    private float h;
    private boolean i;
    private final int j;
    private b k;
    private float l;
    private android.support.v4.widget.ad m;
    private android.support.v4.widget.ad n;

    abstract float a(float f);

    abstract float b(float f);

    abstract float b(int i);

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f3105b = 0.0f;
        this.f = context;
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = context.getResources().getDisplayMetrics().density * 160.0f * 1158.2634f * ViewConfiguration.getScrollFriction();
        this.m = new android.support.v4.widget.ad(context);
        this.n = new android.support.v4.widget.ad(context);
        setWillNotDraw(false);
    }

    private float c(float f) {
        if (this.f3104a == 0.0f) {
            return f;
        }
        float f2 = f;
        while (f2 < 0.0f) {
            f2 += this.f3104a;
        }
        while (f2 >= this.f3104a) {
            f2 -= this.f3104a;
        }
        return f2;
    }

    protected final void a(int i) {
        if (this.f3104a > getWidth()) {
            float scrollPosition = (-b(i)) - getScrollPosition();
            float sqrt = (float) Math.sqrt(Math.abs(2.0f * this.e * scrollPosition));
            float f = sqrt / this.e;
            if (scrollPosition < 0.0f) {
                sqrt = -sqrt;
            }
            a(sqrt, f);
        }
    }

    private void a() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getY();
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 2 && this.i) {
            return true;
        }
        switch (action & 255) {
            case 0:
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                } else {
                    this.g.clear();
                }
                this.g.addMovement(motionEvent);
                this.i = false;
                this.h = x;
                this.l = 0.0f;
                break;
            case 2:
                float f = this.h - x;
                this.h = x;
                this.l += Math.abs(f);
                if (this.l > this.j) {
                    a();
                    this.g.addMovement(motionEvent);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    this.i = true;
                    break;
                }
                break;
        }
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:4:0x0006, B:10:0x0020, B:12:0x0030, B:13:0x0038, B:17:0x0044, B:19:0x004f, B:21:0x0057, B:23:0x0062, B:24:0x006c, B:27:0x0080, B:29:0x0095, B:31:0x00a0, B:34:0x00b1, B:37:0x00b8, B:39:0x00bf, B:40:0x00e0, B:41:0x00ea, B:43:0x00ee, B:46:0x00fe, B:47:0x0101, B:48:0x0104, B:50:0x0108, B:51:0x0119, B:54:0x0139, B:57:0x0144, B:59:0x0148, B:60:0x014c, B:62:0x0157, B:63:0x0163, B:65:0x0169, B:70:0x0177, B:72:0x0180, B:73:0x0184, B:74:0x018b, B:77:0x01a2, B:78:0x01a7, B:67:0x01ac), top: B:3:0x0006 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void a(float f, float f2) {
        long abs = (long) Math.abs(1000.0f * f2);
        this.f3105b = getScrollPosition();
        this.k = new b(this, f, abs);
        this.k.a();
    }

    protected float getScrollPosition() {
        return -getScrollX();
    }

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        if (!this.m.a()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), 0.0f);
            this.m.a(height, (int) this.f3104a);
            z = this.m.a(canvas) | false;
            canvas.restoreToCount(save);
        }
        if (!this.n.a()) {
            int save2 = canvas.save();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), -this.f3104a);
            this.n.a(height2, (int) this.f3104a);
            z |= this.n.a(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        if (f > 0.0f) {
            f = 0.0f;
        }
        int width = (int) (this.f3104a - getWidth());
        if ((-f) > width) {
            f = -width;
        }
        scrollTo(-((int) f), 0);
        invalidate();
    }
}
