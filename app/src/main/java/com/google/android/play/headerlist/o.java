package com.google.android.play.headerlist;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class o extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f6908a;

    o(n nVar) {
        this.f6908a = nVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PlayHeaderListLayout playHeaderListLayout;
        this.f6908a.a(false);
        playHeaderListLayout = this.f6908a.f6907b;
        playHeaderListLayout.k = 2;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
