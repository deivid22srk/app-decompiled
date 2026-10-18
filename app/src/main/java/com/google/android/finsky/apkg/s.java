package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class s extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1500a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1501b = false;
    public int c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public int w = 0;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public long E = 0;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public int K = 0;
    public boolean L = false;
    public int M = 0;
    public boolean N = false;
    public int O = 0;
    public boolean P = false;
    public int Q = 0;
    public boolean R = false;
    public int S = 0;
    public boolean T = false;
    public int U = 0;
    public boolean V = false;
    public int W = 0;
    public boolean X = false;

    public s() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1501b || this.f1500a) {
            codedOutputByteBufferNano.a(1, this.f1500a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(5, this.k);
        }
        if (this.m != 0 || this.n) {
            codedOutputByteBufferNano.a(6, this.m);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(7, this.o);
        }
        if (this.r || this.q) {
            codedOutputByteBufferNano.a(8, this.q);
        }
        if (this.L || this.K != 0) {
            codedOutputByteBufferNano.a(9, this.K);
        }
        if (this.O != 0 || this.P) {
            codedOutputByteBufferNano.a(10, this.O);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(11, this.i);
        }
        if (this.t || this.s) {
            codedOutputByteBufferNano.a(12, this.s);
        }
        if (this.v || this.u) {
            codedOutputByteBufferNano.a(13, this.u);
        }
        if (this.w != 0 || this.x) {
            codedOutputByteBufferNano.a(14, this.w);
        }
        if (this.z || this.y) {
            codedOutputByteBufferNano.a(15, this.y);
        }
        if (this.B || this.A) {
            codedOutputByteBufferNano.a(16, this.A);
        }
        if (this.D || this.C) {
            codedOutputByteBufferNano.a(17, this.C);
        }
        if (this.H || this.G) {
            codedOutputByteBufferNano.a(18, this.G);
        }
        if (this.N || this.M != 0) {
            codedOutputByteBufferNano.a(19, this.M);
        }
        if (this.Q != 0 || this.R) {
            codedOutputByteBufferNano.a(20, this.Q);
        }
        if (this.S != 0 || this.T) {
            codedOutputByteBufferNano.a(21, this.S);
        }
        if (this.F || this.E != 0) {
            codedOutputByteBufferNano.b(22, this.E);
        }
        if (this.J || this.I) {
            codedOutputByteBufferNano.a(23, this.I);
        }
        if (this.V || this.U != 0) {
            codedOutputByteBufferNano.a(24, this.U);
        }
        if (this.X || this.W != 0) {
            codedOutputByteBufferNano.a(25, this.W);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1501b || this.f1500a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.h || this.g) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.m != 0 || this.n) {
            a2 += CodedOutputByteBufferNano.c(6, this.m);
        }
        if (this.p || this.o) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.r || this.q) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.L || this.K != 0) {
            a2 += CodedOutputByteBufferNano.c(9, this.K);
        }
        if (this.O != 0 || this.P) {
            a2 += CodedOutputByteBufferNano.c(10, this.O);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (this.t || this.s) {
            a2 += CodedOutputByteBufferNano.c(12) + 1;
        }
        if (this.v || this.u) {
            a2 += CodedOutputByteBufferNano.c(13) + 1;
        }
        if (this.w != 0 || this.x) {
            a2 += CodedOutputByteBufferNano.c(14, this.w);
        }
        if (this.z || this.y) {
            a2 += CodedOutputByteBufferNano.c(15) + 1;
        }
        if (this.B || this.A) {
            a2 += CodedOutputByteBufferNano.c(16) + 1;
        }
        if (this.D || this.C) {
            a2 += CodedOutputByteBufferNano.c(17) + 1;
        }
        if (this.H || this.G) {
            a2 += CodedOutputByteBufferNano.c(18) + 1;
        }
        if (this.N || this.M != 0) {
            a2 += CodedOutputByteBufferNano.c(19, this.M);
        }
        if (this.Q != 0 || this.R) {
            a2 += CodedOutputByteBufferNano.c(20, this.Q);
        }
        if (this.S != 0 || this.T) {
            a2 += CodedOutputByteBufferNano.c(21, this.S);
        }
        if (this.F || this.E != 0) {
            a2 += CodedOutputByteBufferNano.e(22, this.E);
        }
        if (this.J || this.I) {
            a2 += CodedOutputByteBufferNano.c(23) + 1;
        }
        if (this.V || this.U != 0) {
            a2 += CodedOutputByteBufferNano.c(24, this.U);
        }
        if (this.X || this.W != 0) {
            return a2 + CodedOutputByteBufferNano.c(25, this.W);
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
                    this.f1500a = aVar.b();
                    this.f1501b = true;
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 24:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 40:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 48:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.m = e2;
                            this.n = true;
                            break;
                    }
                case 56:
                    this.o = aVar.b();
                    this.p = true;
                    break;
                case 64:
                    this.q = aVar.b();
                    this.r = true;
                    break;
                case 72:
                    this.K = aVar.e();
                    this.L = true;
                    break;
                case 80:
                    int e3 = aVar.e();
                    switch (e3) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.O = e3;
                            this.P = true;
                            break;
                    }
                case 88:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 96:
                    this.s = aVar.b();
                    this.t = true;
                    break;
                case 104:
                    this.u = aVar.b();
                    this.v = true;
                    break;
                case 112:
                    int e4 = aVar.e();
                    switch (e4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.w = e4;
                            this.x = true;
                            break;
                    }
                case 120:
                    this.y = aVar.b();
                    this.z = true;
                    break;
                case 128:
                    this.A = aVar.b();
                    this.B = true;
                    break;
                case 136:
                    this.C = aVar.b();
                    this.D = true;
                    break;
                case 144:
                    this.G = aVar.b();
                    this.H = true;
                    break;
                case 152:
                    this.M = aVar.e();
                    this.N = true;
                    break;
                case 160:
                    int e5 = aVar.e();
                    switch (e5) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.Q = e5;
                            this.R = true;
                            break;
                    }
                case 168:
                    int e6 = aVar.e();
                    switch (e6) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.S = e6;
                            this.T = true;
                            break;
                    }
                case 176:
                    this.E = aVar.f();
                    this.F = true;
                    break;
                case 184:
                    this.I = aVar.b();
                    this.J = true;
                    break;
                case 192:
                    this.U = aVar.e();
                    this.V = true;
                    break;
                case 200:
                    this.W = aVar.e();
                    this.X = true;
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
