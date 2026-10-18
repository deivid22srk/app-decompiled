package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class q extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7589a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7590b = 0;
    public String c = "";
    public com.google.b.a.a.a.b.a.apkg.c d = null;
    public String e = "";
    public String f = "";

    public q() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7589a != 0) {
            codedOutputByteBufferNano.a(1, this.f7589a);
        }
        if (this.f7590b != 0) {
            codedOutputByteBufferNano.a(2, this.f7590b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(5, this.d);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7589a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7589a);
        }
        if (this.f7590b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f7590b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.d);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.f);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(7, this.e);
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
                case 8:
                    this.f7589a = aVar.e();
                    break;
                case 16:
                    this.f7590b = aVar.e();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 42:
                    if (this.d == null) {
                        this.d = new com.google.b.a.a.a.b.a.apkg.c();
                    }
                    aVar.a(this.d);
                    break;
                case 50:
                    this.f = aVar.c();
                    break;
                case 58:
                    this.e = aVar.c();
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
