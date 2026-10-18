package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lg extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public lf f4078a = null;

    /* renamed from: b, reason: collision with root package name */
    public op f4079b = null;
    public lk[] c = lk.b();
    public os d = null;

    public lg() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4078a != null) {
            codedOutputByteBufferNano.b(1, this.f4078a);
        }
        if (this.f4079b != null) {
            codedOutputByteBufferNano.b(2, this.f4079b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                lk lkVar = this.c[i];
                if (lkVar != null) {
                    codedOutputByteBufferNano.b(3, lkVar);
                }
            }
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4078a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4078a);
        }
        if (this.f4079b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4079b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                lk lkVar = this.c[i2];
                if (lkVar != null) {
                    i += CodedOutputByteBufferNano.d(3, lkVar);
                }
            }
            a2 = i;
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.d);
        }
        return a2;
    }

    public static lg a(byte[] bArr) {
        return (lg) com.google.protobuf.nano.c.a(new lg(), bArr, bArr.length);
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.f4078a == null) {
                        this.f4078a = new lf();
                    }
                    aVar.a(this.f4078a);
                    break;
                case 18:
                    if (this.f4079b == null) {
                        this.f4079b = new op();
                    }
                    aVar.a(this.f4079b);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    lk[] lkVarArr = new lk[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, lkVarArr, 0, length);
                    }
                    while (length < lkVarArr.length - 1) {
                        lkVarArr[length] = new lk();
                        aVar.a(lkVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lkVarArr[length] = new lk();
                    aVar.a(lkVarArr[length]);
                    this.c = lkVarArr;
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new os();
                    }
                    aVar.a(this.d);
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
