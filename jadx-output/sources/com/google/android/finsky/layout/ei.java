package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class ei implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f3264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3265b;
    final /* synthetic */ com.google.android.finsky.g.aq c;
    final /* synthetic */ SubscriptionView d;

    public ei(SubscriptionView subscriptionView, Document document, com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.g.aq aqVar) {
        this.d = subscriptionView;
        this.f3264a = document;
        this.f3265b = cyVar;
        this.c = aqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        el elVar;
        FinskyApp.a().h().a(227, (byte[]) null, new com.google.android.finsky.layout.play.ad(242, this.f3264a.f1963a.R, this.f3265b));
        elVar = this.d.f3094b;
        elVar.a(this.f3264a, this.c);
    }
}
