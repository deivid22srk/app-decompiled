package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class u extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f6787a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6788b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;

    public u() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6787a != 0 || this.f6788b) {
            codedOutputByteBufferNano.a(1, this.f6787a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
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
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(10, this.s);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6787a != 0 || this.f6788b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f6787a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
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
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(10, this.s);
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
                            this.f6787a = e;
                            this.f6788b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
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
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 66:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 74:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 82:
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
