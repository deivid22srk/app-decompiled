package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lm extends com.google.protobuf.nano.c {
    private static volatile lm[] t;

    /* renamed from: a, reason: collision with root package name */
    public dp f4086a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f4087b = 0;
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public ds f = null;
    public String g = "";
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public boolean l = false;
    public int m = -1;
    public boolean n = false;
    public in o = null;
    public int p = 0;
    public boolean q = false;
    public long r = 0;
    public boolean s = false;

    public static lm[] b() {
        if (t == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (t == null) {
                    t = new lm[0];
                }
            }
        }
        return t;
    }

    public lm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4086a != null) {
            codedOutputByteBufferNano.b(1, this.f4086a);
        }
        if (this.c || this.f4087b != 0) {
            codedOutputByteBufferNano.a(2, this.f4087b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.p != 0 || this.q) {
            codedOutputByteBufferNano.a(6, this.p);
        }
        if (this.s || this.r != 0) {
            codedOutputByteBufferNano.b(7, this.r);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(8, this.i);
        }
        if (this.l || !this.k) {
            codedOutputByteBufferNano.a(9, this.k);
        }
        if (this.n || this.m != -1) {
            codedOutputByteBufferNano.a(10, this.m);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(11, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4086a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4086a);
        }
        if (this.c || this.f4087b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f4087b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.p != 0 || this.q) {
            a2 += CodedOutputByteBufferNano.c(6, this.p);
        }
        if (this.s || this.r != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.r);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.l || !this.k) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.n || this.m != -1) {
            a2 += CodedOutputByteBufferNano.c(10, this.m);
        }
        if (this.o != null) {
            return a2 + CodedOutputByteBufferNano.d(11, this.o);
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
                    if (this.f4086a == null) {
                        this.f4086a = new dp();
                    }
                    aVar.a(this.f4086a);
                    break;
                case 16:
                    this.f4087b = aVar.e();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new ds();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 48:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.p = e;
                            this.q = true;
                            break;
                    }
                case 56:
                    this.r = aVar.f();
                    this.s = true;
                    break;
                case 64:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 72:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 80:
                    this.m = aVar.e();
                    this.n = true;
                    break;
                case 90:
                    if (this.o == null) {
                        this.o = new in();
                    }
                    aVar.a(this.o);
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
