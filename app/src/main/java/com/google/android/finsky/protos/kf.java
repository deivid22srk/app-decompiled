package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kf extends com.google.protobuf.nano.c {
    private static volatile kf[] w;

    /* renamed from: a, reason: collision with root package name */
    public int f4031a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4032b = false;
    public String c = "";
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public dp g = null;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public jb l = null;
    public ac m = null;
    public aa n = null;
    public mw o = null;
    public ms p = null;
    public qn q = null;
    public im r = null;
    public ir s = null;
    public qu t = null;
    public boolean u = true;
    public boolean v = false;

    public static kf[] b() {
        if (w == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (w == null) {
                    w = new kf[0];
                }
            }
        }
        return w;
    }

    public kf() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4031a != 1 || this.f4032b) {
            codedOutputByteBufferNano.a(1, this.f4031a);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(7, this.m);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(8, this.n);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(9, this.o);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(10, this.q);
        }
        if (this.r != null) {
            codedOutputByteBufferNano.b(11, this.r);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(12, this.p);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(13, this.c);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(14, this.l);
        }
        if (this.s != null) {
            codedOutputByteBufferNano.b(15, this.s);
        }
        if (this.t != null) {
            codedOutputByteBufferNano.b(16, this.t);
        }
        if (this.v || !this.u) {
            codedOutputByteBufferNano.a(17, this.u);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4031a != 1 || this.f4032b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4031a);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.g);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.h);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.j);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.m);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.n);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.o);
        }
        if (this.q != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.q);
        }
        if (this.r != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.r);
        }
        if (this.p != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.p);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.c);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.l);
        }
        if (this.s != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.s);
        }
        if (this.t != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.t);
        }
        if (this.v || !this.u) {
            return a2 + CodedOutputByteBufferNano.c(17) + 1;
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f4031a = e;
                            this.f4032b = true;
                            break;
                    }
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new dp();
                    }
                    aVar.a(this.g);
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 50:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 58:
                    if (this.m == null) {
                        this.m = new ac();
                    }
                    aVar.a(this.m);
                    break;
                case 66:
                    if (this.n == null) {
                        this.n = new aa();
                    }
                    aVar.a(this.n);
                    break;
                case 74:
                    if (this.o == null) {
                        this.o = new mw();
                    }
                    aVar.a(this.o);
                    break;
                case 82:
                    if (this.q == null) {
                        this.q = new qn();
                    }
                    aVar.a(this.q);
                    break;
                case 90:
                    if (this.r == null) {
                        this.r = new im();
                    }
                    aVar.a(this.r);
                    break;
                case 98:
                    if (this.p == null) {
                        this.p = new ms();
                    }
                    aVar.a(this.p);
                    break;
                case 106:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 114:
                    if (this.l == null) {
                        this.l = new jb();
                    }
                    aVar.a(this.l);
                    break;
                case 122:
                    if (this.s == null) {
                        this.s = new ir();
                    }
                    aVar.a(this.s);
                    break;
                case 130:
                    if (this.t == null) {
                        this.t = new qu();
                    }
                    aVar.a(this.t);
                    break;
                case 136:
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
