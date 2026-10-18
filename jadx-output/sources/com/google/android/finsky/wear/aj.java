package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5082a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5083b;

    aj(WearSupportService wearSupportService, String str) {
        this.f5083b = wearSupportService;
        this.f5082a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearSupportService.a(this.f5083b);
        WearSupportService.b(this.f5082a);
        this.f5083b.b();
    }
}
