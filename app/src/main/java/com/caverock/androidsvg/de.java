package com.caverock.androidsvg;

import java.util.Locale;

/* loaded from: classes.dex */
public class de {

    /* renamed from: a, reason: collision with root package name */
    protected String f1368a;
    protected int c;

    /* renamed from: b, reason: collision with root package name */
    protected int f1369b = 0;
    private m d = new m();

    public de(String str) {
        this.c = 0;
        this.f1368a = str.trim();
        this.c = this.f1368a.length();
    }

    public final boolean c() {
        return this.f1369b == this.c;
    }

    protected static boolean a(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final void d() {
        while (this.f1369b < this.c && a((int) this.f1368a.charAt(this.f1369b))) {
            this.f1369b++;
        }
    }

    public final boolean e() {
        d();
        if (this.f1369b == this.c || this.f1368a.charAt(this.f1369b) != ',') {
            return false;
        }
        this.f1369b++;
        d();
        return true;
    }

    public final float f() {
        float a2 = this.d.a(this.f1368a, this.f1369b, this.c);
        if (!Float.isNaN(a2)) {
            this.f1369b = this.d.f1384a;
        }
        return a2;
    }

    public final float g() {
        e();
        float a2 = this.d.a(this.f1368a, this.f1369b, this.c);
        if (!Float.isNaN(a2)) {
            this.f1369b = this.d.f1384a;
        }
        return a2;
    }

    public final float a(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        e();
        return f();
    }

    public final Integer h() {
        if (this.f1369b == this.c) {
            return null;
        }
        String str = this.f1368a;
        int i = this.f1369b;
        this.f1369b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public final ag i() {
        float f = f();
        if (Float.isNaN(f)) {
            return null;
        }
        cd n = n();
        if (n == null) {
            return new ag(f, cd.px);
        }
        return new ag(f, n);
    }

    public final Boolean a(Object obj) {
        if (obj == null) {
            return null;
        }
        e();
        if (this.f1369b == this.c) {
            return null;
        }
        char charAt = this.f1368a.charAt(this.f1369b);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.f1369b++;
        return Boolean.valueOf(charAt == '1');
    }

    public final boolean a(char c) {
        boolean z = this.f1369b < this.c && this.f1368a.charAt(this.f1369b) == c;
        if (z) {
            this.f1369b++;
        }
        return z;
    }

    public final boolean a(String str) {
        int length = str.length();
        boolean z = this.f1369b <= this.c - length && this.f1368a.substring(this.f1369b, this.f1369b + length).equals(str);
        if (z) {
            this.f1369b = length + this.f1369b;
        }
        return z;
    }

    protected final int j() {
        if (this.f1369b == this.c) {
            return -1;
        }
        this.f1369b++;
        if (this.f1369b < this.c) {
            return this.f1368a.charAt(this.f1369b);
        }
        return -1;
    }

    public final String k() {
        return b(' ');
    }

    public final String b(char c) {
        if (c()) {
            return null;
        }
        char charAt = this.f1368a.charAt(this.f1369b);
        if (a((int) charAt) || charAt == c) {
            return null;
        }
        int i = this.f1369b;
        int j = j();
        while (j != -1 && j != c && !a(j)) {
            j = j();
        }
        return this.f1368a.substring(i, this.f1369b);
    }

    public final String l() {
        if (c()) {
            return null;
        }
        int i = this.f1369b;
        int charAt = this.f1368a.charAt(this.f1369b);
        while (true) {
            if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                break;
            }
            charAt = j();
        }
        int i2 = this.f1369b;
        while (a(charAt)) {
            charAt = j();
        }
        if (charAt == 40) {
            this.f1369b++;
            return this.f1368a.substring(i, i2);
        }
        this.f1369b = i;
        return null;
    }

    public final String m() {
        int i = this.f1369b;
        while (!c() && !a((int) this.f1368a.charAt(this.f1369b))) {
            this.f1369b++;
        }
        String substring = this.f1368a.substring(i, this.f1369b);
        this.f1369b = i;
        return substring;
    }

    public final cd n() {
        if (c()) {
            return null;
        }
        if (this.f1368a.charAt(this.f1369b) == '%') {
            this.f1369b++;
            return cd.percent;
        }
        if (this.f1369b > this.c - 2) {
            return null;
        }
        try {
            cd valueOf = cd.valueOf(this.f1368a.substring(this.f1369b, this.f1369b + 2).toLowerCase(Locale.US));
            this.f1369b += 2;
            return valueOf;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public final boolean o() {
        if (this.f1369b == this.c) {
            return false;
        }
        char charAt = this.f1368a.charAt(this.f1369b);
        return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
    }

    public final String p() {
        int j;
        if (c()) {
            return null;
        }
        int i = this.f1369b;
        char charAt = this.f1368a.charAt(this.f1369b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        do {
            j = j();
            if (j == -1) {
                break;
            }
        } while (j != charAt);
        if (j == -1) {
            this.f1369b = i;
            return null;
        }
        this.f1369b++;
        return this.f1368a.substring(i + 1, this.f1369b - 1);
    }

    public final String q() {
        if (c()) {
            return null;
        }
        int i = this.f1369b;
        this.f1369b = this.c;
        return this.f1368a.substring(i);
    }
}
