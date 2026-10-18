package com.google.android.finsky.layout;

import android.view.View;

/* renamed from: com.google.android.finsky.layout.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.adapters.au f3230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewsControlContainer f3231b;

    public Cdo(ReviewsControlContainer reviewsControlContainer, com.google.android.finsky.adapters.au auVar) {
        this.f3231b = reviewsControlContainer;
        this.f3230a = auVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3230a.B_();
    }
}
