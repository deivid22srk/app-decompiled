package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class pi extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private int f6232a;

    private pi(InputStream inputStream) {
        super(inputStream);
        this.f6232a = 0;
    }

    /* synthetic */ pi(InputStream inputStream, byte b2) {
        this(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f6232a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f6232a += read;
        }
        return read;
    }
}
