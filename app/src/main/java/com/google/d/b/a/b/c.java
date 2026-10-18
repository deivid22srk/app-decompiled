package com.google.d.b.a.b;

import com.google.b.a.a.a.b.a.bpkg.p;
import com.google.b.a.a.a.b.a.bpkg.r;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7745a = "";

    /* renamed from: b, reason: collision with root package name */
    public p f7746b = null;
    public r c = null;
    public com.google.b.a.a.a.b.a.bpkg.e d = null;
    public com.google.b.a.a.a.b.a.apkg.h e = null;
    public boolean f = false;
    public String g = "";
    public String h = "";
    public com.google.b.a.a.a.b.a.apkg.bpkg.b i = null;

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7745a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7745a);
        }
        if (this.f7746b != null) {
            codedOutputByteBufferNano.b(2, this.f7746b);
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
        if (this.f) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(7, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(8, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(9, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7745a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7745a);
        }
        if (this.f7746b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7746b);
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
        if (this.f) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.g);
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.h);
        }
        if (this.i != null) {
            return a2 + CodedOutputByteBufferNano.d(9, this.i);
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
                    this.f7745a = aVar.c();
                    break;
                case 18:
                    if (this.f7746b == null) {
                        this.f7746b = new p();
                    }
                    aVar.a(this.f7746b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new r();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new com.google.b.a.a.a.b.a.bpkg.e();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.apkg.h();
                    }
                    aVar.a(this.e);
                    break;
                case 48:
                    this.f = aVar.b();
                    break;
                case 58:
                    this.g = aVar.c();
                    break;
                case 66:
                    this.h = aVar.c();
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new com.google.b.a.a.a.b.a.apkg.bpkg.b();
                    }
                    aVar.a(this.i);
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
