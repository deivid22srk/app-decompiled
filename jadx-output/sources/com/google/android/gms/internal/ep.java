package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ep implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f5962a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eo f5963b;

    ep(eo eoVar, Handler handler) {
        this.f5963b = eoVar;
        this.f5962a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5962a.post(runnable);
    }
}
