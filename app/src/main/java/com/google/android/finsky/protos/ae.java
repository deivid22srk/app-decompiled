package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ae extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ol[] f3584a = ol.b();

    /* renamed from: b, reason: collision with root package name */
    public ol f3585b = null;
    public ol c = null;
    public ol d = null;
    public ol e = null;
    public ol f = null;
    public lh g = null;
    public sx[] h = sx.b();
    public sx i = null;
    public jd j = null;
    public po k = null;
    public an[] l = an.b();
    public an[] m = an.b();
    public an[] n = an.b();
    public an o = null;
    public ao[] p = ao.b();
    public lv[] q = lv.b();
    public String r = "";
    public boolean s = false;
    public gx[] t = gx.b();
    public pi u = null;
    public kk v = null;
    public String w = "";
    public boolean x = false;
    public kn[] y = kn.b();
    public gx z = null;
    public String A = "";
    public boolean B = false;
    public mv C = null;
    public kc D = null;
    public kb E = null;
    public sv[] F = sv.b();
    public mt G = null;
    public String H = "";
    public boolean I = false;
    public ol J = null;
    public ol K = null;
    public ol L = null;
    public ol M = null;
    public ol N = null;
    public sp O = null;
    public om P = null;
    public pc Q = null;

    public ae() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.J != null) {
            codedOutputByteBufferNano.b(1, this.J);
        }
        if (this.K != null) {
            codedOutputByteBufferNano.b(2, this.K);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(3, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                sx sxVar = this.h[i];
                if (sxVar != null) {
                    codedOutputByteBufferNano.b(4, sxVar);
                }
            }
        }
        if (this.L != null) {
            codedOutputByteBufferNano.b(5, this.L);
        }
        if (this.f3585b != null) {
            codedOutputByteBufferNano.b(6, this.f3585b);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(7, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i2 = 0; i2 < this.l.length; i2++) {
                an anVar = this.l[i2];
                if (anVar != null) {
                    codedOutputByteBufferNano.b(8, anVar);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i3 = 0; i3 < this.m.length; i3++) {
                an anVar2 = this.m[i3];
                if (anVar2 != null) {
                    codedOutputByteBufferNano.b(9, anVar2);
                }
            }
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(10, this.j);
        }
        if (this.M != null) {
            codedOutputByteBufferNano.b(11, this.M);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(12, this.c);
        }
        if (this.q != null && this.q.length > 0) {
            for (int i4 = 0; i4 < this.q.length; i4++) {
                lv lvVar = this.q[i4];
                if (lvVar != null) {
                    codedOutputByteBufferNano.b(13, lvVar);
                }
            }
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(14, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i5 = 0; i5 < this.t.length; i5++) {
                gx gxVar = this.t[i5];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(16, gxVar);
                }
            }
        }
        if (this.v != null) {
            codedOutputByteBufferNano.b(17, this.v);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(18, this.w);
        }
        if (this.u != null) {
            codedOutputByteBufferNano.b(19, this.u);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(20, this.i);
        }
        if (this.p != null && this.p.length > 0) {
            for (int i6 = 0; i6 < this.p.length; i6++) {
                ao aoVar = this.p[i6];
                if (aoVar != null) {
                    codedOutputByteBufferNano.b(21, aoVar);
                }
            }
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(22, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(24, this.e);
        }
        if (this.y != null && this.y.length > 0) {
            for (int i7 = 0; i7 < this.y.length; i7++) {
                kn knVar = this.y[i7];
                if (knVar != null) {
                    codedOutputByteBufferNano.b(25, knVar);
                }
            }
        }
        if (this.z != null) {
            codedOutputByteBufferNano.b(26, this.z);
        }
        if (this.B || !this.A.equals("")) {
            codedOutputByteBufferNano.a(27, this.A);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(28, this.C);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(29, this.o);
        }
        if (this.F != null && this.F.length > 0) {
            for (int i8 = 0; i8 < this.F.length; i8++) {
                sv svVar = this.F[i8];
                if (svVar != null) {
                    codedOutputByteBufferNano.b(30, svVar);
                }
            }
        }
        if (this.N != null) {
            codedOutputByteBufferNano.b(32, this.N);
        }
        if (this.I || !this.H.equals("")) {
            codedOutputByteBufferNano.a(33, this.H);
        }
        if (this.f3584a != null && this.f3584a.length > 0) {
            for (int i9 = 0; i9 < this.f3584a.length; i9++) {
                ol olVar = this.f3584a[i9];
                if (olVar != null) {
                    codedOutputByteBufferNano.b(34, olVar);
                }
            }
        }
        if (this.O != null) {
            codedOutputByteBufferNano.b(35, this.O);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(36, this.f);
        }
        if (this.D != null) {
            codedOutputByteBufferNano.b(37, this.D);
        }
        if (this.E != null) {
            codedOutputByteBufferNano.b(38, this.E);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i10 = 0; i10 < this.n.length; i10++) {
                an anVar3 = this.n[i10];
                if (anVar3 != null) {
                    codedOutputByteBufferNano.b(39, anVar3);
                }
            }
        }
        if (this.P != null) {
            codedOutputByteBufferNano.b(40, this.P);
        }
        if (this.G != null) {
            codedOutputByteBufferNano.b(41, this.G);
        }
        if (this.Q != null) {
            codedOutputByteBufferNano.b(42, this.Q);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.J != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.J);
        }
        if (this.K != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.K);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                sx sxVar = this.h[i2];
                if (sxVar != null) {
                    i += CodedOutputByteBufferNano.d(4, sxVar);
                }
            }
            a2 = i;
        }
        if (this.L != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.L);
        }
        if (this.f3585b != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f3585b);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.l.length; i4++) {
                an anVar = this.l[i4];
                if (anVar != null) {
                    i3 += CodedOutputByteBufferNano.d(8, anVar);
                }
            }
            a2 = i3;
        }
        if (this.m != null && this.m.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.m.length; i6++) {
                an anVar2 = this.m[i6];
                if (anVar2 != null) {
                    i5 += CodedOutputByteBufferNano.d(9, anVar2);
                }
            }
            a2 = i5;
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.j);
        }
        if (this.M != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.M);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.c);
        }
        if (this.q != null && this.q.length > 0) {
            int i7 = a2;
            for (int i8 = 0; i8 < this.q.length; i8++) {
                lv lvVar = this.q[i8];
                if (lvVar != null) {
                    i7 += CodedOutputByteBufferNano.d(13, lvVar);
                }
            }
            a2 = i7;
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            int i9 = a2;
            for (int i10 = 0; i10 < this.t.length; i10++) {
                gx gxVar = this.t[i10];
                if (gxVar != null) {
                    i9 += CodedOutputByteBufferNano.d(16, gxVar);
                }
            }
            a2 = i9;
        }
        if (this.v != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.v);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(18, this.w);
        }
        if (this.u != null) {
            a2 += CodedOutputByteBufferNano.d(19, this.u);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(20, this.i);
        }
        if (this.p != null && this.p.length > 0) {
            int i11 = a2;
            for (int i12 = 0; i12 < this.p.length; i12++) {
                ao aoVar = this.p[i12];
                if (aoVar != null) {
                    i11 += CodedOutputByteBufferNano.d(21, aoVar);
                }
            }
            a2 = i11;
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(22, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(24, this.e);
        }
        if (this.y != null && this.y.length > 0) {
            int i13 = a2;
            for (int i14 = 0; i14 < this.y.length; i14++) {
                kn knVar = this.y[i14];
                if (knVar != null) {
                    i13 += CodedOutputByteBufferNano.d(25, knVar);
                }
            }
            a2 = i13;
        }
        if (this.z != null) {
            a2 += CodedOutputByteBufferNano.d(26, this.z);
        }
        if (this.B || !this.A.equals("")) {
            a2 += CodedOutputByteBufferNano.b(27, this.A);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(28, this.C);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(29, this.o);
        }
        if (this.F != null && this.F.length > 0) {
            int i15 = a2;
            for (int i16 = 0; i16 < this.F.length; i16++) {
                sv svVar = this.F[i16];
                if (svVar != null) {
                    i15 += CodedOutputByteBufferNano.d(30, svVar);
                }
            }
            a2 = i15;
        }
        if (this.N != null) {
            a2 += CodedOutputByteBufferNano.d(32, this.N);
        }
        if (this.I || !this.H.equals("")) {
            a2 += CodedOutputByteBufferNano.b(33, this.H);
        }
        if (this.f3584a != null && this.f3584a.length > 0) {
            int i17 = a2;
            for (int i18 = 0; i18 < this.f3584a.length; i18++) {
                ol olVar = this.f3584a[i18];
                if (olVar != null) {
                    i17 += CodedOutputByteBufferNano.d(34, olVar);
                }
            }
            a2 = i17;
        }
        if (this.O != null) {
            a2 += CodedOutputByteBufferNano.d(35, this.O);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(36, this.f);
        }
        if (this.D != null) {
            a2 += CodedOutputByteBufferNano.d(37, this.D);
        }
        if (this.E != null) {
            a2 += CodedOutputByteBufferNano.d(38, this.E);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i19 = 0; i19 < this.n.length; i19++) {
                an anVar3 = this.n[i19];
                if (anVar3 != null) {
                    a2 += CodedOutputByteBufferNano.d(39, anVar3);
                }
            }
        }
        if (this.P != null) {
            a2 += CodedOutputByteBufferNano.d(40, this.P);
        }
        if (this.G != null) {
            a2 += CodedOutputByteBufferNano.d(41, this.G);
        }
        if (this.Q != null) {
            return a2 + CodedOutputByteBufferNano.d(42, this.Q);
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
                    if (this.J == null) {
                        this.J = new ol();
                    }
                    aVar.a(this.J);
                    break;
                case 18:
                    if (this.K == null) {
                        this.K = new ol();
                    }
                    aVar.a(this.K);
                    break;
                case 26:
                    if (this.g == null) {
                        this.g = new lh();
                    }
                    aVar.a(this.g);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.h == null ? 0 : this.h.length;
                    sx[] sxVarArr = new sx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, sxVarArr, 0, length);
                    }
                    while (length < sxVarArr.length - 1) {
                        sxVarArr[length] = new sx();
                        aVar.a(sxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    sxVarArr[length] = new sx();
                    aVar.a(sxVarArr[length]);
                    this.h = sxVarArr;
                    break;
                case 42:
                    if (this.L == null) {
                        this.L = new ol();
                    }
                    aVar.a(this.L);
                    break;
                case 50:
                    if (this.f3585b == null) {
                        this.f3585b = new ol();
                    }
                    aVar.a(this.f3585b);
                    break;
                case 58:
                    if (this.k == null) {
                        this.k = new po();
                    }
                    aVar.a(this.k);
                    break;
                case 66:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 66);
                    int length2 = this.l == null ? 0 : this.l.length;
                    an[] anVarArr = new an[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.l, 0, anVarArr, 0, length2);
                    }
                    while (length2 < anVarArr.length - 1) {
                        anVarArr[length2] = new an();
                        aVar.a(anVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    anVarArr[length2] = new an();
                    aVar.a(anVarArr[length2]);
                    this.l = anVarArr;
                    break;
                case 74:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length3 = this.m == null ? 0 : this.m.length;
                    an[] anVarArr2 = new an[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.m, 0, anVarArr2, 0, length3);
                    }
                    while (length3 < anVarArr2.length - 1) {
                        anVarArr2[length3] = new an();
                        aVar.a(anVarArr2[length3]);
                        aVar.a();
                        length3++;
                    }
                    anVarArr2[length3] = new an();
                    aVar.a(anVarArr2[length3]);
                    this.m = anVarArr2;
                    break;
                case 82:
                    if (this.j == null) {
                        this.j = new jd();
                    }
                    aVar.a(this.j);
                    break;
                case 90:
                    if (this.M == null) {
                        this.M = new ol();
                    }
                    aVar.a(this.M);
                    break;
                case 98:
                    if (this.c == null) {
                        this.c = new ol();
                    }
                    aVar.a(this.c);
                    break;
                case 106:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 106);
                    int length4 = this.q == null ? 0 : this.q.length;
                    lv[] lvVarArr = new lv[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.q, 0, lvVarArr, 0, length4);
                    }
                    while (length4 < lvVarArr.length - 1) {
                        lvVarArr[length4] = new lv();
                        aVar.a(lvVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    lvVarArr[length4] = new lv();
                    aVar.a(lvVarArr[length4]);
                    this.q = lvVarArr;
                    break;
                case 114:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 130:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 130);
                    int length5 = this.t == null ? 0 : this.t.length;
                    gx[] gxVarArr = new gx[b6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.t, 0, gxVarArr, 0, length5);
                    }
                    while (length5 < gxVarArr.length - 1) {
                        gxVarArr[length5] = new gx();
                        aVar.a(gxVarArr[length5]);
                        aVar.a();
                        length5++;
                    }
                    gxVarArr[length5] = new gx();
                    aVar.a(gxVarArr[length5]);
                    this.t = gxVarArr;
                    break;
                case 138:
                    if (this.v == null) {
                        this.v = new kk();
                    }
                    aVar.a(this.v);
                    break;
                case 146:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 154:
                    if (this.u == null) {
                        this.u = new pi();
                    }
                    aVar.a(this.u);
                    break;
                case 162:
                    if (this.i == null) {
                        this.i = new sx();
                    }
                    aVar.a(this.i);
                    break;
                case 170:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 170);
                    int length6 = this.p == null ? 0 : this.p.length;
                    ao[] aoVarArr = new ao[b7 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.p, 0, aoVarArr, 0, length6);
                    }
                    while (length6 < aoVarArr.length - 1) {
                        aoVarArr[length6] = new ao();
                        aVar.a(aoVarArr[length6]);
                        aVar.a();
                        length6++;
                    }
                    aoVarArr[length6] = new ao();
                    aVar.a(aoVarArr[length6]);
                    this.p = aoVarArr;
                    break;
                case 178:
                    if (this.d == null) {
                        this.d = new ol();
                    }
                    aVar.a(this.d);
                    break;
                case 194:
                    if (this.e == null) {
                        this.e = new ol();
                    }
                    aVar.a(this.e);
                    break;
                case 202:
                    int b8 = com.google.protobuf.nano.e.b(aVar, 202);
                    int length7 = this.y == null ? 0 : this.y.length;
                    kn[] knVarArr = new kn[b8 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.y, 0, knVarArr, 0, length7);
                    }
                    while (length7 < knVarArr.length - 1) {
                        knVarArr[length7] = new kn();
                        aVar.a(knVarArr[length7]);
                        aVar.a();
                        length7++;
                    }
                    knVarArr[length7] = new kn();
                    aVar.a(knVarArr[length7]);
                    this.y = knVarArr;
                    break;
                case 210:
                    if (this.z == null) {
                        this.z = new gx();
                    }
                    aVar.a(this.z);
                    break;
                case 218:
                    this.A = aVar.c();
                    this.B = true;
                    break;
                case 226:
                    if (this.C == null) {
                        this.C = new mv();
                    }
                    aVar.a(this.C);
                    break;
                case 234:
                    if (this.o == null) {
                        this.o = new an();
                    }
                    aVar.a(this.o);
                    break;
                case 242:
                    int b9 = com.google.protobuf.nano.e.b(aVar, 242);
                    int length8 = this.F == null ? 0 : this.F.length;
                    sv[] svVarArr = new sv[b9 + length8];
                    if (length8 != 0) {
                        System.arraycopy(this.F, 0, svVarArr, 0, length8);
                    }
                    while (length8 < svVarArr.length - 1) {
                        svVarArr[length8] = new sv();
                        aVar.a(svVarArr[length8]);
                        aVar.a();
                        length8++;
                    }
                    svVarArr[length8] = new sv();
                    aVar.a(svVarArr[length8]);
                    this.F = svVarArr;
                    break;
                case 258:
                    if (this.N == null) {
                        this.N = new ol();
                    }
                    aVar.a(this.N);
                    break;
                case 266:
                    this.H = aVar.c();
                    this.I = true;
                    break;
                case 274:
                    int b10 = com.google.protobuf.nano.e.b(aVar, 274);
                    int length9 = this.f3584a == null ? 0 : this.f3584a.length;
                    ol[] olVarArr = new ol[b10 + length9];
                    if (length9 != 0) {
                        System.arraycopy(this.f3584a, 0, olVarArr, 0, length9);
                    }
                    while (length9 < olVarArr.length - 1) {
                        olVarArr[length9] = new ol();
                        aVar.a(olVarArr[length9]);
                        aVar.a();
                        length9++;
                    }
                    olVarArr[length9] = new ol();
                    aVar.a(olVarArr[length9]);
                    this.f3584a = olVarArr;
                    break;
                case 282:
                    if (this.O == null) {
                        this.O = new sp();
                    }
                    aVar.a(this.O);
                    break;
                case 290:
                    if (this.f == null) {
                        this.f = new ol();
                    }
                    aVar.a(this.f);
                    break;
                case 298:
                    if (this.D == null) {
                        this.D = new kc();
                    }
                    aVar.a(this.D);
                    break;
                case 306:
                    if (this.E == null) {
                        this.E = new kb();
                    }
                    aVar.a(this.E);
                    break;
                case 314:
                    int b11 = com.google.protobuf.nano.e.b(aVar, 314);
                    int length10 = this.n == null ? 0 : this.n.length;
                    an[] anVarArr3 = new an[b11 + length10];
                    if (length10 != 0) {
                        System.arraycopy(this.n, 0, anVarArr3, 0, length10);
                    }
                    while (length10 < anVarArr3.length - 1) {
                        anVarArr3[length10] = new an();
                        aVar.a(anVarArr3[length10]);
                        aVar.a();
                        length10++;
                    }
                    anVarArr3[length10] = new an();
                    aVar.a(anVarArr3[length10]);
                    this.n = anVarArr3;
                    break;
                case 322:
                    if (this.P == null) {
                        this.P = new om();
                    }
                    aVar.a(this.P);
                    break;
                case 330:
                    if (this.G == null) {
                        this.G = new mt();
                    }
                    aVar.a(this.G);
                    break;
                case 338:
                    if (this.Q == null) {
                        this.Q = new pc();
                    }
                    aVar.a(this.Q);
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
