package com.android.ex.photo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bc;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public class PhotoViewPager extends ViewPager {

    /* renamed from: b, reason: collision with root package name */
    private float f1137b;
    private int c;
    private float d;
    private float e;
    private x f;

    public PhotoViewPager(Context context) {
        super(context);
        f();
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    private void f() {
        setPageTransformer$382b7817(new v(this));
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        w g = this.f != null ? this.f.g() : w.NONE;
        boolean z = g == w.BOTH || g == w.LEFT;
        boolean z2 = g == w.BOTH || g == w.RIGHT;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.c = -1;
        }
        switch (action) {
            case 0:
                this.f1137b = motionEvent.getX();
                this.d = motionEvent.getRawX();
                this.e = motionEvent.getRawY();
                this.c = bc.b(motionEvent, 0);
                break;
            case 2:
                if ((z || z2) && (i = this.c) != -1) {
                    float c = bc.c(motionEvent, bc.a(motionEvent, i));
                    if (z && z2) {
                        this.f1137b = c;
                        return false;
                    }
                    if (z && c > this.f1137b) {
                        this.f1137b = c;
                        return false;
                    }
                    if (z2 && c < this.f1137b) {
                        this.f1137b = c;
                        return false;
                    }
                }
                break;
            case 6:
                int b2 = bc.b(motionEvent);
                if (bc.b(motionEvent, b2) == this.c) {
                    int i2 = b2 != 0 ? 0 : 1;
                    this.f1137b = bc.c(motionEvent, i2);
                    this.c = bc.b(motionEvent, i2);
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnInterceptTouchListener(x xVar) {
        this.f = xVar;
    }
}
