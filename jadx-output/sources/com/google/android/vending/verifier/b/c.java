package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7120a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f7121b = false;
    public int c = 0;
    public boolean d = false;
    public g[] e = g.b();
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public j[] t = j.b();

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7121b || !this.f7120a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7120a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                g gVar = this.e[i];
                if (gVar != null) {
                    codedOutputByteBufferNano.b(3, gVar);
                }
            }
        }
        if (this.g || this.f) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.k || this.j) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        if (this.m || this.l) {
            codedOutputByteBufferNano.a(7, this.l);
        }
        if (this.o || this.n) {
            codedOutputByteBufferNano.a(8, this.n);
        }
        if (this.q || this.p) {
            codedOutputByteBufferNano.a(9, this.p);
        }
        if (this.s || this.r) {
            codedOutputByteBufferNano.a(10, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i2 = 0; i2 < this.t.length; i2++) {
                j jVar = this.t[i2];
                if (jVar != null) {
                    codedOutputByteBufferNano.b(11, jVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7121b || !this.f7120a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7120a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                g gVar = this.e[i2];
                if (gVar != null) {
                    i += CodedOutputByteBufferNano.d(3, gVar);
                }
            }
            a2 = i;
        }
        if (this.g || this.f) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.i || this.h) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.k || this.j) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.m || this.l) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.o || this.n) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.q || this.p) {
            a2 += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.s || this.r) {
            a2 += CodedOutputByteBufferNano.c(10) + 1;
        }
        if (this.t != null && this.t.length > 0) {
            for (int i3 = 0; i3 < this.t.length; i3++) {
                j jVar = this.t[i3];
                if (jVar != null) {
                    a2 += CodedOutputByteBufferNano.d(11, jVar);
                }
            }
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
                    this.f7120a = aVar.c();
                    this.f7121b = true;
                    break;
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.e == null ? 0 : this.e.length;
                    g[] gVarArr = new g[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, gVarArr, 0, length);
                    }
                    while (length < gVarArr.length - 1) {
                        gVarArr[length] = new g();
                        aVar.a(gVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gVarArr[length] = new g();
                    aVar.a(gVarArr[length]);
                    this.e = gVarArr;
                    break;
                case 32:
                    this.f = aVar.b();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.b();
                    this.i = true;
                    break;
                case 48:
                    this.j = aVar.b();
                    this.k = true;
                    break;
                case 56:
                    this.l = aVar.b();
                    this.m = true;
                    break;
                case 64:
                    this.n = aVar.b();
                    this.o = true;
                    break;
                case 72:
                    this.p = aVar.b();
                    this.q = true;
                    break;
                case 80:
                    this.r = aVar.b();
                    this.s = true;
                    break;
                case 90:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length2 = this.t == null ? 0 : this.t.length;
                    j[] jVarArr = new j[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.t, 0, jVarArr, 0, length2);
                    }
                    while (length2 < jVarArr.length - 1) {
                        jVarArr[length2] = new j();
                        aVar.a(jVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    jVarArr[length2] = new j();
                    aVar.a(jVarArr[length2]);
                    this.t = jVarArr;
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
