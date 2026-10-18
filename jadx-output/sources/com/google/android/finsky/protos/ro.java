package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ro extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4347a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4348b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public long m = 0;
    public boolean n = false;
    public long o = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int u = 0;
    public boolean v = false;
    public String w = "";
    public boolean x = false;
    public String y = "";
    public boolean z = false;
    public long A = 0;
    public boolean B = false;

    public ro() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4348b || !this.f4347a.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4347a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.b(8, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.b(9, this.o);
        }
        if (this.r || this.q) {
            codedOutputByteBufferNano.a(10, this.q);
        }
        if (this.t || this.s) {
            codedOutputByteBufferNano.a(11, this.s);
        }
        if (this.v || this.u != 0) {
            codedOutputByteBufferNano.a(12, this.u);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(13, this.w);
        }
        if (this.z || !this.y.equals("")) {
            codedOutputByteBufferNano.a(14, this.y);
        }
        if (this.B || this.A != 0) {
            codedOutputByteBufferNano.b(16, this.A);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4348b || !this.f4347a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4347a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.e(8, this.m);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.e(9, this.o);
        }
        if (this.r || this.q) {
            a2 += CodedOutputByteBufferNano.c(10) + 1;
        }
        if (this.t || this.s) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (this.v || this.u != 0) {
            a2 += CodedOutputByteBufferNano.c(12, this.u);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.w);
        }
        if (this.z || !this.y.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.y);
        }
        if (this.B || this.A != 0) {
            return a2 + CodedOutputByteBufferNano.e(16, this.A);
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
                case 18:
                    this.f4347a = aVar.c();
                    this.f4348b = true;
                    break;
                case 26:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 34:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 58:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 64:
                    this.m = aVar.f();
                    this.n = true;
                    break;
                case 72:
                    this.o = aVar.f();
                    this.p = true;
                    break;
                case 80:
                    this.q = aVar.b();
                    this.r = true;
                    break;
                case 88:
                    this.s = aVar.b();
                    this.t = true;
                    break;
                case 96:
                    this.u = aVar.e();
                    this.v = true;
                    break;
                case 106:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 114:
                    this.y = aVar.c();
                    this.z = true;
                    break;
                case 128:
                    this.A = aVar.f();
                    this.B = true;
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
