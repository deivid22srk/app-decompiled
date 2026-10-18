package com.a.a.a.c;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* loaded from: classes.dex */
public final class b implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final b f987a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f988b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[Catch: SSLException -> 0x00de, TryCatch #0 {SSLException -> 0x00de, blocks: (B:3:0x0003, B:5:0x0018, B:7:0x0024, B:9:0x0032, B:17:0x0038, B:19:0x004b, B:21:0x0059, B:27:0x0060, B:31:0x0088, B:33:0x008e, B:35:0x0098, B:36:0x009e, B:37:0x00a1, B:38:0x00a5, B:40:0x00ab, B:42:0x014d, B:44:0x0157, B:46:0x0161, B:49:0x016b, B:50:0x0181, B:51:0x0182, B:55:0x018e, B:56:0x01a4, B:60:0x00b3, B:61:0x00c1, B:83:0x00c7, B:84:0x00dd, B:63:0x00e2, B:73:0x00ec, B:74:0x00f2, B:76:0x00f8, B:78:0x0102, B:80:0x0137, B:65:0x0109, B:67:0x0113, B:69:0x011d, B:70:0x012a, B:85:0x0147), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086 A[SYNTHETIC] */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean verify(java.lang.String r12, javax.net.ssl.SSLSession r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.c.b.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> a2 = a(x509Certificate, 7);
        List<String> a3 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a2.size() + a3.size());
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        return arrayList;
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str + '.';
        }
        if (!str2.endsWith(".")) {
            str2 = str2 + '.';
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
    }
}
