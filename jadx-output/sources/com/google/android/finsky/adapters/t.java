package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.layout.CategoryRowV2;

/* loaded from: classes.dex */
final class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.protos.ax f1937a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CategoryRowV2 f1938b;
    final /* synthetic */ s c;

    t(s sVar, com.google.android.finsky.protos.ax axVar, CategoryRowV2 categoryRowV2) {
        this.c = sVar;
        this.f1937a = axVar;
        this.f1938b = categoryRowV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.c.a(this.f1937a.d, this.f1937a.f3613a, this.c.d, this.c.e, this.f1938b);
    }
}
