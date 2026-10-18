package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class iz extends com.google.protobuf.nano.c {
    private static volatile iz[] q;

    /* renamed from: a, reason: collision with root package name */
    public dp f3981a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3982b = 1;
    public boolean c = false;
    public long d = 0;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public long h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public iw l = null;
    public ja m = null;
    public iy n = null;
    public ix o = null;
    public dq p = null;

    public static iz[] b() {
        if (q == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (q == null) {
                    q = new iz[0];
                }
            }
        }
        return q;
    }

    public iz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3981a != null) {
            codedOutputByteBufferNano.b(1, this.f3981a);
        }
        if (this.f3982b != 1 || this.c) {
            codedOutputByteBufferNano.a(2, this.f3982b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || this.f) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(5, this.l);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(6, this.m);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(7, this.n);
        }
        if (this.i || this.h != 0) {
            codedOutputByteBufferNano.b(8, this.h);
        }
        if (this.k || this.j) {
            codedOutputByteBufferNano.a(9, this.j);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(10, this.o);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(11, this.p);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3981a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3981a);
        }
        if (this.f3982b != 1 || this.c) {
            a2 += CodedOutputByteBufferNano.c(2, this.f3982b);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.d);
        }
        if (this.g || this.f) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.l);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.m);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.n);
        }
        if (this.i || this.h != 0) {
            a2 += CodedOutputByteBufferNano.e(8, this.h);
        }
        if (this.k || this.j) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.o);
        }
        if (this.p != null) {
            return a2 + CodedOutputByteBufferNano.d(11, this.p);
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
                    if (this.f3981a == null) {
                        this.f3981a = new dp();
                    }
                    aVar.a(this.f3981a);
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f3982b = e;
                            this.c = true;
                            break;
                    }
                case 24:
                    this.d = aVar.f();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.b();
                    this.g = true;
                    break;
                case 42:
                    if (this.l == null) {
                        this.l = new iw();
                    }
                    aVar.a(this.l);
                    break;
                case 50:
                    if (this.m == null) {
                        this.m = new ja();
                    }
                    aVar.a(this.m);
                    break;
                case 58:
                    if (this.n == null) {
                        this.n = new iy();
                    }
                    aVar.a(this.n);
                    break;
                case 64:
                    this.h = aVar.f();
                    this.i = true;
                    break;
                case 72:
                    this.j = aVar.b();
                    this.k = true;
                    break;
                case 82:
                    if (this.o == null) {
                        this.o = new ix();
                    }
                    aVar.a(this.o);
                    break;
                case 90:
                    if (this.p == null) {
                        this.p = new dq();
                    }
                    aVar.a(this.p);
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
