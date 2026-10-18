package com.a.a;

/* loaded from: classes.dex */
public abstract class ad {
    public abstract x a();

    public abstract void a(a.h hVar);

    public long b() {
        return -1L;
    }

    public static ad a(x xVar, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        return new ae(xVar, bArr);
    }
}
