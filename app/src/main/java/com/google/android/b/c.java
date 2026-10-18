package com.google.android.b;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.ZipException;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f1416a;

    /* renamed from: b, reason: collision with root package name */
    long f1417b;
    long c;
    int d;
    int e;
    long f;
    public int g;

    public final String toString() {
        return this.f1416a;
    }

    public final int hashCode() {
        return this.f1416a.hashCode();
    }

    c(byte[] bArr, InputStream inputStream) {
        this.f1417b = -1L;
        this.c = -1L;
        this.d = -1;
        this.e = -1;
        this.f = -1L;
        b.a(inputStream, bArr, 0, 46);
        a aVar = new a(bArr);
        int a2 = aVar.a();
        if (a2 != 33639248) {
            d.a("Central Directory Entry", a2);
        }
        aVar.f1414a = 8;
        int b2 = aVar.b() & 65535;
        if ((b2 & 1) != 0) {
            throw new ZipException("Invalid General Purpose Bit Flag: " + b2);
        }
        this.d = aVar.b() & 65535;
        aVar.b();
        aVar.b();
        aVar.a();
        this.f1417b = aVar.a() & 4294967295L;
        this.c = aVar.a() & 4294967295L;
        this.e = aVar.b() & 65535;
        int b3 = aVar.b() & 65535;
        int b4 = aVar.b() & 65535;
        if (b3 >= 32768) {
            this.g |= 1;
        }
        if (b4 >= 32768) {
            this.g |= 2;
        }
        aVar.f1414a = 42;
        this.f = aVar.a() & 4294967295L;
        byte[] bArr2 = new byte[this.e];
        b.a(inputStream, bArr2, 0, bArr2.length);
        if (a(bArr2)) {
            this.g |= 16;
        }
        try {
            this.f1416a = new String(bArr2, 0, bArr2.length, Keyczar.DEFAULT_ENCODING);
            if (b3 > 0) {
                b.a(inputStream, b3);
            }
            if (b4 > 0) {
                b.a(inputStream, b4);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(byte[] bArr) {
        for (byte b2 : bArr) {
            if (b2 == 0) {
                return true;
            }
        }
        return false;
    }
}
