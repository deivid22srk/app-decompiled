package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class eg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f3260a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3261b;
    final /* synthetic */ com.google.android.finsky.g.aq c;
    final /* synthetic */ SubscriptionRowView2 d;

    eg(SubscriptionRowView2 subscriptionRowView2, el elVar, Document document, com.google.android.finsky.g.aq aqVar) {
        this.d = subscriptionRowView2;
        this.f3260a = elVar;
        this.f3261b = document;
        this.c = aqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2643, (byte[]) null, this.d);
        this.f3260a.a(this.f3261b, this.c);
    }
}
