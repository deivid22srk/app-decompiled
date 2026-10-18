package com.android.a.a;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    Set<e> f1059a;

    /* renamed from: b, reason: collision with root package name */
    Set<e> f1060b;
    Map<String, String> c;
    String[] d;
    String[] e;
    String[] f;
    Pattern g;
    Pattern h;
    private String i;
    private ac j;

    public ad(ac acVar) {
        this.j = acVar;
        this.i = "data";
        k b2 = this.j.b("data");
        if (b2.a(d.COUNTRIES)) {
            this.d = b2.b(d.COUNTRIES).split("~");
        }
        this.c = be.a(this.d, null, null);
        k b3 = this.j.b("data/ZZ");
        this.f1059a = new HashSet();
        if (b3.a(d.FMT)) {
            this.f1059a = b(b3.b(d.FMT));
        }
        this.f1060b = new HashSet();
        if (!b3.a(d.REQUIRE)) {
            return;
        }
        this.f1060b = c(b3.b(d.REQUIRE));
    }

    private ad(ad adVar, k kVar) {
        this.f1059a = adVar.f1059a;
        this.f1060b = adVar.f1060b;
        this.j = adVar.j;
        this.g = adVar.g;
        this.h = adVar.h;
        if (kVar != null) {
            if (kVar.a(d.ID)) {
                this.i = kVar.b(d.ID);
            }
            if (kVar.a(d.SUB_KEYS)) {
                this.d = kVar.b(d.SUB_KEYS).split("~");
            }
            if (kVar.a(d.SUB_LNAMES)) {
                this.e = kVar.b(d.SUB_LNAMES).split("~");
            }
            if (kVar.a(d.SUB_NAMES)) {
                this.f = kVar.b(d.SUB_NAMES).split("~");
            }
            if (kVar.a(d.FMT)) {
                this.f1059a = b(kVar.b(d.FMT));
            }
            if (kVar.a(d.REQUIRE)) {
                this.f1060b = c(kVar.b(d.REQUIRE));
            }
            if (kVar.a(d.XZIP)) {
                this.g = Pattern.compile(kVar.b(d.XZIP), 2);
            }
            if (kVar.a(d.ZIP)) {
                be.a(this.i, "Cannot use null as key");
                if (this.i.split("/").length == 2) {
                    this.g = Pattern.compile(kVar.b(d.ZIP), 2);
                } else {
                    this.h = Pattern.compile(kVar.b(d.ZIP), 2);
                }
            }
            if (this.d != null && this.f == null && this.e != null && this.d.length == this.e.length) {
                this.f = this.d;
            }
        }
        this.c = be.a(this.d, this.f, this.e);
    }

    final ad a(String str) {
        if (be.c(str) == null) {
            return new ad(this, null);
        }
        k a2 = this.j.a(this.i + "/" + str);
        if (a2 != null) {
            return new ad(this, a2);
        }
        if (this.e == null) {
            return new ad(this, null);
        }
        for (int i = 0; i < this.e.length; i++) {
            if (this.e[i].equalsIgnoreCase(str)) {
                k a3 = this.j.a(this.i + "/" + this.f[i]);
                if (a3 != null) {
                    return new ad(this, a3);
                }
            }
        }
        return new ad(this, null);
    }

    public final String toString() {
        return this.i;
    }

    private static Set<e> b(String str) {
        EnumSet of = EnumSet.of(e.COUNTRY);
        boolean z = false;
        for (char c : str.toCharArray()) {
            if (z) {
                if (c != 'n') {
                    e a2 = e.a(c);
                    if (a2 == null) {
                        throw new RuntimeException("Unrecognized character '" + c + "' in format pattern: " + str);
                    }
                    of.add(a2);
                    z = false;
                } else {
                    z = false;
                }
            } else if (c == '%') {
                z = true;
            }
        }
        of.remove(e.ADDRESS_LINE_1);
        of.remove(e.ADDRESS_LINE_2);
        return of;
    }

    private static Set<e> c(String str) {
        EnumSet of = EnumSet.of(e.COUNTRY);
        for (char c : str.toCharArray()) {
            e a2 = e.a(c);
            if (a2 == null) {
                throw new RuntimeException("Unrecognized character '" + c + "' in require pattern: " + str);
            }
            of.add(a2);
        }
        of.remove(e.ADDRESS_LINE_1);
        of.remove(e.ADDRESS_LINE_2);
        return of;
    }
}
