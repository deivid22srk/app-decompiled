package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ml extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public mo f4132a = null;

    /* renamed from: b, reason: collision with root package name */
    public mq f4133b = null;

    public ml() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4132a != null) {
            codedOutputByteBufferNano.b(1, this.f4132a);
        }
        if (this.f4133b != null) {
            codedOutputByteBufferNano.b(2, this.f4133b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4132a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4132a);
        }
        if (this.f4133b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f4133b);
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
                    if (this.f4132a == null) {
                        this.f4132a = new mo();
                    }
                    aVar.a(this.f4132a);
                    break;
                case 18:
                    if (this.f4133b == null) {
                        this.f4133b = new mq();
                    }
                    aVar.a(this.f4133b);
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
