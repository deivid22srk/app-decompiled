package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cl extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3681a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3682b = false;
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
    public cv m = null;
    public String n = "";
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public String r = "";
    public boolean s = false;
    public String t = "";
    public boolean u = false;
    public String v = "";
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;

    public cl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3681a != 1 || this.f3682b) {
            codedOutputByteBufferNano.a(1, this.f3681a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(7, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(8, this.k);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(9, this.m);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(10, this.n);
        }
        if (this.q || !this.p.equals("")) {
            codedOutputByteBufferNano.a(11, this.p);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(12, this.r);
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(13, this.t);
        }
        if (this.w || !this.v.equals("")) {
            codedOutputByteBufferNano.a(14, this.v);
        }
        if (this.y || this.x) {
            codedOutputByteBufferNano.a(15, this.x);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3681a != 1 || this.f3682b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3681a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.k);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.m);
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.n);
        }
        if (this.q || !this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.p);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.r);
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.t);
        }
        if (this.w || !this.v.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.v);
        }
        if (this.y || this.x) {
            return a2 + CodedOutputByteBufferNano.c(15) + 1;
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f3681a = e;
                            this.f3682b = true;
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
                case 50:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 58:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 66:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 74:
                    if (this.m == null) {
                        this.m = new cv();
                    }
                    aVar.a(this.m);
                    break;
                case 82:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 90:
                    this.p = aVar.c();
                    this.q = true;
                    break;
                case 98:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 106:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 114:
                    this.v = aVar.c();
                    this.w = true;
                    break;
                case 120:
                    this.x = aVar.b();
                    this.y = true;
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
