package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ny extends com.google.protobuf.nano.c {
    private static volatile ny[] F;

    /* renamed from: a, reason: collision with root package name */
    public String f4191a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4192b = false;
    public gx c = null;
    public int d = 0;
    public boolean e = false;
    public ds f = null;
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
    public long q = 0;
    public boolean r = false;
    public String s = "";
    public boolean t = false;
    public String u = "";
    public boolean v = false;
    public long w = 0;
    public boolean x = false;
    public int y = 0;
    public boolean z = false;
    public long A = 0;
    public boolean B = false;
    public kj C = null;
    public String D = "";
    public boolean E = false;

    public static ny[] b() {
        if (F == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (F == null) {
                    F = new ny[0];
                }
            }
        }
        return F;
    }

    public ny() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.E || !this.D.equals("")) {
            codedOutputByteBufferNano.a(1, this.D);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(2, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(3, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(4, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.b(5, this.q);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(6, this.d);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(8, this.i);
        }
        if (this.f4192b || !this.f4191a.equals("")) {
            codedOutputByteBufferNano.a(9, this.f4191a);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(19, this.s);
        }
        if (this.v || !this.u.equals("")) {
            codedOutputByteBufferNano.a(29, this.u);
        }
        if (this.x || this.w != 0) {
            codedOutputByteBufferNano.b(30, this.w);
        }
        if (this.C != null) {
            codedOutputByteBufferNano.b(31, this.C);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(33, this.c);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(34, this.f);
        }
        if (this.z || this.y != 0) {
            codedOutputByteBufferNano.a(35, this.y);
        }
        if (this.B || this.A != 0) {
            codedOutputByteBufferNano.a(38, this.A);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.E || !this.D.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.D);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.e(5, this.q);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.d);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.i);
        }
        if (this.f4192b || !this.f4191a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.f4191a);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.s);
        }
        if (this.v || !this.u.equals("")) {
            a2 += CodedOutputByteBufferNano.b(29, this.u);
        }
        if (this.x || this.w != 0) {
            a2 += CodedOutputByteBufferNano.e(30, this.w);
        }
        if (this.C != null) {
            a2 += CodedOutputByteBufferNano.d(31, this.C);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(33, this.c);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(34, this.f);
        }
        if (this.z || this.y != 0) {
            a2 += CodedOutputByteBufferNano.c(35, this.y);
        }
        if (this.B || this.A != 0) {
            return a2 + CodedOutputByteBufferNano.d(38, this.A);
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
                    this.D = aVar.c();
                    this.E = true;
                    break;
                case 18:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 26:
                    this.m = aVar.c();
                    this.n = true;
                    break;
                case 34:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 40:
                    this.q = aVar.f();
                    this.r = true;
                    break;
                case 48:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 58:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 66:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 74:
                    this.f4191a = aVar.c();
                    this.f4192b = true;
                    break;
                case 154:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 234:
                    this.u = aVar.c();
                    this.v = true;
                    break;
                case 240:
                    this.w = aVar.f();
                    this.x = true;
                    break;
                case 250:
                    if (this.C == null) {
                        this.C = new kj();
                    }
                    aVar.a(this.C);
                    break;
                case 266:
                    if (this.c == null) {
                        this.c = new gx();
                    }
                    aVar.a(this.c);
                    break;
                case 274:
                    if (this.f == null) {
                        this.f = new ds();
                    }
                    aVar.a(this.f);
                    break;
                case 280:
                    this.y = aVar.e();
                    this.z = true;
                    break;
                case 304:
                    this.A = aVar.f();
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
