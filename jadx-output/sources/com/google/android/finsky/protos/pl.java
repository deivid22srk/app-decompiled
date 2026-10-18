package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pl extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4255a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4256b = false;
    public String c = "";
    public boolean d = false;
    public pk[] e = pk.b();

    public pl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4256b || !this.f4255a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4255a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                pk pkVar = this.e[i];
                if (pkVar != null) {
                    codedOutputByteBufferNano.b(3, pkVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4256b || !this.f4255a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4255a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                pk pkVar = this.e[i2];
                if (pkVar != null) {
                    i += CodedOutputByteBufferNano.d(3, pkVar);
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
                    this.f4255a = aVar.c();
                    this.f4256b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.e == null ? 0 : this.e.length;
                    pk[] pkVarArr = new pk[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, pkVarArr, 0, length);
                    }
                    while (length < pkVarArr.length - 1) {
                        pkVarArr[length] = new pk();
                        aVar.a(pkVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    pkVarArr[length] = new pk();
                    aVar.a(pkVarArr[length]);
                    this.e = pkVarArr;
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
