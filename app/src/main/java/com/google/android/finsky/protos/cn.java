package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cn extends com.google.protobuf.nano.c {
    private static volatile cn[] o;

    /* renamed from: a, reason: collision with root package name */
    public cj f3685a = null;

    /* renamed from: b, reason: collision with root package name */
    public cl f3686b = null;
    public dj c = null;
    public ck d = null;
    public di e = null;
    public cr f = null;
    public dc g = null;
    public dg h = null;
    public ci i = null;
    public dd j = null;
    public cs k = null;
    public cm l = null;
    public co m = null;
    public cp n = null;

    public static cn[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new cn[0];
                }
            }
        }
        return o;
    }

    public cn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3685a != null) {
            codedOutputByteBufferNano.b(1, this.f3685a);
        }
        if (this.f3686b != null) {
            codedOutputByteBufferNano.b(2, this.f3686b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(6, this.m);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(7, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(8, this.g);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(9, this.h);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(10, this.n);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(11, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(12, this.j);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(13, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(14, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3685a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3685a);
        }
        if (this.f3686b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3686b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.m);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.g);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.h);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.n);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.i);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.j);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.k);
        }
        if (this.l != null) {
            return a2 + CodedOutputByteBufferNano.d(14, this.l);
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
                    if (this.f3685a == null) {
                        this.f3685a = new cj();
                    }
                    aVar.a(this.f3685a);
                    break;
                case 18:
                    if (this.f3686b == null) {
                        this.f3686b = new cl();
                    }
                    aVar.a(this.f3686b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new dj();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new ck();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new di();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    if (this.m == null) {
                        this.m = new co();
                    }
                    aVar.a(this.m);
                    break;
                case 58:
                    if (this.f == null) {
                        this.f = new cr();
                    }
                    aVar.a(this.f);
                    break;
                case 66:
                    if (this.g == null) {
                        this.g = new dc();
                    }
                    aVar.a(this.g);
                    break;
                case 74:
                    if (this.h == null) {
                        this.h = new dg();
                    }
                    aVar.a(this.h);
                    break;
                case 82:
                    if (this.n == null) {
                        this.n = new cp();
                    }
                    aVar.a(this.n);
                    break;
                case 90:
                    if (this.i == null) {
                        this.i = new ci();
                    }
                    aVar.a(this.i);
                    break;
                case 98:
                    if (this.j == null) {
                        this.j = new dd();
                    }
                    aVar.a(this.j);
                    break;
                case 106:
                    if (this.k == null) {
                        this.k = new cs();
                    }
                    aVar.a(this.k);
                    break;
                case 114:
                    if (this.l == null) {
                        this.l = new cm();
                    }
                    aVar.a(this.l);
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
