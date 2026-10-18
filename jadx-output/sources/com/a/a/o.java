package com.a.a;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1041a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f1042b;
    public static final o c;
    public final boolean d;
    final String[] e;
    final String[] f;
    final boolean g;
    o h;

    /* synthetic */ o(p pVar, byte b2) {
        this(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        p a2 = new p(true, (byte) 0).a(k.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, k.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, k.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, k.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, k.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, k.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, k.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, k.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA, k.TLS_ECDHE_RSA_WITH_RC4_128_SHA, k.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, k.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, k.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, k.TLS_RSA_WITH_AES_128_GCM_SHA256, k.TLS_RSA_WITH_AES_128_CBC_SHA, k.TLS_RSA_WITH_AES_256_CBC_SHA, k.TLS_RSA_WITH_3DES_EDE_CBC_SHA, k.TLS_RSA_WITH_RC4_128_SHA, k.TLS_RSA_WITH_RC4_128_MD5).a(aj.TLS_1_2, aj.TLS_1_1, aj.TLS_1_0);
        if (!a2.f1043a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        a2.d = true;
        f1041a = a2.a();
        f1042b = new p(f1041a).a(aj.TLS_1_0).a();
        c = new p(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0).a();
    }

    private o(p pVar) {
        this.d = pVar.f1043a;
        this.e = pVar.f1044b;
        this.f = pVar.c;
        this.g = pVar.d;
    }

    private List<k> a() {
        k[] kVarArr = new k[this.e.length];
        for (int i = 0; i < this.e.length; i++) {
            kVarArr[i] = k.a(this.e[i]);
        }
        return com.a.a.a.l.a(kVarArr);
    }

    private List<aj> b() {
        aj[] ajVarArr = new aj[this.f.length];
        for (int i = 0; i < this.f.length; i++) {
            ajVarArr[i] = aj.a(this.f[i]);
        }
        return com.a.a.a.l.a(ajVarArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.d == oVar.d) {
            return !this.d || (Arrays.equals(this.e, oVar.e) && Arrays.equals(this.f, oVar.f) && this.g == oVar.g);
        }
        return false;
    }

    public final int hashCode() {
        if (!this.d) {
            return 17;
        }
        return (this.g ? 0 : 1) + ((((Arrays.hashCode(this.e) + 527) * 31) + Arrays.hashCode(this.f)) * 31);
    }

    public final String toString() {
        return this.d ? "ConnectionSpec(cipherSuites=" + a() + ", tlsVersions=" + b() + ", supportsTlsExtensions=" + this.g + ")" : "ConnectionSpec()";
    }
}
