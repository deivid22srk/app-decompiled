package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ga extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public fy[] f3856a = fy.b();

    public ga() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3856a != null && this.f3856a.length > 0) {
            for (int i = 0; i < this.f3856a.length; i++) {
                fy fyVar = this.f3856a[i];
                if (fyVar != null) {
                    codedOutputByteBufferNano.b(1, fyVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3856a != null && this.f3856a.length > 0) {
            for (int i = 0; i < this.f3856a.length; i++) {
                fy fyVar = this.f3856a[i];
                if (fyVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, fyVar);
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
                    int length = this.f3856a == null ? 0 : this.f3856a.length;
                    fy[] fyVarArr = new fy[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3856a, 0, fyVarArr, 0, length);
                    }
                    while (length < fyVarArr.length - 1) {
                        fyVarArr[length] = new fy();
                        aVar.a(fyVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    fyVarArr[length] = new fy();
                    aVar.a(fyVarArr[length]);
                    this.f3856a = fyVarArr;
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
