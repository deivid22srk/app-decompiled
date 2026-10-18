package com.google.android.finsky.receivers;

import java.util.List;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f4483a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f4484b;

    k(j jVar, List list) {
        this.f4484b = jVar;
        this.f4483a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.b(this.f4484b.f4482b, this.f4483a);
        h.e(this.f4484b.f4482b);
        h.f(this.f4484b.f4482b);
        this.f4484b.f4482b.a(true);
        this.f4484b.f4481a.run();
    }
}
