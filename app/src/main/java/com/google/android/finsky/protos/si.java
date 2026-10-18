package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class si extends com.google.protobuf.nano.c {
    private static volatile si[] m;

    /* renamed from: a, reason: collision with root package name */
    public sg f4383a = null;

    /* renamed from: b, reason: collision with root package name */
    public rv f4384b = null;
    public rk c = null;
    public rn d = null;
    public ry e = null;
    public rg f = null;
    public rp g = null;
    public sk h = null;
    public rd i = null;
    public rt j = null;
    public rr k = null;
    public ra l = null;

    public static si[] b() {
        if (m == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (m == null) {
                    m = new si[0];
                }
            }
        }
        return m;
    }

    public si() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4383a != null) {
            codedOutputByteBufferNano.b(2, this.f4383a);
        }
        if (this.f4384b != null) {
            codedOutputByteBufferNano.b(5, this.f4384b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(8, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(9, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(12, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(17, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(18, this.g);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(23, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(25, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(30, this.j);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(31, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(33, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4383a != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4383a);
        }
        if (this.f4384b != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.f4384b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.g);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(23, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(25, this.i);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(30, this.j);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(31, this.k);
        }
        if (this.l != null) {
            return a2 + CodedOutputByteBufferNano.d(33, this.l);
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
                    if (this.f4383a == null) {
                        this.f4383a = new sg();
                    }
                    aVar.a(this.f4383a);
                    break;
                case 42:
                    if (this.f4384b == null) {
                        this.f4384b = new rv();
                    }
                    aVar.a(this.f4384b);
                    break;
                case 66:
                    if (this.c == null) {
                        this.c = new rk();
                    }
                    aVar.a(this.c);
                    break;
                case 74:
                    if (this.d == null) {
                        this.d = new rn();
                    }
                    aVar.a(this.d);
                    break;
                case 98:
                    if (this.e == null) {
                        this.e = new ry();
                    }
                    aVar.a(this.e);
                    break;
                case 138:
                    if (this.f == null) {
                        this.f = new rg();
                    }
                    aVar.a(this.f);
                    break;
                case 146:
                    if (this.g == null) {
                        this.g = new rp();
                    }
                    aVar.a(this.g);
                    break;
                case 186:
                    if (this.h == null) {
                        this.h = new sk();
                    }
                    aVar.a(this.h);
                    break;
                case 202:
                    if (this.i == null) {
                        this.i = new rd();
                    }
                    aVar.a(this.i);
                    break;
                case 242:
                    if (this.j == null) {
                        this.j = new rt();
                    }
                    aVar.a(this.j);
                    break;
                case 250:
                    if (this.k == null) {
                        this.k = new rr();
                    }
                    aVar.a(this.k);
                    break;
                case 266:
                    if (this.l == null) {
                        this.l = new ra();
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
