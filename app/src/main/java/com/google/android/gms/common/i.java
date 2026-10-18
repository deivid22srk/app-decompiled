package com.google.android.gms.common;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private int f5677a;

    protected i(byte[] bArr) {
        com.google.android.gms.common.internal.av.b(bArr.length == 25, "cert hash data has incorrect length");
        this.f5677a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    abstract byte[] a();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        return Arrays.equals(a(), ((i) obj).a());
    }

    public int hashCode() {
        return this.f5677a;
    }
}
