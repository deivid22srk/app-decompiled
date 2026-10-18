package com.a.a;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class ah implements Closeable {
    public abstract x a();

    public abstract long b();

    public abstract a.i c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c().close();
    }
}
