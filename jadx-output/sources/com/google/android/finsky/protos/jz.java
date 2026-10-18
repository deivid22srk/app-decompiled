package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class jz extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ol f4019a = null;

    /* renamed from: b, reason: collision with root package name */
    public ol f4020b = null;
    public ol c = null;

    public jz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4019a != null) {
            codedOutputByteBufferNano.b(1, this.f4019a);
        }
        if (this.f4020b != null) {
            codedOutputByteBufferNano.b(2, this.f4020b);
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
        if (this.f4019a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4019a);
        }
        if (this.f4020b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4020b);
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
                    if (this.f4019a == null) {
                        this.f4019a = new ol();
                    }
                    aVar.a(this.f4019a);
                    break;
                case 18:
                    if (this.f4020b == null) {
                        this.f4020b = new ol();
                    }
                    aVar.a(this.f4020b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new ol();
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
