package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ap extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gx[] f3602a = gx.b();

    public ap() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3602a != null && this.f3602a.length > 0) {
            for (int i = 0; i < this.f3602a.length; i++) {
                gx gxVar = this.f3602a[i];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(1, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3602a != null && this.f3602a.length > 0) {
            for (int i = 0; i < this.f3602a.length; i++) {
                gx gxVar = this.f3602a[i];
                if (gxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, gxVar);
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
                    int length = this.f3602a == null ? 0 : this.f3602a.length;
                    gx[] gxVarArr = new gx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3602a, 0, gxVarArr, 0, length);
                    }
                    while (length < gxVarArr.length - 1) {
                        gxVarArr[length] = new gx();
                        aVar.a(gxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gxVarArr[length] = new gx();
                    aVar.a(gxVarArr[length]);
                    this.f3602a = gxVarArr;
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
