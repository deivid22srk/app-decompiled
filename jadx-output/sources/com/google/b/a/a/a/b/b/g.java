package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class g extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.k f7718a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.f f7719b = null;
    public com.google.b.a.a.a.b.a.h c = null;
    public int d = 0;
    public d e = null;

    public g() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7718a != null) {
            codedOutputByteBufferNano.b(1, this.f7718a);
        }
        if (this.f7719b != null) {
            codedOutputByteBufferNano.b(2, this.f7719b);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(4, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7718a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7718a);
        }
        if (this.f7719b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7719b);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.c);
        }
        if (this.d != 0) {
            return a2 + CodedOutputByteBufferNano.c(5, this.d);
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
                    if (this.f7718a == null) {
                        this.f7718a = new com.google.b.a.a.a.b.a.k();
                    }
                    aVar.a(this.f7718a);
                    break;
                case 18:
                    if (this.f7719b == null) {
                        this.f7719b = new com.google.b.a.a.a.b.a.f();
                    }
                    aVar.a(this.f7719b);
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new d();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.h();
                    }
                    aVar.a(this.c);
                    break;
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.d = e;
                            break;
                    }
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
