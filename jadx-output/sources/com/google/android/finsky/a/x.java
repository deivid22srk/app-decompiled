package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class x extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f1509a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1510b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public int q = 0;
    public boolean r = false;

    public x() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1509a != 0 || this.f1510b) {
            codedOutputByteBufferNano.a(1, this.f1509a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1509a != 0 || this.f1510b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1509a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || this.m) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.p || this.o) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.r || this.q != 0) {
            return a2 + CodedOutputByteBufferNano.c(9, this.q);
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f1509a = e;
                            this.f1510b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.b();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.b();
                    this.p = true;
                    break;
                case 72:
                    this.q = aVar.e();
                    this.r = true;
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
