package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class cf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f3184a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f3185b;
    final /* synthetic */ MyAccountLandingPageRowView c;

    cf(MyAccountLandingPageRowView myAccountLandingPageRowView, cg cgVar, com.google.android.finsky.a.i iVar) {
        this.c = myAccountLandingPageRowView;
        this.f3184a = cgVar;
        this.f3185b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3184a.f) {
            this.f3185b.a(299, (byte[]) null, this.c);
        } else {
            this.f3185b.a((com.google.android.finsky.layout.play.cy) this.c);
        }
        this.f3184a.h.onClick(view);
    }
}
