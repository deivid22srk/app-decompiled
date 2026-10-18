package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class hh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ii f6025a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f6026b;

    hh(ii iiVar, Callable callable) {
        this.f6025a = iiVar;
        this.f6026b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.f6025a.b(this.f6026b.call());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.d.f().a((Throwable) e, true);
            this.f6025a.cancel(true);
        }
    }
}
