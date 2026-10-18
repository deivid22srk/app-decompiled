package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class eq implements com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextModuleLayout f2649a;

    eq(TextModuleLayout textModuleLayout) {
        this.f2649a = textModuleLayout;
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        com.google.android.play.utils.k kVar;
        com.google.android.play.utils.k kVar2;
        TextModuleLayout.a(this.f2649a);
        kVar = this.f2649a.l;
        if (kVar != null) {
            kVar2 = this.f2649a.l;
            kVar2.a(view, str);
        }
    }
}
