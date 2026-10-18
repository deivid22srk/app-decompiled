package com.google.android.gms.ads.b;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    CountDownLatch f5261a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    boolean f5262b = false;
    private WeakReference<b> c;
    private long d;

    public d(b bVar, long j) {
        this.c = new WeakReference<>(bVar);
        this.d = j;
        start();
    }

    private void a() {
        b bVar = this.c.get();
        if (bVar != null) {
            bVar.b();
            this.f5262b = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f5261a.await(this.d, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException e) {
            a();
        }
    }
}
