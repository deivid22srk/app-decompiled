package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class as implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f5095a;

    as(ar arVar) {
        this.f5095a = arVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearSupportService.a(this.f5095a.f5094b.f5092a);
        WearSupportService.a(this.f5095a.f5094b.f5092a, this.f5095a.f5093a);
        WearSupportService.b(this.f5095a.f5094b.f5092a);
    }
}
