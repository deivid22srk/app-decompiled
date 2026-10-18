package com.google.android.finsky;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f2882a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyApp f2883b;
    private int c = 0;

    j(FinskyApp finskyApp, Runnable runnable) {
        this.f2883b = finskyApp;
        this.f2882a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 2 && this.f2882a != null) {
            this.f2882a.run();
        }
    }
}
