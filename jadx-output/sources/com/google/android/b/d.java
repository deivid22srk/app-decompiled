package com.google.android.b;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f1419b;
    private final LinkedHashMap<String, c> c = new LinkedHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f1418a = new ArrayList();

    public d(File file) {
        this.f1419b = new RandomAccessFile(file.getPath(), "r");
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f1419b;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                this.f1419b = null;
                randomAccessFile.close();
            }
        }
    }

    private void a() {
        long j;
        long j2 = 0;
        long length = this.f1419b.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + this.f1419b.length());
        }
        this.f1419b.seek(0L);
        if (Integer.reverseBytes(this.f1419b.readInt()) != 67324752) {
            throw new ZipException("Not a zip archive");
        }
        long j3 = length - 65536;
        if (j3 < 0) {
            j = length;
        } else {
            j2 = j3;
            j = length;
        }
        do {
            this.f1419b.seek(j);
            if (Integer.reverseBytes(this.f1419b.readInt()) != 101010256) {
                j--;
            } else {
                byte[] bArr = new byte[18];
                this.f1419b.readFully(bArr);
                a aVar = new a(bArr);
                int b2 = aVar.b() & 65535;
                int b3 = aVar.b() & 65535;
                int b4 = aVar.b() & 65535;
                int b5 = aVar.b() & 65535;
                aVar.f1414a += 4;
                long a2 = aVar.a() & 4294967295L;
                if (b4 != b5 || b2 != 0 || b3 != 0) {
                    throw new ZipException("Spanned archives not supported");
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new e(this.f1419b, a2), 4096);
                byte[] bArr2 = new byte[46];
                for (int i = 0; i < b4; i++) {
                    c cVar = new c(bArr2, bufferedInputStream);
                    if (cVar.f >= a2) {
                        throw new ZipException("Local file header offset is after central directory");
                    }
                    c put = this.c.put(cVar.f1416a, cVar);
                    if (put != null) {
                        put.g |= 32;
                        cVar.g |= 32;
                    }
                    this.f1418a.add(cVar);
                }
                return;
            }
        } while (j >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static void a(String str, int i) {
        throw new ZipException(str + " signature not found; was " + String.format("%08x", Integer.valueOf(i)));
    }

    public final InputStream a(c cVar, boolean z) {
        long j;
        long j2;
        String str = cVar.f1416a;
        if (this.f1419b != null) {
            if (str == null) {
                throw new NullPointerException("entryName == null");
            }
            c cVar2 = this.c.get(str);
            c cVar3 = cVar2 == null ? this.c.get(str + "/") : cVar2;
            if (cVar3 == null) {
                return null;
            }
            RandomAccessFile randomAccessFile = this.f1419b;
            synchronized (randomAccessFile) {
                e eVar = new e(randomAccessFile, cVar3.f);
                DataInputStream dataInputStream = new DataInputStream(eVar);
                int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
                if (reverseBytes != 67324752) {
                    a("Local File Header", reverseBytes);
                }
                dataInputStream.skipBytes(2);
                int reverseBytes2 = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                if ((reverseBytes2 & 1) != 0) {
                    throw new ZipException("Invalid General Purpose Bit Flag: " + reverseBytes2);
                }
                dataInputStream.skipBytes(18);
                int reverseBytes3 = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                int reverseBytes4 = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                dataInputStream.close();
                if (reverseBytes3 != cVar3.e) {
                    cVar3.g |= 8;
                }
                if (reverseBytes4 >= 32768) {
                    cVar3.g |= 4;
                }
                if (z) {
                    return null;
                }
                eVar.skip(reverseBytes3 + reverseBytes4);
                if (cVar3.d == 0) {
                    j2 = eVar.c;
                    eVar.f1421b = j2 + cVar3.c;
                    return eVar;
                }
                j = eVar.c;
                eVar.f1421b = j + cVar3.f1417b;
                return new f(eVar, new Inflater(true), Math.max(1024, (int) Math.min(cVar3.c, 4096L)), cVar3);
            }
        }
        throw new IllegalStateException("Zip file closed");
    }
}
