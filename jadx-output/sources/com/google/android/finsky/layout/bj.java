package com.google.android.finsky.layout;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class bj extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final View f3160a;

    /* renamed from: b, reason: collision with root package name */
    private int f3161b;
    private int c;
    private boolean d;

    public bj(View view) {
        this.f3160a = view;
    }

    public final void a(int i, int i2) {
        this.f3161b = i;
        this.c = i2 - i;
    }

    public final void a() {
        super.cancel();
        this.d = true;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        if (!this.d) {
            this.f3160a.getLayoutParams().height = this.f3161b + ((int) (this.c * f));
            this.f3160a.requestLayout();
        }
    }
}
