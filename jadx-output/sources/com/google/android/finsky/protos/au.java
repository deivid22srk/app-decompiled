package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class au extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3609a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3610b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;

    public au() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3610b || !this.f3609a.equals("")) {
            codedOutputByteBufferNano.a(4, this.f3609a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(17, this.i);
        }
        if (this.k != 0 || this.l) {
            codedOutputByteBufferNano.a(27, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(28, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(29, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(30, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(31, this.s);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3610b || !this.f3609a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f3609a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(17, this.i);
        }
        if (this.k != 0 || this.l) {
            a2 += CodedOutputByteBufferNano.c(27, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(28, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(29, this.o);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(30, this.q);
        }
        if (this.t || !this.s.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(31, this.s);
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
                case 34:
                    this.f3609a = aVar.c();
                    this.f3610b = true;
                    break;
                case 42:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 50:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 56:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 138:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 216:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.k = e;
                            this.l = true;
                            break;
                    }
                case 226:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 234:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 242:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 250:
                    this.s = aVar.c();
                    this.t = true;
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
