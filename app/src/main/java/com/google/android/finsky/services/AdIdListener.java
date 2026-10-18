package com.google.android.finsky.services;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class AdIdListener extends com.google.android.gms.ads.bpkg.e {
    @Override // com.google.android.gms.ads.bpkg.e, android.app.Service
    public void onCreate() {
        super.onCreate();
        FinskyLog.a("AdId refresh", new Object[0]);
        FinskyApp.a().x.a(true);
    }

    @Override // com.google.android.gms.ads.bpkg.e
    public final void a(com.google.android.gms.ads.bpkg.c cVar) {
        FinskyLog.a("AdId change: id (hash)=%d limit=%b", Integer.valueOf(cVar.f5259a.hashCode()), Boolean.valueOf(cVar.f5260b));
    }
}
