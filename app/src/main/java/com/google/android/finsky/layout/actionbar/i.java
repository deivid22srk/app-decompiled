package com.google.android.finsky.layout.actionbar;

import android.support.v7.widget.SearchView;
import android.view.View;

/* loaded from: classes.dex */
public final class i implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f3118a;

    public i(e eVar) {
        this.f3118a = eVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView;
        String str;
        if (!z) {
            this.f3118a.c();
            return;
        }
        searchView = this.f3118a.l;
        str = this.f3118a.v;
        searchView.setQuery(str, false);
    }
}
