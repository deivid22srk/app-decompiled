package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5086b;
    final /* synthetic */ boolean c;
    final /* synthetic */ WearSupportService d;

    al(WearSupportService wearSupportService, String str, String str2, boolean z) {
        this.d = wearSupportService;
        this.f5085a = str;
        this.f5086b = str2;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearSupportService.a(this.d, new am(this));
    }
}
