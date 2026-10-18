package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ea extends com.google.protobuf.nano.c {
    private static volatile ea[] U;

    /* renamed from: a, reason: collision with root package name */
    public eb[] f3763a = eb.b();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3764b = false;
    public boolean c = false;
    public long d = 0;
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public String n = "";
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public long r = 0;
    public boolean s = false;
    public String t = "";
    public boolean u = false;
    public ea[] v = b();
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public int A = 1;
    public boolean B = false;
    public int C = 1;
    public boolean D = false;
    public dx E = null;
    public ef F = null;
    public ek G = null;
    public ej H = null;
    public eo I = null;
    public boolean J = false;
    public boolean K = false;
    public long L = 0;
    public boolean M = false;
    public long N = 0;
    public boolean O = false;
    public int P = 0;
    public boolean Q = false;
    public String[] R = com.google.protobuf.nano.e.f;
    public String S = "";
    public boolean T = false;

    public static ea[] b() {
        if (U == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (U == null) {
                    U = new ea[0];
                }
            }
        }
        return U;
    }

    public ea() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(1, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(2, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(3, this.h);
        }
        if (this.v != null && this.v.length > 0) {
            for (int i = 0; i < this.v.length; i++) {
                ea eaVar = this.v[i];
                if (eaVar != null) {
                    codedOutputByteBufferNano.b(4, eaVar);
                }
            }
        }
        if (this.x || this.w) {
            codedOutputByteBufferNano.a(5, this.w);
        }
        if (this.s || this.r != 0) {
            codedOutputByteBufferNano.b(6, this.r);
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(7, this.t);
        }
        if (this.A != 1 || this.B) {
            codedOutputByteBufferNano.a(8, this.A);
        }
        if (this.F != null) {
            codedOutputByteBufferNano.b(9, this.F);
        }
        if (this.O || this.N != 0) {
            codedOutputByteBufferNano.b(10, this.N);
        }
        if (this.R != null && this.R.length > 0) {
            for (int i2 = 0; i2 < this.R.length; i2++) {
                String str = this.R[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(11, str);
                }
            }
        }
        if (this.G != null) {
            codedOutputByteBufferNano.b(12, this.G);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(13, this.j);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(14, this.l);
        }
        if (this.K || this.J) {
            codedOutputByteBufferNano.a(15, this.J);
        }
        if (this.Q || this.P != 0) {
            codedOutputByteBufferNano.a(16, this.P);
        }
        if (this.C != 1 || this.D) {
            codedOutputByteBufferNano.a(17, this.C);
        }
        if (this.H != null) {
            codedOutputByteBufferNano.b(18, this.H);
        }
        if (this.T || !this.S.equals("")) {
            codedOutputByteBufferNano.a(19, this.S);
        }
        if (this.M || this.L != 0) {
            codedOutputByteBufferNano.b(20, this.L);
        }
        if (this.E != null) {
            codedOutputByteBufferNano.b(21, this.E);
        }
        if (this.z || this.y) {
            codedOutputByteBufferNano.a(22, this.y);
        }
        if (this.I != null) {
            codedOutputByteBufferNano.b(23, this.I);
        }
        if (this.f3763a != null && this.f3763a.length > 0) {
            for (int i3 = 0; i3 < this.f3763a.length; i3++) {
                eb ebVar = this.f3763a[i3];
                if (ebVar != null) {
                    codedOutputByteBufferNano.b(24, ebVar);
                }
            }
        }
        if (this.c || this.f3764b) {
            codedOutputByteBufferNano.a(25, this.f3764b);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(26, this.n);
        }
        if (this.q || this.p) {
            codedOutputByteBufferNano.a(27, this.p);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.h);
        }
        if (this.v != null && this.v.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.v.length; i2++) {
                ea eaVar = this.v[i2];
                if (eaVar != null) {
                    i += CodedOutputByteBufferNano.d(4, eaVar);
                }
            }
            a2 = i;
        }
        if (this.x || this.w) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.s || this.r != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.r);
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.t);
        }
        if (this.A != 1 || this.B) {
            a2 += CodedOutputByteBufferNano.c(8, this.A);
        }
        if (this.F != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.F);
        }
        if (this.O || this.N != 0) {
            a2 += CodedOutputByteBufferNano.e(10, this.N);
        }
        if (this.R != null && this.R.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.R.length; i5++) {
                String str = this.R[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.G != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.G);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.j);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.l);
        }
        if (this.K || this.J) {
            a2 += CodedOutputByteBufferNano.c(15) + 1;
        }
        if (this.Q || this.P != 0) {
            a2 += CodedOutputByteBufferNano.c(16, this.P);
        }
        if (this.C != 1 || this.D) {
            a2 += CodedOutputByteBufferNano.c(17, this.C);
        }
        if (this.H != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.H);
        }
        if (this.T || !this.S.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.S);
        }
        if (this.M || this.L != 0) {
            a2 += CodedOutputByteBufferNano.e(20, this.L);
        }
        if (this.E != null) {
            a2 += CodedOutputByteBufferNano.d(21, this.E);
        }
        if (this.z || this.y) {
            a2 += CodedOutputByteBufferNano.c(22) + 1;
        }
        if (this.I != null) {
            a2 += CodedOutputByteBufferNano.d(23, this.I);
        }
        if (this.f3763a != null && this.f3763a.length > 0) {
            for (int i6 = 0; i6 < this.f3763a.length; i6++) {
                eb ebVar = this.f3763a[i6];
                if (ebVar != null) {
                    a2 += CodedOutputByteBufferNano.d(24, ebVar);
                }
            }
        }
        if (this.c || this.f3764b) {
            a2 += CodedOutputByteBufferNano.c(25) + 1;
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(26, this.n);
        }
        if (this.q || this.p) {
            return a2 + CodedOutputByteBufferNano.c(27) + 1;
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
                    this.d = aVar.f();
                    this.e = true;
                    break;
                case 18:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 26:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.v == null ? 0 : this.v.length;
                    ea[] eaVarArr = new ea[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.v, 0, eaVarArr, 0, length);
                    }
                    while (length < eaVarArr.length - 1) {
                        eaVarArr[length] = new ea();
                        aVar.a(eaVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    eaVarArr[length] = new ea();
                    aVar.a(eaVarArr[length]);
                    this.v = eaVarArr;
                    break;
                case 40:
                    this.w = aVar.b();
                    this.x = true;
                    break;
                case 48:
                    this.r = aVar.f();
                    this.s = true;
                    break;
                case 58:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 64:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.A = e;
                            this.B = true;
                            break;
                    }
                case 74:
                    if (this.F == null) {
                        this.F = new ef();
                    }
                    aVar.a(this.F);
                    break;
                case 80:
                    this.N = aVar.f();
                    this.O = true;
                    break;
                case 90:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length2 = this.R == null ? 0 : this.R.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.R, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.R = strArr;
                    break;
                case 98:
                    if (this.G == null) {
                        this.G = new ek();
                    }
                    aVar.a(this.G);
                    break;
                case 106:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 114:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 120:
                    this.J = aVar.b();
                    this.K = true;
                    break;
                case 128:
                    this.P = aVar.e();
                    this.Q = true;
                    break;
                case 136:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.C = e2;
                            this.D = true;
                            break;
                    }
                case 146:
                    if (this.H == null) {
                        this.H = new ej();
                    }
                    aVar.a(this.H);
                    break;
                case 154:
                    this.S = aVar.c();
                    this.T = true;
                    break;
                case 160:
                    this.L = aVar.f();
                    this.M = true;
                    break;
                case 170:
                    if (this.E == null) {
                        this.E = new dx();
                    }
                    aVar.a(this.E);
                    break;
                case 176:
                    this.y = aVar.b();
                    this.z = true;
                    break;
                case 186:
                    if (this.I == null) {
                        this.I = new eo();
                    }
                    aVar.a(this.I);
                    break;
                case 194:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 194);
                    int length3 = this.f3763a == null ? 0 : this.f3763a.length;
                    eb[] ebVarArr = new eb[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f3763a, 0, ebVarArr, 0, length3);
                    }
                    while (length3 < ebVarArr.length - 1) {
                        ebVarArr[length3] = new eb();
                        aVar.a(ebVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    ebVarArr[length3] = new eb();
                    aVar.a(ebVarArr[length3]);
                    this.f3763a = ebVarArr;
                    break;
                case 200:
                    this.f3764b = aVar.b();
                    this.c = true;
                    break;
                case 210:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 216:
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
