package com.google.android.libraries.bind.apkg;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c implements Executor {
    c() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
