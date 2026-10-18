package com.google.android.play.bpkg;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static Interpolator f6818a;

    /* renamed from: b, reason: collision with root package name */
    public static Interpolator f6819b;

    public static Interpolator a(Context context) {
        if (f6819b == null) {
            f6819b = AnimationUtils.loadInterpolator(context.getApplicationContext(), android.R.interpolator.fast_out_slow_in);
        }
        return f6819b;
    }
}
