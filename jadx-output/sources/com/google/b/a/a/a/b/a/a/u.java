package com.google.b.a.a.a.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class u extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public j f7646a = null;

    /* renamed from: b, reason: collision with root package name */
    public o[] f7647b = o.b();
    public com.google.b.a.a.a.b.a.a.c.b c = null;

    public u() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7646a != null) {
            codedOutputByteBufferNano.b(1, this.f7646a);
        }
        if (this.f7647b != null && this.f7647b.length > 0) {
            for (int i = 0; i < this.f7647b.length; i++) {
                o oVar = this.f7647b[i];
                if (oVar != null) {
                    codedOutputByteBufferNano.b(2, oVar);
                }
            }
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7646a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7646a);
        }
        if (this.f7647b != null && this.f7647b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7647b.length; i2++) {
                o oVar = this.f7647b[i2];
                if (oVar != null) {
                    i += CodedOutputByteBufferNano.d(2, oVar);
                }
            }
            a2 = i;
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.c);
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
                    if (this.f7646a == null) {
                        this.f7646a = new j();
                    }
                    aVar.a(this.f7646a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f7647b == null ? 0 : this.f7647b.length;
                    o[] oVarArr = new o[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7647b, 0, oVarArr, 0, length);
                    }
                    while (length < oVarArr.length - 1) {
                        oVarArr[length] = new o();
                        aVar.a(oVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    oVarArr[length] = new o();
                    aVar.a(oVarArr[length]);
                    this.f7647b = oVarArr;
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.a.c.b();
                    }
                    aVar.a(this.c);
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
