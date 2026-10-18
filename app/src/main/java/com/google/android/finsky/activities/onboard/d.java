package com.google.android.finsky.activities.onboard;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
final class d extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1859a;

    d(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage) {
        this.f1859a = animatedEntertainmentOnboardPage;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
    }
}
