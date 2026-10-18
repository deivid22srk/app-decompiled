package com.google.android.finsky.layout.play;

import android.view.View;

/* loaded from: classes.dex */
final class cd implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3465a;

    cd(PlayCardViewRate playCardViewRate) {
        this.f3465a = playCardViewRate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ch chVar;
        ch chVar2;
        chVar = this.f3465a.I;
        if (chVar != null) {
            chVar2 = this.f3465a.I;
            chVar2.a();
        }
    }
}
