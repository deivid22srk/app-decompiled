package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1795a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f1796b;
    private int c = 0;

    j(d dVar, boolean z) {
        this.f1796b = dVar;
        this.f1795a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 2) {
            this.f1796b.d(this.f1795a);
        }
    }
}
