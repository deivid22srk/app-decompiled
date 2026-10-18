package com.google.android.libraries.bind.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b implements Executor {
    b() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = a.f6638a;
        handler.post(runnable);
    }
}
