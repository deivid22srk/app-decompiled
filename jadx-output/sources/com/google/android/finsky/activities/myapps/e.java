package com.google.android.finsky.activities.myapps;

import android.view.View;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f1821a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f1822b;

    e(c cVar, g gVar) {
        this.f1822b = cVar;
        this.f1821a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1821a.a(this.f1822b.c, this.f1822b);
    }
}
