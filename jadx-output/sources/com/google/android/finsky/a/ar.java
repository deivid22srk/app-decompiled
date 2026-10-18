package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ar extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f1471a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1472b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;

    public ar() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1471a != 0 || this.f1472b) {
            codedOutputByteBufferNano.a(1, this.f1471a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1471a != 0 || this.f1472b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1471a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.m);
        }
        if (this.p || this.o != 0) {
            return a2 + CodedOutputByteBufferNano.c(8, this.o);
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
                            this.f1471a = e;
                            this.f1472b = true;
                            break;
                    }
                case 16:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = e2;
                            this.d = true;
                            break;
                    }
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.e();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.e();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.e();
                    this.p = true;
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
