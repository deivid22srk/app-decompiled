package com.google.android.finsky.layout.play;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ef;

/* loaded from: classes.dex */
final class dc extends ef {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ db f3489a;

    dc(db dbVar) {
        this.f3489a = dbVar;
    }

    @Override // android.support.v7.widget.ef
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 2) {
            recyclerView.b(this);
            this.f3489a.l = false;
            if (!this.f3489a.k) {
                this.f3489a.f3487a.h();
            }
        }
    }
}
