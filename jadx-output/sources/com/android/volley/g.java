package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f1237a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f1238b;

    g(f fVar, Handler handler) {
        this.f1238b = fVar;
        this.f1237a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1237a.post(runnable);
    }
}
