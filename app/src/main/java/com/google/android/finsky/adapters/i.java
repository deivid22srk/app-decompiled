package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayBundleBannerView;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.bx;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f1922a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f1923b;
    final /* synthetic */ Document c;
    final /* synthetic */ PlayBundleBannerView d;
    final /* synthetic */ CardRecyclerViewAdapter e;

    i(CardRecyclerViewAdapter cardRecyclerViewAdapter, cy cyVar, bx bxVar, Document document, PlayBundleBannerView playBundleBannerView) {
        this.e = cardRecyclerViewAdapter;
        this.f1922a = cyVar;
        this.f1923b = bxVar;
        this.c = document;
        this.d = playBundleBannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(212, (byte[]) null, this.f1922a);
        this.e.u.a(this.f1923b, this.e.f, this.e.k, FinskyApp.a().getPackageManager());
        CardRecyclerViewAdapter.a(this.e, this.c, this.d);
    }
}
