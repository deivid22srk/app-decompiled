package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class jt extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f4008a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4009b = false;
    public ab[] c = ab.b();

    public jt() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4008a != 0 || this.f4009b) {
            codedOutputByteBufferNano.a(1, this.f4008a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                ab abVar = this.c[i];
                if (abVar != null) {
                    codedOutputByteBufferNano.b(2, abVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4008a != 0 || this.f4009b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4008a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                ab abVar = this.c[i2];
                if (abVar != null) {
                    i += CodedOutputByteBufferNano.d(2, abVar);
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f4008a = e;
                            this.f4009b = true;
                            break;
                    }
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    ab[] abVarArr = new ab[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, abVarArr, 0, length);
                    }
                    while (length < abVarArr.length - 1) {
                        abVarArr[length] = new ab();
                        aVar.a(abVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    abVarArr[length] = new ab();
                    aVar.a(abVarArr[length]);
                    this.c = abVarArr;
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
