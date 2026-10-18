package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ju extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4010a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4011b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;
    public String f = "";
    public boolean g = false;
    public gx[] h = gx.b();

    public ju() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4011b || !this.f4010a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4010a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                gx gxVar = this.h[i];
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
        if (this.f4011b || !this.f4010a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4010a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                gx gxVar = this.h[i2];
                if (gxVar != null) {
                    i += CodedOutputByteBufferNano.d(5, gxVar);
                }
            }
            return i;
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
                    this.f4010a = aVar.c();
                    this.f4011b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.h == null ? 0 : this.h.length;
                    gx[] gxVarArr = new gx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, gxVarArr, 0, length);
                    }
                    while (length < gxVarArr.length - 1) {
                        gxVarArr[length] = new gx();
                        aVar.a(gxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gxVarArr[length] = new gx();
                    aVar.a(gxVarArr[length]);
                    this.h = gxVarArr;
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
