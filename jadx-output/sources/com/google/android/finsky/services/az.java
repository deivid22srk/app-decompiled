package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class az implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VpaService f4603a;

    az(VpaService vpaService) {
        this.f4603a = vpaService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        VpaService.a(this.f4603a);
        d = this.f4603a.d();
        if (!d) {
            VpaService.c(this.f4603a);
        }
    }
}
