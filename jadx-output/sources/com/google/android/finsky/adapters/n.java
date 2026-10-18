package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ix;

/* loaded from: classes.dex */
final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f1932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1933b;
    final /* synthetic */ int c;
    final /* synthetic */ CardRecyclerViewAdapter d;

    n(CardRecyclerViewAdapter cardRecyclerViewAdapter, cy cyVar, int i, int i2) {
        this.d = cardRecyclerViewAdapter;
        this.f1932a = cyVar;
        this.f1933b = i;
        this.c = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2902, (byte[]) null, this.f1932a);
        ix.a(FinskyApp.a().j(), this.f1933b, 1, null);
        CardRecyclerViewAdapter cardRecyclerViewAdapter = this.d;
        CardRecyclerViewAdapter cardRecyclerViewAdapter2 = this.d;
        cardRecyclerViewAdapter.c(cardRecyclerViewAdapter2.q() + this.c);
    }
}
