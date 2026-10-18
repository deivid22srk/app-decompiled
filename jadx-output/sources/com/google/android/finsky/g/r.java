package com.google.android.finsky.g;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.dp;

/* loaded from: classes.dex */
public class r {
    public static final String f = null;
    public final String g;
    public String h;
    public int i;
    public String j;
    public int k;
    public int l;
    final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final int r;

    public static r a(String str, String str2, Document document, int i) {
        return new r(str, str2, document.f1963a.g, document.f1963a.c, document.f1963a.e, i);
    }

    public static r a(String str, String str2, dp dpVar, int i) {
        return new r(str, str2, dpVar.e, dpVar.f3740a, dpVar.c, i);
    }

    public r(String str, String str2, int i, String str3, int i2, int i3) {
        this(str, str2, i, str3, i2, i3, Long.MIN_VALUE, Long.MAX_VALUE, false, false, null, 0);
    }

    public r(String str, String str2, int i, String str3, int i2, int i3, long j, long j2, boolean z, boolean z2, String str4, int i4) {
        if (str3 == null) {
            throw new NullPointerException();
        }
        this.g = str;
        this.h = str2;
        this.i = i;
        this.j = str3;
        this.k = i2;
        this.l = i3;
        this.m = j;
        this.n = j2;
        this.o = z;
        this.p = z2;
        this.q = str4;
        this.r = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.i == rVar.i && this.k == rVar.k && this.l == rVar.l) {
            return (this.g == f || rVar.g == f || this.g.equals(rVar.g)) && this.j.equals(rVar.j) && this.h.equals(rVar.h);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.h != null ? this.h.hashCode() : 0) + 0) * 31) + (this.j != null ? this.j.hashCode() : 0)) * 31) + this.k) * 31) + this.l;
    }
}
