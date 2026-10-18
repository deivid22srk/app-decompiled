package com.google.android.finsky.activities.myapps;

import android.view.View;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;

/* loaded from: classes.dex */
final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f1802a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pt f1803b;
    final /* synthetic */ DfeToc c;
    final /* synthetic */ MyAppsEmptyView d;

    a(MyAppsEmptyView myAppsEmptyView, com.google.android.finsky.navigationmanager.b bVar, pt ptVar, DfeToc dfeToc) {
        this.d = myAppsEmptyView;
        this.f1802a = bVar;
        this.f1803b = ptVar;
        this.c = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1802a.b(this.f1803b.e, this.f1803b.c, 3, this.c);
    }
}
