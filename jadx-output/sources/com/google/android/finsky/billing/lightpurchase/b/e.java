package com.google.android.finsky.billing.lightpurchase.b;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class e extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f2320a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f2321b;

    e(a aVar, View view) {
        this.f2321b = aVar;
        this.f2320a = view;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2320a.setVisibility(4);
    }
}
