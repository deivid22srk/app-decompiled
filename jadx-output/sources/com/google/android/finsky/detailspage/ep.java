package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class ep implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextModuleLayout f2648a;

    ep(TextModuleLayout textModuleLayout) {
        this.f2648a = textModuleLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextModuleLayout.a(this.f2648a, view);
    }
}
