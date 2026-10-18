package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.kc;

/* loaded from: classes.dex */
final class eh implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3262a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kc f3263b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ SubscriptionRowView2 d;

    eh(SubscriptionRowView2 subscriptionRowView2, com.google.android.finsky.navigationmanager.b bVar, kc kcVar, DfeToc dfeToc) {
        this.d = subscriptionRowView2;
        this.f3262a = bVar;
        this.f3263b = kcVar;
        this.c = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2645, (byte[]) null, this.d);
        this.f3262a.a(this.f3263b.n, this.c, view.getContext().getPackageManager());
    }
}
