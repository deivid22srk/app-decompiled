package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lf extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ld f4076a = null;

    /* renamed from: b, reason: collision with root package name */
    public lj f4077b = null;
    public hh c = null;
    public y d = null;

    public lf() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4076a != null) {
            codedOutputByteBufferNano.b(1, this.f4076a);
        }
        if (this.f4077b != null) {
            codedOutputByteBufferNano.b(2, this.f4077b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4076a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4076a);
        }
        if (this.f4077b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4077b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.d);
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
                    if (this.f4076a == null) {
                        this.f4076a = new ld();
                    }
                    aVar.a(this.f4076a);
                    break;
                case 18:
                    if (this.f4077b == null) {
                        this.f4077b = new lj();
                    }
                    aVar.a(this.f4077b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new hh();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new y();
                    }
                    aVar.a(this.d);
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
