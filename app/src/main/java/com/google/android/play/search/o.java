package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchNavigationButton f7050a;

    o(PlaySearchNavigationButton playSearchNavigationButton) {
        this.f7050a = playSearchNavigationButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar;
        l lVar2;
        int i;
        l lVar3;
        lVar = this.f7050a.f7012b;
        if (lVar != null) {
            lVar2 = this.f7050a.f7012b;
            if (lVar2.e != null) {
                lVar2.e.onClick(view);
            }
            i = this.f7050a.f7011a;
            if (i == 1) {
                lVar3 = this.f7050a.f7012b;
                lVar3.b();
            }
        }
    }
}
