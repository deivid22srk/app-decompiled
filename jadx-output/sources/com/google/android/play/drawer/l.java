package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6866a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6867b;

    l(a aVar, String str) {
        this.f6867b = aVar;
        this.f6866a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        r rVar;
        uVar = this.f6867b.m;
        uVar.a(this.f6866a);
        rVar = this.f6867b.n;
        rVar.h();
    }
}
