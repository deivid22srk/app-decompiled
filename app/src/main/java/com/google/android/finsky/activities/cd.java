package com.google.android.finsky.activities;

import android.view.View;

/* loaded from: classes.dex */
final class cd implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f1648a;

    cd(cc ccVar) {
        this.f1648a = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1648a.g.b(4) != null) {
            this.f1648a.c.a(this.f1648a.g, 0, 4, false);
        } else if (this.f1648a.g.b(0) != null) {
            this.f1648a.c.a(this.f1648a.g, 0, 0, false);
        }
    }
}
