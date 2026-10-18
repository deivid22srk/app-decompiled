package com.google.android.finsky.layout.scroll;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GestureScrollView f3522a;

    a(GestureScrollView gestureScrollView) {
        this.f3522a = gestureScrollView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        b bVar;
        if (Math.abs(f) < Math.abs(f2) / 4.0f) {
            int scrollY = this.f3522a.getScrollY();
            if (f2 > 0.0f) {
                if (scrollY <= 0) {
                    bVar = this.f3522a.c;
                    if (bVar != null) {
                    }
                }
            } else {
                this.f3522a.getChildAt(0).getHeight();
                this.f3522a.getHeight();
            }
        }
        return false;
    }
}
