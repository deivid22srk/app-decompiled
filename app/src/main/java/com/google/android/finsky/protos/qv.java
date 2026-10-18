package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qv extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jm f4314a = null;

    /* renamed from: b, reason: collision with root package name */
    public lq f4315b = null;
    public hl c = null;
    public km d = null;
    public kz e = null;
    public ky f = null;

    public qv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4314a != null) {
            codedOutputByteBufferNano.b(1, this.f4314a);
        }
        if (this.f4315b != null) {
            codedOutputByteBufferNano.b(2, this.f4315b);
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
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4314a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4314a);
        }
        if (this.f4315b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4315b);
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
            return a2 + CodedOutputByteBufferNano.d(6, this.f);
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
                    if (this.f4314a == null) {
                        this.f4314a = new jm();
                    }
                    aVar.a(this.f4314a);
                    break;
                case 18:
                    if (this.f4315b == null) {
                        this.f4315b = new lq();
                    }
                    aVar.a(this.f4315b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new hl();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new km();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new kz();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new ky();
                    }
                    aVar.a(this.f);
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
