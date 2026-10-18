package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gx extends com.google.protobuf.nano.c {
    private static volatile gx[] ac;

    /* renamed from: a, reason: collision with root package name */
    public String f3890a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3891b = false;
    public String c = "";
    public boolean d = false;
    public int e = 1;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;
    public ea[] u = ea.b();
    public ht v = null;
    public ds[] w = ds.b();
    public gx[] x = b();
    public et y = null;
    public gp z = null;
    public gr A = null;
    public nb B = null;
    public ae C = null;
    public String D = "";
    public boolean E = false;
    public String F = "";
    public boolean G = false;
    public String H = "";
    public boolean I = false;
    public String J = "";
    public boolean K = false;
    public String L = "";
    public boolean M = false;
    public String N = "";
    public boolean O = false;
    public boolean P = false;
    public boolean Q = false;
    public byte[] R = com.google.protobuf.nano.e.h;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public oc[] X = oc.b();
    public boolean Y = false;
    public boolean Z = false;
    public boolean aa = false;
    public boolean ab = false;

    public static gx[] b() {
        if (ac == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (ac == null) {
                    ac = new gx[0];
                }
            }
        }
        return ac;
    }

    public gx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3891b || !this.f3890a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3890a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 1 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != 0 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(6, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(7, this.o);
        }
        if (this.u != null && this.u.length > 0) {
            for (int i = 0; i < this.u.length; i++) {
                ea eaVar = this.u[i];
                if (eaVar != null) {
                    codedOutputByteBufferNano.b(8, eaVar);
                }
            }
        }
        if (this.v != null) {
            codedOutputByteBufferNano.b(9, this.v);
        }
        if (this.w != null && this.w.length > 0) {
            for (int i2 = 0; i2 < this.w.length; i2++) {
                ds dsVar = this.w[i2];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(10, dsVar);
                }
            }
        }
        if (this.x != null && this.x.length > 0) {
            for (int i3 = 0; i3 < this.x.length; i3++) {
                gx gxVar = this.x[i3];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(11, gxVar);
                }
            }
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(12, this.y);
        }
        if (this.z != null) {
            codedOutputByteBufferNano.b(13, this.z);
        }
        if (this.B != null) {
            codedOutputByteBufferNano.b(14, this.B);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(15, this.C);
        }
        if (this.E || !this.D.equals("")) {
            codedOutputByteBufferNano.a(16, this.D);
        }
        if (this.G || !this.F.equals("")) {
            codedOutputByteBufferNano.a(17, this.F);
        }
        if (this.I || !this.H.equals("")) {
            codedOutputByteBufferNano.a(18, this.H);
        }
        if (this.M || !this.L.equals("")) {
            codedOutputByteBufferNano.a(19, this.L);
        }
        if (this.O || !this.N.equals("")) {
            codedOutputByteBufferNano.a(20, this.N);
        }
        if (this.Q || this.P) {
            codedOutputByteBufferNano.a(21, this.P);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(22, this.k);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(23, this.q);
        }
        if (this.S || !Arrays.equals(this.R, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(24, this.R);
        }
        if (this.A != null) {
            codedOutputByteBufferNano.b(25, this.A);
        }
        if (this.U || this.T) {
            codedOutputByteBufferNano.a(26, this.T);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(27, this.s);
        }
        if (this.W || this.V) {
            codedOutputByteBufferNano.a(29, this.V);
        }
        if (this.X != null && this.X.length > 0) {
            for (int i4 = 0; i4 < this.X.length; i4++) {
                oc ocVar = this.X[i4];
                if (ocVar != null) {
                    codedOutputByteBufferNano.b(30, ocVar);
                }
            }
        }
        if (this.K || !this.J.equals("")) {
            codedOutputByteBufferNano.a(31, this.J);
        }
        if (this.Z || this.Y) {
            codedOutputByteBufferNano.a(32, this.Y);
        }
        if (this.ab || this.aa) {
            codedOutputByteBufferNano.a(33, this.aa);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3891b || !this.f3890a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3890a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != 1 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.g != 0 || this.h) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.o);
        }
        if (this.u != null && this.u.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.u.length; i2++) {
                ea eaVar = this.u[i2];
                if (eaVar != null) {
                    i += CodedOutputByteBufferNano.d(8, eaVar);
                }
            }
            a2 = i;
        }
        if (this.v != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.v);
        }
        if (this.w != null && this.w.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.w.length; i4++) {
                ds dsVar = this.w[i4];
                if (dsVar != null) {
                    i3 += CodedOutputByteBufferNano.d(10, dsVar);
                }
            }
            a2 = i3;
        }
        if (this.x != null && this.x.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.x.length; i6++) {
                gx gxVar = this.x[i6];
                if (gxVar != null) {
                    i5 += CodedOutputByteBufferNano.d(11, gxVar);
                }
            }
            a2 = i5;
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.y);
        }
        if (this.z != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.z);
        }
        if (this.B != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.B);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.C);
        }
        if (this.E || !this.D.equals("")) {
            a2 += CodedOutputByteBufferNano.b(16, this.D);
        }
        if (this.G || !this.F.equals("")) {
            a2 += CodedOutputByteBufferNano.b(17, this.F);
        }
        if (this.I || !this.H.equals("")) {
            a2 += CodedOutputByteBufferNano.b(18, this.H);
        }
        if (this.M || !this.L.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.L);
        }
        if (this.O || !this.N.equals("")) {
            a2 += CodedOutputByteBufferNano.b(20, this.N);
        }
        if (this.Q || this.P) {
            a2 += CodedOutputByteBufferNano.c(21) + 1;
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(22, this.k);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(23, this.q);
        }
        if (this.S || !Arrays.equals(this.R, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(24, this.R);
        }
        if (this.A != null) {
            a2 += CodedOutputByteBufferNano.d(25, this.A);
        }
        if (this.U || this.T) {
            a2 += CodedOutputByteBufferNano.c(26) + 1;
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(27, this.s);
        }
        if (this.W || this.V) {
            a2 += CodedOutputByteBufferNano.c(29) + 1;
        }
        if (this.X != null && this.X.length > 0) {
            for (int i7 = 0; i7 < this.X.length; i7++) {
                oc ocVar = this.X[i7];
                if (ocVar != null) {
                    a2 += CodedOutputByteBufferNano.d(30, ocVar);
                }
            }
        }
        if (this.K || !this.J.equals("")) {
            a2 += CodedOutputByteBufferNano.b(31, this.J);
        }
        if (this.Z || this.Y) {
            a2 += CodedOutputByteBufferNano.c(32) + 1;
        }
        if (this.ab || this.aa) {
            return a2 + CodedOutputByteBufferNano.c(33) + 1;
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
                    this.f3890a = aVar.c();
                    this.f3891b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
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
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
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
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.g = e2;
                            this.h = true;
                            break;
                    }
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 58:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 66:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 66);
                    int length = this.u == null ? 0 : this.u.length;
                    ea[] eaVarArr = new ea[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.u, 0, eaVarArr, 0, length);
                    }
                    while (length < eaVarArr.length - 1) {
                        eaVarArr[length] = new ea();
                        aVar.a(eaVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    eaVarArr[length] = new ea();
                    aVar.a(eaVarArr[length]);
                    this.u = eaVarArr;
                    break;
                case 74:
                    if (this.v == null) {
                        this.v = new ht();
                    }
                    aVar.a(this.v);
                    break;
                case 82:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length2 = this.w == null ? 0 : this.w.length;
                    ds[] dsVarArr = new ds[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.w, 0, dsVarArr, 0, length2);
                    }
                    while (length2 < dsVarArr.length - 1) {
                        dsVarArr[length2] = new ds();
                        aVar.a(dsVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    dsVarArr[length2] = new ds();
                    aVar.a(dsVarArr[length2]);
                    this.w = dsVarArr;
                    break;
                case 90:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length3 = this.x == null ? 0 : this.x.length;
                    gx[] gxVarArr = new gx[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.x, 0, gxVarArr, 0, length3);
                    }
                    while (length3 < gxVarArr.length - 1) {
                        gxVarArr[length3] = new gx();
                        aVar.a(gxVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    gxVarArr[length3] = new gx();
                    aVar.a(gxVarArr[length3]);
                    this.x = gxVarArr;
                    break;
                case 98:
                    if (this.y == null) {
                        this.y = new et();
                    }
                    aVar.a(this.y);
                    break;
                case 106:
                    if (this.z == null) {
                        this.z = new gp();
                    }
                    aVar.a(this.z);
                    break;
                case 114:
                    if (this.B == null) {
                        this.B = new nb();
                    }
                    aVar.a(this.B);
                    break;
                case 122:
                    if (this.C == null) {
                        this.C = new ae();
                    }
                    aVar.a(this.C);
                    break;
                case 130:
                    this.D = aVar.c();
                    this.E = true;
                    break;
                case 138:
                    this.F = aVar.c();
                    this.G = true;
                    break;
                case 146:
                    this.H = aVar.c();
                    this.I = true;
                    break;
                case 154:
                    this.L = aVar.c();
                    this.M = true;
                    break;
                case 162:
                    this.N = aVar.c();
                    this.O = true;
                    break;
                case 168:
                    this.P = aVar.b();
                    this.Q = true;
                    break;
                case 178:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 186:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 194:
                    this.R = aVar.d();
                    this.S = true;
                    break;
                case 202:
                    if (this.A == null) {
                        this.A = new gr();
                    }
                    aVar.a(this.A);
                    break;
                case 208:
                    this.T = aVar.b();
                    this.U = true;
                    break;
                case 218:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 232:
                    this.V = aVar.b();
                    this.W = true;
                    break;
                case 242:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 242);
                    int length4 = this.X == null ? 0 : this.X.length;
                    oc[] ocVarArr = new oc[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.X, 0, ocVarArr, 0, length4);
                    }
                    while (length4 < ocVarArr.length - 1) {
                        ocVarArr[length4] = new oc();
                        aVar.a(ocVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    ocVarArr[length4] = new oc();
                    aVar.a(ocVarArr[length4]);
                    this.X = ocVarArr;
                    break;
                case 250:
                    this.J = aVar.c();
                    this.K = true;
                    break;
                case 256:
                    this.Y = aVar.b();
                    this.Z = true;
                    break;
                case 264:
                    this.aa = aVar.b();
                    this.ab = true;
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
