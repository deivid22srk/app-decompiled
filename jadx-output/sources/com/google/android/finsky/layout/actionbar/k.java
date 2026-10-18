package com.google.android.finsky.layout.actionbar;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f3121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskySearchToolbar f3122b;

    k(FinskySearchToolbar finskySearchToolbar, View.OnClickListener onClickListener) {
        this.f3122b = finskySearchToolbar;
        this.f3121a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cy burgerMenuPlayStoreUiElementNode;
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        burgerMenuPlayStoreUiElementNode = this.f3122b.getBurgerMenuPlayStoreUiElementNode();
        h.a(burgerMenuPlayStoreUiElementNode);
        if (this.f3121a != null) {
            this.f3121a.onClick(view);
        }
    }
}
