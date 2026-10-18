package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
public final class dn implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.adapters.au f3228a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewsControlContainer f3229b;

    public dn(ReviewsControlContainer reviewsControlContainer, com.google.android.finsky.adapters.au auVar) {
        this.f3229b = reviewsControlContainer;
        this.f3228a = auVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3228a.C_();
    }
}
