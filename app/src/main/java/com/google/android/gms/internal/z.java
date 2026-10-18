package com.google.android.gms.internal;

import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f6259a;
    private int c;
    private int d;
    private int f;
    private int h;
    private int g = Integer.MAX_VALUE;
    private int i = 64;
    private int j = 67108864;

    /* renamed from: b, reason: collision with root package name */
    int f6260b = 0;
    private int e = 0;

    private z(byte[] bArr, int i) {
        this.f6259a = bArr;
        this.c = i + 0;
    }

    public static z a(byte[] bArr, int i) {
        return new z(bArr, i);
    }

    private byte[] f(int i) {
        if (i < 0) {
            throw zzaij.b();
        }
        if (this.e + i > this.g) {
            g(this.g - this.e);
            throw zzaij.a();
        }
        if (i > this.c - this.e) {
            throw zzaij.a();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6259a, this.e, bArr, 0, i);
        this.e += i;
        return bArr;
    }

    private void g(int i) {
        if (i < 0) {
            throw zzaij.b();
        }
        if (this.e + i > this.g) {
            g(this.g - this.e);
            throw zzaij.a();
        }
        if (i > this.c - this.e) {
            throw zzaij.a();
        }
        this.e += i;
    }

    private void k() {
        this.c += this.d;
        int i = this.c;
        if (i <= this.g) {
            this.d = 0;
        } else {
            this.d = i - this.g;
            this.c -= this.d;
        }
    }

    private byte l() {
        if (this.e == this.c) {
            throw zzaij.a();
        }
        byte[] bArr = this.f6259a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }

    public final void a(int i) {
        if (this.f != i) {
            throw zzaij.e();
        }
    }

    public final void a(af afVar) {
        int e = e();
        if (this.h >= this.i) {
            throw zzaij.g();
        }
        int c = c(e);
        this.h++;
        afVar.a(this);
        a(0);
        this.h--;
        d(c);
    }

    public final boolean b() {
        return e() != 0;
    }

    public final int c(int i) {
        if (i < 0) {
            throw zzaij.b();
        }
        int i2 = this.e + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw zzaij.a();
        }
        this.g = i2;
        k();
        return i3;
    }

    public final String c() {
        int e = e();
        if (e > this.c - this.e || e <= 0) {
            return new String(f(e), Keyczar.DEFAULT_ENCODING);
        }
        String str = new String(this.f6259a, this.e, e, Keyczar.DEFAULT_ENCODING);
        this.e = e + this.e;
        return str;
    }

    public final void d(int i) {
        this.g = i;
        k();
    }

    public final byte[] d() {
        int e = e();
        if (e > this.c - this.e || e <= 0) {
            return e == 0 ? ai.h : f(e);
        }
        byte[] bArr = new byte[e];
        System.arraycopy(this.f6259a, this.e, bArr, 0, e);
        this.e = e + this.e;
        return bArr;
    }

    public final int e() {
        byte l = l();
        if (l >= 0) {
            return l;
        }
        int i = l & Byte.MAX_VALUE;
        byte l2 = l();
        if (l2 >= 0) {
            return i | (l2 << 7);
        }
        int i2 = i | ((l2 & Byte.MAX_VALUE) << 7);
        byte l3 = l();
        if (l3 >= 0) {
            return i2 | (l3 << 14);
        }
        int i3 = i2 | ((l3 & Byte.MAX_VALUE) << 14);
        byte l4 = l();
        if (l4 >= 0) {
            return i3 | (l4 << 21);
        }
        int i4 = i3 | ((l4 & Byte.MAX_VALUE) << 21);
        byte l5 = l();
        int i5 = i4 | (l5 << 28);
        if (l5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (l() >= 0) {
                return i5;
            }
        }
        throw zzaij.c();
    }

    public final void e(int i) {
        if (i > this.e - this.f6260b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.f6260b));
        }
        if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        }
        this.e = this.f6260b + i;
    }

    public final long f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((l() & 128) == 0) {
                return j;
            }
        }
        throw zzaij.c();
    }

    public final int g() {
        return (l() & 255) | ((l() & 255) << 8) | ((l() & 255) << 16) | ((l() & 255) << 24);
    }

    public final long h() {
        return ((l() & 255) << 8) | (l() & 255) | ((l() & 255) << 16) | ((l() & 255) << 24) | ((l() & 255) << 32) | ((l() & 255) << 40) | ((l() & 255) << 48) | ((l() & 255) << 56);
    }

    public final int i() {
        if (this.g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.g - this.e;
    }

    public final int j() {
        return this.e - this.f6260b;
    }

    public final int a() {
        if (this.e == this.c) {
            this.f = 0;
            return 0;
        }
        this.f = e();
        if (this.f == 0) {
            throw zzaij.d();
        }
        return this.f;
    }

    public final boolean b(int i) {
        int a2;
        switch (ai.a(i)) {
            case 0:
                e();
                return true;
            case 1:
                h();
                return true;
            case 2:
                g(e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                g();
                return true;
            default:
                throw zzaij.f();
        }
        do {
            a2 = a();
            if (a2 != 0) {
            }
            a(ai.a(ai.b(i), 4));
            return true;
        } while (b(a2));
        a(ai.a(ai.b(i), 4));
        return true;
    }
}
