package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class t extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public u[] f1502a = u.b();

    public t() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1502a != null && this.f1502a.length > 0) {
            for (int i = 0; i < this.f1502a.length; i++) {
                u uVar = this.f1502a[i];
                if (uVar != null) {
                    codedOutputByteBufferNano.b(1, uVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1502a != null && this.f1502a.length > 0) {
            for (int i = 0; i < this.f1502a.length; i++) {
                u uVar = this.f1502a[i];
                if (uVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, uVar);
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
                    int length = this.f1502a == null ? 0 : this.f1502a.length;
                    u[] uVarArr = new u[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f1502a, 0, uVarArr, 0, length);
                    }
                    while (length < uVarArr.length - 1) {
                        uVarArr[length] = new u();
                        aVar.a(uVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    uVarArr[length] = new u();
                    aVar.a(uVarArr[length]);
                    this.f1502a = uVarArr;
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
