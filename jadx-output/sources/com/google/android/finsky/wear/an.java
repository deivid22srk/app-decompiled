package com.google.android.finsky.wear;

import android.net.Uri;

/* loaded from: classes.dex */
final class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f5088a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5089b;
    final /* synthetic */ String c;
    final /* synthetic */ WearSupportService d;

    an(WearSupportService wearSupportService, Uri uri, String str, String str2) {
        this.d = wearSupportService;
        this.f5088a = uri;
        this.f5089b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.m mVar;
        WearSupportService.a(this.d);
        WearSupportService.m(this.d);
        com.google.android.gms.wearable.f fVar = com.google.android.gms.wearable.aa.f6462a;
        mVar = this.d.f;
        fVar.a(mVar, this.f5088a).a(new ao(this));
    }
}
