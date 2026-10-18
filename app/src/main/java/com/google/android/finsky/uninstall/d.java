package com.google.android.finsky.uninstall;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4690a;

    d(c cVar) {
        this.f4690a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4690a.d = true;
        this.f4690a.b();
    }
}
