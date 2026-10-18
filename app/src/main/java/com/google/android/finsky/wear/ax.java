package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class ax implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.c f5103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5104b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ WearSupportService e;

    ax(WearSupportService wearSupportService, com.google.android.finsky.bpkg.c cVar, String str, int i, String str2) {
        this.e = wearSupportService;
        this.f5103a = cVar;
        this.f5104b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5103a.a(new ay(this));
    }
}
