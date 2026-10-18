package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.bx;

/* loaded from: classes.dex */
final class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f1928a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f1929b;
    final /* synthetic */ CardRecyclerViewAdapter c;

    l(CardRecyclerViewAdapter cardRecyclerViewAdapter, cy cyVar, bx bxVar) {
        this.c = cardRecyclerViewAdapter;
        this.f1928a = cyVar;
        this.f1929b = bxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(1237, (byte[]) null, this.f1928a);
        this.c.u.a(this.f1929b, this.c.f, this.c.k, FinskyApp.a().getPackageManager());
    }
}
