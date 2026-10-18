package com.google.android.wallet.ui.common;

import android.animation.TimeInterpolator;

/* loaded from: classes2.dex */
final class bn implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7516a = 3;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f7517b;

    bn(float f) {
        this.f7517b = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return ((float) Math.sin(f * 2.0d * 3.141592653589793d * this.f7516a)) * (1.0f - f) * this.f7517b;
    }
}
