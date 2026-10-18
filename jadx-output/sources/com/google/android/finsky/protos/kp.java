package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kp extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f4048a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4049b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public long i = 0;
    public boolean j = false;
    public long k = 0;
    public boolean l = false;
    public long m = 0;
    public boolean n = false;
    public ei o = null;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public ef t = null;
    public ii u = null;
    public dy v = null;
    public int w = 1;
    public boolean x = false;
    public jc y = null;
    public dp z = null;
    public boolean A = false;
    public boolean B = false;

    public kp() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4049b || this.f4048a != 0) {
            codedOutputByteBufferNano.b(1, this.f4048a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.b(4, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.b(5, this.m);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(6, this.o);
        }
        if (this.q || this.p) {
            codedOutputByteBufferNano.a(7, this.p);
        }
        if (this.s || this.r) {
            codedOutputByteBufferNano.a(8, this.r);
        }
        if (this.t != null) {
            codedOutputByteBufferNano.b(9, this.t);
        }
        if (this.u != null) {
            codedOutputByteBufferNano.b(10, this.u);
        }
        if (this.v != null) {
            codedOutputByteBufferNano.b(11, this.v);
        }
        if (this.x || this.w != 1) {
            codedOutputByteBufferNano.a(12, this.w);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(14, this.i);
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(15, this.y);
        }
        if (this.z != null) {
            codedOutputByteBufferNano.b(16, this.z);
        }
        if (this.B || this.A) {
            codedOutputByteBufferNano.a(17, this.A);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(18, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4049b || this.f4048a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4048a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.h || this.g) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.e(5, this.m);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.o);
        }
        if (this.q || this.p) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.s || this.r) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.t != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.t);
        }
        if (this.u != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.u);
        }
        if (this.v != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.v);
        }
        if (this.x || this.w != 1) {
            a2 += CodedOutputByteBufferNano.c(12, this.w);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.e(14, this.i);
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.y);
        }
        if (this.z != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.z);
        }
        if (this.B || this.A) {
            a2 += CodedOutputByteBufferNano.c(17) + 1;
        }
        if (this.f || this.e != 0) {
            return a2 + CodedOutputByteBufferNano.e(18, this.e);
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
                    this.f4048a = aVar.f();
                    this.f4049b = true;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 24:
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 32:
                    this.k = aVar.f();
                    this.l = true;
                    break;
                case 40:
                    this.m = aVar.f();
                    this.n = true;
                    break;
                case 50:
                    if (this.o == null) {
                        this.o = new ei();
                    }
                    aVar.a(this.o);
                    break;
                case 56:
                    this.p = aVar.b();
                    this.q = true;
                    break;
                case 64:
                    this.r = aVar.b();
                    this.s = true;
                    break;
                case 74:
                    if (this.t == null) {
                        this.t = new ef();
                    }
                    aVar.a(this.t);
                    break;
                case 82:
                    if (this.u == null) {
                        this.u = new ii();
                    }
                    aVar.a(this.u);
                    break;
                case 90:
                    if (this.v == null) {
                        this.v = new dy();
                    }
                    aVar.a(this.v);
                    break;
                case 96:
                    this.w = aVar.e();
                    this.x = true;
                    break;
                case 112:
                    this.i = aVar.f();
                    this.j = true;
                    break;
                case 122:
                    if (this.y == null) {
                        this.y = new jc();
                    }
                    aVar.a(this.y);
                    break;
                case 130:
                    if (this.z == null) {
                        this.z = new dp();
                    }
                    aVar.a(this.z);
                    break;
                case 136:
                    this.A = aVar.b();
                    this.B = true;
                    break;
                case 144:
                    this.e = aVar.f();
                    this.f = true;
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
