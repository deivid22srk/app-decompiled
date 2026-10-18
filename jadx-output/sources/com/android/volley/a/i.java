package com.android.volley.a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private int f1213a;

    /* synthetic */ i(InputStream inputStream, byte b2) {
        this(inputStream);
    }

    private i(InputStream inputStream) {
        super(inputStream);
        this.f1213a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f1213a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f1213a += read;
        }
        return read;
    }
}
