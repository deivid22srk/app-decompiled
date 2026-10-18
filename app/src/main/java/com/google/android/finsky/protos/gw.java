package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gw extends com.google.protobuf.nano.c {
    private static volatile gw[] F;

    /* renamed from: a, reason: collision with root package name */
    public kh f3888a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f3889b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
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
    public String x = "";
    public boolean y = false;
    public gp z = null;
    public String A = "";
    public boolean B = false;
    public lh C = null;
    public String D = "";
    public boolean E = false;

    public static gw[] b() {
        if (F == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (F == null) {
                    F = new gw[0];
                }
            }
        }
        return F;
    }

    public gw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3888a != null) {
            codedOutputByteBufferNano.b(1, this.f3888a);
        }
        if (this.c || !this.f3889b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3889b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(6, this.n);
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(7, this.t);
        }
        if (this.y || !this.x.equals("")) {
            codedOutputByteBufferNano.a(8, this.x);
        }
        if (this.z != null) {
            codedOutputByteBufferNano.b(9, this.z);
        }
        if (this.B || !this.A.equals("")) {
            codedOutputByteBufferNano.a(10, this.A);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(11, this.j);
        }
        if (this.q || !this.p.equals("")) {
            codedOutputByteBufferNano.a(12, this.p);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(13, this.l);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(14, this.r);
        }
        if (this.w || !this.v.equals("")) {
            codedOutputByteBufferNano.a(15, this.v);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(16, this.C);
        }
        if (this.E || !this.D.equals("")) {
            codedOutputByteBufferNano.a(17, this.D);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3888a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3888a);
        }
        if (this.c || !this.f3889b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3889b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.h);
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.n);
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.t);
        }
        if (this.y || !this.x.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.x);
        }
        if (this.z != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.z);
        }
        if (this.B || !this.A.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.A);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.j);
        }
        if (this.q || !this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.p);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.l);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.r);
        }
        if (this.w || !this.v.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.v);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.C);
        }
        if (this.E || !this.D.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(17, this.D);
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
                    if (this.f3888a == null) {
                        this.f3888a = new kh();
                    }
                    aVar.a(this.f3888a);
                    break;
                case 18:
                    this.f3889b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 50:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 58:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 66:
                    this.x = aVar.c();
                    this.y = true;
                    break;
                case 74:
                    if (this.z == null) {
                        this.z = new gp();
                    }
                    aVar.a(this.z);
                    break;
                case 82:
                    this.A = aVar.c();
                    this.B = true;
                    break;
                case 90:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 98:
                    this.p = aVar.c();
                    this.q = true;
                    break;
                case 106:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 114:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 122:
                    this.v = aVar.c();
                    this.w = true;
                    break;
                case 130:
                    if (this.C == null) {
                        this.C = new lh();
                    }
                    aVar.a(this.C);
                    break;
                case 138:
                    this.D = aVar.c();
                    this.E = true;
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
