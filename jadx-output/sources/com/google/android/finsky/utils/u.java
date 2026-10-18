package com.google.android.finsky.utils;

import android.os.Process;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f5057a;

    u(Runnable runnable) {
        this.f5057a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f5057a.run();
    }
}
