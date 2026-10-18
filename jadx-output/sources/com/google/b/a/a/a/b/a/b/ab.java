package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class ab extends com.google.protobuf.nano.c {
    private static volatile ab[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f7654a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7655b = "";
    public int c = 0;
    public r d = null;
    public p e = null;

    public static ab[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new ab[0];
                }
            }
        }
        return f;
    }

    public ab() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7654a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7654a);
        }
        if (!this.f7655b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7655b);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(6, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7654a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7654a);
        }
        if (!this.f7655b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7655b);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.c);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(6, this.e);
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
                    this.f7654a = aVar.c();
                    break;
                case 18:
                    this.f7655b = aVar.c();
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new r();
                    }
                    aVar.a(this.d);
                    break;
                case 40:
                    this.c = aVar.e();
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new p();
                    }
                    aVar.a(this.e);
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
