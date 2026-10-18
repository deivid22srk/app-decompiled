package com.google.android.finsky.detailspage;

/* loaded from: classes.dex */
final class ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f2556a;

    ba(az azVar) {
        this.f2556a = azVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f2556a.u;
        if (!z) {
            this.f2556a.a(((bb) this.f2556a.f2559b).f2557a);
            this.f2556a.a();
        }
    }
}
