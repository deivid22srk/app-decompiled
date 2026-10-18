package com.a.a;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1029a = new h(new i());

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<okio2.j>> f1030b;

    public /* synthetic */ h(i iVar, byte b2) {
        this(iVar);
    }

    public h(i iVar) {
        this.f1030b = com.a.a.apkg.l.a(iVar.f1031a);
    }

    public final void a(String str, List<Certificate> list) {
        List<okio2.j> list2 = this.f1030b.get(str);
        if (list2 != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.contains(a((X509Certificate) list.get(i)))) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ").append(a((Certificate) x509Certificate)).append(": ").append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ").append(str).append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    sha1/").append(okio2.e.a(list2.get(i3).f13b));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha1/" + okio2.e.a(a((X509Certificate) certificate).f13b);
    }

    public static okio2.j a(X509Certificate x509Certificate) {
        return com.a.a.apkg.l.a(okio2.j.a(x509Certificate.getPublicKey().getEncoded()));
    }
}
