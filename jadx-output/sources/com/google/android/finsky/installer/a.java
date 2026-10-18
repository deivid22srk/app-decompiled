package com.google.android.finsky.installer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class a {
    public static void a(RandomAccessFile randomAccessFile, OutputStream outputStream, InputStream inputStream, long j) {
        byte[] bArr = new byte[16];
        try {
            a(inputStream, bArr, 16);
            if (!"ENDSLEY/BSDIFF43".equals(new String(bArr, 0, 16, "US-ASCII"))) {
                throw new PatchFormatException("bad signature");
            }
            long length = randomAccessFile.length();
            if (length > 2147483647L) {
                throw new PatchFormatException("bad oldSize");
            }
            long a2 = a(inputStream);
            if (a2 < 0 || a2 > 2147483647L) {
                throw new PatchFormatException("bad newSize");
            }
            if (j != a2) {
                throw new PatchFormatException("expectedNewSize != newSize");
            }
            byte[] bArr2 = new byte[51200];
            byte[] bArr3 = new byte[51200];
            long j2 = 0;
            long j3 = 0;
            while (j3 < a2) {
                long a3 = a(inputStream);
                long a4 = a(inputStream);
                long a5 = a(inputStream);
                if (a3 < 0 || a3 > 2147483647L) {
                    throw new PatchFormatException("bad diffSegmentLength");
                }
                if (a4 < 0 || a4 > 2147483647L) {
                    throw new PatchFormatException("bad copySegmentLength");
                }
                if (a5 < -2147483648L || a5 > 2147483647L) {
                    throw new PatchFormatException("bad offsetToNextInput");
                }
                long j4 = j3 + a3 + a4;
                if (j4 > a2) {
                    throw new PatchFormatException("expectedFinalNewDataBytesWritten too large");
                }
                long j5 = a5 + j2 + a3;
                if (j5 > length) {
                    throw new PatchFormatException("expectedFinalOldDataOffset too large");
                }
                if (j5 < 0) {
                    throw new PatchFormatException("expectedFinalOldDataOffset is negative");
                }
                randomAccessFile.seek(j2);
                if (a3 > 0) {
                    a((int) a3, inputStream, randomAccessFile, outputStream, bArr2, bArr3);
                }
                if (a4 > 0) {
                    a(inputStream, outputStream, bArr2, (int) a4);
                }
                j3 = j4;
                j2 = j5;
            }
        } catch (IOException e) {
            throw new PatchFormatException("truncated signature");
        }
    }

    private static void a(int i, InputStream inputStream, RandomAccessFile randomAccessFile, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        while (i > 0) {
            int min = Math.min(i, 51200);
            randomAccessFile.readFully(bArr, 0, min);
            a(inputStream, bArr2, min);
            for (int i2 = 0; i2 < min; i2++) {
                bArr[i2] = (byte) (bArr[i2] + bArr2[i2]);
            }
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }

    private static long a(InputStream inputStream) {
        int i = 0;
        long j = 0;
        while (i < 64) {
            long read = (inputStream.read() << i) | j;
            i += 8;
            j = read;
        }
        if (j == Long.MIN_VALUE) {
            throw new PatchFormatException("read negative zero");
        }
        if ((j & Long.MIN_VALUE) != 0) {
            return -(j & Long.MAX_VALUE);
        }
        return j;
    }

    private static void a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2 + 0, i - i2);
            if (read == -1) {
                throw new IOException("truncated input stream");
            }
            i2 += read;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr, int i) {
        while (i > 0) {
            int min = Math.min(51200, i);
            a(inputStream, bArr, min);
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }
}
