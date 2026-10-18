package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class km extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public kl[] f4045a = kl.b();

    public km() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4045a != null && this.f4045a.length > 0) {
            for (int i = 0; i < this.f4045a.length; i++) {
                kl klVar = this.f4045a[i];
                if (klVar != null) {
                    codedOutputByteBufferNano.b(1, klVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4045a != null && this.f4045a.length > 0) {
            for (int i = 0; i < this.f4045a.length; i++) {
                kl klVar = this.f4045a[i];
                if (klVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, klVar);
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
                    int length = this.f4045a == null ? 0 : this.f4045a.length;
                    kl[] klVarArr = new kl[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4045a, 0, klVarArr, 0, length);
                    }
                    while (length < klVarArr.length - 1) {
                        klVarArr[length] = new kl();
                        aVar.a(klVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    klVarArr[length] = new kl();
                    aVar.a(klVarArr[length]);
                    this.f4045a = klVarArr;
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
