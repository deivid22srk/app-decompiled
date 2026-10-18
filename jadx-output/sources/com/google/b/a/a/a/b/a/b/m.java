package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class m extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public n[] f7680a = n.b();

    /* renamed from: b, reason: collision with root package name */
    public String f7681b = "";
    public boolean c = false;

    public m() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7680a != null && this.f7680a.length > 0) {
            for (int i = 0; i < this.f7680a.length; i++) {
                n nVar = this.f7680a[i];
                if (nVar != null) {
                    codedOutputByteBufferNano.b(1, nVar);
                }
            }
        }
        if (!this.f7681b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7681b);
        }
        if (this.c) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7680a != null && this.f7680a.length > 0) {
            for (int i = 0; i < this.f7680a.length; i++) {
                n nVar = this.f7680a[i];
                if (nVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, nVar);
                }
            }
        }
        if (!this.f7681b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7681b);
        }
        if (this.c) {
            return a2 + CodedOutputByteBufferNano.c(3) + 1;
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
                    int length = this.f7680a == null ? 0 : this.f7680a.length;
                    n[] nVarArr = new n[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7680a, 0, nVarArr, 0, length);
                    }
                    while (length < nVarArr.length - 1) {
                        nVarArr[length] = new n();
                        aVar.a(nVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nVarArr[length] = new n();
                    aVar.a(nVarArr[length]);
                    this.f7680a = nVarArr;
                    break;
                case 18:
                    this.f7681b = aVar.c();
                    break;
                case 24:
                    this.c = aVar.b();
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
