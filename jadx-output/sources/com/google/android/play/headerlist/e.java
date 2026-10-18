package com.google.android.play.headerlist;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class e implements View.OnHoverListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6901a;

    e(PlayHeaderListLayout playHeaderListLayout) {
        this.f6901a = playHeaderListLayout;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return this.f6901a.c();
    }
}
