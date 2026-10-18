package com.google.android.gms.measurement.internal;

import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class am<V> extends FutureTask<V> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f6309a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(al alVar, Runnable runnable, String str) {
        super(runnable, null);
        this.f6309a = alVar;
        com.google.android.gms.common.internal.av.a(str);
        this.f6310b = str;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f6309a.l().f6388a.a(this.f6310b, th);
        super.setException(th);
    }
}
