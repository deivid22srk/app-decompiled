package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.mv;

/* loaded from: classes.dex */
final class cq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f3201a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mv f3202b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ OrderHistoryRowView e;

    cq(OrderHistoryRowView orderHistoryRowView, cr crVar, mv mvVar, String str, int i) {
        this.e = orderHistoryRowView;
        this.f3201a = crVar;
        this.f3202b = mvVar;
        this.c = str;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.layout.play.cy cyVar;
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        cyVar = this.e.q;
        h.a(cyVar);
        this.f3201a.a(this.f3202b.k, this.c, this.d);
    }
}
