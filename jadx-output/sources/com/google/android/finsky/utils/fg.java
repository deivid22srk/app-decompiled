package com.google.android.finsky.utils;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class fg implements View.OnTouchListener {
    fg() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a.a(view.getContext(), motionEvent);
        return false;
    }
}
