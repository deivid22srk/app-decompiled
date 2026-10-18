package com.google.android.finsky.activities.myapps;

import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f1817a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1818b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ MyAppsEmptyView d;

    b(MyAppsEmptyView myAppsEmptyView, com.google.android.finsky.navigationmanager.b bVar, String str, DfeToc dfeToc) {
        this.d = myAppsEmptyView;
        this.f1817a = bVar;
        this.f1818b = str;
        this.c = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1817a.a(this.f1818b, this.d.getResources().getString(R.string.games_corpus_title), 3, this.c);
    }
}
