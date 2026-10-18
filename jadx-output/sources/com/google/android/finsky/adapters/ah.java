package com.google.android.finsky.adapters;

import android.view.View;

/* loaded from: classes.dex */
public final class ah implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1891a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f1892b;

    public ah(ag agVar, int i) {
        this.f1892b = agVar;
        this.f1891a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1892b.e.a(this.f1891a);
    }
}
