package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ia extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ds f3939a = null;

    /* renamed from: b, reason: collision with root package name */
    public fe[] f3940b = fe.b();
    public ff c = null;
    public fh d = null;

    public ia() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3940b != null && this.f3940b.length > 0) {
            for (int i = 0; i < this.f3940b.length; i++) {
                fe feVar = this.f3940b[i];
                if (feVar != null) {
                    codedOutputByteBufferNano.b(2, feVar);
                }
            }
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.f3939a != null) {
            codedOutputByteBufferNano.b(5, this.f3939a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3940b != null && this.f3940b.length > 0) {
            for (int i = 0; i < this.f3940b.length; i++) {
                fe feVar = this.f3940b[i];
                if (feVar != null) {
                    a2 += CodedOutputByteBufferNano.d(2, feVar);
                }
            }
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.f3939a != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.f3939a);
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
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f3940b == null ? 0 : this.f3940b.length;
                    fe[] feVarArr = new fe[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3940b, 0, feVarArr, 0, length);
                    }
                    while (length < feVarArr.length - 1) {
                        feVarArr[length] = new fe();
                        aVar.a(feVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    feVarArr[length] = new fe();
                    aVar.a(feVarArr[length]);
                    this.f3940b = feVarArr;
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new ff();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new fh();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.f3939a == null) {
                        this.f3939a = new ds();
                    }
                    aVar.a(this.f3939a);
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
