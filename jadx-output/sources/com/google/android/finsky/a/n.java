package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class n extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f1490a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1491b = false;
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
    public String m = "";
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public long q = 0;
    public boolean r = false;
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;

    public n() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1491b || this.f1490a != 0) {
            codedOutputByteBufferNano.a(1, this.f1490a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.b(9, this.q);
        }
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.a(10, this.s);
        }
        if (this.v || this.u) {
            codedOutputByteBufferNano.a(11, this.u);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1491b || this.f1490a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1490a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.h || this.g) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.p || this.o) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.e(9, this.q);
        }
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.s);
        }
        if (this.v || this.u) {
            return a2 + CodedOutputByteBufferNano.c(11) + 1;
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
                    this.f1490a = aVar.e();
                    this.f1491b = true;
                    break;
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 58:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.b();
                    this.p = true;
                    break;
                case 72:
                    this.q = aVar.f();
                    this.r = true;
                    break;
                case 80:
                    this.s = aVar.e();
                    this.t = true;
                    break;
                case 88:
                    this.u = aVar.b();
                    this.v = true;
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
