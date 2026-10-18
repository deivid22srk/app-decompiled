package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hx extends com.google.protobuf.nano.c {
    private static volatile hx[] t;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3933a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3934b = false;
    public int c = 1;
    public boolean d = false;
    public int e = 1;
    public boolean f = false;
    public String[] g = com.google.protobuf.nano.e.f;
    public long[] h = com.google.protobuf.nano.e.f7879b;
    public long[] i = com.google.protobuf.nano.e.f7879b;
    public double[] j = com.google.protobuf.nano.e.d;
    public hx[] k = b();
    public int l = 1;
    public boolean m = false;
    public int n = 1;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public String r = "";
    public boolean s = false;

    private static hx[] b() {
        if (t == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (t == null) {
                    t = new hx[0];
                }
            }
        }
        return t;
    }

    public hx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3934b || this.f3933a) {
            codedOutputByteBufferNano.a(1, this.f3933a);
        }
        if (this.c != 1 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 1 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                String str = this.g[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        if (this.i != null && this.i.length > 0) {
            for (int i2 = 0; i2 < this.i.length; i2++) {
                codedOutputByteBufferNano.b(5, this.i[i2]);
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i3 = 0; i3 < this.j.length; i3++) {
                codedOutputByteBufferNano.a(6, this.j[i3]);
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (int i4 = 0; i4 < this.k.length; i4++) {
                hx hxVar = this.k[i4];
                if (hxVar != null) {
                    codedOutputByteBufferNano.b(7, hxVar);
                }
            }
        }
        if (this.l != 1 || this.m) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(9, this.r);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i5 = 0; i5 < this.h.length; i5++) {
                codedOutputByteBufferNano.c(10, this.h[i5]);
            }
        }
        if (this.n != 1 || this.o) {
            codedOutputByteBufferNano.a(12, this.n);
        }
        if (this.q || this.p) {
            codedOutputByteBufferNano.a(13, this.p);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3934b || this.f3933a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.c != 1 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != 1 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.g.length; i3++) {
                String str = this.g[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.i != null && this.i.length > 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.i.length; i5++) {
                i4 += CodedOutputByteBufferNano.b(this.i[i5]);
            }
            a2 = a2 + i4 + (this.i.length * 1);
        }
        if (this.j != null && this.j.length > 0) {
            a2 = a2 + (this.j.length * 8) + (this.j.length * 1);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i6 = 0; i6 < this.k.length; i6++) {
                hx hxVar = this.k[i6];
                if (hxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(7, hxVar);
                }
            }
        }
        if (this.l != 1 || this.m) {
            a2 += CodedOutputByteBufferNano.c(8, this.l);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.r);
        }
        if (this.h != null && this.h.length > 0) {
            a2 = a2 + (this.h.length * 8) + (this.h.length * 1);
        }
        if (this.n != 1 || this.o) {
            a2 += CodedOutputByteBufferNano.c(12, this.n);
        }
        if (this.q || this.p) {
            return a2 + CodedOutputByteBufferNano.c(13) + 1;
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
                case 8:
                    this.f3933a = aVar.b();
                    this.f3934b = true;
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 24:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                            this.e = e2;
                            this.f = true;
                            break;
                    }
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.g == null ? 0 : this.g.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.g = strArr;
                    break;
                case 40:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 40);
                    int length2 = this.i == null ? 0 : this.i.length;
                    long[] jArr = new long[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.i, 0, jArr, 0, length2);
                    }
                    while (length2 < jArr.length - 1) {
                        jArr[length2] = aVar.f();
                        aVar.a();
                        length2++;
                    }
                    jArr[length2] = aVar.f();
                    this.i = jArr;
                    break;
                case 42:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i++;
                    }
                    aVar.e(j);
                    int length3 = this.i == null ? 0 : this.i.length;
                    long[] jArr2 = new long[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.i, 0, jArr2, 0, length3);
                    }
                    while (length3 < jArr2.length) {
                        jArr2[length3] = aVar.f();
                        length3++;
                    }
                    this.i = jArr2;
                    aVar.d(c);
                    break;
                case 49:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 49);
                    int length4 = this.j == null ? 0 : this.j.length;
                    double[] dArr = new double[b4 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.j, 0, dArr, 0, length4);
                    }
                    while (length4 < dArr.length - 1) {
                        dArr[length4] = Double.longBitsToDouble(aVar.h());
                        aVar.a();
                        length4++;
                    }
                    dArr[length4] = Double.longBitsToDouble(aVar.h());
                    this.j = dArr;
                    break;
                case 50:
                    int e3 = aVar.e();
                    int c2 = aVar.c(e3);
                    int i2 = e3 / 8;
                    int length5 = this.j == null ? 0 : this.j.length;
                    double[] dArr2 = new double[i2 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.j, 0, dArr2, 0, length5);
                    }
                    while (length5 < dArr2.length) {
                        dArr2[length5] = Double.longBitsToDouble(aVar.h());
                        length5++;
                    }
                    this.j = dArr2;
                    aVar.d(c2);
                    break;
                case 58:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length6 = this.k == null ? 0 : this.k.length;
                    hx[] hxVarArr = new hx[b5 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.k, 0, hxVarArr, 0, length6);
                    }
                    while (length6 < hxVarArr.length - 1) {
                        hxVarArr[length6] = new hx();
                        aVar.a(hxVarArr[length6]);
                        aVar.a();
                        length6++;
                    }
                    hxVarArr[length6] = new hx();
                    aVar.a(hxVarArr[length6]);
                    this.k = hxVarArr;
                    break;
                case 64:
                    int e4 = aVar.e();
                    switch (e4) {
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            this.l = e4;
                            this.m = true;
                            break;
                    }
                case 74:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 81:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 81);
                    int length7 = this.h == null ? 0 : this.h.length;
                    long[] jArr3 = new long[b6 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.h, 0, jArr3, 0, length7);
                    }
                    while (length7 < jArr3.length - 1) {
                        jArr3[length7] = aVar.h();
                        aVar.a();
                        length7++;
                    }
                    jArr3[length7] = aVar.h();
                    this.h = jArr3;
                    break;
                case 82:
                    int e5 = aVar.e();
                    int c3 = aVar.c(e5);
                    int i3 = e5 / 8;
                    int length8 = this.h == null ? 0 : this.h.length;
                    long[] jArr4 = new long[i3 + length8];
                    if (length8 != 0) {
                        System.arraycopy(this.h, 0, jArr4, 0, length8);
                    }
                    while (length8 < jArr4.length) {
                        jArr4[length8] = aVar.h();
                        length8++;
                    }
                    this.h = jArr4;
                    aVar.d(c3);
                    break;
                case 96:
                    int e6 = aVar.e();
                    switch (e6) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.n = e6;
                            this.o = true;
                            break;
                    }
                case 104:
                    this.p = aVar.b();
                    this.q = true;
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
