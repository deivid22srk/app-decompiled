package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nx extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public nv[] f4190a = nv.b();

    public nx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4190a != null && this.f4190a.length > 0) {
            for (int i = 0; i < this.f4190a.length; i++) {
                nv nvVar = this.f4190a[i];
                if (nvVar != null) {
                    codedOutputByteBufferNano.b(1, nvVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4190a != null && this.f4190a.length > 0) {
            for (int i = 0; i < this.f4190a.length; i++) {
                nv nvVar = this.f4190a[i];
                if (nvVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, nvVar);
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
                    int length = this.f4190a == null ? 0 : this.f4190a.length;
                    nv[] nvVarArr = new nv[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4190a, 0, nvVarArr, 0, length);
                    }
                    while (length < nvVarArr.length - 1) {
                        nvVarArr[length] = new nv();
                        aVar.a(nvVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nvVarArr[length] = new nv();
                    aVar.a(nvVarArr[length]);
                    this.f4190a = nvVarArr;
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
