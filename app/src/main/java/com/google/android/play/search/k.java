package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchActionButton f7046a;

    k(PlaySearchActionButton playSearchActionButton) {
        this.f7046a = playSearchActionButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar;
        int i;
        int i2;
        l lVar2;
        l lVar3;
        lVar = this.f7046a.f7009a;
        if (lVar != null) {
            i = this.f7046a.e;
            if (i == 1) {
                lVar3 = this.f7046a.f7009a;
                lVar3.a("", true);
                return;
            }
            i2 = this.f7046a.e;
            if (i2 == 2) {
                lVar2 = this.f7046a.f7009a;
                lVar2.a(4);
            }
        }
    }
}
