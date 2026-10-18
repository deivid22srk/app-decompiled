package com.google.android.finsky.layout;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class cj extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f3191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MyAccountPaymentMethodsCard f3192b;

    cj(MyAccountPaymentMethodsCard myAccountPaymentMethodsCard, View view) {
        this.f3192b = myAccountPaymentMethodsCard;
        this.f3191a = view;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3191a.setVisibility(8);
    }
}
