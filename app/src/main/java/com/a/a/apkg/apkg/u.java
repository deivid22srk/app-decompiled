package com.a.a.apkg.apkg;

import com.a.a.af;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f915a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f916b;
    public static final String c;
    public static final String d;
    public static final Comparator<String> e = new v();

    static {
        com.a.a.apkg.g.a();
        f915a = com.a.a.apkg.g.b();
        f916b = f915a + "-Sent-Millis";
        c = f915a + "-Received-Millis";
        d = f915a + "-Selected-Protocol";
    }

    public static long a(com.a.a.t tVar) {
        return b(tVar.a("Content-Length"));
    }

    public static long b(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            return -1L;
        }
    }

    public static Map<String, List<String>> b(com.a.a.t tVar) {
        TreeMap treeMap = new TreeMap(e);
        int length = tVar.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = tVar.a(i);
            String b2 = tVar.b(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(a2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b2);
            treeMap.put(a2, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static void a(com.a.a.ac acVar, Map<String, List<String>> map) {
        String sb;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    List<String> value = entry.getValue();
                    if (value.size() == 1) {
                        sb = value.get(0);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int size = value.size();
                        for (int i = 0; i < size; i++) {
                            if (i > 0) {
                                sb2.append("; ");
                            }
                            sb2.append(value.get(i));
                        }
                        sb = sb2.toString();
                    }
                    acVar.b(key, sb);
                }
            }
        }
    }

    public static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static List<com.a.a.j> a(com.a.a.t tVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = tVar.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(tVar.a(i))) {
                String b2 = tVar.b(i);
                int i2 = 0;
                while (i2 < b2.length()) {
                    int a2 = e.a(b2, i2, " ");
                    String trim = b2.substring(i2, a2).trim();
                    int a3 = e.a(b2, a2);
                    if (b2.regionMatches(true, a3, "realm=\"", 0, 7)) {
                        int i3 = a3 + 7;
                        int a4 = e.a(b2, i3, "\"");
                        String substring = b2.substring(i3, a4);
                        i2 = e.a(b2, e.a(b2, a4 + 1, ",") + 1);
                        arrayList.add(new com.a.a.j(trim, substring));
                    }
                }
            }
        }
        return arrayList;
    }

    public static long a(com.a.a.ab abVar) {
        return a(abVar.c);
    }

    public static long a(af afVar) {
        return a(afVar.f);
    }

    public static com.a.a.ab a(com.a.a.b bVar, af afVar, Proxy proxy) {
        return afVar.c == 407 ? bVar.b(proxy, afVar) : bVar.a(proxy, afVar);
    }
}
