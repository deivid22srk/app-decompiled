package com.google.b.a.a.a.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class q extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public j f7638a = null;

    /* renamed from: b, reason: collision with root package name */
    public r[] f7639b = r.b();
    public com.google.b.a.a.a.b.a.a.c.b c = null;

    public q() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7638a != null) {
            codedOutputByteBufferNano.b(1, this.f7638a);
        }
        if (this.f7639b != null && this.f7639b.length > 0) {
            for (int i = 0; i < this.f7639b.length; i++) {
                r rVar = this.f7639b[i];
                if (rVar != null) {
                    codedOutputByteBufferNano.b(2, rVar);
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
        if (this.f7638a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7638a);
        }
        if (this.f7639b != null && this.f7639b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7639b.length; i2++) {
                r rVar = this.f7639b[i2];
                if (rVar != null) {
                    i += CodedOutputByteBufferNano.d(2, rVar);
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
                    if (this.f7638a == null) {
                        this.f7638a = new j();
                    }
                    aVar.a(this.f7638a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f7639b == null ? 0 : this.f7639b.length;
                    r[] rVarArr = new r[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7639b, 0, rVarArr, 0, length);
                    }
                    while (length < rVarArr.length - 1) {
                        rVarArr[length] = new r();
                        aVar.a(rVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rVarArr[length] = new r();
                    aVar.a(rVarArr[length]);
                    this.f7639b = rVarArr;
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
