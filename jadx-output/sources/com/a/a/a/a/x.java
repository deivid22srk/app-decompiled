package com.a.a.a.a;

import java.net.URL;

/* loaded from: classes.dex */
public final class x {
    public static String a(URL url) {
        String file = url.getFile();
        return file == null ? "/" : !file.startsWith("/") ? "/" + file : file;
    }

    public static String a(com.a.a.aa aaVar) {
        return aaVar == com.a.a.aa.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
