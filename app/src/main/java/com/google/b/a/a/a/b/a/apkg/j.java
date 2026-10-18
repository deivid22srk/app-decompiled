package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7628a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7629b = 0;
    public byte[] c = com.google.protobuf.nano.e.h;
    public String d = "";
    public com.google.b.a.a.a.b.a.bpkg.r[] e = com.google.b.a.a.a.b.a.bpkg.r.b();

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7628a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7628a);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                com.google.b.a.a.a.b.a.bpkg.r rVar = this.e[i];
                if (rVar != null) {
                    codedOutputByteBufferNano.b(5, rVar);
                }
            }
        }
        if (this.f7629b != 0) {
            codedOutputByteBufferNano.a(7, this.f7629b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7628a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7628a);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                com.google.b.a.a.a.b.a.bpkg.r rVar = this.e[i2];
                if (rVar != null) {
                    i += CodedOutputByteBufferNano.d(5, rVar);
                }
            }
            a2 = i;
        }
        if (this.f7629b != 0) {
            return a2 + CodedOutputByteBufferNano.c(7, this.f7629b);
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
                    this.f7628a = aVar.c();
                    break;
                case 18:
                    this.c = aVar.d();
                    break;
                case 34:
                    this.d = aVar.c();
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.e == null ? 0 : this.e.length;
                    com.google.b.a.a.a.b.a.bpkg.r[] rVarArr = new com.google.b.a.a.a.b.a.bpkg.r[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, rVarArr, 0, length);
                    }
                    while (length < rVarArr.length - 1) {
                        rVarArr[length] = new com.google.b.a.a.a.b.a.bpkg.r();
                        aVar.a(rVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rVarArr[length] = new com.google.b.a.a.a.b.a.bpkg.r();
                    aVar.a(rVarArr[length]);
                    this.e = rVarArr;
                    break;
                case 56:
                    this.f7629b = aVar.e();
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
