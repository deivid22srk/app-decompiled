package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
public final class ej implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SubscriptionView f3266a;

    public ej(SubscriptionView subscriptionView) {
        this.f3266a = subscriptionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        i = this.f3266a.n;
        if (i == 2) {
            this.f3266a.b();
            this.f3266a.n = 1;
        } else {
            this.f3266a.a();
            this.f3266a.n = 2;
        }
    }
}
