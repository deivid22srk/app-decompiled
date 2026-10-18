package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class se extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public sd f4375a = null;

    /* renamed from: b, reason: collision with root package name */
    public sf[] f4376b = sf.b();

    public se() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4375a != null) {
            codedOutputByteBufferNano.b(1, this.f4375a);
        }
        if (this.f4376b != null && this.f4376b.length > 0) {
            for (int i = 0; i < this.f4376b.length; i++) {
                sf sfVar = this.f4376b[i];
                if (sfVar != null) {
                    codedOutputByteBufferNano.a(2, sfVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4375a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4375a);
        }
        if (this.f4376b != null && this.f4376b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4376b.length; i2++) {
                sf sfVar = this.f4376b[i2];
                if (sfVar != null) {
                    i += CodedOutputByteBufferNano.c(2, sfVar);
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
                    if (this.f4375a == null) {
                        this.f4375a = new sd();
                    }
                    aVar.a(this.f4375a);
                    break;
                case 19:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 19);
                    int length = this.f4376b == null ? 0 : this.f4376b.length;
                    sf[] sfVarArr = new sf[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4376b, 0, sfVarArr, 0, length);
                    }
                    while (length < sfVarArr.length - 1) {
                        sfVarArr[length] = new sf();
                        aVar.a(sfVarArr[length], 2);
                        aVar.a();
                        length++;
                    }
                    sfVarArr[length] = new sf();
                    aVar.a(sfVarArr[length], 2);
                    this.f4376b = sfVarArr;
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
