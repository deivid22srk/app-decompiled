package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class ae implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f7028a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearchToolbar f7029b;

    ae(PlaySearchToolbar playSearchToolbar, View.OnClickListener onClickListener) {
        this.f7029b = playSearchToolbar;
        this.f7028a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaySearch playSearch;
        playSearch = this.f7029b.p;
        if (playSearch.c.a() && this.f7028a != null) {
            this.f7028a.onClick(view);
        }
    }
}
