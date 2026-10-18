package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class je extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public bc[] f3990a = bc.b();

    /* renamed from: b, reason: collision with root package name */
    public gx[] f3991b = gx.b();

    public je() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3990a != null && this.f3990a.length > 0) {
            for (int i = 0; i < this.f3990a.length; i++) {
                bc bcVar = this.f3990a[i];
                if (bcVar != null) {
                    codedOutputByteBufferNano.b(1, bcVar);
                }
            }
        }
        if (this.f3991b != null && this.f3991b.length > 0) {
            for (int i2 = 0; i2 < this.f3991b.length; i2++) {
                gx gxVar = this.f3991b[i2];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(2, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3990a != null && this.f3990a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3990a.length; i2++) {
                bc bcVar = this.f3990a[i2];
                if (bcVar != null) {
                    i += CodedOutputByteBufferNano.d(1, bcVar);
                }
            }
            a2 = i;
        }
        if (this.f3991b != null && this.f3991b.length > 0) {
            for (int i3 = 0; i3 < this.f3991b.length; i3++) {
                gx gxVar = this.f3991b[i3];
                if (gxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(2, gxVar);
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
                    int length = this.f3990a == null ? 0 : this.f3990a.length;
                    bc[] bcVarArr = new bc[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3990a, 0, bcVarArr, 0, length);
                    }
                    while (length < bcVarArr.length - 1) {
                        bcVarArr[length] = new bc();
                        aVar.a(bcVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bcVarArr[length] = new bc();
                    aVar.a(bcVarArr[length]);
                    this.f3990a = bcVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f3991b == null ? 0 : this.f3991b.length;
                    gx[] gxVarArr = new gx[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f3991b, 0, gxVarArr, 0, length2);
                    }
                    while (length2 < gxVarArr.length - 1) {
                        gxVarArr[length2] = new gx();
                        aVar.a(gxVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    gxVarArr[length2] = new gx();
                    aVar.a(gxVarArr[length2]);
                    this.f3991b = gxVarArr;
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
