package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class i extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.k f7722a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.f f7723b = null;
    public com.google.b.a.a.a.b.a.h c = null;
    public boolean d = false;
    public int e = 0;
    public String f = "";
    public d g = null;
    public boolean h = false;
    public long i = 0;

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(1, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(2, this.g);
        }
        if (this.f7722a != null) {
            codedOutputByteBufferNano.b(3, this.f7722a);
        }
        if (this.f7723b != null) {
            codedOutputByteBufferNano.b(4, this.f7723b);
        }
        if (this.d) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        if (this.h) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (this.i != 0) {
            codedOutputByteBufferNano.b(7, this.i);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(8, this.c);
        }
        if (this.e != 0) {
            codedOutputByteBufferNano.a(9, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.g);
        }
        if (this.f7722a != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f7722a);
        }
        if (this.f7723b != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f7723b);
        }
        if (this.d) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.h) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.i != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.i);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.c);
        }
        if (this.e != 0) {
            return a2 + CodedOutputByteBufferNano.c(9, this.e);
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
                    this.f = aVar.c();
                    break;
                case 18:
                    if (this.g == null) {
                        this.g = new d();
                    }
                    aVar.a(this.g);
                    break;
                case 26:
                    if (this.f7722a == null) {
                        this.f7722a = new com.google.b.a.a.a.b.a.k();
                    }
                    aVar.a(this.f7722a);
                    break;
                case 34:
                    if (this.f7723b == null) {
                        this.f7723b = new com.google.b.a.a.a.b.a.f();
                    }
                    aVar.a(this.f7723b);
                    break;
                case 40:
                    this.d = aVar.b();
                    break;
                case 48:
                    this.h = aVar.b();
                    break;
                case 56:
                    this.i = aVar.f();
                    break;
                case 66:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.h();
                    }
                    aVar.a(this.c);
                    break;
                case 72:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.e = e;
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
