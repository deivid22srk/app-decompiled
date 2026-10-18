package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ox extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ow[] f4231a = ow.b();

    public ox() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4231a != null && this.f4231a.length > 0) {
            for (int i = 0; i < this.f4231a.length; i++) {
                ow owVar = this.f4231a[i];
                if (owVar != null) {
                    codedOutputByteBufferNano.b(1, owVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4231a != null && this.f4231a.length > 0) {
            for (int i = 0; i < this.f4231a.length; i++) {
                ow owVar = this.f4231a[i];
                if (owVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, owVar);
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
                    int length = this.f4231a == null ? 0 : this.f4231a.length;
                    ow[] owVarArr = new ow[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4231a, 0, owVarArr, 0, length);
                    }
                    while (length < owVarArr.length - 1) {
                        owVarArr[length] = new ow();
                        aVar.a(owVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    owVarArr[length] = new ow();
                    aVar.a(owVarArr[length]);
                    this.f4231a = owVarArr;
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
