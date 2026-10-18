package com.google.d.b.a.b;

import com.google.b.a.a.a.b.a.k;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class g extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public k f7752a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.f f7753b = null;
    public com.google.b.a.a.a.b.a.h c = null;
    public int d = 0;
    public c e = null;
    public String f = "";

    public g() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7752a != null) {
            codedOutputByteBufferNano.b(1, this.f7752a);
        }
        if (this.f7753b != null) {
            codedOutputByteBufferNano.b(2, this.f7753b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7752a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7752a);
        }
        if (this.f7753b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7753b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (!this.f.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.f);
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
                    if (this.f7752a == null) {
                        this.f7752a = new k();
                    }
                    aVar.a(this.f7752a);
                    break;
                case 18:
                    if (this.f7753b == null) {
                        this.f7753b = new com.google.b.a.a.a.b.a.f();
                    }
                    aVar.a(this.f7753b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.h();
                    }
                    aVar.a(this.c);
                    break;
                case 32:
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
                case 42:
                    if (this.e == null) {
                        this.e = new c();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    this.f = aVar.c();
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
