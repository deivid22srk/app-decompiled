package com.a.a.a;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1003b = true;

    m(String str) {
        this.f1002a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1002a);
        thread.setDaemon(this.f1003b);
        return thread;
    }
}
