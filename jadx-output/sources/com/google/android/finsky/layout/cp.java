package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f3199a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3200b;
    final /* synthetic */ com.google.android.finsky.activities.a c;
    final /* synthetic */ OrderHistoryRowView d;

    cp(OrderHistoryRowView orderHistoryRowView, cr crVar, Document document, com.google.android.finsky.activities.a aVar) {
        this.d = orderHistoryRowView;
        this.f3199a = crVar;
        this.f3200b = document;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.layout.play.cy cyVar;
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        cyVar = this.d.q;
        h.a(cyVar);
        this.f3199a.a(this.f3200b.f1963a.c, this.c.i);
    }
}
