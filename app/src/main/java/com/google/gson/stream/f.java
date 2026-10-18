package com.google.gson.stream;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Writer f7866a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f7867b = new ArrayList();
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    private String h;

    public f(Writer writer) {
        this.f7867b.add(d.EMPTY_DOCUMENT);
        this.d = ":";
        this.g = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f7866a = writer;
    }

    public f a() {
        g();
        return a(d.EMPTY_ARRAY, "[");
    }

    public f b() {
        return a(d.EMPTY_ARRAY, d.NONEMPTY_ARRAY, "]");
    }

    public f c() {
        g();
        return a(d.EMPTY_OBJECT, "{");
    }

    public f d() {
        return a(d.EMPTY_OBJECT, d.NONEMPTY_OBJECT, "}");
    }

    private f a(d dVar, String str) {
        b(true);
        this.f7867b.add(dVar);
        this.f7866a.write(str);
        return this;
    }

    private f a(d dVar, d dVar2, String str) {
        d f = f();
        if (f != dVar2 && f != dVar) {
            throw new IllegalStateException("Nesting problem: " + this.f7867b);
        }
        if (this.h != null) {
            throw new IllegalStateException("Dangling name: " + this.h);
        }
        this.f7867b.remove(this.f7867b.size() - 1);
        if (f == dVar2) {
            h();
        }
        this.f7866a.write(str);
        return this;
    }

    private d f() {
        return this.f7867b.get(this.f7867b.size() - 1);
    }

    private void a(d dVar) {
        this.f7867b.set(this.f7867b.size() - 1, dVar);
    }

    public f a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.h != null) {
            throw new IllegalStateException();
        }
        this.h = str;
        return this;
    }

    private void g() {
        if (this.h == null) {
            return;
        }
        d f = f();
        if (f == d.NONEMPTY_OBJECT) {
            this.f7866a.write(44);
        } else if (f != d.EMPTY_OBJECT) {
            throw new IllegalStateException("Nesting problem: " + this.f7867b);
        }
        h();
        a(d.DANGLING_NAME);
        c(this.h);
        this.h = null;
    }

    public f b(String str) {
        if (str == null) {
            return e();
        }
        g();
        b(false);
        c(str);
        return this;
    }

    public f e() {
        if (this.h != null) {
            if (this.g) {
                g();
            } else {
                this.h = null;
                return this;
            }
        }
        b(false);
        this.f7866a.write("null");
        return this;
    }

    public f a(boolean z) {
        g();
        b(false);
        this.f7866a.write(z ? "true" : "false");
        return this;
    }

    public f a(long j) {
        g();
        b(false);
        this.f7866a.write(Long.toString(j));
        return this;
    }

    public f a(Number number) {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (!this.e && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b(false);
        this.f7866a.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7866a.close();
        if (f() != d.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    private void c(String str) {
        this.f7866a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\b':
                    this.f7866a.write("\\b");
                    continue;
                case '\t':
                    this.f7866a.write("\\t");
                    continue;
                case '\n':
                    this.f7866a.write("\\n");
                    continue;
                case '\f':
                    this.f7866a.write("\\f");
                    continue;
                case '\r':
                    this.f7866a.write("\\r");
                    continue;
                case '\"':
                case '\\':
                    this.f7866a.write(92);
                    break;
                case '&':
                case '\'':
                case '<':
                case '=':
                case '>':
                    if (this.f) {
                        this.f7866a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                        continue;
                    } else {
                        this.f7866a.write(charAt);
                        break;
                    }
                case 8232:
                case 8233:
                    this.f7866a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                    continue;
                default:
                    if (charAt <= 31) {
                        this.f7866a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                        break;
                    }
                    break;
            }
            this.f7866a.write(charAt);
        }
        this.f7866a.write("\"");
    }

    private void h() {
        if (this.c != null) {
            this.f7866a.write("\n");
            for (int i = 1; i < this.f7867b.size(); i++) {
                this.f7866a.write(this.c);
            }
        }
    }

    private void b(boolean z) {
        switch (f()) {
            case EMPTY_DOCUMENT:
                if (!this.e && !z) {
                    throw new IllegalStateException("JSON must start with an array or an object.");
                }
                a(d.NONEMPTY_DOCUMENT);
                return;
            case EMPTY_ARRAY:
                a(d.NONEMPTY_ARRAY);
                h();
                return;
            case NONEMPTY_ARRAY:
                this.f7866a.append(',');
                h();
                return;
            case DANGLING_NAME:
                this.f7866a.append((CharSequence) this.d);
                a(d.NONEMPTY_OBJECT);
                return;
            case NONEMPTY_DOCUMENT:
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem: " + this.f7867b);
        }
    }
}
