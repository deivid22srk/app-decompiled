package com.google.android.finsky.utils;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class hv {

    /* renamed from: a, reason: collision with root package name */
    View f4977a;

    /* renamed from: b, reason: collision with root package name */
    int f4978b;
    int c;
    FrameLayout.LayoutParams d;

    hv(Activity activity) {
        this.c = 0;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.c = activity.getResources().getDimensionPixelSize(identifier);
        }
        this.f4977a = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        this.f4977a.getViewTreeObserver().addOnGlobalLayoutListener(new hw(this));
        this.d = (FrameLayout.LayoutParams) this.f4977a.getLayoutParams();
    }
}
