package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ah extends com.google.protobuf.nano.c {
    private static volatile ah[] p;

    /* renamed from: a, reason: collision with root package name */
    public int f3590a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3591b = false;
    public int c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public long i = 0;
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public ad o = null;

    public static ah[] b() {
        if (p == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (p == null) {
                    p = new ah[0];
                }
            }
        }
        return p;
    }

    public ah() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3590a != 0 || this.f3591b) {
            codedOutputByteBufferNano.a(1, this.f3590a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(4, this.k);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(5, this.o);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(6, this.i);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3590a != 0 || this.f3591b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3590a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.k);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.o);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.i);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.h || !this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(8, this.g);
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
                        case 0:
                        case 1:
                            this.f3590a = e;
                            this.f3591b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 42:
                    if (this.o == null) {
                        this.o = new ad();
                    }
                    aVar.a(this.o);
                    break;
                case 48:
                    this.i = aVar.f();
                    this.j = true;
                    break;
                case 58:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 66:
                    this.g = aVar.c();
                    this.h = true;
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
