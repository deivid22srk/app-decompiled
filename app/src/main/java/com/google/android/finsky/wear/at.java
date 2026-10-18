package com.google.android.finsky.wear;

import com.google.android.finsky.utils.cb;

/* loaded from: classes.dex */
final class at implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5096a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5097b;

    at(WearSupportService wearSupportService, String str) {
        this.f5097b = wearSupportService;
        this.f5096a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d c = d.c(this.f5096a);
        com.google.android.finsky.api.b a2 = ad.a(this.f5096a);
        cb.a(a2, c, new au(this, c, a2));
    }
}
