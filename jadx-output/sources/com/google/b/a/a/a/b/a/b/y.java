package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class y extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7694a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f7695b = "";

    public y() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7694a != 0) {
            codedOutputByteBufferNano.a(1, this.f7694a);
        }
        if (!this.f7695b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7695b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7694a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7694a);
        }
        if (!this.f7695b.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f7695b);
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f7694a = e;
                            break;
                    }
                case 18:
                    this.f7695b = aVar.c();
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
