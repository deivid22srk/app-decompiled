package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ed extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public em f3769a = null;

    /* renamed from: b, reason: collision with root package name */
    public dz f3770b = null;
    public dz c = null;

    public ed() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3769a != null) {
            codedOutputByteBufferNano.b(1, this.f3769a);
        }
        if (this.f3770b != null) {
            codedOutputByteBufferNano.b(2, this.f3770b);
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
        if (this.f3769a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3769a);
        }
        if (this.f3770b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3770b);
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
                    if (this.f3769a == null) {
                        this.f3769a = new em();
                    }
                    aVar.a(this.f3769a);
                    break;
                case 18:
                    if (this.f3770b == null) {
                        this.f3770b = new dz();
                    }
                    aVar.a(this.f3770b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new dz();
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
