package com.google.android.finsky.utils;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class io extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ in f5000a;

    io(in inVar) {
        this.f5000a = inVar;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f5000a.f4999b != null) {
            this.f5000a.f4999b.a();
        }
    }
}
