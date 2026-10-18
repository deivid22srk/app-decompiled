package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ag extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1449a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1450b = false;
    public boolean c = false;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public int q = 0;
    public boolean r = false;
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public al w = null;
    public int x = 0;
    public boolean y = false;
    public int z = 0;
    public boolean A = false;
    public long B = 0;
    public boolean C = false;

    public ag() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1450b || this.f1449a) {
            codedOutputByteBufferNano.a(1, this.f1449a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k != 0) {
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
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.a(11, this.s);
        }
        if (this.v || this.u) {
            codedOutputByteBufferNano.a(12, this.u);
        }
        if (this.w != null) {
            codedOutputByteBufferNano.b(13, this.w);
        }
        if (this.y || this.x != 0) {
            codedOutputByteBufferNano.a(14, this.x);
        }
        if (this.A || this.z != 0) {
            codedOutputByteBufferNano.a(15, this.z);
        }
        if (this.C || this.B != 0) {
            codedOutputByteBufferNano.b(16, this.B);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1450b || this.f1449a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.k);
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
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.c(11, this.s);
        }
        if (this.v || this.u) {
            a2 += CodedOutputByteBufferNano.c(12) + 1;
        }
        if (this.w != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.w);
        }
        if (this.y || this.x != 0) {
            a2 += CodedOutputByteBufferNano.c(14, this.x);
        }
        if (this.A || this.z != 0) {
            a2 += CodedOutputByteBufferNano.c(15, this.z);
        }
        if (this.C || this.B != 0) {
            return a2 + CodedOutputByteBufferNano.e(16, this.B);
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
                    this.f1449a = aVar.b();
                    this.f1450b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.e();
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
                case 88:
                    this.s = aVar.e();
                    this.t = true;
                    break;
                case 96:
                    this.u = aVar.b();
                    this.v = true;
                    break;
                case 106:
                    if (this.w == null) {
                        this.w = new al();
                    }
                    aVar.a(this.w);
                    break;
                case 112:
                    this.x = aVar.e();
                    this.y = true;
                    break;
                case 120:
                    this.z = aVar.e();
                    this.A = true;
                    break;
                case 128:
                    this.B = aVar.f();
                    this.C = true;
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
