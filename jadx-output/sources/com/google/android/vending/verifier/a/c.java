package com.google.android.vending.verifier.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.vending.verifier.PackageVerificationLoggingService;
import com.google.android.vending.verifier.b.j;
import com.google.android.vending.verifier.b.m;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class c {
    public static com.google.android.vending.verifier.b.b a(byte[] bArr, long j, String str, Integer num, byte[][] bArr2, byte[][] bArr3, e[] eVarArr, Uri uri, Uri uri2, InetAddress inetAddress, InetAddress inetAddress2, String[] strArr, byte[][] bArr4, String[] strArr2, byte[][] bArr5, String str2, Long l, String str3, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, byte[][] bArr6, boolean z8) {
        com.google.android.vending.verifier.b.b bVar = new com.google.android.vending.verifier.b.b();
        if (str != null || num != null) {
            com.google.android.vending.verifier.b.c cVar = new com.google.android.vending.verifier.b.c();
            if (str != null) {
                cVar.f7120a = str;
                cVar.f7121b = true;
            }
            if (num != null) {
                cVar.c = num.intValue();
                cVar.d = true;
            }
            if (eVarArr != null) {
                cVar.e = new com.google.android.vending.verifier.b.g[eVarArr.length];
                for (int i = 0; i < eVarArr.length; i++) {
                    com.google.android.vending.verifier.b.g[] gVarArr = cVar.e;
                    e eVar = eVarArr[i];
                    com.google.android.vending.verifier.b.g gVar = new com.google.android.vending.verifier.b.g();
                    gVar.f7128a = eVar.f7112a;
                    gVar.f7129b = true;
                    gVar.c = a(eVar.f7113b);
                    gVar.d = eVar.c;
                    gVar.e = true;
                    gVarArr[i] = gVar;
                }
            }
            if (bArr6 != null) {
                cVar.t = new j[bArr6.length];
                for (int i2 = 0; i2 < bArr6.length; i2++) {
                    j[] jVarArr = cVar.t;
                    byte[] bArr7 = bArr6[i2];
                    j jVar = new j();
                    jVar.f7135a = a(bArr7);
                    jVarArr[i2] = jVar;
                }
            }
            if (z) {
                cVar.f = true;
                cVar.g = true;
            }
            if (z2) {
                cVar.h = true;
                cVar.i = true;
            }
            if (z3) {
                cVar.j = true;
                cVar.k = true;
            }
            if (z4) {
                cVar.n = true;
                cVar.o = true;
            }
            if (z5) {
                cVar.p = true;
                cVar.q = true;
            }
            if (z6) {
                cVar.r = true;
                cVar.s = true;
            }
            if (z7) {
                cVar.l = true;
                cVar.m = true;
            }
            bVar.q = cVar;
        }
        if (bArr2 != null && bArr2.length > 0) {
            bVar.g = a(bArr2);
        } else if (bArr3 != null && bArr3.length > 0) {
            com.google.android.vending.verifier.b.i iVar = new com.google.android.vending.verifier.b.i();
            iVar.f7132a = new com.google.android.vending.verifier.b.d[bArr3.length];
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                com.google.android.vending.verifier.b.d dVar = new com.google.android.vending.verifier.b.d();
                com.google.android.vending.verifier.b.e eVar2 = new com.google.android.vending.verifier.b.e();
                eVar2.i = bArr3[i3];
                eVar2.j = true;
                dVar.f7123a = new com.google.android.vending.verifier.b.e[]{eVar2};
                iVar.f7132a[i3] = dVar;
            }
            bVar.g = iVar;
        }
        if (uri != null) {
            bVar.f7118a = uri.toString();
            bVar.f7119b = true;
            if (uri2 != null) {
                bVar.f = new com.google.android.vending.verifier.b.h[2];
            } else {
                bVar.f = new com.google.android.vending.verifier.b.h[1];
            }
            bVar.f[0] = a(uri, inetAddress, uri2, 0);
            if (uri2 != null) {
                bVar.f[1] = a(uri2, inetAddress2, null, 2);
            }
        } else {
            bVar.f7118a = "";
            bVar.f7119b = true;
        }
        if (strArr != null) {
            bVar.t = strArr;
        }
        if (bArr4 != null && bArr4.length > 0) {
            bVar.w = a(bArr4);
        }
        if (strArr2 != null) {
            bVar.x = strArr2;
        }
        if (bArr5 != null && bArr5.length > 0) {
            bVar.y = a(bArr5);
        }
        bVar.d = j;
        bVar.e = true;
        bVar.c = a(bArr);
        bVar.m = 2;
        bVar.n = true;
        if (str2 != null) {
            bVar.o = str2;
            bVar.p = true;
        }
        if (l != null) {
            bVar.r = l.longValue();
            bVar.s = true;
        }
        if (!TextUtils.isEmpty(str3)) {
            bVar.z = str3;
            bVar.A = true;
        }
        if (z8) {
            bVar.B = z8;
            bVar.C = true;
        }
        if (num2 != null) {
            try {
                bVar.u = Integer.toHexString(num2.intValue()).getBytes(Keyczar.DEFAULT_ENCODING);
                bVar.v = true;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return bVar;
    }

    private static com.google.android.vending.verifier.b.h a(Uri uri, InetAddress inetAddress, Uri uri2, int i) {
        com.google.android.vending.verifier.b.h hVar = new com.google.android.vending.verifier.b.h();
        hVar.f7130a = uri.toString();
        hVar.f7131b = true;
        hVar.c = i;
        hVar.d = true;
        if (uri2 != null) {
            hVar.g = uri2.toString();
            hVar.h = true;
        }
        if (inetAddress != null) {
            try {
                hVar.e = inetAddress.getHostAddress().getBytes(Keyczar.DEFAULT_ENCODING);
                hVar.f = true;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return hVar;
    }

    private static com.google.android.vending.verifier.b.f a(byte[] bArr) {
        com.google.android.vending.verifier.b.f fVar = new com.google.android.vending.verifier.b.f();
        fVar.f7126a = bArr;
        fVar.f7127b = true;
        return fVar;
    }

    private static com.google.android.vending.verifier.b.i a(byte[][] bArr) {
        com.google.android.vending.verifier.b.i iVar = new com.google.android.vending.verifier.b.i();
        iVar.f7132a = new com.google.android.vending.verifier.b.d[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            com.google.android.vending.verifier.b.d dVar = new com.google.android.vending.verifier.b.d();
            com.google.android.vending.verifier.b.e eVar = new com.google.android.vending.verifier.b.e();
            eVar.f7124a = bArr[i];
            eVar.f7125b = true;
            dVar.f7123a = new com.google.android.vending.verifier.b.e[]{eVar};
            iVar.f7132a[i] = dVar;
        }
        return iVar;
    }

    public static void a(Context context, String str, int i, boolean z, boolean z2, boolean z3, byte[] bArr) {
        m mVar = new m();
        if (bArr != null) {
            mVar.c = bArr;
            mVar.d = true;
        }
        mVar.f7140a = i;
        mVar.f7141b = true;
        if (z) {
            mVar.e = true;
            mVar.f = true;
        }
        if (z2) {
            mVar.g = true;
            mVar.h = true;
        }
        if (z3) {
            mVar.i = true;
            mVar.j = true;
        }
        if (com.google.android.finsky.c.d.cC.b().booleanValue()) {
            PackageVerificationLoggingService.a(context, mVar);
        }
        if (com.google.android.finsky.c.d.cD.b().booleanValue()) {
            FinskyApp.a().f1434a.a(new i("https://safebrowsing.google.com/safebrowsing/clientreport/download-stat", new d(str), mVar));
        }
    }
}
