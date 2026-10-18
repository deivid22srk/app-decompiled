package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class q extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public m f7147a = null;

    /* renamed from: b, reason: collision with root package name */
    public p f7148b = null;

    public q() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7147a != null) {
            codedOutputByteBufferNano.b(1, this.f7147a);
        }
        if (this.f7148b != null) {
            codedOutputByteBufferNano.b(2, this.f7148b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7147a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7147a);
        }
        if (this.f7148b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7148b);
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
                    if (this.f7147a == null) {
                        this.f7147a = new m();
                    }
                    aVar.a(this.f7147a);
                    break;
                case 18:
                    if (this.f7148b == null) {
                        this.f7148b = new p();
                    }
                    aVar.a(this.f7148b);
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
