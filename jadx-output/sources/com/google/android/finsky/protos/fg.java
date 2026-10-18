package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fg extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ff f3818a = null;

    /* renamed from: b, reason: collision with root package name */
    public fj f3819b = null;
    public fn c = null;

    public fg() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3818a != null) {
            codedOutputByteBufferNano.b(1, this.f3818a);
        }
        if (this.f3819b != null) {
            codedOutputByteBufferNano.b(2, this.f3819b);
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
        if (this.f3818a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3818a);
        }
        if (this.f3819b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3819b);
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
                    if (this.f3818a == null) {
                        this.f3818a = new ff();
                    }
                    aVar.a(this.f3818a);
                    break;
                case 18:
                    if (this.f3819b == null) {
                        this.f3819b = new fj();
                    }
                    aVar.a(this.f3819b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new fn();
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
