package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final e[] f954a = {new e(e.e, ""), new e(e.f951b, "GET"), new e(e.f951b, "POST"), new e(e.c, "/"), new e(e.c, "/index.html"), new e(e.d, "http"), new e(e.d, "https"), new e(e.f950a, "200"), new e(e.f950a, "204"), new e(e.f950a, "206"), new e(e.f950a, "304"), new e(e.f950a, "400"), new e(e.f950a, "404"), new e(e.f950a, "500"), new e("accept-charset", ""), new e("accept-encoding", "gzip, deflate"), new e("accept-language", ""), new e("accept-ranges", ""), new e("accept", ""), new e("access-control-allow-origin", ""), new e("age", ""), new e("allow", ""), new e("authorization", ""), new e("cache-control", ""), new e("content-disposition", ""), new e("content-encoding", ""), new e("content-language", ""), new e("content-length", ""), new e("content-location", ""), new e("content-range", ""), new e("content-type", ""), new e("cookie", ""), new e("date", ""), new e("etag", ""), new e("expect", ""), new e("expires", ""), new e("from", ""), new e("host", ""), new e("if-match", ""), new e("if-modified-since", ""), new e("if-none-match", ""), new e("if-range", ""), new e("if-unmodified-since", ""), new e("last-modified", ""), new e("link", ""), new e("location", ""), new e("max-forwards", ""), new e("proxy-authenticate", ""), new e("proxy-authorization", ""), new e("range", ""), new e("referer", ""), new e("refresh", ""), new e("retry-after", ""), new e("server", ""), new e("set-cookie", ""), new e("strict-transport-security", ""), new e("transfer-encoding", ""), new e("user-agent", ""), new e("vary", ""), new e("via", ""), new e("www-authenticate", "")};

    /* renamed from: b, reason: collision with root package name */
    public static final Map<okio2.j, Integer> f955b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f954a.length);
        for (int i = 0; i < f954a.length; i++) {
            if (!linkedHashMap.containsKey(f954a[i].h)) {
                linkedHashMap.put(f954a[i].h, Integer.valueOf(i));
            }
        }
        f955b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static /* synthetic */ okio2.j a(okio2.j jVar) {
        int length = jVar.f13b.length;
        for (int i = 0; i < length; i++) {
            byte b2 = jVar.f13b[i];
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + jVar.a());
            }
        }
        return jVar;
    }
}
