package com.google.android.finsky.activities.bpkg;

import android.view.View;
import com.google.android.finsky.layout.ch;

/* loaded from: classes.dex */
public final class ag implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    int f1572a = -1;

    /* renamed from: b, reason: collision with root package name */
    ch f1573b;
    public final com.google.android.finsky.apkg.i c;

    public ag(com.google.android.finsky.apkg.i iVar) {
        this.c = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ch chVar = (ch) view;
        if (!chVar.d) {
            this.c.a(chVar.getPlayStoreUiElement().f1453a, (byte[]) null, chVar);
            chVar.b();
            if (this.f1573b != null) {
                this.f1573b.b();
            }
            this.f1572a = chVar.getRowPosition();
            this.f1573b = chVar;
        }
    }
}
