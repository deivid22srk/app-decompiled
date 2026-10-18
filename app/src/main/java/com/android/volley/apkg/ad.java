package com.android.volley.apkg;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class ad extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final d f1202a;

    public ad(d dVar, int i) {
        this.f1202a = dVar;
        this.buf = this.f1202a.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1202a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f1202a.a(this.buf);
    }

    public void a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a2 = this.f1202a.a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a2, 0, this.count);
            this.f1202a.a(this.buf);
            this.buf = a2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
