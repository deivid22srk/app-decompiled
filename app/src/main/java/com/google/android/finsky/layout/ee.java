package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ee implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f3256a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3257b;
    final /* synthetic */ com.google.android.finsky.gpkg.aq c;
    final /* synthetic */ SubscriptionRowView d;

    ee(SubscriptionRowView subscriptionRowView, el elVar, Document document, com.google.android.finsky.gpkg.aq aqVar) {
        this.d = subscriptionRowView;
        this.f3256a = elVar;
        this.f3257b = document;
        this.c = aqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2643, (byte[]) null, this.d);
        this.f3256a.a(this.f3257b, this.c);
    }
}
