package com.google.android.finsky.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class hw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hv f4979a;

    hw(hv hvVar) {
        this.f4979a = hvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        hv hvVar = this.f4979a;
        Rect rect = new Rect();
        hvVar.f4977a.getWindowVisibleDisplayFrame(rect);
        int i = (rect.bottom - rect.top) + hvVar.c;
        if (i == hvVar.f4978b) {
            return;
        }
        int height = hvVar.f4977a.getRootView().getHeight();
        int i2 = height - i;
        if (i2 > height / 4) {
            hvVar.d.height = height - i2;
        } else {
            hvVar.d.height = height;
        }
        hvVar.f4977a.requestLayout();
        hvVar.f4978b = i;
    }
}
