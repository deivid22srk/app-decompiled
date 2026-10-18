package com.google.android.play.headerlist;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
abstract class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final float f6903a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6904b;
    private final float c;

    protected abstract void a(float f);

    protected h(PlayHeaderListLayout playHeaderListLayout, float f, float f2) {
        this.f6904b = playHeaderListLayout;
        this.f6903a = f;
        this.c = f2;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        a(((this.c - this.f6903a) * f) + this.f6903a);
    }
}
