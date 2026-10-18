package com.google.android.libraries.bind.apkg;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f6646a = this;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f6647b = new i(this);
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Executor e;
    public final /* synthetic */ f f;

    h(f fVar, Executor executor, Runnable runnable, Executor executor2) {
        this.f = fVar;
        this.c = executor;
        this.d = runnable;
        this.e = executor2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.execute(this.f6647b);
    }
}
