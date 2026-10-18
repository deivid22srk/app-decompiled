package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class h extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7626a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7627b = false;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f = 0;

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7626a != 0) {
            codedOutputByteBufferNano.a(1, this.f7626a);
        }
        if (this.f7627b) {
            codedOutputByteBufferNano.a(2, this.f7627b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7626a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7626a);
        }
        if (this.f7627b) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.e);
        }
        if (this.f != 0) {
            return a2 + CodedOutputByteBufferNano.c(6, this.f);
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
                    this.f7626a = aVar.e();
                    break;
                case 16:
                    this.f7627b = aVar.b();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 34:
                    this.d = aVar.c();
                    break;
                case 42:
                    this.e = aVar.c();
                    break;
                case 48:
                    this.f = aVar.e();
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
