package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ds extends com.google.protobuf.nano.c {
    private static volatile ds[] C;

    /* renamed from: a, reason: collision with root package name */
    public int f3746a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3747b = false;
    public int c = 0;
    public boolean d = false;
    public du e = null;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public int p = 0;
    public boolean q = false;
    public String r = "";
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public Cdo v = null;
    public String w = "";
    public boolean x = false;
    public dv y = null;
    public dt z = null;
    public int A = 0;
    public boolean B = false;

    public static ds[] b() {
        if (C == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (C == null) {
                    C = new ds[0];
                }
            }
        }
        return C;
    }

    public ds() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3746a != 0 || this.f3747b) {
            codedOutputByteBufferNano.a(1, this.f3746a);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.a(2, this.e);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(7, this.h);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(8, this.c);
        }
        if (this.m || this.l) {
            codedOutputByteBufferNano.a(9, this.l);
        }
        if (this.z != null) {
            codedOutputByteBufferNano.a(10, this.z);
        }
        if (this.q || this.p != 0) {
            codedOutputByteBufferNano.a(14, this.p);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(15, this.r);
        }
        if (this.u || this.t) {
            codedOutputByteBufferNano.a(16, this.t);
        }
        if (this.v != null) {
            codedOutputByteBufferNano.b(17, this.v);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(19, this.w);
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(20, this.y);
        }
        if (this.A != 0 || this.B) {
            codedOutputByteBufferNano.a(21, this.A);
        }
        if (this.o || this.n) {
            codedOutputByteBufferNano.a(22, this.n);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3746a != 0 || this.f3747b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3746a);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.c(2, this.e);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.j);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.h);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.c);
        }
        if (this.m || this.l) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.z != null) {
            a2 += CodedOutputByteBufferNano.c(10, this.z);
        }
        if (this.q || this.p != 0) {
            a2 += CodedOutputByteBufferNano.c(14, this.p);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.r);
        }
        if (this.u || this.t) {
            a2 += CodedOutputByteBufferNano.c(16) + 1;
        }
        if (this.v != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.v);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.w);
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(20, this.y);
        }
        if (this.A != 0 || this.B) {
            a2 += CodedOutputByteBufferNano.c(21, this.A);
        }
        if (this.o || this.n) {
            return a2 + CodedOutputByteBufferNano.c(22) + 1;
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
                        case 13:
                        case 14:
                        case 15:
                            this.f3746a = e;
                            this.f3747b = true;
                            break;
                    }
                case 19:
                    if (this.e == null) {
                        this.e = new du();
                    }
                    aVar.a(this.e, 2);
                    break;
                case 42:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 50:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 58:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 64:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 72:
                    this.l = aVar.b();
                    this.m = true;
                    break;
                case 83:
                    if (this.z == null) {
                        this.z = new dt();
                    }
                    aVar.a(this.z, 10);
                    break;
                case 112:
                    this.p = aVar.e();
                    this.q = true;
                    break;
                case 122:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 128:
                    this.t = aVar.b();
                    this.u = true;
                    break;
                case 138:
                    if (this.v == null) {
                        this.v = new Cdo();
                    }
                    aVar.a(this.v);
                    break;
                case 154:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 162:
                    if (this.y == null) {
                        this.y = new dv();
                    }
                    aVar.a(this.y);
                    break;
                case 168:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.A = e2;
                            this.B = true;
                            break;
                    }
                case 176:
                    this.n = aVar.b();
                    this.o = true;
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
