package com.google.android.finsky.activities.onboard;

import android.view.View;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1861a;

    f(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage) {
        this.f1861a = animatedEntertainmentOnboardPage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        cy cyVar;
        this.f1861a.a(4);
        iVar = this.f1861a.K;
        cyVar = this.f1861a.J;
        iVar.a(5010, (byte[]) null, cyVar);
    }
}
