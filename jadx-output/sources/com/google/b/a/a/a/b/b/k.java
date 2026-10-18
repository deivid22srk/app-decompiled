package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class k extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public c f7724a = null;

    /* renamed from: b, reason: collision with root package name */
    public b f7725b = null;

    public k() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7724a != null) {
            codedOutputByteBufferNano.b(1, this.f7724a);
        }
        if (this.f7725b != null) {
            codedOutputByteBufferNano.b(2, this.f7725b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7724a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7724a);
        }
        if (this.f7725b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7725b);
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
                    if (this.f7724a == null) {
                        this.f7724a = new c();
                    }
                    aVar.a(this.f7724a);
                    break;
                case 18:
                    if (this.f7725b == null) {
                        this.f7725b = new b();
                    }
                    aVar.a(this.f7725b);
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
