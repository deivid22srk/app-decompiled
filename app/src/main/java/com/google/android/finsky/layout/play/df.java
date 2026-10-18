package com.google.android.finsky.layout.play;

import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.px;

/* loaded from: classes.dex */
final class df implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f3491a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3492b;
    final /* synthetic */ px c;
    final /* synthetic */ com.google.android.finsky.api.b d;
    final /* synthetic */ DfeToc e;
    final /* synthetic */ TopChartsClusterContentView f;

    df(TopChartsClusterContentView topChartsClusterContentView, cy cyVar, com.google.android.finsky.navigationmanager.b bVar, px pxVar, com.google.android.finsky.api.b bVar2, DfeToc dfeToc) {
        this.f = topChartsClusterContentView;
        this.f3491a = cyVar;
        this.f3492b = bVar;
        this.c = pxVar;
        this.d = bVar2;
        this.e = dfeToc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FinskyApp.a().h().a(1238, (byte[]) null, this.f3491a);
        this.f3492b.a(this.c.c, this.d, this.e, FinskyApp.a().getPackageManager());
    }
}
