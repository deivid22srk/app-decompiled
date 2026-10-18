package com.google.android.finsky.autoupdate;

import android.os.PowerManager;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f2038a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PowerManager.WakeLock f2039b;
    private int c;

    i(Runnable runnable, PowerManager.WakeLock wakeLock) {
        this.f2038a = runnable;
        this.f2039b = wakeLock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == 3) {
            this.f2038a.run();
            this.f2039b.release();
        }
    }
}
