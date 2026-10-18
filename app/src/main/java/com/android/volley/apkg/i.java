package com.android.volley.apkg;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f1213a;

    /* synthetic */ i(InputStream inputStream, byte b2) {
        this(inputStream);
    }

    public i(InputStream inputStream) {
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
