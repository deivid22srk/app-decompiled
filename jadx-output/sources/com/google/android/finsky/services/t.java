package com.google.android.finsky.services;

import android.os.IBinder;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f4635a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f4636b;

    t(s sVar, IBinder iBinder) {
        this.f4636b = sVar;
        this.f4635a = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        this.f4636b.f4634b = com.google.android.play.b.a(this.f4635a);
        s.a(this.f4636b);
        semaphore = this.f4636b.d;
        semaphore.release();
    }
}
