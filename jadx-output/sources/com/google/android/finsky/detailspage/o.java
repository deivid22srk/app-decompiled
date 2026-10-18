package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f2664a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f2665b;
    final /* synthetic */ BylinesModuleLayout c;

    o(BylinesModuleLayout bylinesModuleLayout, q qVar, p pVar) {
        this.c = bylinesModuleLayout;
        this.f2664a = qVar;
        this.f2665b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f2664a.a(this.f2665b);
    }
}
