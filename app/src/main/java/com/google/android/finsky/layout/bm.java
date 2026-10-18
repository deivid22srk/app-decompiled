package com.google.android.finsky.layout;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class bm extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HorizontalStrip f3165a;

    bm(HorizontalStrip horizontalStrip) {
        this.f3165a = horizontalStrip;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f3165a.b();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3165a.a();
    }
}
