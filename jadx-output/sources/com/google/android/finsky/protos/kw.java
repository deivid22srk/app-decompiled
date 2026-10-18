package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kw extends com.google.protobuf.nano.c {
    private static volatile kw[] u;

    /* renamed from: a, reason: collision with root package name */
    public String f4058a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4059b = false;
    public long c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public long o = 0;
    public boolean p = false;
    public long q = 0;
    public boolean r = false;
    public long s = 0;
    public boolean t = false;

    public static kw[] b() {
        if (u == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (u == null) {
                    u = new kw[0];
                }
            }
        }
        return u;
    }

    public kw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(1, this.c);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(2, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(4, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(5, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.b(6, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.b(7, this.q);
        }
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.b(8, this.s);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(9, this.e);
        }
        if (this.f4059b || !this.f4058a.equals("")) {
            codedOutputByteBufferNano.a(10, this.f4058a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.c);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.m);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.q);
        }
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.e(8, this.s);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.e);
        }
        if (this.f4059b || !this.f4058a.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(10, this.f4058a);
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
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 16:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 24:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 34:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 42:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 48:
                    this.o = aVar.f();
                    this.p = true;
                    break;
                case 56:
                    this.q = aVar.f();
                    this.r = true;
                    break;
                case 64:
                    this.s = aVar.f();
                    this.t = true;
                    break;
                case 74:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 82:
                    this.f4058a = aVar.c();
                    this.f4059b = true;
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
