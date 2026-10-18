package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lo extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public lm f4090a = null;

    /* renamed from: b, reason: collision with root package name */
    public lm[] f4091b = lm.b();
    public ln[] c = ln.b();

    public lo() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4090a != null) {
            codedOutputByteBufferNano.b(1, this.f4090a);
        }
        if (this.f4091b != null && this.f4091b.length > 0) {
            for (int i = 0; i < this.f4091b.length; i++) {
                lm lmVar = this.f4091b[i];
                if (lmVar != null) {
                    codedOutputByteBufferNano.b(2, lmVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                ln lnVar = this.c[i2];
                if (lnVar != null) {
                    codedOutputByteBufferNano.b(3, lnVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4090a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4090a);
        }
        if (this.f4091b != null && this.f4091b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4091b.length; i2++) {
                lm lmVar = this.f4091b[i2];
                if (lmVar != null) {
                    i += CodedOutputByteBufferNano.d(2, lmVar);
                }
            }
            a2 = i;
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                ln lnVar = this.c[i3];
                if (lnVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, lnVar);
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
                    if (this.f4090a == null) {
                        this.f4090a = new lm();
                    }
                    aVar.a(this.f4090a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f4091b == null ? 0 : this.f4091b.length;
                    lm[] lmVarArr = new lm[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4091b, 0, lmVarArr, 0, length);
                    }
                    while (length < lmVarArr.length - 1) {
                        lmVarArr[length] = new lm();
                        aVar.a(lmVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lmVarArr[length] = new lm();
                    aVar.a(lmVarArr[length]);
                    this.f4091b = lmVarArr;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.c == null ? 0 : this.c.length;
                    ln[] lnVarArr = new ln[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, lnVarArr, 0, length2);
                    }
                    while (length2 < lnVarArr.length - 1) {
                        lnVarArr[length2] = new ln();
                        aVar.a(lnVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    lnVarArr[length2] = new ln();
                    aVar.a(lnVarArr[length2]);
                    this.c = lnVarArr;
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
