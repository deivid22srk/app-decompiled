package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nb extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f4156a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4157b = false;
    public float c = 0.0f;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public long i = 0;
    public boolean j = false;
    public long k = 0;
    public boolean l = false;
    public long m = 0;
    public boolean n = false;
    public long o = 0;
    public boolean p = false;
    public long q = 0;
    public boolean r = false;
    public double s = 0.0d;
    public boolean t = false;
    public long u = 0;
    public boolean v = false;
    public long w = 0;
    public boolean x = false;
    public nc[] y = nc.b();

    public nb() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4156a != 1 || this.f4157b) {
            codedOutputByteBufferNano.a(1, this.f4156a);
        }
        if (this.d || Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(4, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(5, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.a(6, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(7, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(8, this.q);
        }
        if (this.v || this.u != 0) {
            codedOutputByteBufferNano.a(9, this.u);
        }
        if (this.x || this.w != 0) {
            codedOutputByteBufferNano.a(10, this.w);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(11, this.g);
        }
        if (this.t || Double.doubleToLongBits(this.s) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(12, this.s);
        }
        if (this.y != null && this.y.length > 0) {
            for (int i = 0; i < this.y.length; i++) {
                nc ncVar = this.y[i];
                if (ncVar != null) {
                    codedOutputByteBufferNano.b(13, ncVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4156a != 1 || this.f4157b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4156a);
        }
        if (this.d || Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(2) + 4;
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.d(4, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.d(5, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.d(6, this.m);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.d(7, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.d(8, this.q);
        }
        if (this.v || this.u != 0) {
            a2 += CodedOutputByteBufferNano.d(9, this.u);
        }
        if (this.x || this.w != 0) {
            a2 += CodedOutputByteBufferNano.d(10, this.w);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.d(11, this.g);
        }
        if (this.t || Double.doubleToLongBits(this.s) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(12) + 8;
        }
        if (this.y != null && this.y.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.y.length; i2++) {
                nc ncVar = this.y[i2];
                if (ncVar != null) {
                    i += CodedOutputByteBufferNano.d(13, ncVar);
                }
            }
            return i;
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
                        case 1:
                        case 2:
                        case 3:
                            this.f4156a = e;
                            this.f4157b = true;
                            break;
                    }
                case 21:
                    this.c = Float.intBitsToFloat(aVar.g());
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 32:
                    this.i = aVar.f();
                    this.j = true;
                    break;
                case 40:
                    this.k = aVar.f();
                    this.l = true;
                    break;
                case 48:
                    this.m = aVar.f();
                    this.n = true;
                    break;
                case 56:
                    this.o = aVar.f();
                    this.p = true;
                    break;
                case 64:
                    this.q = aVar.f();
                    this.r = true;
                    break;
                case 72:
                    this.u = aVar.f();
                    this.v = true;
                    break;
                case 80:
                    this.w = aVar.f();
                    this.x = true;
                    break;
                case 88:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 97:
                    this.s = Double.longBitsToDouble(aVar.h());
                    this.t = true;
                    break;
                case 106:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 106);
                    int length = this.y == null ? 0 : this.y.length;
                    nc[] ncVarArr = new nc[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.y, 0, ncVarArr, 0, length);
                    }
                    while (length < ncVarArr.length - 1) {
                        ncVarArr[length] = new nc();
                        aVar.a(ncVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ncVarArr[length] = new nc();
                    aVar.a(ncVarArr[length]);
                    this.y = ncVarArr;
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
