package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bc extends com.google.protobuf.nano.c {
    private static volatile bc[] v;

    /* renamed from: a, reason: collision with root package name */
    public gw[] f3623a = gw.b();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3624b = false;
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
    public double n = 0.0d;
    public boolean o = false;
    public long p = 0;
    public boolean q = false;
    public String r = "";
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;

    public static bc[] b() {
        if (v == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (v == null) {
                    v = new bc[0];
                }
            }
        }
        return v;
    }

    public bc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3623a != null && this.f3623a.length > 0) {
            for (int i = 0; i < this.f3623a.length; i++) {
                gw gwVar = this.f3623a[i];
                if (gwVar != null) {
                    codedOutputByteBufferNano.b(1, gwVar);
                }
            }
        }
        if (this.c || this.f3624b) {
            codedOutputByteBufferNano.a(2, this.f3624b);
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
        if (this.o || Double.doubleToLongBits(this.n) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(6, this.n);
        }
        if (this.q || this.p != 0) {
            codedOutputByteBufferNano.b(7, this.p);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(8, this.r);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(9, this.j);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(10, this.l);
        }
        if (this.u || this.t) {
            codedOutputByteBufferNano.a(11, this.t);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3623a != null && this.f3623a.length > 0) {
            for (int i = 0; i < this.f3623a.length; i++) {
                gw gwVar = this.f3623a[i];
                if (gwVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, gwVar);
                }
            }
        }
        if (this.c || this.f3624b) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
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
        if (this.o || Double.doubleToLongBits(this.n) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(6) + 8;
        }
        if (this.q || this.p != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.p);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.r);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.j);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.l);
        }
        if (this.u || this.t) {
            return a2 + CodedOutputByteBufferNano.c(11) + 1;
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f3623a == null ? 0 : this.f3623a.length;
                    gw[] gwVarArr = new gw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3623a, 0, gwVarArr, 0, length);
                    }
                    while (length < gwVarArr.length - 1) {
                        gwVarArr[length] = new gw();
                        aVar.a(gwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gwVarArr[length] = new gw();
                    aVar.a(gwVarArr[length]);
                    this.f3623a = gwVarArr;
                    break;
                case 16:
                    this.f3624b = aVar.b();
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
                case 49:
                    this.n = Double.longBitsToDouble(aVar.h());
                    this.o = true;
                    break;
                case 56:
                    this.p = aVar.f();
                    this.q = true;
                    break;
                case 66:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 74:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 82:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 88:
                    this.t = aVar.b();
                    this.u = true;
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
