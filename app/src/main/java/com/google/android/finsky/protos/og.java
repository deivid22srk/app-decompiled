package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class og extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4205a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4206b = false;
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public bc[] i = bc.b();
    public gx[] j = gx.b();
    public of[] k = of.b();
    public boolean l = false;
    public boolean m = false;
    public byte[] n = com.google.protobuf.nano.e.h;
    public boolean o = false;

    public og() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4206b || !this.f4205a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4205a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i = 0; i < this.i.length; i++) {
                bc bcVar = this.i[i];
                if (bcVar != null) {
                    codedOutputByteBufferNano.b(4, bcVar);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i2 = 0; i2 < this.j.length; i2++) {
                gx gxVar = this.j[i2];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(5, gxVar);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (int i3 = 0; i3 < this.k.length; i3++) {
                of ofVar = this.k[i3];
                if (ofVar != null) {
                    codedOutputByteBufferNano.b(6, ofVar);
                }
            }
        }
        if (this.o || !Arrays.equals(this.n, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.n);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(8, this.e);
        }
        if (this.m || this.l) {
            codedOutputByteBufferNano.a(9, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4206b || !this.f4205a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4205a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.h || this.g) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                bc bcVar = this.i[i2];
                if (bcVar != null) {
                    i += CodedOutputByteBufferNano.d(4, bcVar);
                }
            }
            a2 = i;
        }
        if (this.j != null && this.j.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.j.length; i4++) {
                gx gxVar = this.j[i4];
                if (gxVar != null) {
                    i3 += CodedOutputByteBufferNano.d(5, gxVar);
                }
            }
            a2 = i3;
        }
        if (this.k != null && this.k.length > 0) {
            for (int i5 = 0; i5 < this.k.length; i5++) {
                of ofVar = this.k[i5];
                if (ofVar != null) {
                    a2 += CodedOutputByteBufferNano.d(6, ofVar);
                }
            }
        }
        if (this.o || !Arrays.equals(this.n, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.n);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.m || this.l) {
            return a2 + CodedOutputByteBufferNano.c(9) + 1;
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
                    this.f4205a = aVar.c();
                    this.f4206b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.i == null ? 0 : this.i.length;
                    bc[] bcVarArr = new bc[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, bcVarArr, 0, length);
                    }
                    while (length < bcVarArr.length - 1) {
                        bcVarArr[length] = new bc();
                        aVar.a(bcVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bcVarArr[length] = new bc();
                    aVar.a(bcVarArr[length]);
                    this.i = bcVarArr;
                    break;
                case 42:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length2 = this.j == null ? 0 : this.j.length;
                    gx[] gxVarArr = new gx[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.j, 0, gxVarArr, 0, length2);
                    }
                    while (length2 < gxVarArr.length - 1) {
                        gxVarArr[length2] = new gx();
                        aVar.a(gxVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    gxVarArr[length2] = new gx();
                    aVar.a(gxVarArr[length2]);
                    this.j = gxVarArr;
                    break;
                case 50:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length3 = this.k == null ? 0 : this.k.length;
                    of[] ofVarArr = new of[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.k, 0, ofVarArr, 0, length3);
                    }
                    while (length3 < ofVarArr.length - 1) {
                        ofVarArr[length3] = new of();
                        aVar.a(ofVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    ofVarArr[length3] = new of();
                    aVar.a(ofVarArr[length3]);
                    this.k = ofVarArr;
                    break;
                case 58:
                    this.n = aVar.d();
                    this.o = true;
                    break;
                case 64:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 72:
                    this.l = aVar.b();
                    this.m = true;
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
