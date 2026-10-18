package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class o extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public k[] f7144a = k.b();

    public o() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7144a != null && this.f7144a.length > 0) {
            for (int i = 0; i < this.f7144a.length; i++) {
                k kVar = this.f7144a[i];
                if (kVar != null) {
                    codedOutputByteBufferNano.b(1, kVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7144a != null && this.f7144a.length > 0) {
            for (int i = 0; i < this.f7144a.length; i++) {
                k kVar = this.f7144a[i];
                if (kVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, kVar);
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
                    int length = this.f7144a == null ? 0 : this.f7144a.length;
                    k[] kVarArr = new k[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7144a, 0, kVarArr, 0, length);
                    }
                    while (length < kVarArr.length - 1) {
                        kVarArr[length] = new k();
                        aVar.a(kVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kVarArr[length] = new k();
                    aVar.a(kVarArr[length]);
                    this.f7144a = kVarArr;
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
