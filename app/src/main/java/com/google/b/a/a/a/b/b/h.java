package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class h extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.d f7720a = null;

    /* renamed from: b, reason: collision with root package name */
    public c f7721b = null;
    public e c = null;

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7720a != null) {
            codedOutputByteBufferNano.b(1, this.f7720a);
        }
        if (this.f7721b != null) {
            codedOutputByteBufferNano.b(2, this.f7721b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7720a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7720a);
        }
        if (this.f7721b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7721b);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.c);
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
                    if (this.f7720a == null) {
                        this.f7720a = new com.google.b.a.a.a.b.a.d();
                    }
                    aVar.a(this.f7720a);
                    break;
                case 18:
                    if (this.f7721b == null) {
                        this.f7721b = new c();
                    }
                    aVar.a(this.f7721b);
                    break;
                case 34:
                    if (this.c == null) {
                        this.c = new e();
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
