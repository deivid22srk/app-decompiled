package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class aa extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ab[] f7652a = ab.b();

    /* renamed from: b, reason: collision with root package name */
    public String f7653b = "";
    public String c = "";
    public int d = 0;

    public aa() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7652a != null && this.f7652a.length > 0) {
            for (int i = 0; i < this.f7652a.length; i++) {
                ab abVar = this.f7652a[i];
                if (abVar != null) {
                    codedOutputByteBufferNano.b(1, abVar);
                }
            }
        }
        if (!this.f7653b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7653b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7652a != null && this.f7652a.length > 0) {
            for (int i = 0; i < this.f7652a.length; i++) {
                ab abVar = this.f7652a[i];
                if (abVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, abVar);
                }
            }
        }
        if (!this.f7653b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7653b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.d);
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
                    int length = this.f7652a == null ? 0 : this.f7652a.length;
                    ab[] abVarArr = new ab[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7652a, 0, abVarArr, 0, length);
                    }
                    while (length < abVarArr.length - 1) {
                        abVarArr[length] = new ab();
                        aVar.a(abVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    abVarArr[length] = new ab();
                    aVar.a(abVarArr[length]);
                    this.f7652a = abVarArr;
                    break;
                case 18:
                    this.f7653b = aVar.c();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = e;
                            break;
                    }
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
