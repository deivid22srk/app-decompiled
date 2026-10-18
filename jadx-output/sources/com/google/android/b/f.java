package com.google.android.b;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
final class f extends InflaterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final c f1422a;

    /* renamed from: b, reason: collision with root package name */
    private long f1423b;

    public f(InputStream inputStream, Inflater inflater, int i, c cVar) {
        super(inputStream, inflater, i);
        this.f1423b = 0L;
        this.f1422a = cVar;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f1423b += read;
            } else if (this.f1422a.c != this.f1423b) {
                throw new IOException("Size mismatch on inflated file: " + this.f1423b + " vs " + this.f1422a.c);
            }
            return read;
        } catch (IOException e) {
            throw new IOException("Error reading data for " + this.f1422a.f1416a + " near offset " + this.f1423b);
        }
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (super.available() == 0) {
            return 0;
        }
        return (int) (this.f1422a.c - this.f1423b);
    }
}
