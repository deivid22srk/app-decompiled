package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class mc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4115a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4116b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public io o = null;
    public String[] p = com.google.protobuf.nano.e.f;
    public String[] q = com.google.protobuf.nano.e.f;
    public String r = "";
    public boolean s = false;
    public String t = "";
    public boolean u = false;
    public String v = "";
    public boolean w = false;
    public cn x = null;
    public gx[] y = gx.b();
    public int[] z = com.google.protobuf.nano.e.f7878a;
    public lz[] A = lz.b();
    public ds B = null;
    public mr C = null;

    public mc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4116b || !this.f4115a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4115a);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(2, this.e);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(3, this.m);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(4, this.o);
        }
        if (this.q != null && this.q.length > 0) {
            for (int i = 0; i < this.q.length; i++) {
                String str = this.q[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(5, str);
                }
            }
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(6, this.r);
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(7, this.t);
        }
        if (this.w || !this.v.equals("")) {
            codedOutputByteBufferNano.a(8, this.v);
        }
        if (this.x != null) {
            codedOutputByteBufferNano.b(9, this.x);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(10, this.i);
        }
        if (this.p != null && this.p.length > 0) {
            for (int i2 = 0; i2 < this.p.length; i2++) {
                String str2 = this.p[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(11, str2);
                }
            }
        }
        if (this.y != null && this.y.length > 0) {
            for (int i3 = 0; i3 < this.y.length; i3++) {
                gx gxVar = this.y[i3];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(12, gxVar);
                }
            }
        }
        if (this.z != null && this.z.length > 0) {
            for (int i4 = 0; i4 < this.z.length; i4++) {
                codedOutputByteBufferNano.a(13, this.z[i4]);
            }
        }
        if (this.A != null && this.A.length > 0) {
            for (int i5 = 0; i5 < this.A.length; i5++) {
                lz lzVar = this.A[i5];
                if (lzVar != null) {
                    codedOutputByteBufferNano.b(14, lzVar);
                }
            }
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(15, this.g);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(16, this.k);
        }
        if (this.B != null) {
            codedOutputByteBufferNano.b(17, this.B);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(18, this.C);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(19, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4116b || !this.f4115a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4115a);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.e);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.m);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.o);
        }
        if (this.q != null && this.q.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.q.length; i3++) {
                String str = this.q[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.r);
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.t);
        }
        if (this.w || !this.v.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.v);
        }
        if (this.x != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.x);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.i);
        }
        if (this.p != null && this.p.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.p.length; i6++) {
                String str2 = this.p[i6];
                if (str2 != null) {
                    i5++;
                    i4 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i4 + (i5 * 1);
        }
        if (this.y != null && this.y.length > 0) {
            int i7 = a2;
            for (int i8 = 0; i8 < this.y.length; i8++) {
                gx gxVar = this.y[i8];
                if (gxVar != null) {
                    i7 += CodedOutputByteBufferNano.d(12, gxVar);
                }
            }
            a2 = i7;
        }
        if (this.z != null && this.z.length > 0) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.z.length; i10++) {
                i9 += CodedOutputByteBufferNano.b(this.z[i10]);
            }
            a2 = a2 + i9 + (this.z.length * 1);
        }
        if (this.A != null && this.A.length > 0) {
            for (int i11 = 0; i11 < this.A.length; i11++) {
                lz lzVar = this.A[i11];
                if (lzVar != null) {
                    a2 += CodedOutputByteBufferNano.d(14, lzVar);
                }
            }
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.g);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(16, this.k);
        }
        if (this.B != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.B);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.C);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(19, this.c);
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
                    this.f4115a = aVar.c();
                    this.f4116b = true;
                    break;
                case 18:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 26:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 34:
                    if (this.o == null) {
                        this.o = new io();
                    }
                    aVar.a(this.o);
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.q == null ? 0 : this.q.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.q, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.q = strArr;
                    break;
                case 50:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 58:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 66:
                    this.v = aVar.c();
                    this.w = true;
                    break;
                case 74:
                    if (this.x == null) {
                        this.x = new cn();
                    }
                    aVar.a(this.x);
                    break;
                case 82:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 90:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length2 = this.p == null ? 0 : this.p.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.p, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.p = strArr2;
                    break;
                case 98:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 98);
                    int length3 = this.y == null ? 0 : this.y.length;
                    gx[] gxVarArr = new gx[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.y, 0, gxVarArr, 0, length3);
                    }
                    while (length3 < gxVarArr.length - 1) {
                        gxVarArr[length3] = new gx();
                        aVar.a(gxVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    gxVarArr[length3] = new gx();
                    aVar.a(gxVarArr[length3]);
                    this.y = gxVarArr;
                    break;
                case 104:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 104);
                    int length4 = this.z == null ? 0 : this.z.length;
                    int[] iArr = new int[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.z, 0, iArr, 0, length4);
                    }
                    while (length4 < iArr.length - 1) {
                        iArr[length4] = aVar.e();
                        aVar.a();
                        length4++;
                    }
                    iArr[length4] = aVar.e();
                    this.z = iArr;
                    break;
                case 106:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length5 = this.z == null ? 0 : this.z.length;
                    int[] iArr2 = new int[i + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.z, 0, iArr2, 0, length5);
                    }
                    while (length5 < iArr2.length) {
                        iArr2[length5] = aVar.e();
                        length5++;
                    }
                    this.z = iArr2;
                    aVar.d(c);
                    break;
                case 114:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length6 = this.A == null ? 0 : this.A.length;
                    lz[] lzVarArr = new lz[b6 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.A, 0, lzVarArr, 0, length6);
                    }
                    while (length6 < lzVarArr.length - 1) {
                        lzVarArr[length6] = new lz();
                        aVar.a(lzVarArr[length6]);
                        aVar.a();
                        length6++;
                    }
                    lzVarArr[length6] = new lz();
                    aVar.a(lzVarArr[length6]);
                    this.A = lzVarArr;
                    break;
                case 122:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 130:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 138:
                    if (this.B == null) {
                        this.B = new ds();
                    }
                    aVar.a(this.B);
                    break;
                case 146:
                    if (this.C == null) {
                        this.C = new mr();
                    }
                    aVar.a(this.C);
                    break;
                case 154:
                    this.c = aVar.c();
                    this.d = true;
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
