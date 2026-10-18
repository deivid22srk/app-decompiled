package com.google.android.gms.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mw implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f6174a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6175b;
    private final AtomicInteger c;
    private final ThreadFactory d;

    public mw(String str) {
        this(str, (byte) 0);
    }

    private mw(String str, byte b2) {
        this.c = new AtomicInteger();
        this.d = Executors.defaultThreadFactory();
        this.f6174a = (String) com.google.android.gms.common.internal.av.a(str, (Object) "Name must not be null");
        this.f6175b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new mx(runnable, this.f6175b));
        newThread.setName(this.f6174a + "[" + this.c.getAndIncrement() + "]");
        return newThread;
    }
}
