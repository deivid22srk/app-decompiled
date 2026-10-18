package com.google.b.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7553a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7554b = 0;
    public int c = 0;

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7553a != 0) {
            codedOutputByteBufferNano.a(1, this.f7553a);
        }
        if (this.f7554b != 0) {
            codedOutputByteBufferNano.a(2, this.f7554b);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7553a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7553a);
        }
        if (this.f7554b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f7554b);
        }
        if (this.c != 0) {
            return a2 + CodedOutputByteBufferNano.c(3, this.c);
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
                case 8:
                    this.f7553a = aVar.e();
                    break;
                case 16:
                    this.f7554b = aVar.e();
                    break;
                case 24:
                    this.c = aVar.e();
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
