package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f5108a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5109b;
    private int c;

    b(a aVar, Runnable runnable) {
        this.f5109b = aVar;
        this.f5108a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 2) {
            this.f5108a.run();
        }
    }
}
