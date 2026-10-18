package com.a.a.a.a;

import com.a.a.af;
import java.util.Date;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f895a;

    /* renamed from: b, reason: collision with root package name */
    public final com.a.a.ab f896b;
    public final af c;
    public Date d;
    public String e;
    public Date f;
    public String g;
    public Date h;
    public long i;
    public long j;
    public String k;
    public int l;

    public d(long j, com.a.a.ab abVar, af afVar) {
        this.l = -1;
        this.f895a = j;
        this.f896b = abVar;
        this.c = afVar;
        if (afVar == null) {
            return;
        }
        com.a.a.t tVar = afVar.f;
        int length = tVar.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = tVar.a(i);
            String b2 = tVar.b(i);
            if ("Date".equalsIgnoreCase(a2)) {
                this.d = m.a(b2);
                this.e = b2;
            } else if ("Expires".equalsIgnoreCase(a2)) {
                this.h = m.a(b2);
            } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                this.f = m.a(b2);
                this.g = b2;
            } else if ("ETag".equalsIgnoreCase(a2)) {
                this.k = b2;
            } else if ("Age".equalsIgnoreCase(a2)) {
                this.l = e.b(b2, -1);
            } else if (u.f916b.equalsIgnoreCase(a2)) {
                this.i = Long.parseLong(b2);
            } else if (u.c.equalsIgnoreCase(a2)) {
                this.j = Long.parseLong(b2);
            }
        }
    }

    public static boolean a(com.a.a.ab abVar) {
        return (abVar.a("If-Modified-Since") == null && abVar.a("If-None-Match") == null) ? false : true;
    }
}
