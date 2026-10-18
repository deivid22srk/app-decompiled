package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.mv;

/* loaded from: classes.dex */
final class ct implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f3205a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mv f3206b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ OrderHistoryRowView2 e;

    ct(OrderHistoryRowView2 orderHistoryRowView2, cr crVar, mv mvVar, String str, int i) {
        this.e = orderHistoryRowView2;
        this.f3205a = crVar;
        this.f3206b = mvVar;
        this.c = str;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.layout.play.cy cyVar;
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        cyVar = this.e.m;
        h.a(cyVar);
        this.f3205a.a(this.f3206b.k, this.c, this.d);
    }
}
