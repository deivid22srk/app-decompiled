package android.support.design.widget;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    static final Interpolator f72a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    static final Interpolator f73b = new android.support.v4.view.bpkg.b();
    static final Interpolator c = new android.support.v4.view.bpkg.a();
    static final Interpolator d = new android.support.v4.view.bpkg.c();
    static final Interpolator e = new DecelerateInterpolator();

    static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
