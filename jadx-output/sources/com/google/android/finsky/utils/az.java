package com.google.android.finsky.utils;

import com.google.android.finsky.utils.ExternalReferrer;

/* loaded from: classes.dex */
final class az implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4757b;
    final /* synthetic */ ExternalReferrer.ExternalReferrerService c;
    private int d;

    az(ExternalReferrer.ExternalReferrerService externalReferrerService, String str, boolean z) {
        this.c = externalReferrerService;
        this.f4756a = str;
        this.f4757b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        this.d++;
        if (this.d == 2) {
            ExternalReferrer.ExternalReferrerService.a(this.c);
            ExternalReferrer.a(this.f4756a, this.f4757b);
            i = this.c.f4706b;
            if (i <= 0) {
                ExternalReferrer.ExternalReferrerService externalReferrerService = this.c;
                i2 = this.c.f4705a;
                externalReferrerService.stopSelf(i2);
            }
        }
    }
}
