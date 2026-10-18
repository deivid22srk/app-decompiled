package com.google.android.wallet.ui.common;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes.dex */
public final class bc extends TouchDelegate {
    private static final Rect c = new Rect();

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.h.r<View, TouchDelegate> f7504a;

    /* renamed from: b, reason: collision with root package name */
    public TouchDelegate f7505b;

    public bc(View view) {
        super(c, view);
        this.f7504a = new android.support.v4.h.r<>();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (motionEvent.getPointerCount() > 1) {
                return false;
            }
            int size = this.f7504a.size();
            for (int i = 0; i < size; i++) {
                TouchDelegate c2 = this.f7504a.c(i);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                boolean onTouchEvent = c2.onTouchEvent(motionEvent);
                motionEvent.setLocation(x, y);
                if (onTouchEvent) {
                    this.f7505b = c2;
                    return true;
                }
            }
            return false;
        }
        boolean z = this.f7505b != null && this.f7505b.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 32) {
            this.f7505b = null;
            return z;
        }
        return z;
    }
}
