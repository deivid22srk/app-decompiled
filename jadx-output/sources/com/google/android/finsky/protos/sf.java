package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sf extends com.google.protobuf.nano.c {
    private static volatile sf[] k;

    /* renamed from: a, reason: collision with root package name */
    public ru f4377a = null;

    /* renamed from: b, reason: collision with root package name */
    public rh f4378b = null;
    public rx c = null;
    public rf d = null;
    public sj e = null;
    public rc f = null;
    public rs g = null;
    public rq h = null;
    public re i = null;
    public qz j = null;

    public static sf[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new sf[0];
                }
            }
        }
        return k;
    }

    public sf() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4377a != null) {
            codedOutputByteBufferNano.b(6, this.f4377a);
        }
        if (this.f4378b != null) {
            codedOutputByteBufferNano.b(9, this.f4378b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(13, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(18, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(24, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(26, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(31, this.g);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(32, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(33, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(34, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4377a != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f4377a);
        }
        if (this.f4378b != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.f4378b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(24, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(26, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(31, this.g);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(32, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(33, this.i);
        }
        if (this.j != null) {
            return a2 + CodedOutputByteBufferNano.d(34, this.j);
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
                case 50:
                    if (this.f4377a == null) {
                        this.f4377a = new ru();
                    }
                    aVar.a(this.f4377a);
                    break;
                case 74:
                    if (this.f4378b == null) {
                        this.f4378b = new rh();
                    }
                    aVar.a(this.f4378b);
                    break;
                case 106:
                    if (this.c == null) {
                        this.c = new rx();
                    }
                    aVar.a(this.c);
                    break;
                case 146:
                    if (this.d == null) {
                        this.d = new rf();
                    }
                    aVar.a(this.d);
                    break;
                case 194:
                    if (this.e == null) {
                        this.e = new sj();
                    }
                    aVar.a(this.e);
                    break;
                case 210:
                    if (this.f == null) {
                        this.f = new rc();
                    }
                    aVar.a(this.f);
                    break;
                case 250:
                    if (this.g == null) {
                        this.g = new rs();
                    }
                    aVar.a(this.g);
                    break;
                case 258:
                    if (this.h == null) {
                        this.h = new rq();
                    }
                    aVar.a(this.h);
                    break;
                case 266:
                    if (this.i == null) {
                        this.i = new re();
                    }
                    aVar.a(this.i);
                    break;
                case 274:
                    if (this.j == null) {
                        this.j = new qz();
                    }
                    aVar.a(this.j);
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
