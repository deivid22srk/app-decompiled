package com.google.b.a.a.a.b.b;

import com.google.b.a.a.a.b.a.b.p;
import com.google.b.a.a.a.b.a.b.r;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7712a = "";

    /* renamed from: b, reason: collision with root package name */
    public com.google.d.b.a.a.b.b f7713b = null;
    public p c = null;
    public r d = null;
    public com.google.b.a.a.a.b.a.a.h e = null;
    public String f = "";
    public String g = "";
    public com.google.b.a.a.a.b.a.b[] h = com.google.b.a.a.a.b.a.b.b();
    public boolean i = false;
    public com.google.b.a.a.a.b.a.b.e j = null;
    public com.google.b.a.a.a.b.a.a.a.b k = null;
    public com.google.b.a.a.a.b.a.a.b.b l = null;
    public com.google.b.a.a.a.b.a.a.b.a.p m = null;

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.k != null) {
            codedOutputByteBufferNano.b(1, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(2, this.l);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(3, this.m);
        }
        if (!this.f7712a.equals("")) {
            codedOutputByteBufferNano.a(4, this.f7712a);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                com.google.b.a.a.a.b.a.b bVar = this.h[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.b(8, bVar);
                }
            }
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(9, this.f);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(10, this.d);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(11, this.c);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(12, this.g);
        }
        if (this.i) {
            codedOutputByteBufferNano.a(13, this.i);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(14, this.e);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(15, this.j);
        }
        if (this.f7713b != null) {
            codedOutputByteBufferNano.b(16, this.f7713b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.k);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.l);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.m);
        }
        if (!this.f7712a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f7712a);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                com.google.b.a.a.a.b.a.b bVar = this.h[i2];
                if (bVar != null) {
                    i += CodedOutputByteBufferNano.d(8, bVar);
                }
            }
            a2 = i;
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.f);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.d);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.c);
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.g);
        }
        if (this.i) {
            a2 += CodedOutputByteBufferNano.c(13) + 1;
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.e);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.j);
        }
        if (this.f7713b != null) {
            return a2 + CodedOutputByteBufferNano.d(16, this.f7713b);
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
                    if (this.k == null) {
                        this.k = new com.google.b.a.a.a.b.a.a.a.b();
                    }
                    aVar.a(this.k);
                    break;
                case 18:
                    if (this.l == null) {
                        this.l = new com.google.b.a.a.a.b.a.a.b.b();
                    }
                    aVar.a(this.l);
                    break;
                case 26:
                    if (this.m == null) {
                        this.m = new com.google.b.a.a.a.b.a.a.b.a.p();
                    }
                    aVar.a(this.m);
                    break;
                case 34:
                    this.f7712a = aVar.c();
                    break;
                case 66:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 66);
                    int length = this.h == null ? 0 : this.h.length;
                    com.google.b.a.a.a.b.a.b[] bVarArr = new com.google.b.a.a.a.b.a.b[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new com.google.b.a.a.a.b.a.b();
                        aVar.a(bVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bVarArr[length] = new com.google.b.a.a.a.b.a.b();
                    aVar.a(bVarArr[length]);
                    this.h = bVarArr;
                    break;
                case 74:
                    this.f = aVar.c();
                    break;
                case 82:
                    if (this.d == null) {
                        this.d = new r();
                    }
                    aVar.a(this.d);
                    break;
                case 90:
                    if (this.c == null) {
                        this.c = new p();
                    }
                    aVar.a(this.c);
                    break;
                case 98:
                    this.g = aVar.c();
                    break;
                case 104:
                    this.i = aVar.b();
                    break;
                case 114:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.a.h();
                    }
                    aVar.a(this.e);
                    break;
                case 122:
                    if (this.j == null) {
                        this.j = new com.google.b.a.a.a.b.a.b.e();
                    }
                    aVar.a(this.j);
                    break;
                case 130:
                    if (this.f7713b == null) {
                        this.f7713b = new com.google.d.b.a.a.b.b();
                    }
                    aVar.a(this.f7713b);
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
