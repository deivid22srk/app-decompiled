package com.google.android.finsky.installer;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class g {
    public static long a(RandomAccessFile randomAccessFile, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        long j2 = 0;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            throw new PatchFormatException("Unexpected magic=" + String.format("%x", Integer.valueOf(readInt)));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new PatchFormatException("Unexpected version=" + read);
        }
        do {
            try {
                long j3 = j2;
                int read2 = dataInputStream.read();
                switch (read2) {
                    case -1:
                        throw new IOException("Patch file overrun");
                    case 0:
                        return j3;
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        a(bArr, dataInputStream, outputStream, read2);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        a(bArr, dataInputStream, outputStream, read2);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        a(bArr, randomAccessFile, outputStream, readUnsignedShort, read2);
                        break;
                    case 250:
                        long readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readUnsignedShort();
                        a(bArr, randomAccessFile, outputStream, readUnsignedShort2, read2);
                        break;
                    case 251:
                        long readUnsignedShort3 = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.readInt();
                        a(bArr, randomAccessFile, outputStream, readUnsignedShort3, read2);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        a(bArr, randomAccessFile, outputStream, readInt2, read2);
                        break;
                    case 253:
                        long readInt3 = dataInputStream.readInt();
                        read2 = dataInputStream.readUnsignedShort();
                        a(bArr, randomAccessFile, outputStream, readInt3, read2);
                        break;
                    case 254:
                        long readInt4 = dataInputStream.readInt();
                        read2 = dataInputStream.readInt();
                        a(bArr, randomAccessFile, outputStream, readInt4, read2);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        a(bArr, randomAccessFile, outputStream, readLong, read2);
                        break;
                    default:
                        a(bArr, dataInputStream, outputStream, read2);
                        break;
                }
                j2 = read2 + j3;
            } finally {
                outputStream.flush();
            }
        } while (j2 <= j);
        throw new IOException("Output length overrun");
    }

    private static void a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = i2 < 16384 ? i2 : 16384;
            try {
                dataInputStream.readFully(bArr, 0, i3);
                outputStream.write(bArr, 0, i3);
                i2 -= i3;
            } catch (EOFException e) {
                throw new IOException("patch underrun");
            }
        }
    }

    private static void a(byte[] bArr, RandomAccessFile randomAccessFile, OutputStream outputStream, long j, int i) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        try {
            randomAccessFile.seek(j);
            int i2 = i;
            while (i2 > 0) {
                int i3 = i2 < 16384 ? i2 : 16384;
                randomAccessFile.readFully(bArr, 0, i3);
                outputStream.write(bArr, 0, i3);
                i2 -= i3;
            }
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }
}
