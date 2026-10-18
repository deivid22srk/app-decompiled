package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pf extends com.google.protobuf.nano.c {
    private static volatile pf[] n;

    /* renamed from: a, reason: collision with root package name */
    public String f4243a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4244b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public ad m = null;

    public static pf[] b() {
        if (n == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (n == null) {
                    n = new pf[0];
                }
            }
        }
        return n;
    }

    public pf() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4244b || !this.f4243a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4243a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(7, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4244b || !this.f4243a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4243a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.k);
        }
        if (this.m != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.m);
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
                    this.f4243a = aVar.c();
                    this.f4244b = true;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 58:
                    if (this.m == null) {
                        this.m = new ad();
                    }
                    aVar.a(this.m);
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
