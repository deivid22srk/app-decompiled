package a;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class f implements h, i, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    v f9a;

    /* renamed from: b, reason: collision with root package name */
    public long f10b;

    @Override // a.h
    public final /* bridge */ /* synthetic */ h q() {
        return this;
    }

    @Override // a.h, a.i
    public final f c() {
        return this;
    }

    @Override // a.h
    public final h d() {
        return this;
    }

    @Override // a.i
    public final boolean e() {
        return this.f10b == 0;
    }

    @Override // a.i
    public final void a(long j) {
        if (this.f10b < j) {
            throw new EOFException();
        }
    }

    @Override // a.i
    public final InputStream f() {
        return new g(this);
    }

    public final f a(OutputStream outputStream, long j, long j2) {
        ab.a(this.f10b, 0L, j2);
        if (j2 != 0) {
            v vVar = this.f9a;
            while (j >= vVar.c - vVar.f33b) {
                j -= vVar.c - vVar.f33b;
                vVar = vVar.d;
            }
            while (j2 > 0) {
                int min = (int) Math.min(vVar.c - r1, j2);
                outputStream.write(vVar.f32a, (int) (vVar.f33b + j), min);
                j2 -= min;
                vVar = vVar.d;
                j = 0;
            }
        }
        return this;
    }

    public final f a(f fVar, long j, long j2) {
        if (fVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        ab.a(this.f10b, j, j2);
        if (j2 != 0) {
            v vVar = this.f9a;
            v d = fVar.d(1);
            fVar.f10b += j2;
            long j3 = j;
            while (j2 > 0) {
                while (j3 >= vVar.c - vVar.f33b) {
                    j3 -= vVar.c - vVar.f33b;
                    vVar = vVar.d;
                }
                if (d.c == 2048) {
                    d = d.a(w.f34a.a());
                }
                int min = (int) Math.min(Math.min(vVar.c - (vVar.f33b + j3), j2), 2048 - d.c);
                System.arraycopy(vVar.f32a, vVar.f33b + ((int) j3), d.f32a, d.c, min);
                j3 += min;
                d.c += min;
                j2 -= min;
            }
        }
        return this;
    }

    public final f a(OutputStream outputStream, long j) {
        v vVar;
        ab.a(this.f10b, 0L, j);
        v vVar2 = this.f9a;
        while (j > 0) {
            int min = (int) Math.min(j, vVar2.c - vVar2.f33b);
            outputStream.write(vVar2.f32a, vVar2.f33b, min);
            vVar2.f33b += min;
            this.f10b -= min;
            j -= min;
            if (vVar2.f33b == vVar2.c) {
                vVar = vVar2.a();
                this.f9a = vVar;
                w.f34a.a(vVar2);
            } else {
                vVar = vVar2;
            }
            vVar2 = vVar;
        }
        return this;
    }

    @Override // a.i
    public final byte g() {
        if (this.f10b == 0) {
            throw new IllegalStateException("size == 0");
        }
        v vVar = this.f9a;
        int i = vVar.f33b;
        int i2 = vVar.c;
        int i3 = i + 1;
        byte b2 = vVar.f32a[i];
        this.f10b--;
        if (i3 == i2) {
            this.f9a = vVar.a();
            w.f34a.a(vVar);
        } else {
            vVar.f33b = i3;
        }
        return b2;
    }

    public final byte b(long j) {
        ab.a(this.f10b, j, 1L);
        v vVar = this.f9a;
        while (true) {
            int i = vVar.c - vVar.f33b;
            if (j < i) {
                return vVar.f32a[vVar.f33b + ((int) j)];
            }
            j -= i;
            vVar = vVar.d;
        }
    }

    @Override // a.i
    public final short h() {
        if (this.f10b < 2) {
            throw new IllegalStateException("size < 2: " + this.f10b);
        }
        v vVar = this.f9a;
        int i = vVar.f33b;
        int i2 = vVar.c;
        if (i2 - i < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        byte[] bArr = vVar.f32a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f10b -= 2;
        if (i4 == i2) {
            this.f9a = vVar.a();
            w.f34a.a(vVar);
        } else {
            vVar.f33b = i4;
        }
        return (short) i5;
    }

    @Override // a.i
    public final int i() {
        if (this.f10b < 4) {
            throw new IllegalStateException("size < 4: " + this.f10b);
        }
        v vVar = this.f9a;
        int i = vVar.f33b;
        int i2 = vVar.c;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = vVar.f32a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f10b -= 4;
        if (i8 == i2) {
            this.f9a = vVar.a();
            w.f34a.a(vVar);
            return i9;
        }
        vVar.f33b = i8;
        return i9;
    }

    @Override // a.i
    public final short j() {
        return ab.a(h());
    }

    @Override // a.i
    public final int k() {
        return ab.a(i());
    }

    public final j l() {
        return new j(n());
    }

    @Override // a.i
    public final j c(long j) {
        return new j(e(j));
    }

    private String g(long j) {
        Charset charset = ab.f3a;
        ab.a(this.f10b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        v vVar = this.f9a;
        if (vVar.f33b + j > vVar.c) {
            return new String(e(j), charset);
        }
        String str = new String(vVar.f32a, vVar.f33b, (int) j, charset);
        vVar.f33b = (int) (vVar.f33b + j);
        this.f10b -= j;
        if (vVar.f33b != vVar.c) {
            return str;
        }
        this.f9a = vVar.a();
        w.f34a.a(vVar);
        return str;
    }

    final String d(long j) {
        if (j > 0 && b(j - 1) == 13) {
            String g = g(j - 1);
            f(2L);
            return g;
        }
        String g2 = g(j);
        f(1L);
        return g2;
    }

    public final byte[] n() {
        try {
            return e(this.f10b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // a.i
    public final byte[] e(long j) {
        ab.a(this.f10b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        c(bArr);
        return bArr;
    }

    private void c(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        ab.a(bArr.length, i, i2);
        v vVar = this.f9a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.c - vVar.f33b);
        System.arraycopy(vVar.f32a, vVar.f33b, bArr, i, min);
        vVar.f33b += min;
        this.f10b -= min;
        if (vVar.f33b == vVar.c) {
            this.f9a = vVar.a();
            w.f34a.a(vVar);
            return min;
        }
        return min;
    }

    public final void o() {
        try {
            f(this.f10b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // a.i
    public final void f(long j) {
        while (j > 0) {
            if (this.f9a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.f9a.c - this.f9a.f33b);
            this.f10b -= min;
            j -= min;
            v vVar = this.f9a;
            vVar.f33b = min + vVar.f33b;
            if (this.f9a.f33b == this.f9a.c) {
                v vVar2 = this.f9a;
                this.f9a = vVar2.a();
                w.f34a.a(vVar2);
            }
        }
    }

    @Override // a.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f b(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        return c(jVar.f13b, 0, jVar.f13b.length);
    }

    @Override // a.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                v d = d(1);
                byte[] bArr = d.f32a;
                int i2 = d.c - i;
                int min = Math.min(length, 2048 - i2);
                int i3 = i + 1;
                bArr[i + i2] = (byte) charAt;
                while (i3 < min) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i3 + i2] = (byte) charAt2;
                    i3++;
                }
                int i4 = (i3 + i2) - d.c;
                d.c += i4;
                this.f10b += i4;
                i = i3;
            } else if (charAt < 2048) {
                g((charAt >> 6) | 192);
                g((charAt & '?') | 128);
                i++;
            } else if (charAt < 55296 || charAt > 57343) {
                g((charAt >> '\f') | 224);
                g(((charAt >> 6) & 63) | 128);
                g((charAt & '?') | 128);
                i++;
            } else {
                char charAt3 = i + 1 < length ? str.charAt(i + 1) : (char) 0;
                if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                    g(63);
                    i++;
                } else {
                    int i5 = ((charAt3 & 9215) | ((charAt & 10239) << 10)) + 65536;
                    g((i5 >> 18) | 240);
                    g(((i5 >> 12) & 63) | 128);
                    g(((i5 >> 6) & 63) | 128);
                    g((i5 & 63) | 128);
                    i += 2;
                }
            }
        }
        return this;
    }

    @Override // a.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    @Override // a.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        ab.a(bArr.length, i, i2);
        int i3 = i + i2;
        while (i < i3) {
            v d = d(1);
            int min = Math.min(i3 - i, 2048 - d.c);
            System.arraycopy(bArr, i, d.f32a, d.c, min);
            i += min;
            d.c = min + d.c;
        }
        this.f10b += i2;
        return this;
    }

    @Override // a.h
    public final long a(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a2 = yVar.a(this, 2048L);
            if (a2 != -1) {
                j += a2;
            } else {
                return j;
            }
        }
    }

    @Override // a.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f g(int i) {
        v d = d(1);
        byte[] bArr = d.f32a;
        int i2 = d.c;
        d.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f10b++;
        return this;
    }

    @Override // a.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f f(int i) {
        v d = d(2);
        byte[] bArr = d.f32a;
        int i2 = d.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        d.c = i3 + 1;
        this.f10b += 2;
        return this;
    }

    @Override // a.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f e(int i) {
        v d = d(4);
        byte[] bArr = d.f32a;
        int i2 = d.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        d.c = i5 + 1;
        this.f10b += 4;
        return this;
    }

    final v d(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        if (this.f9a == null) {
            this.f9a = w.f34a.a();
            v vVar = this.f9a;
            v vVar2 = this.f9a;
            v vVar3 = this.f9a;
            vVar2.e = vVar3;
            vVar.d = vVar3;
            return vVar3;
        }
        v vVar4 = this.f9a.e;
        if (vVar4.c + i > 2048) {
            return vVar4.a(w.f34a.a());
        }
        return vVar4;
    }

    @Override // a.x
    public final void a_(f fVar, long j) {
        v vVar;
        if (fVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        ab.a(fVar.f10b, 0L, j);
        while (j > 0) {
            if (j < fVar.f9a.c - fVar.f9a.f33b) {
                v vVar2 = this.f9a != null ? this.f9a.e : null;
                if (vVar2 == null || (vVar2.c - vVar2.f33b) + j > 2048) {
                    v vVar3 = fVar.f9a;
                    int i = (int) j;
                    int i2 = (vVar3.c - vVar3.f33b) - i;
                    if (i <= 0 || i2 <= 0) {
                        throw new IllegalArgumentException();
                    }
                    if (i < i2) {
                        vVar = w.f34a.a();
                        System.arraycopy(vVar3.f32a, vVar3.f33b, vVar.f32a, vVar.f33b, i);
                        vVar3.f33b += i;
                        vVar.c = i + vVar.c;
                        vVar3.e.a(vVar);
                    } else {
                        v a2 = w.f34a.a();
                        System.arraycopy(vVar3.f32a, i + vVar3.f33b, a2.f32a, a2.f33b, i2);
                        vVar3.c -= i2;
                        a2.c = i2 + a2.c;
                        vVar3.a(a2);
                        vVar = vVar3;
                    }
                    fVar.f9a = vVar;
                } else {
                    fVar.f9a.a(vVar2, (int) j);
                    fVar.f10b -= j;
                    this.f10b += j;
                    return;
                }
            }
            v vVar4 = fVar.f9a;
            long j2 = vVar4.c - vVar4.f33b;
            fVar.f9a = vVar4.a();
            if (this.f9a == null) {
                this.f9a = vVar4;
                v vVar5 = this.f9a;
                v vVar6 = this.f9a;
                v vVar7 = this.f9a;
                vVar6.e = vVar7;
                vVar5.d = vVar7;
            } else {
                v a3 = this.f9a.e.a(vVar4);
                if (a3.e == a3) {
                    throw new IllegalStateException();
                }
                if ((a3.e.c - a3.e.f33b) + (a3.c - a3.f33b) <= 2048) {
                    a3.a(a3.e, a3.c - a3.f33b);
                    a3.a();
                    w.f34a.a(a3);
                }
            }
            fVar.f10b -= j2;
            this.f10b += j2;
            j -= j2;
        }
    }

    @Override // a.y
    public final long a(f fVar, long j) {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f10b == 0) {
            return -1L;
        }
        if (j > this.f10b) {
            j = this.f10b;
        }
        fVar.a_(this, j);
        return j;
    }

    @Override // a.i
    public final long a(byte b2) {
        return a(b2, 0L);
    }

    public final long a(byte b2, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        v vVar = this.f9a;
        if (vVar == null) {
            return -1L;
        }
        long j2 = 0;
        do {
            int i = vVar.c - vVar.f33b;
            if (j >= i) {
                j -= i;
            } else {
                byte[] bArr = vVar.f32a;
                long j3 = vVar.c;
                for (long j4 = vVar.f33b + j; j4 < j3; j4++) {
                    if (bArr[(int) j4] == b2) {
                        return (j2 + j4) - vVar.f33b;
                    }
                }
                j = 0;
            }
            j2 += i;
            vVar = vVar.d;
        } while (vVar != this.f9a);
        return -1L;
    }

    @Override // a.x
    public final void b() {
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // a.x
    public final z a() {
        return z.f36b;
    }

    public final boolean equals(Object obj) {
        long j = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10b != fVar.f10b) {
            return false;
        }
        if (this.f10b == 0) {
            return true;
        }
        v vVar = this.f9a;
        v vVar2 = fVar.f9a;
        int i = vVar.f33b;
        int i2 = vVar2.f33b;
        while (j < this.f10b) {
            long min = Math.min(vVar.c - i, vVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                byte b2 = vVar.f32a[i];
                int i5 = i2 + 1;
                if (b2 != vVar2.f32a[i2]) {
                    return false;
                }
                i3++;
                i2 = i5;
                i = i4;
            }
            if (i == vVar.c) {
                vVar = vVar.d;
                i = vVar.f33b;
            }
            if (i2 == vVar2.c) {
                vVar2 = vVar2.d;
                i2 = vVar2.f33b;
            }
            j += min;
        }
        return true;
    }

    public final int hashCode() {
        v vVar = this.f9a;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f33b;
            int i3 = vVar.c;
            while (i2 < i3) {
                int i4 = vVar.f32a[i2] + (i * 31);
                i2++;
                i = i4;
            }
            vVar = vVar.d;
        } while (vVar != this.f9a);
        return i;
    }

    public final String toString() {
        if (this.f10b == 0) {
            return "Buffer[size=0]";
        }
        if (this.f10b <= 16) {
            return String.format("Buffer[size=%s data=%s]", Long.valueOf(this.f10b), clone().l().b());
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this.f9a.f32a, this.f9a.f33b, this.f9a.c - this.f9a.f33b);
            for (v vVar = this.f9a.d; vVar != this.f9a; vVar = vVar.d) {
                messageDigest.update(vVar.f32a, vVar.f33b, vVar.c - vVar.f33b);
            }
            return String.format("Buffer[size=%s md5=%s]", Long.valueOf(this.f10b), j.a(messageDigest.digest()).b());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        if (this.f10b == 0) {
            return fVar;
        }
        fVar.c(this.f9a.f32a, this.f9a.f33b, this.f9a.c - this.f9a.f33b);
        for (v vVar = this.f9a.d; vVar != this.f9a; vVar = vVar.d) {
            fVar.c(vVar.f32a, vVar.f33b, vVar.c - vVar.f33b);
        }
        return fVar;
    }

    @Override // a.i
    public final String m() {
        long a2 = a((byte) 10, 0L);
        if (a2 == -1) {
            f fVar = new f();
            a(fVar, 0L, Math.min(32L, this.f10b));
            throw new EOFException("\\n not found: size=" + this.f10b + " content=" + fVar.l().b() + "...");
        }
        return d(a2);
    }
}
