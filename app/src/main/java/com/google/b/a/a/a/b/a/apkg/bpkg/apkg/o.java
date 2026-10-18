package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7585a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7586b = "";
    public String c = "";
    public String d = "";
    public int e = 0;
    public int f = 0;
    public com.google.b.a.a.a.b.a.apkg.c g = null;
    public String h = "";
    public s[] i = s.b();
    public byte[] j = com.google.protobuf.nano.e.h;
    public String k = "";

    public o() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(1, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(2, this.d);
        }
        if (this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (!this.f7586b.equals("")) {
            codedOutputByteBufferNano.a(9, this.f7586b);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(10, this.g);
        }
        if (!Arrays.equals(this.j, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(11, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(12, this.k);
        }
        if (!this.f7585a.equals("")) {
            codedOutputByteBufferNano.a(13, this.f7585a);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i = 0; i < this.i.length; i++) {
                s sVar = this.i[i];
                if (sVar != null) {
                    codedOutputByteBufferNano.b(14, sVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.d);
        }
        if (this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.f);
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.h);
        }
        if (!this.f7586b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.f7586b);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.g);
        }
        if (!Arrays.equals(this.j, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(11, this.j);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.k);
        }
        if (!this.f7585a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.f7585a);
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                s sVar = this.i[i2];
                if (sVar != null) {
                    i += CodedOutputByteBufferNano.d(14, sVar);
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
                    this.c = aVar.c();
                    break;
                case 18:
                    this.d = aVar.c();
                    break;
                case 24:
                    this.e = aVar.e();
                    break;
                case 32:
                    this.f = aVar.e();
                    break;
                case 50:
                    this.h = aVar.c();
                    break;
                case 74:
                    this.f7586b = aVar.c();
                    break;
                case 82:
                    if (this.g == null) {
                        this.g = new com.google.b.a.a.a.b.a.apkg.c();
                    }
                    aVar.a(this.g);
                    break;
                case 90:
                    this.j = aVar.d();
                    break;
                case 98:
                    this.k = aVar.c();
                    break;
                case 106:
                    this.f7585a = aVar.c();
                    break;
                case 114:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length = this.i == null ? 0 : this.i.length;
                    s[] sVarArr = new s[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, sVarArr, 0, length);
                    }
                    while (length < sVarArr.length - 1) {
                        sVarArr[length] = new s();
                        aVar.a(sVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    sVarArr[length] = new s();
                    aVar.a(sVarArr[length]);
                    this.i = sVarArr;
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
