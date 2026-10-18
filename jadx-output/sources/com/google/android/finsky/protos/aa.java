package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class aa extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f3576a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3577b = false;
    public long c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public hg k = null;
    public ah[] l = ah.b();
    public il[] m = il.b();
    public boolean n = false;
    public boolean o = false;
    public long p = 0;
    public boolean q = false;
    public long r = 0;
    public boolean s = false;
    public boolean t = true;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public ad x = null;
    public pf[] y = pf.b();
    public int z = 0;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    public aa() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3577b || this.f3576a != 0) {
            codedOutputByteBufferNano.b(1, this.f3576a);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i = 0; i < this.l.length; i++) {
                ah ahVar = this.l[i];
                if (ahVar != null) {
                    codedOutputByteBufferNano.b(4, ahVar);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i2 = 0; i2 < this.m.length; i2++) {
                il ilVar = this.m[i2];
                if (ilVar != null) {
                    codedOutputByteBufferNano.b(5, ilVar);
                }
            }
        }
        if (this.o || this.n) {
            codedOutputByteBufferNano.a(6, this.n);
        }
        if (this.q || this.p != 0) {
            codedOutputByteBufferNano.b(7, this.p);
        }
        if (this.u || !this.t) {
            codedOutputByteBufferNano.a(8, this.t);
        }
        if (this.s || this.r != 0) {
            codedOutputByteBufferNano.b(9, this.r);
        }
        if (this.w || this.v) {
            codedOutputByteBufferNano.a(10, this.v);
        }
        if (this.x != null) {
            codedOutputByteBufferNano.b(11, this.x);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(12, this.k);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(13, this.i);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(14, this.c);
        }
        if (this.y != null && this.y.length > 0) {
            for (int i3 = 0; i3 < this.y.length; i3++) {
                pf pfVar = this.y[i3];
                if (pfVar != null) {
                    codedOutputByteBufferNano.b(15, pfVar);
                }
            }
        }
        if (this.z != 0 || this.A) {
            codedOutputByteBufferNano.a(16, this.z);
        }
        if (this.C || this.B) {
            codedOutputByteBufferNano.a(17, this.B);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3577b || this.f3576a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f3576a);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.g);
        }
        if (this.l != null && this.l.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.l.length; i2++) {
                ah ahVar = this.l[i2];
                if (ahVar != null) {
                    i += CodedOutputByteBufferNano.d(4, ahVar);
                }
            }
            a2 = i;
        }
        if (this.m != null && this.m.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.m.length; i4++) {
                il ilVar = this.m[i4];
                if (ilVar != null) {
                    i3 += CodedOutputByteBufferNano.d(5, ilVar);
                }
            }
            a2 = i3;
        }
        if (this.o || this.n) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.q || this.p != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.p);
        }
        if (this.u || !this.t) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.s || this.r != 0) {
            a2 += CodedOutputByteBufferNano.e(9, this.r);
        }
        if (this.w || this.v) {
            a2 += CodedOutputByteBufferNano.c(10) + 1;
        }
        if (this.x != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.x);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.k);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.i);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(14, this.c);
        }
        if (this.y != null && this.y.length > 0) {
            for (int i5 = 0; i5 < this.y.length; i5++) {
                pf pfVar = this.y[i5];
                if (pfVar != null) {
                    a2 += CodedOutputByteBufferNano.d(15, pfVar);
                }
            }
        }
        if (this.z != 0 || this.A) {
            a2 += CodedOutputByteBufferNano.c(16, this.z);
        }
        if (this.C || this.B) {
            return a2 + CodedOutputByteBufferNano.c(17) + 1;
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
                    this.f3576a = aVar.f();
                    this.f3577b = true;
                    break;
                case 18:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 26:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.l == null ? 0 : this.l.length;
                    ah[] ahVarArr = new ah[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, ahVarArr, 0, length);
                    }
                    while (length < ahVarArr.length - 1) {
                        ahVarArr[length] = new ah();
                        aVar.a(ahVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ahVarArr[length] = new ah();
                    aVar.a(ahVarArr[length]);
                    this.l = ahVarArr;
                    break;
                case 42:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length2 = this.m == null ? 0 : this.m.length;
                    il[] ilVarArr = new il[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.m, 0, ilVarArr, 0, length2);
                    }
                    while (length2 < ilVarArr.length - 1) {
                        ilVarArr[length2] = new il();
                        aVar.a(ilVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    ilVarArr[length2] = new il();
                    aVar.a(ilVarArr[length2]);
                    this.m = ilVarArr;
                    break;
                case 48:
                    this.n = aVar.b();
                    this.o = true;
                    break;
                case 56:
                    this.p = aVar.f();
                    this.q = true;
                    break;
                case 64:
                    this.t = aVar.b();
                    this.u = true;
                    break;
                case 72:
                    this.r = aVar.f();
                    this.s = true;
                    break;
                case 80:
                    this.v = aVar.b();
                    this.w = true;
                    break;
                case 90:
                    if (this.x == null) {
                        this.x = new ad();
                    }
                    aVar.a(this.x);
                    break;
                case 98:
                    if (this.k == null) {
                        this.k = new hg();
                    }
                    aVar.a(this.k);
                    break;
                case 106:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 112:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 122:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length3 = this.y == null ? 0 : this.y.length;
                    pf[] pfVarArr = new pf[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.y, 0, pfVarArr, 0, length3);
                    }
                    while (length3 < pfVarArr.length - 1) {
                        pfVarArr[length3] = new pf();
                        aVar.a(pfVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    pfVarArr[length3] = new pf();
                    aVar.a(pfVarArr[length3]);
                    this.y = pfVarArr;
                    break;
                case 128:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.z = e;
                            this.A = true;
                            break;
                    }
                case 136:
                    this.B = aVar.b();
                    this.C = true;
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
