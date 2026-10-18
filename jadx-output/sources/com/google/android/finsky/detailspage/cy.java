package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class cy implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ da f2599a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewSnippetsModuleLayout f2600b;

    cy(ReviewSnippetsModuleLayout reviewSnippetsModuleLayout, da daVar) {
        this.f2600b = reviewSnippetsModuleLayout;
        this.f2599a = daVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cz czVar;
        cz czVar2;
        czVar = this.f2600b.k;
        if (czVar != null) {
            czVar2 = this.f2600b.k;
            czVar2.a(this.f2599a);
        }
    }
}
