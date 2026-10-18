package com.google.android.wallet.nfc.a;

import android.annotation.TargetApi;
import android.nfc.TagLostException;
import android.nfc.tech.IsoDep;
import android.os.SystemClock;
import com.google.android.wallet.nfc.exceptions.TagReadTimeoutException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7361a = com.google.android.wallet.a.a.j.b().intValue();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r2 = com.google.android.wallet.nfc.a.b.f7356a;
        r4 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r1 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r0 = a(r3, r2[r1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        throw new com.google.android.wallet.nfc.exceptions.TagReadException();
     */
    @android.annotation.TargetApi(10)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.wallet.nfc.a a(android.content.Intent r7) {
        /*
            r1 = 0
            java.lang.String r0 = "android.nfc.extra.TAG"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            android.nfc.Tag r0 = (android.nfc.Tag) r0
            android.nfc.tech.IsoDep r3 = android.nfc.tech.IsoDep.get(r0)
            if (r3 != 0) goto L15
            com.google.android.wallet.nfc.exceptions.UnsupportedTagException r0 = new com.google.android.wallet.nfc.exceptions.UnsupportedTagException
            r0.<init>()
            throw r0
        L15:
            r3.connect()     // Catch: java.lang.Throwable -> L7a
            int r0 = com.google.android.wallet.nfc.a.e.f7361a     // Catch: java.lang.Throwable -> L7a
            r3.setTimeout(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String[] r4 = com.google.android.wallet.nfc.a.b.f7357b     // Catch: java.lang.Throwable -> L7a
            int r5 = r4.length     // Catch: java.lang.Throwable -> L7a
            r2 = r1
        L21:
            if (r2 >= r5) goto L5c
            r0 = r4[r2]     // Catch: java.lang.Throwable -> L7a
            com.google.android.wallet.nfc.a.c r0 = com.google.android.wallet.nfc.a.b.a(r0)     // Catch: java.lang.Throwable -> L7a
            com.google.android.wallet.nfc.a.f r6 = new com.google.android.wallet.nfc.a.f     // Catch: java.lang.Throwable -> L7a
            byte[] r0 = r0.f7358a     // Catch: java.lang.Throwable -> L7a
            byte[] r0 = a(r3, r0)     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            byte[] r0 = com.google.android.wallet.nfc.a.f.f7362a     // Catch: java.lang.Throwable -> L7a
            boolean r0 = com.google.android.wallet.nfc.a.b.a(r6, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L56
            com.google.android.wallet.nfc.a.h r0 = com.google.android.wallet.nfc.a.i.a(r6)     // Catch: java.lang.Throwable -> L7a
            byte[] r6 = com.google.android.wallet.nfc.a.j.e     // Catch: java.lang.Throwable -> L7a
            com.google.android.wallet.nfc.a.h r0 = com.google.android.wallet.nfc.a.j.a(r0, r6)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L56
            java.lang.String r0 = com.google.android.wallet.nfc.a.j.a(r0)     // Catch: java.lang.Throwable -> L7a
            com.google.android.wallet.nfc.a r0 = a(r3, r0)     // Catch: java.lang.Throwable -> L7a
        L50:
            if (r0 == 0) goto L58
            r3.close()
        L55:
            return r0
        L56:
            r0 = 0
            goto L50
        L58:
            int r0 = r2 + 1
            r2 = r0
            goto L21
        L5c:
            java.lang.String[] r2 = com.google.android.wallet.nfc.a.b.f7356a     // Catch: java.lang.Throwable -> L7a
            int r4 = r2.length     // Catch: java.lang.Throwable -> L7a
        L5f:
            if (r1 >= r4) goto L71
            r0 = r2[r1]     // Catch: java.lang.Throwable -> L7a
            com.google.android.wallet.nfc.a r0 = a(r3, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L6d
            r3.close()
            goto L55
        L6d:
            int r0 = r1 + 1
            r1 = r0
            goto L5f
        L71:
            r3.close()
            com.google.android.wallet.nfc.exceptions.TagReadException r0 = new com.google.android.wallet.nfc.exceptions.TagReadException
            r0.<init>()
            throw r0
        L7a:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.nfc.a.e.a(android.content.Intent):com.google.android.wallet.nfc.a");
    }

    @TargetApi(10)
    private static com.google.android.wallet.nfc.a a(IsoDep isoDep, String str) {
        com.google.android.wallet.nfc.a aVar;
        f fVar = new f(a(isoDep, b.a(str).f7358a));
        if (b.a(fVar, f.f7362a)) {
            h a2 = i.a(fVar);
            byte[] a3 = j.a(new f(a(isoDep, b.a(j.b(j.a(a2, j.f)), j.a(j.a(a2, j.d)).toLowerCase().startsWith("visacard")).f7358a)));
            ArrayList arrayList = new ArrayList();
            int length = a3.length;
            for (int i = 0; i < length; i += 4) {
                arrayList.add(new a(a3[i + 1], a3[i + 2], (byte) (com.google.android.wallet.common.util.d.a(a3[i]) >> 3), a3[i + 3]));
            }
            int size = arrayList.size();
            int i2 = 0;
            loop1: while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                a aVar2 = (a) arrayList.get(i2);
                for (byte b2 = aVar2.f7354a; b2 <= aVar2.f7355b; b2 = (byte) (b2 + 1)) {
                    com.google.android.wallet.nfc.a a4 = a(isoDep, b2, aVar2.c);
                    if (a4 != null) {
                        aVar = a4;
                        break loop1;
                    }
                }
                i2++;
            }
            if (aVar == null) {
                h a5 = j.a(a2, j.g);
                if (a5 != null) {
                    byte b3 = (byte) (a5.f7367b[0] >> 3);
                    for (byte b4 = 1; b4 <= 16; b4 = (byte) (b4 + 1)) {
                        com.google.android.wallet.nfc.a a6 = a(isoDep, b4, b3);
                        if (a6 != null) {
                            return a6;
                        }
                    }
                }
                for (byte b5 = 1; b5 <= 31; b5 = (byte) (b5 + 1)) {
                    for (byte b6 = 1; b6 <= 16; b6 = (byte) (b6 + 1)) {
                        com.google.android.wallet.nfc.a a7 = a(isoDep, b6, b5);
                        if (a7 != null) {
                            return a7;
                        }
                    }
                }
            } else {
                return aVar;
            }
        }
        return null;
    }

    @TargetApi(10)
    private static com.google.android.wallet.nfc.a a(IsoDep isoDep, byte b2, byte b3) {
        com.google.android.wallet.nfc.a c;
        f fVar = new f(a(isoDep, b.a(b2, b3).f7358a));
        if (b.a(fVar, f.f7363b)) {
            fVar = new f(a(isoDep, b.a(b2, b3, fVar.e).f7358a));
        }
        if (!b.a(fVar, f.f7362a) || (c = j.c(i.a(fVar))) == null) {
            return null;
        }
        return c;
    }

    @TargetApi(10)
    private static byte[] a(IsoDep isoDep, byte[] bArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            return isoDep.transceive(bArr);
        } catch (TagLostException e) {
            if (SystemClock.elapsedRealtime() - elapsedRealtime >= f7361a) {
                throw new TagReadTimeoutException(e);
            }
            throw e;
        }
    }
}
