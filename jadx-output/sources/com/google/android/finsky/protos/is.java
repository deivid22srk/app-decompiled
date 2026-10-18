package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class is extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public iv[] f3969a = iv.b();

    /* renamed from: b, reason: collision with root package name */
    public int f3970b = 0;
    public boolean c = false;

    public is() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3969a != null && this.f3969a.length > 0) {
            for (int i = 0; i < this.f3969a.length; i++) {
                iv ivVar = this.f3969a[i];
                if (ivVar != null) {
                    codedOutputByteBufferNano.b(1, ivVar);
                }
            }
        }
        if (this.c || this.f3970b != 0) {
            codedOutputByteBufferNano.a(2, this.f3970b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3969a != null && this.f3969a.length > 0) {
            for (int i = 0; i < this.f3969a.length; i++) {
                iv ivVar = this.f3969a[i];
                if (ivVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, ivVar);
                }
            }
        }
        if (this.c || this.f3970b != 0) {
            return a2 + CodedOutputByteBufferNano.c(2, this.f3970b);
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
                    int length = this.f3969a == null ? 0 : this.f3969a.length;
                    iv[] ivVarArr = new iv[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3969a, 0, ivVarArr, 0, length);
                    }
                    while (length < ivVarArr.length - 1) {
                        ivVarArr[length] = new iv();
                        aVar.a(ivVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ivVarArr[length] = new iv();
                    aVar.a(ivVarArr[length]);
                    this.f3969a = ivVarArr;
                    break;
                case 16:
                    this.f3970b = aVar.e();
                    this.c = true;
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
