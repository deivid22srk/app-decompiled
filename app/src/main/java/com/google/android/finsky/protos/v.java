package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class v extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4415a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4416b = false;
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
    public String u = "";
    public boolean v = false;
    public String w = "";
    public boolean x = false;
    public String y = "";
    public boolean z = false;
    public String A = "";
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;

    public v() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4416b || !this.f4415a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4415a);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(2, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(4, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(5, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(6, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(7, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(8, this.s);
        }
        if (this.v || !this.u.equals("")) {
            codedOutputByteBufferNano.a(9, this.u);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(10, this.w);
        }
        if (this.z || !this.y.equals("")) {
            codedOutputByteBufferNano.a(11, this.y);
        }
        if (this.D || this.C) {
            codedOutputByteBufferNano.a(12, this.C);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(13, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(14, this.e);
        }
        if (this.B || !this.A.equals("")) {
            codedOutputByteBufferNano.a(15, this.A);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4416b || !this.f4415a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4415a);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.o);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.q);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.s);
        }
        if (this.v || !this.u.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.u);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.w);
        }
        if (this.z || !this.y.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.y);
        }
        if (this.D || this.C) {
            a2 += CodedOutputByteBufferNano.c(12) + 1;
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.e);
        }
        if (this.B || !this.A.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(15, this.A);
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
                    this.f4415a = aVar.c();
                    this.f4416b = true;
                    break;
                case 18:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 26:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 34:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 42:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 50:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 58:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 66:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 74:
                    this.u = aVar.c();
                    this.v = true;
                    break;
                case 82:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 90:
                    this.y = aVar.c();
                    this.z = true;
                    break;
                case 96:
                    this.C = aVar.b();
                    this.D = true;
                    break;
                case 106:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 114:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 122:
                    this.A = aVar.c();
                    this.B = true;
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
