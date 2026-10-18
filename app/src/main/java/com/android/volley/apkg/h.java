package com.android.volley.apkg;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f1211a;

    /* renamed from: b, reason: collision with root package name */
    public String f1212b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map<String, String> h;

    public h() {
    }

    public h(String str, com.android.volley.b bVar) {
        this.f1212b = str;
        this.f1211a = bVar.f1228a.length;
        this.c = bVar.f1229b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
    }

    public static h a(InputStream inputStream) {
        h hVar = new h();
        if (g.a(inputStream) != 538247942) {
            throw new IOException();
        }
        hVar.f1212b = g.c(inputStream);
        hVar.c = g.c(inputStream);
        if (hVar.c.equals("")) {
            hVar.c = null;
        }
        hVar.d = g.b(inputStream);
        hVar.e = g.b(inputStream);
        hVar.f = g.b(inputStream);
        hVar.g = g.b(inputStream);
        hVar.h = g.d(inputStream);
        return hVar;
    }

    public final boolean a(OutputStream outputStream) {
        try {
            g.a(outputStream, 538247942);
            g.a(outputStream, this.f1212b);
            g.a(outputStream, this.c == null ? "" : this.c);
            g.a(outputStream, this.d);
            g.a(outputStream, this.e);
            g.a(outputStream, this.f);
            g.a(outputStream, this.g);
            Map<String, String> map = this.h;
            if (map != null) {
                g.a(outputStream, map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    g.a(outputStream, entry.getKey());
                    g.a(outputStream, entry.getValue());
                }
            } else {
                g.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            com.android.volley.w.b("%s", e.toString());
            return false;
        }
    }
}
