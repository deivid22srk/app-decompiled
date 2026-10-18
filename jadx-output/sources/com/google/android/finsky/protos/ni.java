package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ni extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gx f4167a = null;

    /* renamed from: b, reason: collision with root package name */
    public gx[] f4168b = gx.b();

    public ni() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4167a != null) {
            codedOutputByteBufferNano.b(1, this.f4167a);
        }
        if (this.f4168b != null && this.f4168b.length > 0) {
            for (int i = 0; i < this.f4168b.length; i++) {
                gx gxVar = this.f4168b[i];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(3, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4167a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4167a);
        }
        if (this.f4168b != null && this.f4168b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4168b.length; i2++) {
                gx gxVar = this.f4168b[i2];
                if (gxVar != null) {
                    i += CodedOutputByteBufferNano.d(3, gxVar);
                }
            }
            return i;
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
                    if (this.f4167a == null) {
                        this.f4167a = new gx();
                    }
                    aVar.a(this.f4167a);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.f4168b == null ? 0 : this.f4168b.length;
                    gx[] gxVarArr = new gx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4168b, 0, gxVarArr, 0, length);
                    }
                    while (length < gxVarArr.length - 1) {
                        gxVarArr[length] = new gx();
                        aVar.a(gxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gxVarArr[length] = new gx();
                    aVar.a(gxVarArr[length]);
                    this.f4168b = gxVarArr;
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
