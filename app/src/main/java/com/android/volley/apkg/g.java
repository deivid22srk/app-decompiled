package com.android.volley.apkg;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
public final class g implements com.android.volley.a {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, h> f1209a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f1210b = 0;
    public final File c;
    public final int d;

    public g(File file, int i) {
        this.c = file;
        this.d = i;
    }

    @Override // com.android.volley.a
    public final synchronized void b() {
        synchronized (this) {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            this.f1209a.clear();
            this.f1210b = 0L;
            com.android.volley.w.b("Cache cleared.", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.android.volley.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.android.volley.b a(java.lang.String r11) {
        /*
            r10 = this;
            r1 = 0
            monitor-enter(r10)
            java.util.Map<java.lang.String, com.android.volley.apkg.h> r0 = r10.f1209a     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L89
            com.android.volley.apkg.h r0 = (com.android.volley.apkg.h) r0     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto Lf
            r0 = r1
        Ld:
            monitor-exit(r10)
            return r0
        Lf:
            java.io.File r4 = r10.d(r11)     // Catch: java.lang.Throwable -> L89
            com.android.volley.apkg.i r3 = new com.android.volley.apkg.i     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            r5.<init>(r4)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            r2.<init>(r5)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            r5 = 0
            r3.<init>(r2, r5)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L81
            com.android.volley.apkg.h.a(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r4.length()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            int r2 = com.android.volley.apkg.i.a(r3)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r6 - r8
            int r2 = (int) r6     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            byte[] r5 = a(r3, r2)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            com.android.volley.b r2 = new com.android.volley.b     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.f1228a = r5     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            java.lang.String r5 = r0.c     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.f1229b = r5     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r0.d     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.c = r6     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r0.e     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.d = r6     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r0.f     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.e = r6     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            long r6 = r0.g     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.f = r6     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.h     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r2.g = r0     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L95
            r3.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L89
            r0 = r2
            goto Ld
        L59:
            r0 = move-exception
            r0 = r1
            goto Ld
        L5c:
            r0 = move-exception
            r2 = r1
        L5e:
            java.lang.String r3 = "%s: %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L92
            r6 = 0
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L92
            r5[r6] = r4     // Catch: java.lang.Throwable -> L92
            r4 = 1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
            r5[r4] = r0     // Catch: java.lang.Throwable -> L92
            com.android.volley.w.b(r3, r5)     // Catch: java.lang.Throwable -> L92
            r10.b(r11)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L89
        L7c:
            r0 = r1
            goto Ld
        L7e:
            r0 = move-exception
            r0 = r1
            goto Ld
        L81:
            r0 = move-exception
            r3 = r1
        L83:
            if (r3 == 0) goto L88
            r3.close()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L8c:
            r0 = move-exception
            r0 = r1
            goto Ld
        L90:
            r0 = move-exception
            goto L83
        L92:
            r0 = move-exception
            r3 = r2
            goto L83
        L95:
            r0 = move-exception
            r2 = r3
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.apkg.g.a(java.lang.String):com.android.volley.b");
    }

    @Override // com.android.volley.a
    public final synchronized void a() {
        BufferedInputStream bufferedInputStream;
        if (!this.c.exists()) {
            if (!this.c.mkdirs()) {
                com.android.volley.w.c("Unable to create cache dir %s", this.c.getAbsolutePath());
            }
        } else {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            try {
                                h a2 = h.a(bufferedInputStream);
                                a2.f1211a = file.length();
                                a(a2.f1212b, a2);
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
        }
    }

    @Override // com.android.volley.a
    public final synchronized void a(String str, boolean z) {
        com.android.volley.b a2 = a(str);
        if (a2 != null) {
            a2.f = 0L;
            if (z) {
                a2.e = 0L;
            }
            a(str, a2);
        }
    }

    @Override // com.android.volley.a
    public final synchronized void a(String str, com.android.volley.b bVar) {
        BufferedOutputStream bufferedOutputStream;
        h hVar;
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.f1210b + bVar.f1228a.length >= this.d) {
                if (com.android.volley.w.f1258b) {
                    com.android.volley.w.a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f1210b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Map.Entry<String, h>> it = this.f1209a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        break;
                    }
                    h value = it.next().getValue();
                    if (d(value.f1212b).delete()) {
                        this.f1210b -= value.f1211a;
                    } else {
                        com.android.volley.w.b("Could not delete cache entry for key=%s, filename=%s", value.f1212b, c(value.f1212b));
                    }
                    it.remove();
                    i = i2 + 1;
                    if (this.f1210b + r2 < this.d * 0.9f) {
                        break;
                    } else {
                        i2 = i;
                    }
                }
                if (com.android.volley.w.f1258b) {
                    com.android.volley.w.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f1210b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d = d(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                hVar = new h(str, bVar);
            } catch (IOException e) {
                if (!d.delete()) {
                    com.android.volley.w.b("Could not clean up file %s", d.getAbsolutePath());
                }
            }
            if (!hVar.a(bufferedOutputStream)) {
                bufferedOutputStream.close();
                com.android.volley.w.b("Failed to write header for %s", d.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(bVar.f1228a);
            bufferedOutputStream.close();
            a(str, hVar);
        }
    }

    public synchronized void b(String str) {
        boolean delete = d(str).delete();
        h hVar = this.f1209a.get(str);
        if (hVar != null) {
            this.f1210b -= hVar.f1211a;
            this.f1209a.remove(str);
        }
        if (!delete) {
            com.android.volley.w.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    public static String c(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    public File d(String str) {
        return new File(this.c, c(str));
    }

    public void a(String str, h hVar) {
        if (!this.f1209a.containsKey(str)) {
            this.f1210b += hVar.f1211a;
        } else {
            this.f1210b = (hVar.f1211a - this.f1209a.get(str).f1211a) + this.f1210b;
        }
        this.f1209a.put(str, hVar);
    }

    public static byte[] a(InputStream inputStream, int i) {
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

    public static int e(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }

    public static void a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static int a(InputStream inputStream) {
        return (e(inputStream) << 0) | 0 | (e(inputStream) << 8) | (e(inputStream) << 16) | (e(inputStream) << 24);
    }

    public static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static long b(InputStream inputStream) {
        return 0 | ((e(inputStream) & 255) << 0) | ((e(inputStream) & 255) << 8) | ((e(inputStream) & 255) << 16) | ((e(inputStream) & 255) << 24) | ((e(inputStream) & 255) << 32) | ((e(inputStream) & 255) << 40) | ((e(inputStream) & 255) << 48) | ((e(inputStream) & 255) << 56);
    }

    public static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(Keyczar.DEFAULT_ENCODING);
        a(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    public static String c(InputStream inputStream) {
        return new String(a(inputStream, (int) b(inputStream)), Keyczar.DEFAULT_ENCODING);
    }

    public static Map<String, String> d(InputStream inputStream) {
        int a2 = a(inputStream);
        Map<String, String> emptyMap = a2 == 0 ? Collections.emptyMap() : new HashMap<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyMap.put(c(inputStream).intern(), c(inputStream).intern());
        }
        return emptyMap;
    }
}
