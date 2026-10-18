package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public qx[] f4316a = qx.b();

    public qw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4316a != null && this.f4316a.length > 0) {
            for (int i = 0; i < this.f4316a.length; i++) {
                qx qxVar = this.f4316a[i];
                if (qxVar != null) {
                    codedOutputByteBufferNano.b(1, qxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4316a != null && this.f4316a.length > 0) {
            for (int i = 0; i < this.f4316a.length; i++) {
                qx qxVar = this.f4316a[i];
                if (qxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, qxVar);
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
                    int length = this.f4316a == null ? 0 : this.f4316a.length;
                    qx[] qxVarArr = new qx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4316a, 0, qxVarArr, 0, length);
                    }
                    while (length < qxVarArr.length - 1) {
                        qxVarArr[length] = new qx();
                        aVar.a(qxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    qxVarArr[length] = new qx();
                    aVar.a(qxVarArr[length]);
                    this.f4316a = qxVarArr;
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
