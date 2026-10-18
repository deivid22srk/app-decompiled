package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pm extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public pj[] f4257a = pj.b();

    public pm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4257a != null && this.f4257a.length > 0) {
            for (int i = 0; i < this.f4257a.length; i++) {
                pj pjVar = this.f4257a[i];
                if (pjVar != null) {
                    codedOutputByteBufferNano.b(1, pjVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4257a != null && this.f4257a.length > 0) {
            for (int i = 0; i < this.f4257a.length; i++) {
                pj pjVar = this.f4257a[i];
                if (pjVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, pjVar);
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
                    int length = this.f4257a == null ? 0 : this.f4257a.length;
                    pj[] pjVarArr = new pj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4257a, 0, pjVarArr, 0, length);
                    }
                    while (length < pjVarArr.length - 1) {
                        pjVarArr[length] = new pj();
                        aVar.a(pjVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    pjVarArr[length] = new pj();
                    aVar.a(pjVarArr[length]);
                    this.f4257a = pjVarArr;
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
