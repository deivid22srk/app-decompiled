package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f2108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2109b;

    d(c cVar, Runnable runnable) {
        this.f2109b = cVar;
        this.f2108a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2108a != null) {
            this.f2109b.c.post(this.f2108a);
        }
    }
}
