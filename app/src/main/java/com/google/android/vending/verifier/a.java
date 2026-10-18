package com.google.android.vending.verifier;

import com.google.android.finsky.utils.jm;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.security.cert.Certificate;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[][] a(java.lang.String r7) {
        /*
            r1 = 0
            r4 = 0
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L63
            r2.<init>(r7)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L63
            java.lang.String r0 = "AndroidManifest.xml"
            java.util.jar.JarEntry r0 = r2.getJarEntry(r0)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            java.security.cert.Certificate[] r5 = a(r2, r0)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r5 == 0) goto L16
            int r0 = r5.length     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r0 != 0) goto L27
        L16:
            r2.close()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r2.close()     // Catch: java.io.IOException -> L1e
        L1c:
            r0 = r1
        L1d:
            return r0
        L1e:
            r0 = move-exception
            java.lang.String r2 = "Error closing apk file while collecting certificates"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.google.android.finsky.utils.FinskyLog.a(r0, r2, r3)
            goto L1c
        L27:
            r2.close()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r0 = r5.length     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            byte[][] r0 = new byte[r0][]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r3 = r4
        L2e:
            int r6 = r5.length     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            if (r3 >= r6) goto L3c
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            byte[] r6 = r6.getEncoded()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            r0[r3] = r6     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L76
            int r3 = r3 + 1
            goto L2e
        L3c:
            r2.close()     // Catch: java.io.IOException -> L40
            goto L1d
        L40:
            r1 = move-exception
            java.lang.String r2 = "Error closing apk file while collecting certificates"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.google.android.finsky.utils.FinskyLog.a(r1, r2, r3)
            goto L1d
        L49:
            r0 = move-exception
            r2 = r1
        L4b:
            java.lang.String r3 = "Error while collecting certificates"
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L74
            com.google.android.finsky.utils.FinskyLog.a(r0, r3, r5)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.io.IOException -> L5a
        L58:
            r0 = r1
            goto L1d
        L5a:
            r0 = move-exception
            java.lang.String r2 = "Error closing apk file while collecting certificates"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.google.android.finsky.utils.FinskyLog.a(r0, r2, r3)
            goto L58
        L63:
            r0 = move-exception
            r2 = r1
        L65:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L6b
        L6a:
            throw r0
        L6b:
            r1 = move-exception
            java.lang.String r2 = "Error closing apk file while collecting certificates"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.google.android.finsky.utils.FinskyLog.a(r1, r2, r3)
            goto L6a
        L74:
            r0 = move-exception
            goto L65
        L76:
            r0 = move-exception
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.verifier.a.a(java.lang.String):byte[][]");
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        byte[] bArr = new byte[8192];
        try {
            bufferedInputStream = new BufferedInputStream(jarFile.getInputStream(jarEntry));
            do {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    jm.a((Closeable) bufferedInputStream);
                    throw th;
                }
            } while (bufferedInputStream.read(bArr, 0, 8192) != -1);
            jm.a((Closeable) bufferedInputStream);
            if (jarEntry != null) {
                return jarEntry.getCertificates();
            }
            return null;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
        }
    }
}
