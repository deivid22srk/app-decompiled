package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class y {
    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.google.gson.stream.f fVar = new com.google.gson.stream.f(stringWriter);
            fVar.e = true;
            com.google.gson.bpkg.v.a(this, fVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final ab g() {
        if (this instanceof ab) {
            return (ab) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }
}
