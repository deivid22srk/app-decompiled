package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public bx[] f4408a = bx.b();

    public sw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4408a != null && this.f4408a.length > 0) {
            for (int i = 0; i < this.f4408a.length; i++) {
                bx bxVar = this.f4408a[i];
                if (bxVar != null) {
                    codedOutputByteBufferNano.b(1, bxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4408a != null && this.f4408a.length > 0) {
            for (int i = 0; i < this.f4408a.length; i++) {
                bx bxVar = this.f4408a[i];
                if (bxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, bxVar);
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
                case 10:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4408a == null ? 0 : this.f4408a.length;
                    bx[] bxVarArr = new bx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4408a, 0, bxVarArr, 0, length);
                    }
                    while (length < bxVarArr.length - 1) {
                        bxVarArr[length] = new bx();
                        aVar.a(bxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bxVarArr[length] = new bx();
                    aVar.a(bxVarArr[length]);
                    this.f4408a = bxVarArr;
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
