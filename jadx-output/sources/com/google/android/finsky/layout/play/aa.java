package com.google.android.finsky.layout.play;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
public final class aa extends Scroller {

    /* renamed from: a, reason: collision with root package name */
    private final int f3388a;

    public aa(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f3388a = 400;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f3388a);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f3388a);
    }
}
