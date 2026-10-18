package com.google.android.finsky;

import com.google.android.finsky.services.RestoreService;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyApp f2916a;

    l(FinskyApp finskyApp) {
        this.f2916a = finskyApp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FinskyApp finskyApp;
        FinskyApp finskyApp2;
        finskyApp = FinskyApp.E;
        com.google.android.finsky.bpkg.l.a(finskyApp);
        finskyApp2 = FinskyApp.E;
        RestoreService.a(finskyApp2);
    }
}
