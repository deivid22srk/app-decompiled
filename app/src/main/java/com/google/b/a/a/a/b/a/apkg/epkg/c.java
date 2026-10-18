package com.google.b.a.a.a.b.a.apkg.epkg;

import com.google.b.a.a.a.b.a.bpkg.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7622a = "";

    /* renamed from: b, reason: collision with root package name */
    public ae[] f7623b = ae.b();

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7622a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7622a);
        }
        if (this.f7623b != null && this.f7623b.length > 0) {
            for (int i = 0; i < this.f7623b.length; i++) {
                ae aeVar = this.f7623b[i];
                if (aeVar != null) {
                    codedOutputByteBufferNano.b(3, aeVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7622a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7622a);
        }
        if (this.f7623b != null && this.f7623b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7623b.length; i2++) {
                ae aeVar = this.f7623b[i2];
                if (aeVar != null) {
                    i += CodedOutputByteBufferNano.d(3, aeVar);
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
                    this.f7622a = aVar.c();
                    break;
                case 26:
                    int b2 = e.b(aVar, 26);
                    int length = this.f7623b == null ? 0 : this.f7623b.length;
                    ae[] aeVarArr = new ae[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7623b, 0, aeVarArr, 0, length);
                    }
                    while (length < aeVarArr.length - 1) {
                        aeVarArr[length] = new ae();
                        aVar.a(aeVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    aeVarArr[length] = new ae();
                    aVar.a(aeVarArr[length]);
                    this.f7623b = aeVarArr;
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
