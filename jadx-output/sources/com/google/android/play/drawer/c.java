package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f6853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6854b;

    c(a aVar, w wVar) {
        this.f6854b = aVar;
        this.f6853a = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        r rVar;
        uVar = this.f6854b.m;
        uVar.a(this.f6853a);
        rVar = this.f6854b.n;
        rVar.h();
    }
}
