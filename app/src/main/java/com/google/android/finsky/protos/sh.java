package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sh extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public si[] f4381a = si.b();

    /* renamed from: b, reason: collision with root package name */
    public rw f4382b = null;

    public sh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4381a != null && this.f4381a.length > 0) {
            for (int i = 0; i < this.f4381a.length; i++) {
                si siVar = this.f4381a[i];
                if (siVar != null) {
                    codedOutputByteBufferNano.a(1, siVar);
                }
            }
        }
        if (this.f4382b != null) {
            codedOutputByteBufferNano.b(38, this.f4382b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4381a != null && this.f4381a.length > 0) {
            for (int i = 0; i < this.f4381a.length; i++) {
                si siVar = this.f4381a[i];
                if (siVar != null) {
                    a2 += CodedOutputByteBufferNano.c(1, siVar);
                }
            }
        }
        if (this.f4382b != null) {
            return a2 + CodedOutputByteBufferNano.d(38, this.f4382b);
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
                case 11:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 11);
                    int length = this.f4381a == null ? 0 : this.f4381a.length;
                    si[] siVarArr = new si[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4381a, 0, siVarArr, 0, length);
                    }
                    while (length < siVarArr.length - 1) {
                        siVarArr[length] = new si();
                        aVar.a(siVarArr[length], 1);
                        aVar.a();
                        length++;
                    }
                    siVarArr[length] = new si();
                    aVar.a(siVarArr[length], 1);
                    this.f4381a = siVarArr;
                    break;
                case 306:
                    if (this.f4382b == null) {
                        this.f4382b = new rw();
                    }
                    aVar.a(this.f4382b);
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
