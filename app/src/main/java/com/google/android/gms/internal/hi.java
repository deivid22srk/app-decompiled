package com.google.android.gms.internal;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ii f6027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Future f6028b;

    hi(ii iiVar, Future future) {
        this.f6027a = iiVar;
        this.f6028b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6027a.isCancelled()) {
            this.f6028b.cancel(true);
        }
    }
}
