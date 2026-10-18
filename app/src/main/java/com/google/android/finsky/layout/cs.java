package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cs implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f3203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f3204b;
    final /* synthetic */ com.google.android.finsky.activities.a c;
    final /* synthetic */ OrderHistoryRowView2 d;

    cs(OrderHistoryRowView2 orderHistoryRowView2, cr crVar, Document document, com.google.android.finsky.activities.a aVar) {
        this.d = orderHistoryRowView2;
        this.f3203a = crVar;
        this.f3204b = document;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.layout.play.cy cyVar;
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        cyVar = this.d.m;
        h.a(cyVar);
        this.f3203a.a(this.f3204b.f1963a.c, this.c.i);
    }
}
