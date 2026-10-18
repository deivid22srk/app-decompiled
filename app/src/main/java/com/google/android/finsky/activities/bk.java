package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class bk implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.utils.gc f1617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f1618b;

    bk(bi biVar, com.google.android.finsky.utils.gc gcVar) {
        this.f1618b = biVar;
        this.f1617a = gcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1618b.r.a(295, (byte[]) null, this.f1618b.s);
        this.f1617a.a(this.f1618b.g, this.f1618b.o, true, (android.support.v4.app.aa) this.f1618b.d.B, this.f1618b.e);
    }
}
