package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sk extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public rn[] f4387a = rn.b();

    public sk() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4387a != null && this.f4387a.length > 0) {
            for (int i = 0; i < this.f4387a.length; i++) {
                rn rnVar = this.f4387a[i];
                if (rnVar != null) {
                    codedOutputByteBufferNano.b(1, rnVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4387a != null && this.f4387a.length > 0) {
            for (int i = 0; i < this.f4387a.length; i++) {
                rn rnVar = this.f4387a[i];
                if (rnVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, rnVar);
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
                    int length = this.f4387a == null ? 0 : this.f4387a.length;
                    rn[] rnVarArr = new rn[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4387a, 0, rnVarArr, 0, length);
                    }
                    while (length < rnVarArr.length - 1) {
                        rnVarArr[length] = new rn();
                        aVar.a(rnVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rnVarArr[length] = new rn();
                    aVar.a(rnVarArr[length]);
                    this.f4387a = rnVarArr;
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
