package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ix;

/* loaded from: classes.dex */
final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f1930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1931b;
    final /* synthetic */ CardRecyclerViewAdapter c;

    m(CardRecyclerViewAdapter cardRecyclerViewAdapter, cy cyVar, int i) {
        this.c = cardRecyclerViewAdapter;
        this.f1930a = cyVar;
        this.f1931b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(2901, (byte[]) null, this.f1930a);
        com.google.android.finsky.navigationmanager.b bVar = this.c.u;
        bVar.f3538a.c(ix.b(this.f1931b));
    }
}
