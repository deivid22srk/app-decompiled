package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ck extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3679a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3680b = false;
    public String c = "";
    public boolean d = false;
    public da e = null;
    public da f = null;
    public da g = null;
    public cz h = null;
    public cz i = null;
    public cx j = null;
    public String k = "";
    public boolean l = false;
    public cv m = null;
    public String n = "";
    public boolean o = false;
    public cu p = null;

    public ck() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3680b || !this.f3679a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3679a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(5, this.g);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(6, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(7, this.i);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(8, this.m);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(9, this.n);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(10, this.p);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(11, this.j);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(12, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3680b || !this.f3679a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3679a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.g);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.i);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.m);
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.n);
        }
        if (this.p != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.p);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.j);
        }
        if (this.l || !this.k.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(12, this.k);
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
                    this.f3679a = aVar.c();
                    this.f3680b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new da();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new da();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    if (this.g == null) {
                        this.g = new da();
                    }
                    aVar.a(this.g);
                    break;
                case 50:
                    if (this.h == null) {
                        this.h = new cz();
                    }
                    aVar.a(this.h);
                    break;
                case 58:
                    if (this.i == null) {
                        this.i = new cz();
                    }
                    aVar.a(this.i);
                    break;
                case 66:
                    if (this.m == null) {
                        this.m = new cv();
                    }
                    aVar.a(this.m);
                    break;
                case 74:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 82:
                    if (this.p == null) {
                        this.p = new cu();
                    }
                    aVar.a(this.p);
                    break;
                case 90:
                    if (this.j == null) {
                        this.j = new cx();
                    }
                    aVar.a(this.j);
                    break;
                case 98:
                    this.k = aVar.c();
                    this.l = true;
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
