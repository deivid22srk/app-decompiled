package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class i extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public d[] f7132a = d.b();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7133b = false;
    public boolean c = false;

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7132a != null && this.f7132a.length > 0) {
            for (int i = 0; i < this.f7132a.length; i++) {
                d dVar = this.f7132a[i];
                if (dVar != null) {
                    codedOutputByteBufferNano.b(1, dVar);
                }
            }
        }
        if (this.c || this.f7133b) {
            codedOutputByteBufferNano.a(2, this.f7133b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7132a != null && this.f7132a.length > 0) {
            for (int i = 0; i < this.f7132a.length; i++) {
                d dVar = this.f7132a[i];
                if (dVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, dVar);
                }
            }
        }
        if (this.c || this.f7133b) {
            return a2 + CodedOutputByteBufferNano.c(2) + 1;
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
                    int length = this.f7132a == null ? 0 : this.f7132a.length;
                    d[] dVarArr = new d[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7132a, 0, dVarArr, 0, length);
                    }
                    while (length < dVarArr.length - 1) {
                        dVarArr[length] = new d();
                        aVar.a(dVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dVarArr[length] = new d();
                    aVar.a(dVarArr[length]);
                    this.f7132a = dVarArr;
                    break;
                case 16:
                    this.f7133b = aVar.b();
                    this.c = true;
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
