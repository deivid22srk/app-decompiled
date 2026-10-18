package com.google.android.finsky.utils;

import android.util.Base64;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class ia extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f4982a;

    /* renamed from: b, reason: collision with root package name */
    private MessageDigest f4983b;
    private long c;

    public ia(OutputStream outputStream) {
        super(outputStream);
        this.f4982a = outputStream;
        try {
            this.f4983b = MessageDigest.getInstance("SHA-1");
            this.c = 0L;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final hz a() {
        return new hz(Base64.encodeToString(this.f4983b.digest(), 11), this.c, (byte) 0);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f4983b.update(bArr, i, i2);
        this.c += i2;
        this.f4982a.write(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.f4983b.update((byte) i);
        this.c++;
        this.f4982a.write(i);
    }
}
