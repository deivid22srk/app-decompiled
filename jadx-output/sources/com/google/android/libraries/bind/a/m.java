package com.google.android.libraries.bind.a;

import android.os.Process;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f6654a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f6655b;

    m(l lVar, Runnable runnable) {
        this.f6655b = lVar;
        this.f6654a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f6654a.run();
    }
}
