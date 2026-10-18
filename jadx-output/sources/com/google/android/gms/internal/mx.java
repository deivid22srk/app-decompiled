package com.google.android.gms.internal;

import android.os.Process;

/* loaded from: classes.dex */
final class mx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f6176a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6177b;

    public mx(Runnable runnable, int i) {
        this.f6176a = runnable;
        this.f6177b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f6177b);
        this.f6176a.run();
    }
}
