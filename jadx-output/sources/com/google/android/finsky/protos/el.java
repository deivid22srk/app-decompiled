package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class el extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public dp f3784a = null;

    /* renamed from: b, reason: collision with root package name */
    public dp[] f3785b = dp.b();
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public el() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3784a != null) {
            codedOutputByteBufferNano.b(1, this.f3784a);
        }
        if (this.f3785b != null && this.f3785b.length > 0) {
            for (int i = 0; i < this.f3785b.length; i++) {
                dp dpVar = this.f3785b[i];
                if (dpVar != null) {
                    codedOutputByteBufferNano.b(2, dpVar);
                }
            }
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3784a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3784a);
        }
        if (this.f3785b != null && this.f3785b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3785b.length; i2++) {
                dp dpVar = this.f3785b[i2];
                if (dpVar != null) {
                    i += CodedOutputByteBufferNano.d(2, dpVar);
                }
            }
            a2 = i;
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    if (this.f3784a == null) {
                        this.f3784a = new dp();
                    }
                    aVar.a(this.f3784a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f3785b == null ? 0 : this.f3785b.length;
                    dp[] dpVarArr = new dp[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3785b, 0, dpVarArr, 0, length);
                    }
                    while (length < dpVarArr.length - 1) {
                        dpVarArr[length] = new dp();
                        aVar.a(dpVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dpVarArr[length] = new dp();
                    aVar.a(dpVarArr[length]);
                    this.f3785b = dpVarArr;
                    break;
                case 24:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 32:
                    this.e = aVar.b();
                    this.f = true;
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
