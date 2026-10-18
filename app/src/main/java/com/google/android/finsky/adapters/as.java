package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
final class as implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f1899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f1900b;

    as(aq aqVar, ny nyVar) {
        this.f1900b = aqVar;
        this.f1899a = nyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1900b.e.a(this.f1899a);
    }
}
