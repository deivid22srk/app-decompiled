package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
final class an implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f6311a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6312b;

    public an(al alVar, String str) {
        this.f6311a = alVar;
        com.google.android.gms.common.internal.av.a(str);
        this.f6312b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6311a.l().f6388a.a(this.f6312b, th);
    }
}
