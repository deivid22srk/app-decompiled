package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6868a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6869b;

    m(a aVar, String str) {
        this.f6869b = aVar;
        this.f6868a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        r rVar;
        uVar = this.f6869b.m;
        uVar.a(this.f6868a);
        rVar = this.f6869b.n;
        rVar.h();
    }
}
