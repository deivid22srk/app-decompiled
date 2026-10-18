package com.google.android.finsky.receivers;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ac implements aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f4439a;

    ac(u uVar) {
        this.f4439a = uVar;
    }

    @Override // com.google.android.finsky.receivers.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        com.google.android.finsky.download.w wVar;
        com.google.android.finsky.a.n nVar;
        wVar = this.f4439a.t;
        wVar.e(bVar);
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        String p = bVar.p();
        nVar = this.f4439a.k;
        h.a(100, p, (String) null, 0, (String) null, nVar);
        this.f4439a.b(40, (String) null);
    }
}
