package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hy extends com.google.protobuf.nano.c {
    private static volatile hy[] f;

    /* renamed from: a, reason: collision with root package name */
    public hx f3935a = null;

    /* renamed from: b, reason: collision with root package name */
    public String[] f3936b = com.google.protobuf.nano.e.f;
    public long[] c = com.google.protobuf.nano.e.f7879b;
    public boolean[] d = com.google.protobuf.nano.e.e;
    public double[] e = com.google.protobuf.nano.e.d;

    public static hy[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new hy[0];
                }
            }
        }
        return f;
    }

    public hy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3935a != null) {
            codedOutputByteBufferNano.b(1, this.f3935a);
        }
        if (this.f3936b != null && this.f3936b.length > 0) {
            for (int i = 0; i < this.f3936b.length; i++) {
                String str = this.f3936b[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                codedOutputByteBufferNano.b(3, this.c[i2]);
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                codedOutputByteBufferNano.a(4, this.d[i3]);
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i4 = 0; i4 < this.e.length; i4++) {
                codedOutputByteBufferNano.a(5, this.e[i4]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3935a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3935a);
        }
        if (this.f3936b != null && this.f3936b.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f3936b.length; i3++) {
                String str = this.f3936b[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.c != null && this.c.length > 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.c.length; i5++) {
                i4 += CodedOutputByteBufferNano.b(this.c[i5]);
            }
            a2 = a2 + i4 + (this.c.length * 1);
        }
        if (this.d != null && this.d.length > 0) {
            a2 = a2 + (this.d.length * 1) + (this.d.length * 1);
        }
        if (this.e != null && this.e.length > 0) {
            return a2 + (this.e.length * 8) + (this.e.length * 1);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.f3935a == null) {
                        this.f3935a = new hx();
                    }
                    aVar.a(this.f3935a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f3936b == null ? 0 : this.f3936b.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3936b, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f3936b = strArr;
                    break;
                case 24:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 24);
                    int length2 = this.c == null ? 0 : this.c.length;
                    long[] jArr = new long[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, jArr, 0, length2);
                    }
                    while (length2 < jArr.length - 1) {
                        jArr[length2] = aVar.f();
                        aVar.a();
                        length2++;
                    }
                    jArr[length2] = aVar.f();
                    this.c = jArr;
                    break;
                case 26:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i++;
                    }
                    aVar.e(j);
                    int length3 = this.c == null ? 0 : this.c.length;
                    long[] jArr2 = new long[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, jArr2, 0, length3);
                    }
                    while (length3 < jArr2.length) {
                        jArr2[length3] = aVar.f();
                        length3++;
                    }
                    this.c = jArr2;
                    aVar.d(c);
                    break;
                case 32:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 32);
                    int length4 = this.d == null ? 0 : this.d.length;
                    boolean[] zArr = new boolean[b4 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.d, 0, zArr, 0, length4);
                    }
                    while (length4 < zArr.length - 1) {
                        zArr[length4] = aVar.b();
                        aVar.a();
                        length4++;
                    }
                    zArr[length4] = aVar.b();
                    this.d = zArr;
                    break;
                case 34:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i2 = 0;
                    while (aVar.i() > 0) {
                        aVar.b();
                        i2++;
                    }
                    aVar.e(j2);
                    int length5 = this.d == null ? 0 : this.d.length;
                    boolean[] zArr2 = new boolean[i2 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.d, 0, zArr2, 0, length5);
                    }
                    while (length5 < zArr2.length) {
                        zArr2[length5] = aVar.b();
                        length5++;
                    }
                    this.d = zArr2;
                    aVar.d(c2);
                    break;
                case 41:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 41);
                    int length6 = this.e == null ? 0 : this.e.length;
                    double[] dArr = new double[b5 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.e, 0, dArr, 0, length6);
                    }
                    while (length6 < dArr.length - 1) {
                        dArr[length6] = Double.longBitsToDouble(aVar.h());
                        aVar.a();
                        length6++;
                    }
                    dArr[length6] = Double.longBitsToDouble(aVar.h());
                    this.e = dArr;
                    break;
                case 42:
                    int e = aVar.e();
                    int c3 = aVar.c(e);
                    int i3 = e / 8;
                    int length7 = this.e == null ? 0 : this.e.length;
                    double[] dArr2 = new double[i3 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.e, 0, dArr2, 0, length7);
                    }
                    while (length7 < dArr2.length) {
                        dArr2[length7] = Double.longBitsToDouble(aVar.h());
                        length7++;
                    }
                    this.e = dArr2;
                    aVar.d(c3);
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
