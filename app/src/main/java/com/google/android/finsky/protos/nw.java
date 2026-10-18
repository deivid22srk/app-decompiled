package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public nu[] f4189a = nu.b();

    public nw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4189a != null && this.f4189a.length > 0) {
            for (int i = 0; i < this.f4189a.length; i++) {
                nu nuVar = this.f4189a[i];
                if (nuVar != null) {
                    codedOutputByteBufferNano.b(1, nuVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4189a != null && this.f4189a.length > 0) {
            for (int i = 0; i < this.f4189a.length; i++) {
                nu nuVar = this.f4189a[i];
                if (nuVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, nuVar);
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
                    int length = this.f4189a == null ? 0 : this.f4189a.length;
                    nu[] nuVarArr = new nu[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4189a, 0, nuVarArr, 0, length);
                    }
                    while (length < nuVarArr.length - 1) {
                        nuVarArr[length] = new nu();
                        aVar.a(nuVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nuVarArr[length] = new nu();
                    aVar.a(nuVarArr[length]);
                    this.f4189a = nuVarArr;
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
