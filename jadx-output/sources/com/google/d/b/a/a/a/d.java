package com.google.d.b.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.d f7735a = null;

    /* renamed from: b, reason: collision with root package name */
    public b f7736b = null;

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7735a != null) {
            codedOutputByteBufferNano.b(1, this.f7735a);
        }
        if (this.f7736b != null) {
            codedOutputByteBufferNano.b(2, this.f7736b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7735a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7735a);
        }
        if (this.f7736b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7736b);
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
                    if (this.f7735a == null) {
                        this.f7735a = new com.google.b.a.a.a.b.a.d();
                    }
                    aVar.a(this.f7735a);
                    break;
                case 18:
                    if (this.f7736b == null) {
                        this.f7736b = new b();
                    }
                    aVar.a(this.f7736b);
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
