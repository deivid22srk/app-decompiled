package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f6855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6856b;

    d(a aVar, x xVar) {
        this.f6856b = aVar;
        this.f6855a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        r rVar;
        uVar = this.f6856b.m;
        uVar.a(this.f6855a);
        rVar = this.f6856b.n;
        rVar.h();
    }
}
