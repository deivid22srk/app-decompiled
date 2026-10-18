package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pi extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gn f4249a = null;

    /* renamed from: b, reason: collision with root package name */
    public gn f4250b = null;
    public nd[] c = nd.b();

    public pi() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                nd ndVar = this.c[i];
                if (ndVar != null) {
                    codedOutputByteBufferNano.b(2, ndVar);
                }
            }
        }
        if (this.f4249a != null) {
            codedOutputByteBufferNano.b(4, this.f4249a);
        }
        if (this.f4250b != null) {
            codedOutputByteBufferNano.b(5, this.f4250b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                nd ndVar = this.c[i];
                if (ndVar != null) {
                    a2 += CodedOutputByteBufferNano.d(2, ndVar);
                }
            }
        }
        if (this.f4249a != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f4249a);
        }
        if (this.f4250b != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.f4250b);
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
                    int length = this.c == null ? 0 : this.c.length;
                    nd[] ndVarArr = new nd[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, ndVarArr, 0, length);
                    }
                    while (length < ndVarArr.length - 1) {
                        ndVarArr[length] = new nd();
                        aVar.a(ndVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ndVarArr[length] = new nd();
                    aVar.a(ndVarArr[length]);
                    this.c = ndVarArr;
                    break;
                case 34:
                    if (this.f4249a == null) {
                        this.f4249a = new gn();
                    }
                    aVar.a(this.f4249a);
                    break;
                case 42:
                    if (this.f4250b == null) {
                        this.f4250b = new gn();
                    }
                    aVar.a(this.f4250b);
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
