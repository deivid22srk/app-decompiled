package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class az implements bg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5107b;

    az(WearSupportService wearSupportService, String str) {
        this.f5107b = wearSupportService;
        this.f5106a = str;
    }

    @Override // com.google.android.finsky.wear.bg
    public final void a(boolean z) {
        FinskyLog.a("Completed daily hygiene for node %s", this.f5106a);
        if (z) {
            this.f5107b.l.b();
        }
        this.f5107b.d(this.f5106a);
    }
}
