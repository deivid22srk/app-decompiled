package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends com.google.protobuf.nano.c {
    public boolean A;
    public ar B;
    public p C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ao H;
    public String I;
    public boolean J;
    public an K;
    public String L;
    public boolean M;
    public o N;
    public t O;
    public ae P;
    public s Q;
    public String R;
    public boolean S;
    public aq T;
    public q U;
    public r V;
    public am W;
    public ap X;
    public v Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public int f1511a;
    public boolean aa;
    public w ab;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1512b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public int g;
    public boolean h;
    public String i;
    public boolean j;
    public byte[] k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;
    public ag s;
    public n t;
    public long u;
    public boolean v;
    public long w;
    public boolean x;
    public x y;
    public boolean z;

    public y() {
        b();
    }

    public final y b() {
        this.f1511a = 0;
        this.f1512b = false;
        this.c = "";
        this.d = false;
        this.e = "";
        this.f = false;
        this.g = 0;
        this.h = false;
        this.i = "";
        this.j = false;
        this.k = com.google.protobuf.nano.e.h;
        this.l = false;
        this.m = 0;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.q = 0;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = 0L;
        this.v = false;
        this.w = 0L;
        this.x = false;
        this.y = null;
        this.z = false;
        this.A = false;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = "";
        this.J = false;
        this.K = null;
        this.L = "";
        this.M = false;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = "";
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = false;
        this.aa = false;
        this.ab = null;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1511a != 0 || this.f1512b) {
            codedOutputByteBufferNano.a(1, this.f1511a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        if (this.s != null) {
            codedOutputByteBufferNano.b(10, this.s);
        }
        if (this.t != null) {
            codedOutputByteBufferNano.b(11, this.t);
        }
        if (this.v || this.u != 0) {
            codedOutputByteBufferNano.b(12, this.u);
        }
        if (this.x || this.w != 0) {
            codedOutputByteBufferNano.b(13, this.w);
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(14, this.y);
        }
        if (this.A || this.z) {
            codedOutputByteBufferNano.a(15, this.z);
        }
        if (this.B != null) {
            codedOutputByteBufferNano.b(17, this.B);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(18, this.C);
        }
        if (this.E || this.D != 0) {
            codedOutputByteBufferNano.a(19, this.D);
        }
        if (this.G || this.F) {
            codedOutputByteBufferNano.a(20, this.F);
        }
        if (this.H != null) {
            codedOutputByteBufferNano.b(21, this.H);
        }
        if (this.J || !this.I.equals("")) {
            codedOutputByteBufferNano.a(23, this.I);
        }
        if (this.K != null) {
            codedOutputByteBufferNano.b(24, this.K);
        }
        if (this.M || !this.L.equals("")) {
            codedOutputByteBufferNano.a(25, this.L);
        }
        if (this.N != null) {
            codedOutputByteBufferNano.b(26, this.N);
        }
        if (this.O != null) {
            codedOutputByteBufferNano.b(27, this.O);
        }
        if (this.P != null) {
            codedOutputByteBufferNano.b(28, this.P);
        }
        if (this.Q != null) {
            codedOutputByteBufferNano.b(29, this.Q);
        }
        if (this.S || !this.R.equals("")) {
            codedOutputByteBufferNano.a(30, this.R);
        }
        if (this.T != null) {
            codedOutputByteBufferNano.b(31, this.T);
        }
        if (this.U != null) {
            codedOutputByteBufferNano.b(32, this.U);
        }
        if (this.V != null) {
            codedOutputByteBufferNano.b(33, this.V);
        }
        if (this.W != null) {
            codedOutputByteBufferNano.b(34, this.W);
        }
        if (this.X != null) {
            codedOutputByteBufferNano.b(35, this.X);
        }
        if (this.Y != null) {
            codedOutputByteBufferNano.b(36, this.Y);
        }
        if (this.aa || this.Z) {
            codedOutputByteBufferNano.a(38, this.Z);
        }
        if (this.ab != null) {
            codedOutputByteBufferNano.b(39, this.ab);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1511a != 0 || this.f1512b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1511a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.m);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.c(9, this.q);
        }
        if (this.s != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.s);
        }
        if (this.t != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.t);
        }
        if (this.v || this.u != 0) {
            a2 += CodedOutputByteBufferNano.e(12, this.u);
        }
        if (this.x || this.w != 0) {
            a2 += CodedOutputByteBufferNano.e(13, this.w);
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.y);
        }
        if (this.A || this.z) {
            a2 += CodedOutputByteBufferNano.c(15) + 1;
        }
        if (this.B != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.B);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.C);
        }
        if (this.E || this.D != 0) {
            a2 += CodedOutputByteBufferNano.c(19, this.D);
        }
        if (this.G || this.F) {
            a2 += CodedOutputByteBufferNano.c(20) + 1;
        }
        if (this.H != null) {
            a2 += CodedOutputByteBufferNano.d(21, this.H);
        }
        if (this.J || !this.I.equals("")) {
            a2 += CodedOutputByteBufferNano.b(23, this.I);
        }
        if (this.K != null) {
            a2 += CodedOutputByteBufferNano.d(24, this.K);
        }
        if (this.M || !this.L.equals("")) {
            a2 += CodedOutputByteBufferNano.b(25, this.L);
        }
        if (this.N != null) {
            a2 += CodedOutputByteBufferNano.d(26, this.N);
        }
        if (this.O != null) {
            a2 += CodedOutputByteBufferNano.d(27, this.O);
        }
        if (this.P != null) {
            a2 += CodedOutputByteBufferNano.d(28, this.P);
        }
        if (this.Q != null) {
            a2 += CodedOutputByteBufferNano.d(29, this.Q);
        }
        if (this.S || !this.R.equals("")) {
            a2 += CodedOutputByteBufferNano.b(30, this.R);
        }
        if (this.T != null) {
            a2 += CodedOutputByteBufferNano.d(31, this.T);
        }
        if (this.U != null) {
            a2 += CodedOutputByteBufferNano.d(32, this.U);
        }
        if (this.V != null) {
            a2 += CodedOutputByteBufferNano.d(33, this.V);
        }
        if (this.W != null) {
            a2 += CodedOutputByteBufferNano.d(34, this.W);
        }
        if (this.X != null) {
            a2 += CodedOutputByteBufferNano.d(35, this.X);
        }
        if (this.Y != null) {
            a2 += CodedOutputByteBufferNano.d(36, this.Y);
        }
        if (this.aa || this.Z) {
            a2 += CodedOutputByteBufferNano.c(38) + 1;
        }
        if (this.ab != null) {
            return a2 + CodedOutputByteBufferNano.d(39, this.ab);
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                        case 145:
                        case 146:
                        case 200:
                        case 201:
                        case 202:
                        case 203:
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        case 304:
                        case 305:
                        case 306:
                        case 320:
                        case 321:
                        case 322:
                        case 323:
                        case 324:
                        case 325:
                        case 330:
                        case 331:
                        case 332:
                        case 340:
                        case 341:
                        case 342:
                        case 343:
                        case 344:
                        case 345:
                        case 346:
                        case 350:
                        case 351:
                        case 352:
                        case 353:
                        case 354:
                        case 355:
                        case 356:
                        case 357:
                        case 360:
                        case 361:
                        case 362:
                        case 363:
                        case 364:
                        case 365:
                        case 366:
                        case 367:
                        case 380:
                        case 381:
                        case 382:
                        case 383:
                        case 384:
                        case 385:
                        case 400:
                        case 401:
                        case 402:
                        case 403:
                        case 404:
                        case 406:
                        case 407:
                        case 408:
                        case 409:
                        case 500:
                        case 501:
                        case 502:
                        case 503:
                        case 505:
                        case 506:
                        case 507:
                        case 508:
                        case 509:
                        case 510:
                        case 511:
                        case 512:
                        case 513:
                        case 514:
                        case 515:
                        case 516:
                        case 517:
                        case 518:
                        case 519:
                        case 520:
                        case 521:
                        case 522:
                        case 523:
                        case 524:
                        case 525:
                        case 526:
                        case 527:
                        case 528:
                        case 529:
                        case 530:
                        case 531:
                        case 532:
                        case 533:
                        case 600:
                        case 601:
                        case 620:
                        case 630:
                        case 631:
                        case 720:
                        case 721:
                        case 722:
                        case 723:
                        case 724:
                        case 725:
                        case 770:
                        case 771:
                        case 772:
                        case 773:
                        case 774:
                        case 775:
                        case 776:
                        case 800:
                        case 801:
                        case 850:
                        case 851:
                        case 900:
                        case 901:
                        case 902:
                        case 903:
                        case 904:
                        case 905:
                        case 906:
                        case 907:
                        case 908:
                        case 909:
                        case 940:
                        case 941:
                        case 1000:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                        case 1005:
                        case 1006:
                        case 1100:
                        case 1101:
                        case 1102:
                        case 1103:
                        case 1104:
                        case 1105:
                        case 1106:
                        case 1200:
                        case 1201:
                            this.f1511a = e;
                            this.f1512b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    this.k = aVar.d();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.e();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.e();
                    this.p = true;
                    break;
                case 72:
                    this.q = aVar.e();
                    this.r = true;
                    break;
                case 82:
                    if (this.s == null) {
                        this.s = new ag();
                    }
                    aVar.a(this.s);
                    break;
                case 90:
                    if (this.t == null) {
                        this.t = new n();
                    }
                    aVar.a(this.t);
                    break;
                case 96:
                    this.u = aVar.f();
                    this.v = true;
                    break;
                case 104:
                    this.w = aVar.f();
                    this.x = true;
                    break;
                case 114:
                    if (this.y == null) {
                        this.y = new x();
                    }
                    aVar.a(this.y);
                    break;
                case 120:
                    this.z = aVar.b();
                    this.A = true;
                    break;
                case 138:
                    if (this.B == null) {
                        this.B = new ar();
                    }
                    aVar.a(this.B);
                    break;
                case 146:
                    if (this.C == null) {
                        this.C = new p();
                    }
                    aVar.a(this.C);
                    break;
                case 152:
                    this.D = aVar.e();
                    this.E = true;
                    break;
                case 160:
                    this.F = aVar.b();
                    this.G = true;
                    break;
                case 170:
                    if (this.H == null) {
                        this.H = new ao();
                    }
                    aVar.a(this.H);
                    break;
                case 186:
                    this.I = aVar.c();
                    this.J = true;
                    break;
                case 194:
                    if (this.K == null) {
                        this.K = new an();
                    }
                    aVar.a(this.K);
                    break;
                case 202:
                    this.L = aVar.c();
                    this.M = true;
                    break;
                case 210:
                    if (this.N == null) {
                        this.N = new o();
                    }
                    aVar.a(this.N);
                    break;
                case 218:
                    if (this.O == null) {
                        this.O = new t();
                    }
                    aVar.a(this.O);
                    break;
                case 226:
                    if (this.P == null) {
                        this.P = new ae();
                    }
                    aVar.a(this.P);
                    break;
                case 234:
                    if (this.Q == null) {
                        this.Q = new s();
                    }
                    aVar.a(this.Q);
                    break;
                case 242:
                    this.R = aVar.c();
                    this.S = true;
                    break;
                case 250:
                    if (this.T == null) {
                        this.T = new aq();
                    }
                    aVar.a(this.T);
                    break;
                case 258:
                    if (this.U == null) {
                        this.U = new q();
                    }
                    aVar.a(this.U);
                    break;
                case 266:
                    if (this.V == null) {
                        this.V = new r();
                    }
                    aVar.a(this.V);
                    break;
                case 274:
                    if (this.W == null) {
                        this.W = new am();
                    }
                    aVar.a(this.W);
                    break;
                case 282:
                    if (this.X == null) {
                        this.X = new ap();
                    }
                    aVar.a(this.X);
                    break;
                case 290:
                    if (this.Y == null) {
                        this.Y = new v();
                    }
                    aVar.a(this.Y);
                    break;
                case 304:
                    this.Z = aVar.b();
                    this.aa = true;
                    break;
                case 314:
                    if (this.ab == null) {
                        this.ab = new w();
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
