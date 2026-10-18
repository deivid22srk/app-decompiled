package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class op extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4221a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4222b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public qu[] g = qu.b();

    public op() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4222b || this.f4221a) {
            codedOutputByteBufferNano.a(1, this.f4221a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                qu quVar = this.g[i];
                if (quVar != null) {
                    codedOutputByteBufferNano.b(4, quVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4222b || this.f4221a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                qu quVar = this.g[i2];
                if (quVar != null) {
                    i += CodedOutputByteBufferNano.d(4, quVar);
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
                    this.f4221a = aVar.b();
                    this.f4222b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.g == null ? 0 : this.g.length;
                    qu[] quVarArr = new qu[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, quVarArr, 0, length);
                    }
                    while (length < quVarArr.length - 1) {
                        quVarArr[length] = new qu();
                        aVar.a(quVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    quVarArr[length] = new qu();
                    aVar.a(quVarArr[length]);
                    this.g = quVarArr;
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
