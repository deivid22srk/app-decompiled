package com.google.android.finsky.layout.play;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
final class ae implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HighlightsClusterViewContent f3393a;

    /* renamed from: b, reason: collision with root package name */
    private Interpolator f3394b = new android.support.v4.view.b.b();

    ae(HighlightsClusterViewContent highlightsClusterViewContent) {
        this.f3393a = highlightsClusterViewContent;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.f3394b.getInterpolation(1.0f - f);
    }
}
