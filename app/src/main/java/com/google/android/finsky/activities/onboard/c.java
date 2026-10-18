package com.google.android.finsky.activities.onboard;

import android.view.View;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1858a;

    c(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage) {
        this.f1858a = animatedEntertainmentOnboardPage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        cy cyVar;
        iVar = this.f1858a.K;
        cyVar = this.f1858a.J;
        iVar.a(5005, (byte[]) null, cyVar);
        ((EntertainmentOnboardHostActivity) this.f1858a.getContext()).finish();
    }
}
