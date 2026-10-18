package com.google.android.finsky.layout.play;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes.dex */
final class bu extends TranslateAnimation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3454a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3455b;
    final /* synthetic */ int c;
    final /* synthetic */ int[] d;
    final /* synthetic */ PlayCardRateClusterView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bu(PlayCardRateClusterView playCardRateClusterView, float f, int i, int i2, int i3, int[] iArr) {
        super(0.0f, 0.0f, f, 0.0f);
        this.e = playCardRateClusterView;
        this.f3454a = i;
        this.f3455b = i2;
        this.c = i3;
        this.d = iArr;
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i = (int) (this.f3454a * f);
        int i2 = this.f3455b;
        while (true) {
            i2++;
            if (i2 < this.c) {
                com.google.android.play.layout.a a2 = this.e.a(i2);
                a2.offsetLeftAndRight((this.d[i2] - i) - a2.getLeft());
            } else {
                return;
            }
        }
    }
}
