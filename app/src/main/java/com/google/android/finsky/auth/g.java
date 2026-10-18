package com.google.android.finsky.auth;

import java.util.Map;

/* loaded from: classes.dex */
public final class g {
    public static void a(Map<String, String> map, String str, String str2) {
        if (str2.startsWith("oauth2:")) {
            map.put("Authorization", "Bearer " + str);
        } else {
            map.put("Authorization", "GoogleLogin auth=" + str);
        }
    }

    public static String a(com.google.android.finsky.dpkg.d dVar, long j) {
        return (com.google.android.finsky.cpkg.d.fp.b().booleanValue() && dVar != null && dVar.a(j)) ? com.google.android.finsky.cpkg.d.fr.b() : com.google.android.finsky.cpkg.d.fq.b();
    }
}
