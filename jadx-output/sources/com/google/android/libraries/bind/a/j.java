package com.google.android.libraries.bind.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    protected Executor f6650b;
    public final int c;
    protected final ThreadGroup d;
    public final Executor e = new k(this);
    private final String g;
    private static final com.google.android.libraries.bind.c.b f = com.google.android.libraries.bind.c.b.a(o.class);

    /* renamed from: a, reason: collision with root package name */
    protected static final List<j> f6649a = new ArrayList();

    public j(String str) {
        this.g = str;
        f6649a.add(this);
        this.c = 2;
        this.d = new ThreadGroup(str);
        this.f6650b = new n(this, this.c, this.c, TimeUnit.SECONDS, new LinkedBlockingQueue(), new l(this));
    }

    public j(String str, Executor executor) {
        this.g = str;
        f6649a.add(this);
        this.c = 1;
        this.d = new ThreadGroup(str);
        this.f6650b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6650b.execute(runnable);
    }

    public final String toString() {
        return this.g;
    }
}
