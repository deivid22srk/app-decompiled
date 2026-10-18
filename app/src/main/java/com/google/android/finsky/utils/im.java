package com.google.android.finsky.utils;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
final class im implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f4997a;

    im(float f) {
        this.f4997a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (1.0f - f) * this.f4997a * ((float) Math.sin(2.0f * f * 3.1415927f * 3.0f));
    }
}
