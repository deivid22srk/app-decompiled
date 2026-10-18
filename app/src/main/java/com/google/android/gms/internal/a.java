package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final pe f5858a;

    public a(pe peVar, int i) {
        this.f5858a = peVar;
        this.buf = this.f5858a.a(Math.max(i, 256));
    }

    private void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] a2 = this.f5858a.a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, a2, 0, this.count);
        this.f5858a.a(this.buf);
        this.buf = a2;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5858a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f5858a.a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
