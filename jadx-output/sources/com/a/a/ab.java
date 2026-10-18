package com.a.a;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    final String f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1007b;
    public final t c;
    public final ad d;
    final Object e;
    volatile URL f;
    private volatile URI g;
    private volatile d h;

    /* synthetic */ ab(ac acVar, byte b2) {
        this(acVar);
    }

    private ab(ac acVar) {
        this.f1006a = acVar.f1008a;
        this.f1007b = acVar.c;
        this.c = acVar.d.a();
        this.d = acVar.e;
        this.e = acVar.f != null ? acVar.f : this;
        this.f = acVar.f1009b;
    }

    public final URL a() {
        try {
            URL url = this.f;
            if (url != null) {
                return url;
            }
            URL url2 = new URL(this.f1006a);
            this.f = url2;
            return url2;
        } catch (MalformedURLException e) {
            throw new RuntimeException("Malformed URL: " + this.f1006a, e);
        }
    }

    public final URI b() {
        try {
            URI uri = this.g;
            if (uri != null) {
                return uri;
            }
            com.a.a.a.g.a();
            URI a2 = com.a.a.a.g.a(a());
            this.g = a2;
            return a2;
        } catch (URISyntaxException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final ac c() {
        return new ac(this, (byte) 0);
    }

    public final d d() {
        d dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.c);
        this.h = a2;
        return a2;
    }

    public final boolean e() {
        return a().getProtocol().equals("https");
    }

    public final String toString() {
        return "Request{method=" + this.f1007b + ", url=" + this.f1006a + ", tag=" + (this.e != this ? this.e : null) + '}';
    }
}
