package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.k f7708a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.f f7709b = null;
    public com.google.b.a.a.a.b.a.h c = null;
    public d d = null;
    public boolean e = false;
    public int f = 0;
    public String g = "";

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.f7708a != null) {
            codedOutputByteBufferNano.b(5, this.f7708a);
        }
        if (this.f7709b != null) {
            codedOutputByteBufferNano.b(6, this.f7709b);
        }
        if (this.e) {
            codedOutputByteBufferNano.a(8, this.e);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(9, this.c);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(10, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(11, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.f7708a != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.f7708a);
        }
        if (this.f7709b != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f7709b);
        }
        if (this.e) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.c);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.f);
        }
        if (!this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(11, this.g);
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
                case 34:
                    if (this.d == null) {
                        this.d = new d();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.f7708a == null) {
                        this.f7708a = new com.google.b.a.a.a.b.a.k();
                    }
                    aVar.a(this.f7708a);
                    break;
                case 50:
                    if (this.f7709b == null) {
                        this.f7709b = new com.google.b.a.a.a.b.a.f();
                    }
                    aVar.a(this.f7709b);
                    break;
                case 64:
                    this.e = aVar.b();
                    break;
                case 74:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.h();
                    }
                    aVar.a(this.c);
                    break;
                case 80:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f = e;
                            break;
                    }
                case 90:
                    this.g = aVar.c();
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
