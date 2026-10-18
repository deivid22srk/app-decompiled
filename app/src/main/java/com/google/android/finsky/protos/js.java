package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class js extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4006a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4007b = false;
    public int c = 0;
    public boolean d = false;
    public nk[] e = nk.b();

    public js() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4007b || !this.f4006a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4006a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                nk nkVar = this.e[i];
                if (nkVar != null) {
                    codedOutputByteBufferNano.b(3, nkVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4007b || !this.f4006a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4006a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                nk nkVar = this.e[i2];
                if (nkVar != null) {
                    i += CodedOutputByteBufferNano.d(3, nkVar);
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
                    this.f4006a = aVar.c();
                    this.f4007b = true;
                    break;
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.e == null ? 0 : this.e.length;
                    nk[] nkVarArr = new nk[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, nkVarArr, 0, length);
                    }
                    while (length < nkVarArr.length - 1) {
                        nkVarArr[length] = new nk();
                        aVar.a(nkVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nkVarArr[length] = new nk();
                    aVar.a(nkVarArr[length]);
                    this.e = nkVarArr;
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
