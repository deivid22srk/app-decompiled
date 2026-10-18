package com.google.android.b;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b {
    public static void a(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (inputStream == null) {
                throw new NullPointerException("in == null");
            }
            if (bArr == null) {
                throw new NullPointerException("dst == null");
            }
            int length = bArr.length;
            if ((i2 | 0) >= 0 && length >= 0 && length + 0 >= i2) {
                while (i2 > 0) {
                    int read = inputStream.read(bArr, i, i2);
                    if (read < 0) {
                        throw new EOFException();
                    }
                    i += read;
                    i2 -= read;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(InputStream inputStream, int i) {
        if (i != 0) {
            while (i > 0) {
                long skip = inputStream.skip(i);
                if (skip < 0) {
                    throw new EOFException();
                }
                i = (int) (i - skip);
            }
        }
    }
}
