package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public class OnboardPager extends com.google.android.play.widget.e {

    /* renamed from: b, reason: collision with root package name */
    protected boolean f7002b;
    protected boolean c;
    protected float d;

    public OnboardPager(Context context) {
        super(context);
        this.f7002b = true;
        this.c = true;
    }

    public OnboardPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7002b = true;
        this.c = true;
    }

    public void setAllowSwipeToNext(boolean z) {
        this.f7002b = z;
    }

    public void setAllowSwipeToPrevious(boolean z) {
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.dq, android.support.v4.view.ViewPager
    public final boolean c() {
        if (a(-1)) {
            return super.c();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.dq, android.support.v4.view.ViewPager
    public final boolean d() {
        if (a(1)) {
            return super.d();
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 || !a(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            motionEvent.setAction(3);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                motionEvent.setAction(3);
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    private boolean a(MotionEvent motionEvent) {
        boolean z = motionEvent.getPointerCount() > 1;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.d = motionEvent.getX(0);
                break;
            case 2:
                if (z) {
                    return false;
                }
                float x = motionEvent.getX(0);
                float f = x - this.d;
                this.d = x;
                if (!a((int) Math.signum(-f))) {
                    return false;
                }
                break;
            case 5:
            case 6:
                return false;
        }
        return true;
    }

    private boolean a(int i) {
        int currentVisualItem = getCurrentVisualItem();
        int a2 = getAdapter() == null ? 0 : getAdapter().a();
        if (i < 0 && currentVisualItem > 0) {
            return f() ? this.f7002b : this.c;
        }
        if (i <= 0 || currentVisualItem >= a2 - 1) {
            return true;
        }
        return f() ? this.c : this.f7002b;
    }
}
