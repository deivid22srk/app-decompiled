package com.google.android.finsky.adapters;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.fu;

/* loaded from: classes.dex */
final class ba implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1911a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f1912b;

    ba(ax axVar, String str) {
        this.f1912b = axVar;
        this.f1911a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int c = ((com.google.android.finsky.api.model.m) this.f1912b.r.f1988a).c();
        FinskyApp.a().A.saveRecentQuery(this.f1911a, Integer.toString(c));
        com.google.android.finsky.navigationmanager.b bVar = this.f1912b.u;
        String str = this.f1911a;
        if (!bVar.k()) {
            return;
        }
        String b2 = com.google.android.finsky.api.s.b(str, c);
        bVar.a(7, b2, (Fragment) fu.a(str, b2, c), false, new View[0]);
    }
}
