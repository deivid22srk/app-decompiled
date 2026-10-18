package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class mi extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public mh[] f4127a = mh.b();

    public mi() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4127a != null && this.f4127a.length > 0) {
            for (int i = 0; i < this.f4127a.length; i++) {
                mh mhVar = this.f4127a[i];
                if (mhVar != null) {
                    codedOutputByteBufferNano.b(1, mhVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4127a != null && this.f4127a.length > 0) {
            for (int i = 0; i < this.f4127a.length; i++) {
                mh mhVar = this.f4127a[i];
                if (mhVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, mhVar);
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
                    int length = this.f4127a == null ? 0 : this.f4127a.length;
                    mh[] mhVarArr = new mh[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4127a, 0, mhVarArr, 0, length);
                    }
                    while (length < mhVarArr.length - 1) {
                        mhVarArr[length] = new mh();
                        aVar.a(mhVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    mhVarArr[length] = new mh();
                    aVar.a(mhVarArr[length]);
                    this.f4127a = mhVarArr;
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
