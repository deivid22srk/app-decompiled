package com.google.android.finsky.layout.play;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
final class cp extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayListView f3475a;

    cp(PlayListView playListView) {
        this.f3475a = playListView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PlayListView.a(this.f3475a);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        PlayListView.a(this.f3475a);
    }
}
