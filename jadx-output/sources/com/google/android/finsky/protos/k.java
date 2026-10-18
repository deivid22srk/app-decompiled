package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class k extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public l f4021a = null;

    /* renamed from: b, reason: collision with root package name */
    public d f4022b = null;
    public o c = null;
    public q d = null;
    public e e = null;
    public n f = null;
    public r g = null;

    public k() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4021a != null) {
            codedOutputByteBufferNano.b(1, this.f4021a);
        }
        if (this.f4022b != null) {
            codedOutputByteBufferNano.b(2, this.f4022b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(6, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(7, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4021a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4021a);
        }
        if (this.f4022b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4022b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f);
        }
        if (this.g != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.g);
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
                    if (this.f4021a == null) {
                        this.f4021a = new l();
                    }
                    aVar.a(this.f4021a);
                    break;
                case 18:
                    if (this.f4022b == null) {
                        this.f4022b = new d();
                    }
                    aVar.a(this.f4022b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new o();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new q();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new e();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new n();
                    }
                    aVar.a(this.f);
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new r();
                    }
                    aVar.a(this.g);
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
