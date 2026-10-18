package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class SetupWizardStickyHeaderScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private View f3082a;

    /* renamed from: b, reason: collision with root package name */
    private View f3083b;
    private int c;
    private RectF d;

    public SetupWizardStickyHeaderScrollView(Context context) {
        super(context);
        this.c = 0;
        this.d = new RectF();
    }

    public SetupWizardStickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = new RectF();
    }

    public SetupWizardStickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.d = new RectF();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3082a != null) {
            return;
        }
        this.f3082a = findViewWithTag("sticky");
        this.f3083b = findViewWithTag("stickyContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.d.left, -this.d.top);
        return this.f3083b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        setVerticalScrollBarEnabled(false);
        super.draw(canvas);
        if (this.f3082a != null) {
            int save = canvas.save();
            View view = this.f3083b != null ? this.f3083b : this.f3082a;
            int top = this.f3083b != null ? this.f3082a.getTop() : 0;
            if ((view.getTop() - getScrollY()) + top < this.c || !view.isShown()) {
                this.d.set(0.0f, (-top) + this.c, view.getWidth(), (view.getHeight() - top) + this.c);
                canvas.translate(0.0f, (-r4) + this.d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
        setVerticalScrollBarEnabled(true);
        onDrawScrollBars(canvas);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
        }
        return windowInsets;
    }
}
