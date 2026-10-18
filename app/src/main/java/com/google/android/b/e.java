package com.google.android.b;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
final class e extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f1420a;

    /* renamed from: b, reason: collision with root package name */
    private long f1421b;
    private long c;

    public e(RandomAccessFile randomAccessFile, long j) {
        this.f1420a = randomAccessFile;
        this.c = j;
        this.f1421b = randomAccessFile.length();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c < this.f1421b ? 1 : 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read;
        synchronized (this.f1420a) {
            this.f1420a.seek(this.c);
            read = this.f1420a.read();
            if (read != -1) {
                this.c++;
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        synchronized (this.f1420a) {
            long j = this.f1421b - this.c;
            if (i2 > j) {
                i2 = (int) j;
            }
            this.f1420a.seek(this.c);
            read = this.f1420a.read(bArr, i, i2);
            if (read > 0) {
                this.c += read;
            } else {
                read = -1;
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j > this.f1421b - this.c) {
            j = this.f1421b - this.c;
        }
        this.c += j;
        return j;
    }
}
