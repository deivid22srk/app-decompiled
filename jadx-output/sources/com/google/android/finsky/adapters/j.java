package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.bx;

/* loaded from: classes.dex */
final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f1924a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cy f1925b;
    final /* synthetic */ Document c;
    final /* synthetic */ View d;
    final /* synthetic */ CardRecyclerViewAdapter e;

    j(CardRecyclerViewAdapter cardRecyclerViewAdapter, bx bxVar, cy cyVar, Document document, View view) {
        this.e = cardRecyclerViewAdapter;
        this.f1924a = bxVar;
        this.f1925b = cyVar;
        this.c = document;
        this.d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.f1924a.f3657a == 1;
        FinskyApp.a().h().a(z ? 1231 : 1232, (byte[]) null, this.f1925b);
        this.e.u.a(this.f1924a, this.e.f, this.e.k, FinskyApp.a().getPackageManager());
        if (z) {
            CardRecyclerViewAdapter.a(this.e, this.c, this.d);
        }
    }
}
