package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class ek implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3268b;
    final /* synthetic */ SubscriptionView c;

    public ek(SubscriptionView subscriptionView, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.c = subscriptionView;
        this.f3267a = bVar;
        this.f3268b = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3267a.n();
        FinskyApp.a().h().a(1840, (byte[]) null, this.f3268b);
    }
}
