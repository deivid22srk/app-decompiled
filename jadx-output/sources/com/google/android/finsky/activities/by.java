package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class by implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Document f1636a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bw f1637b;

    by(bw bwVar, Document document) {
        this.f1637b = bwVar;
        this.f1636a = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1637b.r.a(2703, (byte[]) null, this.f1637b.s);
        com.google.android.finsky.protos.dp e = com.google.android.finsky.utils.cy.e(this.f1636a, FinskyApp.a().p.a(this.f1637b.f));
        if (e != null) {
            this.f1637b.c.a(com.google.android.finsky.api.s.a(com.google.android.finsky.utils.as.e(e.f3740a)));
        }
    }
}
