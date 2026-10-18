package com.google.android.play.b;

import android.content.Context;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6820a;

    /* renamed from: b, reason: collision with root package name */
    private Interpolator f6821b;

    public e(Context context) {
        this.f6820a = context;
        this.f6821b = d.a(this.f6820a);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.f6821b.getInterpolation(1.0f - f);
    }
}
