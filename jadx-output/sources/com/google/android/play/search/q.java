package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchPlateTextContainer f7053a;

    q(PlaySearchPlateTextContainer playSearchPlateTextContainer) {
        this.f7053a = playSearchPlateTextContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar;
        l lVar2;
        lVar = this.f7053a.c;
        if (lVar != null) {
            lVar2 = this.f7053a.c;
            lVar2.a(3);
        }
    }
}
