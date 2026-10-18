package com.google.android.finsky.billing.lightpurchase.bpkg;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
public final class d extends eu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2319a;

    d(a aVar) {
        this.f2319a = aVar;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        view = this.f2319a.f;
        view.setVisibility(4);
    }
}
