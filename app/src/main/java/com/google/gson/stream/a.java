package com.google.gson.stream;

import com.google.gson.bpkg.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7859a = ")]}'\n".toCharArray();
    private final Reader d;
    private e l;
    private String m;
    private String n;
    private int o;
    private int p;
    private boolean q;
    private final h c = new h();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7860b = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 1;
    private int i = 1;
    private d[] j = new d[32];
    private int k = 0;

    static /* synthetic */ String e(a aVar) {
        aVar.m = null;
        return null;
    }

    static {
        r.f7836a = new b();
    }

    public a(Reader reader) {
        a(d.EMPTY_DOCUMENT);
        this.q = false;
        this.d = reader;
    }

    public void a() {
        a(e.BEGIN_ARRAY);
    }

    public void b() {
        a(e.END_ARRAY);
    }

    public void c() {
        a(e.BEGIN_OBJECT);
    }

    public void d() {
        a(e.END_OBJECT);
    }

    private void a(e eVar) {
        f();
        if (this.l != eVar) {
            throw new IllegalStateException("Expected " + eVar + " but was " + f() + " at line " + q() + " column " + r());
        }
        g();
    }

    public boolean e() {
        f();
        return (this.l == e.END_OBJECT || this.l == e.END_ARRAY) ? false : true;
    }

    public e f() {
        int i = 0;
        if (this.l != null) {
            return this.l;
        }
        switch (this.j[this.k - 1]) {
            case EMPTY_DOCUMENT:
                if (this.f7860b) {
                    c(true);
                    this.f--;
                    if (this.f + f7859a.length <= this.g || a(f7859a.length)) {
                        while (true) {
                            if (i < f7859a.length) {
                                if (this.e[this.f + i] == f7859a[i]) {
                                    i++;
                                }
                            } else {
                                this.f += f7859a.length;
                            }
                        }
                    }
                }
                this.j[this.k - 1] = d.NONEMPTY_DOCUMENT;
                e p = p();
                if (!this.f7860b && this.l != e.BEGIN_ARRAY && this.l != e.BEGIN_OBJECT) {
                    throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.l + " at line " + q() + " column " + r());
                }
                return p;
            case EMPTY_ARRAY:
                return a(true);
            case NONEMPTY_ARRAY:
                return a(false);
            case EMPTY_OBJECT:
                return b(true);
            case DANGLING_NAME:
                switch (c(true)) {
                    case 58:
                        break;
                    case 59:
                    case 60:
                    default:
                        throw a("Expected ':'");
                    case 61:
                        s();
                        if ((this.f < this.g || a(1)) && this.e[this.f] == '>') {
                            this.f++;
                            break;
                        }
                        break;
                }
                this.j[this.k - 1] = d.NONEMPTY_OBJECT;
                return p();
            case NONEMPTY_OBJECT:
                return b(false);
            case NONEMPTY_DOCUMENT:
                if (c(false) == -1) {
                    return e.END_DOCUMENT;
                }
                this.f--;
                if (!this.f7860b) {
                    throw a("Expected EOF");
                }
                return p();
            case CLOSED:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    private e g() {
        f();
        e eVar = this.l;
        this.l = null;
        this.n = null;
        this.m = null;
        return eVar;
    }

    public String h() {
        f();
        if (this.l != e.NAME) {
            throw new IllegalStateException("Expected a name but was " + f() + " at line " + q() + " column " + r());
        }
        String str = this.m;
        g();
        return str;
    }

    public String i() {
        f();
        if (this.l != e.STRING && this.l != e.NUMBER) {
            throw new IllegalStateException("Expected a string but was " + f() + " at line " + q() + " column " + r());
        }
        String str = this.n;
        g();
        return str;
    }

    public boolean j() {
        f();
        if (this.l != e.BOOLEAN) {
            throw new IllegalStateException("Expected a boolean but was " + this.l + " at line " + q() + " column " + r());
        }
        boolean z = this.n == "true";
        g();
        return z;
    }

    public void k() {
        f();
        if (this.l != e.NULL) {
            throw new IllegalStateException("Expected null but was " + this.l + " at line " + q() + " column " + r());
        }
        g();
    }

    public double l() {
        f();
        if (this.l != e.STRING && this.l != e.NUMBER) {
            throw new IllegalStateException("Expected a double but was " + this.l + " at line " + q() + " column " + r());
        }
        double parseDouble = Double.parseDouble(this.n);
        if (parseDouble >= 1.0d && this.n.startsWith("0")) {
            throw new MalformedJsonException("JSON forbids octal prefixes: " + this.n + " at line " + q() + " column " + r());
        }
        if (!this.f7860b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + this.n + " at line " + q() + " column " + r());
        }
        g();
        return parseDouble;
    }

    public long m() {
        long j;
        f();
        if (this.l != e.STRING && this.l != e.NUMBER) {
            throw new IllegalStateException("Expected a long but was " + this.l + " at line " + q() + " column " + r());
        }
        try {
            j = Long.parseLong(this.n);
        } catch (NumberFormatException e) {
            double parseDouble = Double.parseDouble(this.n);
            j = (long) parseDouble;
            if (j != parseDouble) {
                throw new NumberFormatException("Expected a long but was " + this.n + " at line " + q() + " column " + r());
            }
        }
        if (j >= 1 && this.n.startsWith("0")) {
            throw new MalformedJsonException("JSON forbids octal prefixes: " + this.n + " at line " + q() + " column " + r());
        }
        g();
        return j;
    }

    public int n() {
        int i;
        f();
        if (this.l != e.STRING && this.l != e.NUMBER) {
            throw new IllegalStateException("Expected an int but was " + this.l + " at line " + q() + " column " + r());
        }
        try {
            i = Integer.parseInt(this.n);
        } catch (NumberFormatException e) {
            double parseDouble = Double.parseDouble(this.n);
            i = (int) parseDouble;
            if (i != parseDouble) {
                throw new NumberFormatException("Expected an int but was " + this.n + " at line " + q() + " column " + r());
            }
        }
        if (i >= 1 && this.n.startsWith("0")) {
            throw new MalformedJsonException("JSON forbids octal prefixes: " + this.n + " at line " + q() + " column " + r());
        }
        g();
        return i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.n = null;
        this.l = null;
        this.j[0] = d.CLOSED;
        this.k = 1;
        this.d.close();
    }

    public void o() {
        this.q = true;
        int i = 0;
        do {
            try {
                e g = g();
                if (g == e.BEGIN_ARRAY || g == e.BEGIN_OBJECT) {
                    i++;
                } else if (g == e.END_ARRAY || g == e.END_OBJECT) {
                    i--;
                }
            } finally {
                this.q = false;
            }
        } while (i != 0);
    }

    private void a(d dVar) {
        if (this.k == this.j.length) {
            d[] dVarArr = new d[this.k * 2];
            System.arraycopy(this.j, 0, dVarArr, 0, this.k);
            this.j = dVarArr;
        }
        d[] dVarArr2 = this.j;
        int i = this.k;
        this.k = i + 1;
        dVarArr2[i] = dVar;
    }

    private e a(boolean z) {
        if (z) {
            this.j[this.k - 1] = d.NONEMPTY_ARRAY;
        } else {
            switch (c(true)) {
                case 44:
                    break;
                case 59:
                    s();
                    break;
                case 93:
                    this.k--;
                    e eVar = e.END_ARRAY;
                    this.l = eVar;
                    return eVar;
                default:
                    throw a("Unterminated array");
            }
        }
        switch (c(true)) {
            case 44:
            case 59:
                break;
            case 93:
                if (z) {
                    this.k--;
                    e eVar2 = e.END_ARRAY;
                    this.l = eVar2;
                    return eVar2;
                }
                break;
            default:
                this.f--;
                return p();
        }
        s();
        this.f--;
        this.n = "null";
        e eVar3 = e.NULL;
        this.l = eVar3;
        return eVar3;
    }

    private e b(boolean z) {
        if (z) {
            switch (c(true)) {
                case 125:
                    this.k--;
                    e eVar = e.END_OBJECT;
                    this.l = eVar;
                    return eVar;
                default:
                    this.f--;
                    break;
            }
        } else {
            switch (c(true)) {
                case 44:
                case 59:
                    break;
                case 125:
                    this.k--;
                    e eVar2 = e.END_OBJECT;
                    this.l = eVar2;
                    return eVar2;
                default:
                    throw a("Unterminated object");
            }
        }
        int c = c(true);
        switch (c) {
            case 39:
                s();
            case 34:
                this.m = a((char) c);
                this.j[this.k - 1] = d.DANGLING_NAME;
                e eVar3 = e.NAME;
                this.l = eVar3;
                return eVar3;
            default:
                s();
                this.f--;
                this.m = d(false);
                if (this.m.length() == 0) {
                    throw a("Expected name");
                }
                this.j[this.k - 1] = d.DANGLING_NAME;
                e eVar32 = e.NAME;
                this.l = eVar32;
                return eVar32;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.gson.stream.e p() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.p():com.google.gson.stream.e");
    }

    private boolean a(int i) {
        char[] cArr = this.e;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.f;
        for (int i5 = 0; i5 < i4; i5++) {
            if (cArr[i5] == '\n') {
                i2++;
                i3 = 1;
            } else {
                i3++;
            }
        }
        this.h = i2;
        this.i = i3;
        if (this.g != this.f) {
            this.g -= this.f;
            System.arraycopy(cArr, this.f, cArr, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            int read = this.d.read(cArr, this.g, cArr.length - this.g);
            if (read == -1) {
                return false;
            }
            this.g = read + this.g;
            if (this.h == 1 && this.i == 1 && this.g > 0 && cArr[0] == 65279) {
                this.f++;
                this.i--;
            }
        } while (this.g < i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q() {
        int i = this.h;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.e[i2] == '\n') {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r() {
        int i = this.i;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.e[i2] == '\n') {
                i = 1;
            } else {
                i++;
            }
        }
        return i;
    }

    private int c(boolean z) {
        int i;
        boolean z2;
        char[] cArr = this.e;
        int i2 = this.f;
        int i3 = this.g;
        while (true) {
            if (i2 == i3) {
                this.f = i2;
                if (a(1)) {
                    i2 = this.f;
                    i3 = this.g;
                } else {
                    if (z) {
                        throw new EOFException("End of input at line " + q() + " column " + r());
                    }
                    return -1;
                }
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            switch (c) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    i2 = i4;
                    break;
                case '#':
                    this.f = i4;
                    s();
                    t();
                    i2 = this.f;
                    i3 = this.g;
                    break;
                case '/':
                    this.f = i4;
                    if (i4 == i3 && !a(1)) {
                        return c;
                    }
                    s();
                    switch (cArr[this.f]) {
                        case '*':
                            this.f++;
                            while (true) {
                                if (this.f + "*/".length() <= this.g || a("*/".length())) {
                                    for (int i = 0; i < "*/".length(); i++) {
                                        i = this.e[this.f + i] == "*/".charAt(i) ? i + 1 : 0;
                                    }
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.f++;
                            }
                            if (!z2) {
                                throw a("Unterminated comment");
                            }
                            i2 = this.f + 2;
                            i3 = this.g;
                            break;
                        case '/':
                            this.f++;
                            t();
                            i2 = this.f;
                            i3 = this.g;
                            break;
                        default:
                            return c;
                    }
                default:
                    this.f = i4;
                    return c;
            }
        }
    }

    private void s() {
        if (!this.f7860b) {
            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void t() {
        char c;
        do {
            if (this.f < this.g || a(1)) {
                char[] cArr = this.e;
                int i = this.f;
                this.f = i + 1;
                c = cArr[i];
                if (c == '\r') {
                    return;
                }
            } else {
                return;
            }
        } while (c != '\n');
    }

    private String a(char c) {
        int i;
        int i2;
        StringBuilder sb;
        int i3;
        char[] cArr = this.e;
        StringBuilder sb2 = null;
        do {
            int i4 = this.f;
            int i5 = this.g;
            int i6 = i4;
            while (i6 < i5) {
                int i7 = i6 + 1;
                char c2 = cArr[i6];
                if (c2 == c) {
                    this.f = i7;
                    if (this.q) {
                        return "skipped!";
                    }
                    if (sb2 == null) {
                        return this.c.a(cArr, i4, (i7 - i4) - 1);
                    }
                    sb2.append(cArr, i4, (i7 - i4) - 1);
                    return sb2.toString();
                }
                if (c2 == '\\') {
                    this.f = i7;
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(cArr, i4, (i7 - i4) - 1);
                    sb2.append(u());
                    int i8 = this.f;
                    sb = sb2;
                    i3 = i8;
                    i = this.g;
                    i2 = i8;
                } else {
                    int i9 = i4;
                    i = i5;
                    i2 = i7;
                    sb = sb2;
                    i3 = i9;
                }
                i6 = i2;
                i5 = i;
                i4 = i3;
                sb2 = sb;
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(cArr, i4, i6 - i4);
            this.f = i6;
        } while (a(1));
        throw a("Unterminated string");
    }

    private String d(boolean z) {
        String str = null;
        this.o = -1;
        this.p = 0;
        int i = 0;
        StringBuilder sb = null;
        while (true) {
            if (this.f + i < this.g) {
                switch (this.e[this.f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        s();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i < this.e.length) {
                if (!a(i + 1)) {
                    this.e[this.g] = 0;
                }
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.e, this.f, i);
                this.p += i;
                this.f = i + this.f;
                if (a(1)) {
                    i = 0;
                } else {
                    i = 0;
                }
            }
        }
        if (z && sb == null) {
            this.o = this.f;
        } else if (this.q) {
            str = "skipped!";
        } else if (sb == null) {
            str = this.c.a(this.e, this.f, i);
        } else {
            sb.append(this.e, this.f, i);
            str = sb.toString();
        }
        this.p += i;
        this.f += i;
        return str;
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(getClass().getSimpleName()).append(" near ");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(this.f, 20);
        sb.append(this.e, this.f - min, min);
        sb.append(this.e, this.f, Math.min(this.g - this.f, 20));
        return append.append((Object) sb).toString();
    }

    private char u() {
        int i;
        if (this.f == this.g && !a(1)) {
            throw a("Unterminated escape sequence");
        }
        char[] cArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        char c = cArr[i2];
        switch (c) {
            case 'b':
                return '\b';
            case 'f':
                return '\f';
            case 'n':
                return '\n';
            case 'r':
                return '\r';
            case 't':
                return '\t';
            case 'u':
                if (this.f + 4 > this.g && !a(4)) {
                    throw a("Unterminated escape sequence");
                }
                int i3 = this.f;
                int i4 = i3 + 4;
                char c2 = 0;
                for (int i5 = i3; i5 < i4; i5++) {
                    char c3 = this.e[i5];
                    char c4 = (char) (c2 << 4);
                    if (c3 >= '0' && c3 <= '9') {
                        i = c3 - '0';
                    } else if (c3 >= 'a' && c3 <= 'f') {
                        i = (c3 - 'a') + 10;
                    } else if (c3 >= 'A' && c3 <= 'F') {
                        i = (c3 - 'A') + 10;
                    } else {
                        throw new NumberFormatException("\\u" + this.c.a(this.e, this.f, 4));
                    }
                    c2 = (char) (c4 + i);
                }
                this.f += 4;
                return c2;
            default:
                return c;
        }
    }

    private IOException a(String str) {
        throw new MalformedJsonException(str + " at line " + q() + " column " + r());
    }
}
