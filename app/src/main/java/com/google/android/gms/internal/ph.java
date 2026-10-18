package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
final class ph {

    /* renamed from: a, reason: collision with root package name */
    public long f6230a;

    /* renamed from: b, reason: collision with root package name */
    public String f6231b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map<String, String> h;

    private ph() {
    }

    public ph(String str, bg bgVar) {
        this.f6231b = str;
        this.f6230a = bgVar.f5893a.length;
        this.c = bgVar.f5894b;
        this.d = bgVar.c;
        this.e = bgVar.d;
        this.f = bgVar.e;
        this.g = bgVar.f;
        this.h = bgVar.g;
    }

    public static ph a(InputStream inputStream) {
        ph phVar = new ph();
        if (pg.a(inputStream) != 538247942) {
            throw new IOException();
        }
        phVar.f6231b = pg.c(inputStream);
        phVar.c = pg.c(inputStream);
        if (phVar.c.equals("")) {
            phVar.c = null;
        }
        phVar.d = pg.b(inputStream);
        phVar.e = pg.b(inputStream);
        phVar.f = pg.b(inputStream);
        phVar.g = pg.b(inputStream);
        phVar.h = pg.d(inputStream);
        return phVar;
    }

    public final boolean a(OutputStream outputStream) {
        try {
            pg.a(outputStream, 538247942);
            pg.a(outputStream, this.f6231b);
            pg.a(outputStream, this.c == null ? "" : this.c);
            pg.a(outputStream, this.d);
            pg.a(outputStream, this.e);
            pg.a(outputStream, this.f);
            pg.a(outputStream, this.g);
            Map<String, String> map = this.h;
            if (map != null) {
                pg.a(outputStream, map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    pg.a(outputStream, entry.getKey());
                    pg.a(outputStream, entry.getValue());
                }
            } else {
                pg.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            nx.b("%s", e.toString());
            return false;
        }
    }
}
