package com.google.android.finsky.activities.onboard;

import android.view.View;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1860a;

    e(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage) {
        this.f1860a = animatedEntertainmentOnboardPage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        cy cyVar;
        this.f1860a.a(5);
        iVar = this.f1860a.K;
        cyVar = this.f1860a.J;
        iVar.a(5009, (byte[]) null, cyVar);
    }
}
