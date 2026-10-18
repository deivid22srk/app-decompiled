package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class pg implements bf {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, ph> f6228a;

    /* renamed from: b, reason: collision with root package name */
    private long f6229b;
    private final File c;
    private final int d;

    private pg(File file) {
        this.f6228a = new LinkedHashMap(16, 0.75f, true);
        this.f6229b = 0L;
        this.c = file;
        this.d = 5242880;
    }

    public pg(File file, byte b2) {
        this(file);
    }

    static int a(InputStream inputStream) {
        return (e(inputStream) << 0) | 0 | (e(inputStream) << 8) | (e(inputStream) << 16) | (e(inputStream) << 24);
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(Keyczar.DEFAULT_ENCODING);
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void a(String str, ph phVar) {
        if (this.f6228a.containsKey(str)) {
            this.f6229b = (phVar.f6230a - this.f6228a.get(str).f6230a) + this.f6229b;
        } else {
            this.f6229b += phVar.f6230a;
        }
        this.f6228a.put(str, phVar);
    }

    private static byte[] a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 != i) {
            throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
        }
        return bArr;
    }

    static long b(InputStream inputStream) {
        return 0 | ((e(inputStream) & 255) << 0) | ((e(inputStream) & 255) << 8) | ((e(inputStream) & 255) << 16) | ((e(inputStream) & 255) << 24) | ((e(inputStream) & 255) << 32) | ((e(inputStream) & 255) << 40) | ((e(inputStream) & 255) << 48) | ((e(inputStream) & 255) << 56);
    }

    static String c(InputStream inputStream) {
        return new String(a(inputStream, (int) b(inputStream)), Keyczar.DEFAULT_ENCODING);
    }

    private static String c(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private File d(String str) {
        return new File(this.c, c(str));
    }

    static Map<String, String> d(InputStream inputStream) {
        int a2 = a(inputStream);
        Map<String, String> emptyMap = a2 == 0 ? Collections.emptyMap() : new HashMap<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    @Override // com.google.android.gms.internal.bf
    public final synchronized void a() {
        BufferedInputStream bufferedInputStream;
        if (this.c.exists()) {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            try {
                                ph a2 = ph.a(bufferedInputStream);
                                a2.f6230a = file.length();
                                a(a2.f6231b, a2);
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e) {
                                }
                            } catch (Throwable th) {
                                bufferedInputStream2 = bufferedInputStream;
                                th = th;
                                if (bufferedInputStream2 != null) {
                                    try {
                                        bufferedInputStream2.close();
                                    } catch (IOException e2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            if (file != null) {
                                file.delete();
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                        }
                    } catch (IOException e5) {
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } else if (!this.c.mkdirs()) {
            nx.c("Unable to create cache dir %s", this.c.getAbsolutePath());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.bg a(java.lang.String r11) {
        /*
            r10 = this;
            r1 = 0
            monitor-enter(r10)
            java.util.Map<java.lang.String, com.google.android.gms.internal.ph> r0 = r10.f6228a     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.ph r0 = (com.google.android.gms.internal.ph) r0     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto Lf
            r0 = r1
        Ld:
            monitor-exit(r10)
            return r0
        Lf:
            java.io.File r4 = r10.d(r11)     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.pi r3 = new com.google.android.gms.internal.pi     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L7c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L7c
            r2.<init>(r4)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L7c
            r5 = 0
            r3.<init>(r2, r5)     // Catch: java.io.IOException -> L57 java.lang.Throwable -> L7c
            com.google.android.gms.internal.ph.a(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r4.length()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            int r2 = com.google.android.gms.internal.pi.a(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r6 - r8
            int r2 = (int) r6     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            byte[] r5 = a(r3, r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            com.google.android.gms.internal.bg r2 = new com.google.android.gms.internal.bg     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.f5893a = r5     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            java.lang.String r5 = r0.c     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.f5894b = r5     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r0.d     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.c = r6     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r0.e     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.d = r6     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r0.f     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.e = r6     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            long r6 = r0.g     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.f = r6     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.h     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r2.g = r0     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8f
            r3.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L84
            r0 = r2
            goto Ld
        L54:
            r0 = move-exception
            r0 = r1
            goto Ld
        L57:
            r0 = move-exception
            r2 = r1
        L59:
            java.lang.String r3 = "%s: %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c
            r6 = 0
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L8c
            r5[r6] = r4     // Catch: java.lang.Throwable -> L8c
            r4 = 1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8c
            r5[r4] = r0     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.nx.b(r3, r5)     // Catch: java.lang.Throwable -> L8c
            r10.b(r11)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L77
            r2.close()     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L84
        L77:
            r0 = r1
            goto Ld
        L79:
            r0 = move-exception
            r0 = r1
            goto Ld
        L7c:
            r0 = move-exception
            r3 = r1
        L7e:
            if (r3 == 0) goto L83
            r3.close()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L87
        L83:
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L87:
            r0 = move-exception
            r0 = r1
            goto Ld
        L8a:
            r0 = move-exception
            goto L7e
        L8c:
            r0 = move-exception
            r3 = r2
            goto L7e
        L8f:
            r0 = move-exception
            r2 = r3
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pg.a(java.lang.String):com.google.android.gms.internal.bg");
    }

    @Override // com.google.android.gms.internal.bf
    public final synchronized void a(String str, bg bgVar) {
        FileOutputStream fileOutputStream;
        ph phVar;
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.f6229b + bgVar.f5893a.length >= this.d) {
                if (nx.f6191b) {
                    nx.a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f6229b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Map.Entry<String, ph>> it = this.f6228a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        break;
                    }
                    ph value = it.next().getValue();
                    if (d(value.f6231b).delete()) {
                        this.f6229b -= value.f6230a;
                    } else {
                        nx.b("Could not delete cache entry for key=%s, filename=%s", value.f6231b, c(value.f6231b));
                    }
                    it.remove();
                    i = i2 + 1;
                    if (this.f6229b + r2 < this.d * 0.9f) {
                        break;
                    } else {
                        i2 = i;
                    }
                }
                if (nx.f6191b) {
                    nx.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f6229b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d = d(str);
            try {
                fileOutputStream = new FileOutputStream(d);
                phVar = new ph(str, bgVar);
            } catch (IOException e) {
                if (!d.delete()) {
                    nx.b("Could not clean up file %s", d.getAbsolutePath());
                }
            }
            if (!phVar.a(fileOutputStream)) {
                fileOutputStream.close();
                nx.b("Failed to write header for %s", d.getAbsolutePath());
                throw new IOException();
            }
            fileOutputStream.write(bgVar.f5893a);
            fileOutputStream.close();
            a(str, phVar);
        }
    }

    private synchronized void b(String str) {
        boolean delete = d(str).delete();
        ph phVar = this.f6228a.get(str);
        if (phVar != null) {
            this.f6229b -= phVar.f6230a;
            this.f6228a.remove(str);
        }
        if (!delete) {
            nx.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }
}
