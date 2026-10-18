package com.google.android.libraries.bind.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class c implements Executor {
    c() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
