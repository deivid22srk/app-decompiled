package com.google.android.libraries.bind.apkg;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6643a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f6644b;
    public boolean e;
    public final ReentrantLock c = new ReentrantLock();
    public final Condition d = this.c.newCondition();
    public final d f = new d(a.c(), new g(this));

    static {
        f6643a = Build.VERSION.SDK_INT >= 21;
        f6644b = new f();
    }

    public final boolean a() {
        if (f6643a) {
            return false;
        }
        this.c.lock();
        try {
            return this.e;
        } finally {
            this.c.unlock();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor d = a.d();
        j jVar = o.f6658a;
        h hVar = new h(this, jVar, runnable, d);
        if (!a()) {
            hVar.run();
        } else {
            jVar.execute(hVar);
        }
    }
}
