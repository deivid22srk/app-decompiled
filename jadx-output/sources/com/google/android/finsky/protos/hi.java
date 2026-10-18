package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hi extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public hm[] f3910a = hm.b();

    public hi() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3910a != null && this.f3910a.length > 0) {
            for (int i = 0; i < this.f3910a.length; i++) {
                hm hmVar = this.f3910a[i];
                if (hmVar != null) {
                    codedOutputByteBufferNano.b(1, hmVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3910a != null && this.f3910a.length > 0) {
            for (int i = 0; i < this.f3910a.length; i++) {
                hm hmVar = this.f3910a[i];
                if (hmVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, hmVar);
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
                    int length = this.f3910a == null ? 0 : this.f3910a.length;
                    hm[] hmVarArr = new hm[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3910a, 0, hmVarArr, 0, length);
                    }
                    while (length < hmVarArr.length - 1) {
                        hmVarArr[length] = new hm();
                        aVar.a(hmVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    hmVarArr[length] = new hm();
                    aVar.a(hmVarArr[length]);
                    this.f3910a = hmVarArr;
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
