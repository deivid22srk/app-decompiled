package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class bt implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.utils.gc f1631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f1632b;

    bt(bi biVar, com.google.android.finsky.utils.gc gcVar) {
        this.f1632b = biVar;
        this.f1631a = gcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1632b.r.a(296, (byte[]) null, this.f1632b.s);
        this.f1631a.a(this.f1632b.g, this.f1632b.o, false, (android.support.v4.app.aa) this.f1632b.d.B, this.f1632b.e);
    }
}
