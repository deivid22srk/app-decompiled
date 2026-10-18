package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class t extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public p f7688a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f7689b = "";
    public r c = null;
    public p[] d = p.b();

    public t() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7688a != null) {
            codedOutputByteBufferNano.b(3, this.f7688a);
        }
        if (!this.f7689b.equals("")) {
            codedOutputByteBufferNano.a(4, this.f7689b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(5, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                p pVar = this.d[i];
                if (pVar != null) {
                    codedOutputByteBufferNano.b(6, pVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7688a != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f7688a);
        }
        if (!this.f7689b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f7689b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                p pVar = this.d[i2];
                if (pVar != null) {
                    i += CodedOutputByteBufferNano.d(6, pVar);
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
                case 26:
                    if (this.f7688a == null) {
                        this.f7688a = new p();
                    }
                    aVar.a(this.f7688a);
                    break;
                case 34:
                    this.f7689b = aVar.c();
                    break;
                case 42:
                    if (this.c == null) {
                        this.c = new r();
                    }
                    aVar.a(this.c);
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.d == null ? 0 : this.d.length;
                    p[] pVarArr = new p[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, pVarArr, 0, length);
                    }
                    while (length < pVarArr.length - 1) {
                        pVarArr[length] = new p();
                        aVar.a(pVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    pVarArr[length] = new p();
                    aVar.a(pVarArr[length]);
                    this.d = pVarArr;
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
