package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lh extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4080a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4081b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public gx[] g = gx.b();
    public kj[] h = kj.b();

    public lh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4081b || this.f4080a) {
            codedOutputByteBufferNano.a(1, this.f4080a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                kj kjVar = this.h[i];
                if (kjVar != null) {
                    codedOutputByteBufferNano.b(4, kjVar);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (int i2 = 0; i2 < this.g.length; i2++) {
                gx gxVar = this.g[i2];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(5, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4081b || this.f4080a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                kj kjVar = this.h[i2];
                if (kjVar != null) {
                    i += CodedOutputByteBufferNano.d(4, kjVar);
                }
            }
            a2 = i;
        }
        if (this.g != null && this.g.length > 0) {
            for (int i3 = 0; i3 < this.g.length; i3++) {
                gx gxVar = this.g[i3];
                if (gxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(5, gxVar);
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
                case 8:
                    this.f4080a = aVar.b();
                    this.f4081b = true;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.h == null ? 0 : this.h.length;
                    kj[] kjVarArr = new kj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, kjVarArr, 0, length);
                    }
                    while (length < kjVarArr.length - 1) {
                        kjVarArr[length] = new kj();
                        aVar.a(kjVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kjVarArr[length] = new kj();
                    aVar.a(kjVarArr[length]);
                    this.h = kjVarArr;
                    break;
                case 42:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length2 = this.g == null ? 0 : this.g.length;
                    gx[] gxVarArr = new gx[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.g, 0, gxVarArr, 0, length2);
                    }
                    while (length2 < gxVarArr.length - 1) {
                        gxVarArr[length2] = new gx();
                        aVar.a(gxVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    gxVarArr[length2] = new gx();
                    aVar.a(gxVarArr[length2]);
                    this.g = gxVarArr;
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
