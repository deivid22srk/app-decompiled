package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public hy[] f3932a = hy.b();

    public hw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3932a != null && this.f3932a.length > 0) {
            for (int i = 0; i < this.f3932a.length; i++) {
                hy hyVar = this.f3932a[i];
                if (hyVar != null) {
                    codedOutputByteBufferNano.b(1, hyVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3932a != null && this.f3932a.length > 0) {
            for (int i = 0; i < this.f3932a.length; i++) {
                hy hyVar = this.f3932a[i];
                if (hyVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, hyVar);
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
                    int length = this.f3932a == null ? 0 : this.f3932a.length;
                    hy[] hyVarArr = new hy[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3932a, 0, hyVarArr, 0, length);
                    }
                    while (length < hyVarArr.length - 1) {
                        hyVarArr[length] = new hy();
                        aVar.a(hyVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    hyVarArr[length] = new hy();
                    aVar.a(hyVarArr[length]);
                    this.f3932a = hyVarArr;
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
