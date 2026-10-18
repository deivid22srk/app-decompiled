package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ob extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public oa[] f4199a = oa.b();

    public ob() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4199a != null && this.f4199a.length > 0) {
            for (int i = 0; i < this.f4199a.length; i++) {
                oa oaVar = this.f4199a[i];
                if (oaVar != null) {
                    codedOutputByteBufferNano.b(1, oaVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4199a != null && this.f4199a.length > 0) {
            for (int i = 0; i < this.f4199a.length; i++) {
                oa oaVar = this.f4199a[i];
                if (oaVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, oaVar);
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
                    int length = this.f4199a == null ? 0 : this.f4199a.length;
                    oa[] oaVarArr = new oa[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4199a, 0, oaVarArr, 0, length);
                    }
                    while (length < oaVarArr.length - 1) {
                        oaVarArr[length] = new oa();
                        aVar.a(oaVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    oaVarArr[length] = new oa();
                    aVar.a(oaVarArr[length]);
                    this.f4199a = oaVarArr;
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
