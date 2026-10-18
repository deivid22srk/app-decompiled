package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public pt[] f4273a = pt.b();

    /* renamed from: b, reason: collision with root package name */
    public int f4274b = 0;
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
    public pu p = null;
    public kg q = null;
    public String r = "";
    public boolean s = false;
    public pv t = null;
    public boolean u = false;
    public boolean v = false;
    public pr w = null;
    public String x = "";
    public boolean y = false;
    public String z = "";
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public String H = "";
    public boolean I = false;
    public int J = 0;
    public boolean K = false;
    public String L = "";
    public boolean M = false;

    public pw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4273a != null && this.f4273a.length > 0) {
            for (int i = 0; i < this.f4273a.length; i++) {
                pt ptVar = this.f4273a[i];
                if (ptVar != null) {
                    codedOutputByteBufferNano.b(1, ptVar);
                }
            }
        }
        if (this.c || this.f4274b != 0) {
            codedOutputByteBufferNano.a(2, this.f4274b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(4, this.l);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(5, this.p);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(7, this.h);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(8, this.q);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(9, this.r);
        }
        if (this.t != null) {
            codedOutputByteBufferNano.b(10, this.t);
        }
        if (this.v || this.u) {
            codedOutputByteBufferNano.a(11, this.u);
        }
        if (this.w != null) {
            codedOutputByteBufferNano.b(12, this.w);
        }
        if (this.y || !this.x.equals("")) {
            codedOutputByteBufferNano.a(13, this.x);
        }
        if (this.A || !this.z.equals("")) {
            codedOutputByteBufferNano.a(15, this.z);
        }
        if (this.C || this.B) {
            codedOutputByteBufferNano.a(16, this.B);
        }
        if (this.E || this.D) {
            codedOutputByteBufferNano.a(17, this.D);
        }
        if (this.G || this.F) {
            codedOutputByteBufferNano.a(18, this.F);
        }
        if (this.I || !this.H.equals("")) {
            codedOutputByteBufferNano.a(19, this.H);
        }
        if (this.J != 0 || this.K) {
            codedOutputByteBufferNano.a(20, this.J);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(21, this.n);
        }
        if (this.M || !this.L.equals("")) {
            codedOutputByteBufferNano.a(22, this.L);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(23, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4273a != null && this.f4273a.length > 0) {
            for (int i = 0; i < this.f4273a.length; i++) {
                pt ptVar = this.f4273a[i];
                if (ptVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, ptVar);
                }
            }
        }
        if (this.c || this.f4274b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f4274b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.l);
        }
        if (this.p != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.p);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.h);
        }
        if (this.q != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.q);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.r);
        }
        if (this.t != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.t);
        }
        if (this.v || this.u) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (this.w != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.w);
        }
        if (this.y || !this.x.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.x);
        }
        if (this.A || !this.z.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.z);
        }
        if (this.C || this.B) {
            a2 += CodedOutputByteBufferNano.c(16) + 1;
        }
        if (this.E || this.D) {
            a2 += CodedOutputByteBufferNano.c(17) + 1;
        }
        if (this.G || this.F) {
            a2 += CodedOutputByteBufferNano.c(18) + 1;
        }
        if (this.I || !this.H.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.H);
        }
        if (this.J != 0 || this.K) {
            a2 += CodedOutputByteBufferNano.c(20, this.J);
        }
        if (this.o || !this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(21, this.n);
        }
        if (this.M || !this.L.equals("")) {
            a2 += CodedOutputByteBufferNano.b(22, this.L);
        }
        if (this.k || !this.j.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(23, this.j);
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
                    int length = this.f4273a == null ? 0 : this.f4273a.length;
                    pt[] ptVarArr = new pt[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4273a, 0, ptVarArr, 0, length);
                    }
                    while (length < ptVarArr.length - 1) {
                        ptVarArr[length] = new pt();
                        aVar.a(ptVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ptVarArr[length] = new pt();
                    aVar.a(ptVarArr[length]);
                    this.f4273a = ptVarArr;
                    break;
                case 16:
                    this.f4274b = aVar.e();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 42:
                    if (this.p == null) {
                        this.p = new pu();
                    }
                    aVar.a(this.p);
                    break;
                case 50:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 58:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 66:
                    if (this.q == null) {
                        this.q = new kg();
                    }
                    aVar.a(this.q);
                    break;
                case 74:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 82:
                    if (this.t == null) {
                        this.t = new pv();
                    }
                    aVar.a(this.t);
                    break;
                case 88:
                    this.u = aVar.b();
                    this.v = true;
                    break;
                case 98:
                    if (this.w == null) {
                        this.w = new pr();
                    }
                    aVar.a(this.w);
                    break;
                case 106:
                    this.x = aVar.c();
                    this.y = true;
                    break;
                case 122:
                    this.z = aVar.c();
                    this.A = true;
                    break;
                case 128:
                    this.B = aVar.b();
                    this.C = true;
                    break;
                case 136:
                    this.D = aVar.b();
                    this.E = true;
                    break;
                case 144:
                    this.F = aVar.b();
                    this.G = true;
                    break;
                case 154:
                    this.H = aVar.c();
                    this.I = true;
                    break;
                case 160:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.J = e;
                            this.K = true;
                            break;
                    }
                case 170:
                    this.n = aVar.c();
                    this.o = true;
                    break;
                case 178:
                    this.L = aVar.c();
                    this.M = true;
                    break;
                case 186:
                    this.j = aVar.c();
                    this.k = true;
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
