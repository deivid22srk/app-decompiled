package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ri extends com.google.protobuf.nano.c {
    private static volatile ri[] o;

    /* renamed from: a, reason: collision with root package name */
    public String f4335a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4336b = false;
    public int c = 1;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public String m = "";
    public boolean n = false;

    public static ri[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new ri[0];
                }
            }
        }
        return o;
    }

    public ri() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4336b || !this.f4335a.equals("")) {
            codedOutputByteBufferNano.a(3, this.f4335a);
        }
        if (this.c != 1 || this.d) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(6, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(7, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(8, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(9, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4336b || !this.f4335a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f4335a);
        }
        if (this.c != 1 || this.d) {
            a2 += CodedOutputByteBufferNano.c(4, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(5, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.k);
        }
        if (this.n || !this.m.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(9, this.m);
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
                case 26:
                    this.f4335a = aVar.c();
                    this.f4336b = true;
                    break;
                case 32:
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
                        case 10:
                        case 11:
                        case 12:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 40:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 48:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 58:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 64:
                    this.k = aVar.e();
                    this.l = true;
                    break;
                case 74:
                    this.m = aVar.c();
                    this.n = true;
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
