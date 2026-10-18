package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class dv implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.ad f1697a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ du f1698b;

    dv(du duVar, com.google.android.finsky.layout.play.ad adVar) {
        this.f1698b = duVar;
        this.f1697a = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.navigationmanager.b bVar;
        String str;
        String str2;
        String str3;
        FinskyApp.a().h().a(this.f1697a);
        bVar = this.f1698b.as;
        str = this.f1698b.h;
        str2 = this.f1698b.i;
        str3 = this.f1698b.aw;
        bVar.a(str, str2, str3, (String) null);
    }
}
