package com.google.android.libraries.bind.apkg;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6651a;

    k(j jVar) {
        this.f6651a = jVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!a.b()) {
            runnable.run();
        } else {
            this.f6651a.execute(runnable);
        }
    }
}
