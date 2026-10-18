package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ce extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public cf f3669a = null;

    /* renamed from: b, reason: collision with root package name */
    public cf f3670b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public ce() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3669a != null) {
            codedOutputByteBufferNano.b(1, this.f3669a);
        }
        if (this.f3670b != null) {
            codedOutputByteBufferNano.b(2, this.f3670b);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3669a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3669a);
        }
        if (this.f3670b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3670b);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    if (this.f3669a == null) {
                        this.f3669a = new cf();
                    }
                    aVar.a(this.f3669a);
                    break;
                case 18:
                    if (this.f3670b == null) {
                        this.f3670b = new cf();
                    }
                    aVar.a(this.f3670b);
                    break;
                case 24:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 32:
                    this.e = aVar.b();
                    this.f = true;
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
