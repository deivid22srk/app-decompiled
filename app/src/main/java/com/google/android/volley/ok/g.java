package com.google.android.volley.ok;

import java.io.InputStream;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
final class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f7219a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f7220b;

    public g(c cVar, InputStream inputStream) {
        this.f7219a = cVar;
        this.f7220b = inputStream;
    }

    @Override // java.io.InputStream
    public final int read() {
        InterruptedIOException b2;
        try {
            return this.f7220b.read();
        } catch (InterruptedIOException e) {
            b2 = c.b(e);
            throw b2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        InterruptedIOException b2;
        try {
            return this.f7220b.read(bArr);
        } catch (InterruptedIOException e) {
            b2 = c.b(e);
            throw b2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        InterruptedIOException b2;
        try {
            return this.f7220b.read(bArr, i, i2);
        } catch (InterruptedIOException e) {
            b2 = c.b(e);
            throw b2;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7220b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7220b.close();
    }

    public final String toString() {
        return this.f7220b.toString();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f7220b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f7220b.markSupported();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f7220b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f7220b.skip(j);
    }
}
