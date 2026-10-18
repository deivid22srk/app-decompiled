package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.kc;

/* loaded from: classes.dex */
final class ef implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kc f3259b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ SubscriptionRowView d;

    ef(SubscriptionRowView subscriptionRowView, com.google.android.finsky.navigationmanager.b bVar, kc kcVar, DfeToc dfeToc) {
        this.d = subscriptionRowView;
        this.f3258a = bVar;
        this.f3259b = kcVar;
        this.c = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2645, (byte[]) null, this.d);
        this.f3258a.a(this.f3259b.n, this.c, view.getContext().getPackageManager());
    }
}
