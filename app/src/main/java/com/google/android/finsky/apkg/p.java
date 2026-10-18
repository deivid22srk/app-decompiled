package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class p extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1494a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1495b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public int q = 0;
    public boolean r = false;
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;

    public p() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1495b || this.f1494a) {
            codedOutputByteBufferNano.a(5, this.f1494a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(6, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(9, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(10, this.k);
        }
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(11, this.m);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(12, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(13, this.q);
        }
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.a(14, this.s);
        }
        if (this.v || this.u) {
            codedOutputByteBufferNano.a(15, this.u);
        }
        if (this.x || this.w) {
            codedOutputByteBufferNano.a(16, this.w);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1495b || this.f1494a) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.g);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(10) + 1;
        }
        if (this.n || this.m) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (this.p || this.o) {
            a2 += CodedOutputByteBufferNano.c(12) + 1;
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.c(13, this.q);
        }
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.c(14, this.s);
        }
        if (this.v || this.u) {
            a2 += CodedOutputByteBufferNano.c(15) + 1;
        }
        if (this.x || this.w) {
            return a2 + CodedOutputByteBufferNano.c(16) + 1;
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
                case 40:
                    this.f1494a = aVar.b();
                    this.f1495b = true;
                    break;
                case 48:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 56:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 64:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 72:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 80:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 88:
                    this.m = aVar.b();
                    this.n = true;
                    break;
                case 96:
                    this.o = aVar.b();
                    this.p = true;
                    break;
                case 104:
                    this.q = aVar.e();
                    this.r = true;
                    break;
                case 112:
                    this.s = aVar.e();
                    this.t = true;
                    break;
                case 120:
                    this.u = aVar.b();
                    this.v = true;
                    break;
                case 128:
                    this.w = aVar.b();
                    this.x = true;
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
