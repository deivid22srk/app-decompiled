package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7648a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7649b = com.google.protobuf.nano.e.h;
    public p[] c = p.b();
    public String d = "";

    public v() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7648a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7648a);
        }
        if (!Arrays.equals(this.f7649b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7649b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                p pVar = this.c[i];
                if (pVar != null) {
                    codedOutputByteBufferNano.b(3, pVar);
                }
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7648a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7648a);
        }
        if (!Arrays.equals(this.f7649b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7649b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                p pVar = this.c[i2];
                if (pVar != null) {
                    i += CodedOutputByteBufferNano.d(3, pVar);
                }
            }
            a2 = i;
        }
        if (!this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.d);
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
                    this.f7648a = aVar.c();
                    break;
                case 18:
                    this.f7649b = aVar.d();
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    p[] pVarArr = new p[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, pVarArr, 0, length);
                    }
                    while (length < pVarArr.length - 1) {
                        pVarArr[length] = new p();
                        aVar.a(pVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    pVarArr[length] = new p();
                    aVar.a(pVarArr[length]);
                    this.c = pVarArr;
                    break;
                case 34:
                    this.d = aVar.c();
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
