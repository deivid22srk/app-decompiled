package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ek extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public em f3782a = null;

    /* renamed from: b, reason: collision with root package name */
    public em f3783b = null;
    public boolean c = false;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public eg g = null;
    public dp[] h = dp.b();
    public el i = null;
    public em j = null;
    public boolean k = false;
    public boolean l = false;
    public long m = 0;
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public long q = 0;
    public boolean r = false;

    public ek() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3782a != null) {
            codedOutputByteBufferNano.b(1, this.f3782a);
        }
        if (this.f3783b != null) {
            codedOutputByteBufferNano.b(2, this.f3783b);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                dp dpVar = this.h[i];
                if (dpVar != null) {
                    codedOutputByteBufferNano.b(5, dpVar);
                }
            }
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(6, this.j);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.b(8, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(9, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.b(10, this.q);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(11, this.c);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(12, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3782a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3782a);
        }
        if (this.f3783b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3783b);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                dp dpVar = this.h[i2];
                if (dpVar != null) {
                    i += CodedOutputByteBufferNano.d(5, dpVar);
                }
            }
            a2 = i;
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.j);
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.e(8, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.e(10, this.q);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (this.i != null) {
            return a2 + CodedOutputByteBufferNano.d(12, this.i);
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
                    if (this.f3782a == null) {
                        this.f3782a = new em();
                    }
                    aVar.a(this.f3782a);
                    break;
                case 18:
                    if (this.f3783b == null) {
                        this.f3783b = new em();
                    }
                    aVar.a(this.f3783b);
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new eg();
                    }
                    aVar.a(this.g);
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.h == null ? 0 : this.h.length;
                    dp[] dpVarArr = new dp[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, dpVarArr, 0, length);
                    }
                    while (length < dpVarArr.length - 1) {
                        dpVarArr[length] = new dp();
                        aVar.a(dpVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dpVarArr[length] = new dp();
                    aVar.a(dpVarArr[length]);
                    this.h = dpVarArr;
                    break;
                case 50:
                    if (this.j == null) {
                        this.j = new em();
                    }
                    aVar.a(this.j);
                    break;
                case 56:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 64:
                    this.m = aVar.f();
                    this.n = true;
                    break;
                case 74:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 80:
                    this.q = aVar.f();
                    this.r = true;
                    break;
                case 88:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 98:
                    if (this.i == null) {
                        this.i = new el();
                    }
                    aVar.a(this.i);
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
