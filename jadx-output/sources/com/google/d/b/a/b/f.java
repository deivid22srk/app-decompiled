package com.google.d.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class f extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.d f7750a = null;

    /* renamed from: b, reason: collision with root package name */
    public d f7751b = null;

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7750a != null) {
            codedOutputByteBufferNano.b(1, this.f7750a);
        }
        if (this.f7751b != null) {
            codedOutputByteBufferNano.b(2, this.f7751b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7750a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7750a);
        }
        if (this.f7751b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7751b);
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
                    if (this.f7750a == null) {
                        this.f7750a = new com.google.b.a.a.a.b.a.d();
                    }
                    aVar.a(this.f7750a);
                    break;
                case 18:
                    if (this.f7751b == null) {
                        this.f7751b = new d();
                    }
                    aVar.a(this.f7751b);
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
