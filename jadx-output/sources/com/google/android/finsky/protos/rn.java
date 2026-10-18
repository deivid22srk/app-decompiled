package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rn extends com.google.protobuf.nano.c {
    private static volatile rn[] c;

    /* renamed from: a, reason: collision with root package name */
    public ro f4345a = null;

    /* renamed from: b, reason: collision with root package name */
    public rm[] f4346b = rm.b();

    public static rn[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new rn[0];
                }
            }
        }
        return c;
    }

    public rn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4345a != null) {
            codedOutputByteBufferNano.a(1, this.f4345a);
        }
        if (this.f4346b != null && this.f4346b.length > 0) {
            for (int i = 0; i < this.f4346b.length; i++) {
                rm rmVar = this.f4346b[i];
                if (rmVar != null) {
                    codedOutputByteBufferNano.b(15, rmVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4345a != null) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4345a);
        }
        if (this.f4346b != null && this.f4346b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4346b.length; i2++) {
                rm rmVar = this.f4346b[i2];
                if (rmVar != null) {
                    i += CodedOutputByteBufferNano.d(15, rmVar);
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
                case 11:
                    if (this.f4345a == null) {
                        this.f4345a = new ro();
                    }
                    aVar.a(this.f4345a, 1);
                    break;
                case 122:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length = this.f4346b == null ? 0 : this.f4346b.length;
                    rm[] rmVarArr = new rm[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4346b, 0, rmVarArr, 0, length);
                    }
                    while (length < rmVarArr.length - 1) {
                        rmVarArr[length] = new rm();
                        aVar.a(rmVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rmVarArr[length] = new rm();
                    aVar.a(rmVarArr[length]);
                    this.f4346b = rmVarArr;
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
