package com.google.android.wallet.ui.common;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
final class x implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float f7531a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7532b;
    private final Interpolator c;

    public x(Interpolator interpolator, float f) {
        this.f7531a = f;
        this.c = interpolator;
        this.f7532b = 1.0f - (0.5f * f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (this.c.getInterpolation(f) * this.f7532b) + (((0.5f * f) + (0.15915494f * ((float) Math.sin(3.141592653589793d * f)))) * this.f7531a);
    }
}
