package com.a.a;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1021a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f1022b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    private final boolean l;

    /* synthetic */ d(e eVar, byte b2) {
        this(eVar);
    }

    static {
        e eVar = new e();
        eVar.f1023a = true;
        f1021a = eVar.a();
        e eVar2 = new e();
        eVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        eVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f1022b = eVar2.a();
    }

    private d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = z4;
        this.i = i3;
        this.j = i4;
        this.k = z5;
        this.l = z6;
    }

    private d(e eVar) {
        this.c = eVar.f1023a;
        this.d = eVar.f1024b;
        this.e = eVar.c;
        this.f = -1;
        this.g = false;
        this.h = false;
        this.i = eVar.d;
        this.j = eVar.e;
        this.k = eVar.f;
        this.l = eVar.g;
    }

    public static d a(t tVar) {
        String str;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z5 = false;
        boolean z6 = false;
        int length = tVar.f1049a.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            if (tVar.a(i5).equalsIgnoreCase("Cache-Control") || tVar.a(i5).equalsIgnoreCase("Pragma")) {
                String b2 = tVar.b(i5);
                int i6 = 0;
                while (i6 < b2.length()) {
                    int a2 = com.a.a.a.a.e.a(b2, i6, "=,;");
                    String trim = b2.substring(i6, a2).trim();
                    if (a2 == b2.length() || b2.charAt(a2) == ',' || b2.charAt(a2) == ';') {
                        i6 = a2 + 1;
                        str = null;
                    } else {
                        int a3 = com.a.a.a.a.e.a(b2, a2 + 1);
                        if (a3 < b2.length() && b2.charAt(a3) == '\"') {
                            int i7 = a3 + 1;
                            int a4 = com.a.a.a.a.e.a(b2, i7, "\"");
                            String substring = b2.substring(i7, a4);
                            i6 = a4 + 1;
                            str = substring;
                        } else {
                            int a5 = com.a.a.a.a.e.a(b2, a3, ",;");
                            String trim2 = b2.substring(a3, a5).trim();
                            i6 = a5;
                            str = trim2;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if ("max-age".equalsIgnoreCase(trim)) {
                        i = com.a.a.a.a.e.b(str, -1);
                    } else if ("s-maxage".equalsIgnoreCase(trim)) {
                        i2 = com.a.a.a.a.e.b(str, -1);
                    } else if ("public".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if ("max-stale".equalsIgnoreCase(trim)) {
                        i3 = com.a.a.a.a.e.b(str, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(trim)) {
                        i4 = com.a.a.a.a.e.b(str, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if ("no-transform".equalsIgnoreCase(trim)) {
                        z6 = true;
                    }
                }
            }
        }
        return new d(z, z2, i, i2, z3, z4, i3, i4, z5, z6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        if (this.e != -1) {
            sb.append("max-age=").append(this.e).append(", ");
        }
        if (this.f != -1) {
            sb.append("s-maxage=").append(this.f).append(", ");
        }
        if (this.g) {
            sb.append("public, ");
        }
        if (this.h) {
            sb.append("must-revalidate, ");
        }
        if (this.i != -1) {
            sb.append("max-stale=").append(this.i).append(", ");
        }
        if (this.j != -1) {
            sb.append("min-fresh=").append(this.j).append(", ");
        }
        if (this.k) {
            sb.append("only-if-cached, ");
        }
        if (this.l) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
