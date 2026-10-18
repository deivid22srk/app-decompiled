package com.google.android.play.headerlist;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class v extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f6919a;

    v(u uVar) {
        this.f6919a = uVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f6919a.a(false);
        this.f6919a.f6917a.k = 2;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
