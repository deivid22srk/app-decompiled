package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rz extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public sa[] f4364a = sa.b();

    public rz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4364a != null && this.f4364a.length > 0) {
            for (int i = 0; i < this.f4364a.length; i++) {
                sa saVar = this.f4364a[i];
                if (saVar != null) {
                    codedOutputByteBufferNano.a(2, saVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4364a != null && this.f4364a.length > 0) {
            for (int i = 0; i < this.f4364a.length; i++) {
                sa saVar = this.f4364a[i];
                if (saVar != null) {
                    a2 += CodedOutputByteBufferNano.c(2, saVar);
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
                case 19:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 19);
                    int length = this.f4364a == null ? 0 : this.f4364a.length;
                    sa[] saVarArr = new sa[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4364a, 0, saVarArr, 0, length);
                    }
                    while (length < saVarArr.length - 1) {
                        saVarArr[length] = new sa();
                        aVar.a(saVarArr[length], 2);
                        aVar.a();
                        length++;
                    }
                    saVarArr[length] = new sa();
                    aVar.a(saVarArr[length], 2);
                    this.f4364a = saVarArr;
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
