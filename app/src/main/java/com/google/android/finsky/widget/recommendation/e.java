package com.google.android.finsky.widget.recommendation;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5234a;

    e(d dVar) {
        this.f5234a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5234a.f5232a.a(this.f5234a.c);
        h.a(this.f5234a.c, this.f5234a.d);
    }
}
