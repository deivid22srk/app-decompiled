package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class et extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3798a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3799b = false;
    public String c = "";
    public boolean d = false;
    public double e = 0.0d;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public eu[] m = eu.b();
    public ds n = null;

    public et() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3799b || !this.f3798a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3798a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || Double.doubleToLongBits(this.e) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i = 0; i < this.m.length; i++) {
                eu euVar = this.m[i];
                if (euVar != null) {
                    codedOutputByteBufferNano.b(7, euVar);
                }
            }
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(8, this.n);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3799b || !this.f3798a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3798a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || Double.doubleToLongBits(this.e) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(3) + 8;
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.m != null && this.m.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.m.length; i2++) {
                eu euVar = this.m[i2];
                if (euVar != null) {
                    i += CodedOutputByteBufferNano.d(7, euVar);
                }
            }
            a2 = i;
        }
        if (this.n != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.n);
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
                    this.f3798a = aVar.c();
                    this.f3799b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 25:
                    this.e = Double.longBitsToDouble(aVar.h());
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 58:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length = this.m == null ? 0 : this.m.length;
                    eu[] euVarArr = new eu[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.m, 0, euVarArr, 0, length);
                    }
                    while (length < euVarArr.length - 1) {
                        euVarArr[length] = new eu();
                        aVar.a(euVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    euVarArr[length] = new eu();
                    aVar.a(euVarArr[length]);
                    this.m = euVarArr;
                    break;
                case 66:
                    if (this.n == null) {
                        this.n = new ds();
                    }
                    aVar.a(this.n);
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
