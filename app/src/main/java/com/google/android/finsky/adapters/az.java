package com.google.android.finsky.adapters;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.fu;

/* loaded from: classes.dex */
final class az implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f1908b;

    az(ax axVar, String str) {
        this.f1908b = axVar;
        this.f1907a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int c = ((com.google.android.finsky.api.model.m) this.f1908b.r.f1988a).c();
        FinskyApp.a().A.saveRecentQuery(this.f1907a, Integer.toString(c));
        com.google.android.finsky.navigationmanager.b bVar = this.f1908b.u;
        String str = this.f1907a;
        if (!bVar.k()) {
            return;
        }
        String a2 = com.google.android.finsky.api.s.a(str, c);
        bVar.a(7, a2, (Fragment) fu.a(str, a2, c), false, new View[0]);
    }
}
