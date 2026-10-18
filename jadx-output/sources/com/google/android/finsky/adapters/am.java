package com.google.android.finsky.adapters;

import android.view.View;

/* loaded from: classes.dex */
final class am implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f1894a;

    am(al alVar) {
        this.f1894a = alVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1894a.v == 2) {
            this.f1894a.d();
        }
        this.f1894a.h(1);
    }
}
