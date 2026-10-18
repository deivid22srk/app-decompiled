package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VpaService f4615a;

    bf(VpaService vpaService) {
        this.f4615a = vpaService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f4615a.e;
        if (z) {
            this.f4615a.a(2);
        } else {
            this.f4615a.a(1);
        }
    }
}
