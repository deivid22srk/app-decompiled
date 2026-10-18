package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ag extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3588a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3589b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String[] k = com.google.protobuf.nano.e.f;
    public int l = 0;
    public boolean m = false;
    public long n = 0;
    public boolean o = false;
    public String[] p = com.google.protobuf.nano.e.f;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;
    public String u = "";
    public boolean v = false;
    public String w = "";
    public boolean x = false;
    public String y = "";
    public boolean z = false;
    public String A = "";
    public boolean B = false;
    public hr[] C = hr.b();
    public String D = "";
    public boolean E = false;
    public cg[] F = cg.b();
    public String[] G = com.google.protobuf.nano.e.f;
    public boolean H = true;
    public boolean I = false;
    public String[] J = com.google.protobuf.nano.e.f;
    public boolean K = false;
    public boolean L = false;
    public String[] M = com.google.protobuf.nano.e.f;
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public boolean S = false;
    public String T = "";
    public boolean U = false;
    public int V = 0;
    public boolean W = false;
    public int X = 0;
    public boolean Y = false;
    public String Z = "";
    public boolean aa = false;
    public in ab = null;

    public ag() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3589b || !this.f3588a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3588a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                String str = this.k[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(7, str);
                }
            }
        }
        if (this.m || this.l != 0) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.o || this.n != 0) {
            codedOutputByteBufferNano.b(9, this.n);
        }
        if (this.p != null && this.p.length > 0) {
            for (int i2 = 0; i2 < this.p.length; i2++) {
                String str2 = this.p[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(10, str2);
                }
            }
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(11, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(12, this.s);
        }
        if (this.v || !this.u.equals("")) {
            codedOutputByteBufferNano.a(13, this.u);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(14, this.w);
        }
        if (this.z || !this.y.equals("")) {
            codedOutputByteBufferNano.a(15, this.y);
        }
        if (this.B || !this.A.equals("")) {
            codedOutputByteBufferNano.a(16, this.A);
        }
        if (this.C != null && this.C.length > 0) {
            for (int i3 = 0; i3 < this.C.length; i3++) {
                hr hrVar = this.C[i3];
                if (hrVar != null) {
                    codedOutputByteBufferNano.b(17, hrVar);
                }
            }
        }
        if (this.E || !this.D.equals("")) {
            codedOutputByteBufferNano.a(18, this.D);
        }
        if (this.G != null && this.G.length > 0) {
            for (int i4 = 0; i4 < this.G.length; i4++) {
                String str3 = this.G[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(19, str3);
                }
            }
        }
        if (this.I || !this.H) {
            codedOutputByteBufferNano.a(21, this.H);
        }
        if (this.F != null && this.F.length > 0) {
            for (int i5 = 0; i5 < this.F.length; i5++) {
                cg cgVar = this.F[i5];
                if (cgVar != null) {
                    codedOutputByteBufferNano.b(22, cgVar);
                }
            }
        }
        if (this.J != null && this.J.length > 0) {
            for (int i6 = 0; i6 < this.J.length; i6++) {
                String str4 = this.J[i6];
                if (str4 != null) {
                    codedOutputByteBufferNano.a(23, str4);
                }
            }
        }
        if (this.L || this.K) {
            codedOutputByteBufferNano.a(24, this.K);
        }
        if (this.M != null && this.M.length > 0) {
            for (int i7 = 0; i7 < this.M.length; i7++) {
                String str5 = this.M[i7];
                if (str5 != null) {
                    codedOutputByteBufferNano.a(25, str5);
                }
            }
        }
        if (this.O || this.N) {
            codedOutputByteBufferNano.a(26, this.N);
        }
        if (this.Q || this.P) {
            codedOutputByteBufferNano.a(27, this.P);
        }
        if (this.S || this.R) {
            codedOutputByteBufferNano.a(28, this.R);
        }
        if (this.U || !this.T.equals("")) {
            codedOutputByteBufferNano.a(30, this.T);
        }
        if (this.V != 0 || this.W) {
            codedOutputByteBufferNano.a(31, this.V);
        }
        if (this.Y || this.X != 0) {
            codedOutputByteBufferNano.a(32, this.X);
        }
        if (this.aa || !this.Z.equals("")) {
            codedOutputByteBufferNano.a(33, this.Z);
        }
        if (this.ab != null) {
            codedOutputByteBufferNano.b(34, this.ab);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3589b || !this.f3588a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3588a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.k.length; i3++) {
                String str = this.k[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.m || this.l != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.l);
        }
        if (this.o || this.n != 0) {
            a2 += CodedOutputByteBufferNano.e(9, this.n);
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
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.q);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.s);
        }
        if (this.v || !this.u.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.u);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.w);
        }
        if (this.z || !this.y.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.y);
        }
        if (this.B || !this.A.equals("")) {
            a2 += CodedOutputByteBufferNano.b(16, this.A);
        }
        if (this.C != null && this.C.length > 0) {
            int i7 = a2;
            for (int i8 = 0; i8 < this.C.length; i8++) {
                hr hrVar = this.C[i8];
                if (hrVar != null) {
                    i7 += CodedOutputByteBufferNano.d(17, hrVar);
                }
            }
            a2 = i7;
        }
        if (this.E || !this.D.equals("")) {
            a2 += CodedOutputByteBufferNano.b(18, this.D);
        }
        if (this.G != null && this.G.length > 0) {
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < this.G.length; i11++) {
                String str3 = this.G[i11];
                if (str3 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.a(str3);
                }
            }
            a2 = a2 + i9 + (i10 * 2);
        }
        if (this.I || !this.H) {
            a2 += CodedOutputByteBufferNano.c(21) + 1;
        }
        if (this.F != null && this.F.length > 0) {
            int i12 = a2;
            for (int i13 = 0; i13 < this.F.length; i13++) {
                cg cgVar = this.F[i13];
                if (cgVar != null) {
                    i12 += CodedOutputByteBufferNano.d(22, cgVar);
                }
            }
            a2 = i12;
        }
        if (this.J != null && this.J.length > 0) {
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < this.J.length; i16++) {
                String str4 = this.J[i16];
                if (str4 != null) {
                    i15++;
                    i14 += CodedOutputByteBufferNano.a(str4);
                }
            }
            a2 = a2 + i14 + (i15 * 2);
        }
        if (this.L || this.K) {
            a2 += CodedOutputByteBufferNano.c(24) + 1;
        }
        if (this.M != null && this.M.length > 0) {
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < this.M.length; i19++) {
                String str5 = this.M[i19];
                if (str5 != null) {
                    i18++;
                    i17 += CodedOutputByteBufferNano.a(str5);
                }
            }
            a2 = a2 + i17 + (i18 * 2);
        }
        if (this.O || this.N) {
            a2 += CodedOutputByteBufferNano.c(26) + 1;
        }
        if (this.Q || this.P) {
            a2 += CodedOutputByteBufferNano.c(27) + 1;
        }
        if (this.S || this.R) {
            a2 += CodedOutputByteBufferNano.c(28) + 1;
        }
        if (this.U || !this.T.equals("")) {
            a2 += CodedOutputByteBufferNano.b(30, this.T);
        }
        if (this.V != 0 || this.W) {
            a2 += CodedOutputByteBufferNano.c(31, this.V);
        }
        if (this.Y || this.X != 0) {
            a2 += CodedOutputByteBufferNano.c(32, this.X);
        }
        if (this.aa || !this.Z.equals("")) {
            a2 += CodedOutputByteBufferNano.b(33, this.Z);
        }
        if (this.ab != null) {
            return a2 + CodedOutputByteBufferNano.d(34, this.ab);
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
                    this.f3588a = aVar.c();
                    this.f3589b = true;
                    break;
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 58:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length = this.k == null ? 0 : this.k.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.k = strArr;
                    break;
                case 64:
                    this.l = aVar.e();
                    this.m = true;
                    break;
                case 72:
                    this.n = aVar.f();
                    this.o = true;
                    break;
                case 82:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 82);
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
                case 90:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 98:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 106:
                    this.u = aVar.c();
                    this.v = true;
                    break;
                case 114:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 122:
                    this.y = aVar.c();
                    this.z = true;
                    break;
                case 130:
                    this.A = aVar.c();
                    this.B = true;
                    break;
                case 138:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 138);
                    int length3 = this.C == null ? 0 : this.C.length;
                    hr[] hrVarArr = new hr[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.C, 0, hrVarArr, 0, length3);
                    }
                    while (length3 < hrVarArr.length - 1) {
                        hrVarArr[length3] = new hr();
                        aVar.a(hrVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    hrVarArr[length3] = new hr();
                    aVar.a(hrVarArr[length3]);
                    this.C = hrVarArr;
                    break;
                case 146:
                    this.D = aVar.c();
                    this.E = true;
                    break;
                case 154:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 154);
                    int length4 = this.G == null ? 0 : this.G.length;
                    String[] strArr3 = new String[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.G, 0, strArr3, 0, length4);
                    }
                    while (length4 < strArr3.length - 1) {
                        strArr3[length4] = aVar.c();
                        aVar.a();
                        length4++;
                    }
                    strArr3[length4] = aVar.c();
                    this.G = strArr3;
                    break;
                case 168:
                    this.H = aVar.b();
                    this.I = true;
                    break;
                case 178:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 178);
                    int length5 = this.F == null ? 0 : this.F.length;
                    cg[] cgVarArr = new cg[b6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.F, 0, cgVarArr, 0, length5);
                    }
                    while (length5 < cgVarArr.length - 1) {
                        cgVarArr[length5] = new cg();
                        aVar.a(cgVarArr[length5]);
                        aVar.a();
                        length5++;
                    }
                    cgVarArr[length5] = new cg();
                    aVar.a(cgVarArr[length5]);
                    this.F = cgVarArr;
                    break;
                case 186:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 186);
                    int length6 = this.J == null ? 0 : this.J.length;
                    String[] strArr4 = new String[b7 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.J, 0, strArr4, 0, length6);
                    }
                    while (length6 < strArr4.length - 1) {
                        strArr4[length6] = aVar.c();
                        aVar.a();
                        length6++;
                    }
                    strArr4[length6] = aVar.c();
                    this.J = strArr4;
                    break;
                case 192:
                    this.K = aVar.b();
                    this.L = true;
                    break;
                case 202:
                    int b8 = com.google.protobuf.nano.e.b(aVar, 202);
                    int length7 = this.M == null ? 0 : this.M.length;
                    String[] strArr5 = new String[b8 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.M, 0, strArr5, 0, length7);
                    }
                    while (length7 < strArr5.length - 1) {
                        strArr5[length7] = aVar.c();
                        aVar.a();
                        length7++;
                    }
                    strArr5[length7] = aVar.c();
                    this.M = strArr5;
                    break;
                case 208:
                    this.N = aVar.b();
                    this.O = true;
                    break;
                case 216:
                    this.P = aVar.b();
                    this.Q = true;
                    break;
                case 224:
                    this.R = aVar.b();
                    this.S = true;
                    break;
                case 242:
                    this.T = aVar.c();
                    this.U = true;
                    break;
                case 248:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.V = e;
                            this.W = true;
                            break;
                    }
                case 256:
                    this.X = aVar.e();
                    this.Y = true;
                    break;
                case 266:
                    this.Z = aVar.c();
                    this.aa = true;
                    break;
                case 274:
                    if (this.ab == null) {
                        this.ab = new in();
                    }
                    aVar.a(this.ab);
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
