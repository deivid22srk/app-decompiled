package com.a.a;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    final String f1047a;

    /* renamed from: b, reason: collision with root package name */
    final List<Certificate> f1048b;
    private final List<Certificate> c;

    private s(String str, List<Certificate> list, List<Certificate> list2) {
        this.f1047a = str;
        this.f1048b = list;
        this.c = list2;
    }

    public static s a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            certificateArr = null;
        }
        List a2 = certificateArr != null ? com.a.a.a.l.a(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new s(cipherSuite, a2, localCertificates != null ? com.a.a.a.l.a(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1047a.equals(sVar.f1047a) && this.f1048b.equals(sVar.f1048b) && this.c.equals(sVar.c);
    }

    public final int hashCode() {
        return ((((this.f1047a.hashCode() + 527) * 31) + this.f1048b.hashCode()) * 31) + this.c.hashCode();
    }
}
