package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class u extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7593a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7594b = "";
    public com.google.b.a.a.a.b.a.apkg.cpkg.b c = null;

    public u() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7593a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7593a);
        }
        if (!this.f7594b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7594b);
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
        if (!this.f7593a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7593a);
        }
        if (!this.f7594b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7594b);
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
                    this.f7593a = aVar.c();
                    break;
                case 18:
                    this.f7594b = aVar.c();
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.apkg.cpkg.b();
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
