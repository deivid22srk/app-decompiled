package com.a.a.apkg.cpkg;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f986b;
    int c;
    int d;
    int e;
    int f;
    char[] g;

    public a(X500Principal x500Principal) {
        this.f985a = x500Principal.getName("RFC2253");
        this.f986b = this.f985a.length();
    }

    public final String a() {
        while (this.c < this.f986b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.c == this.f986b) {
            return null;
        }
        this.d = this.c;
        this.c++;
        while (this.c < this.f986b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            this.c++;
        }
        if (this.c >= this.f986b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.f986b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                this.c++;
            }
            if (this.g[this.c] != '=' || this.c == this.f986b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
            }
        }
        do {
            this.c++;
            if (this.c >= this.f986b) {
                break;
            }
        } while (this.g[this.c] == ' ');
        if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && ((this.g[this.d] == 'O' || this.g[this.d] == 'o') && ((this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')))) {
            this.d += 4;
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    public final String b() {
        int i;
        if (this.c + 4 >= this.f986b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
        }
        this.d = this.c;
        this.c++;
        while (this.c != this.f986b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
            if (this.g[this.c] == ' ') {
                this.e = this.c;
                this.c++;
                while (this.c < this.f986b && this.g[this.c] == ' ') {
                    this.c++;
                }
                i = this.e - this.d;
                if (i >= 5 || (i & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
                }
                byte[] bArr = new byte[i / 2];
                int i2 = this.d + 1;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) a(i2);
                    i2 += 2;
                }
                return new String(this.g, this.d, i);
            }
            if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                char[] cArr = this.g;
                int i4 = this.c;
                cArr[i4] = (char) (cArr[i4] + ' ');
            }
            this.c++;
        }
        this.e = this.c;
        i = this.e - this.d;
        if (i >= 5) {
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
    }

    public final String c() {
        this.d = this.c;
        this.e = this.c;
        while (this.c < this.f986b) {
            switch (this.g[this.c]) {
                case ' ':
                    this.f = this.e;
                    this.c++;
                    char[] cArr = this.g;
                    int i = this.e;
                    this.e = i + 1;
                    cArr[i] = ' ';
                    while (this.c < this.f986b && this.g[this.c] == ' ') {
                        char[] cArr2 = this.g;
                        int i2 = this.e;
                        this.e = i2 + 1;
                        cArr2[i2] = ' ';
                        this.c++;
                    }
                    if (this.c != this.f986b && this.g[this.c] != ',' && this.g[this.c] != '+' && this.g[this.c] != ';') {
                        break;
                    } else {
                        return new String(this.g, this.d, this.f - this.d);
                    }
                case '+':
                case ',':
                case ';':
                    return new String(this.g, this.d, this.e - this.d);
                case '\\':
                    char[] cArr3 = this.g;
                    int i3 = this.e;
                    this.e = i3 + 1;
                    cArr3[i3] = d();
                    this.c++;
                    break;
                default:
                    char[] cArr4 = this.g;
                    int i4 = this.e;
                    this.e = i4 + 1;
                    cArr4[i4] = this.g[this.c];
                    this.c++;
                    break;
            }
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    public final char d() {
        this.c++;
        if (this.c == this.f986b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f985a);
        }
        switch (this.g[this.c]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
                return this.g[this.c];
            default:
                return e();
        }
    }

    public char e() {
        int i;
        int i2;
        int a2 = a(this.c);
        this.c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i = 1;
            i2 = a2 & 31;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        int i3 = i2;
        for (int i4 = 0; i4 < i; i4++) {
            this.c++;
            if (this.c == this.f986b || this.g[this.c] != '\\') {
                return '?';
            }
            this.c++;
            int a3 = a(this.c);
            this.c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (a3 & 63);
        }
        return (char) i3;
    }

    public int a(int i) {
        int i2;
        int i3;
        if (i + 1 >= this.f986b) {
            throw new IllegalStateException("Malformed DN: " + this.f985a);
        }
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c >= 'A' && c <= 'F') {
            i2 = c - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.f985a);
        }
        char c2 = this.g[i + 1];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 >= 'A' && c2 <= 'F') {
            i3 = c2 - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.f985a);
        }
        return (i2 << 4) + i3;
    }
}
