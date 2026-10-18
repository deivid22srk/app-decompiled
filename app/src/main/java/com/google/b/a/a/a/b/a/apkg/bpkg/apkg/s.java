package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class s extends com.google.protobuf.nano.c {
    public static volatile s[] h;

    /* renamed from: a, reason: collision with root package name */
    public int f7591a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f7592b = "";
    public int c = 0;
    public int d = 0;
    public String e = "";
    public int f = 0;
    public String g = "";

    public static s[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new s[0];
                }
            }
        }
        return h;
    }

    public s() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7592b.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7592b);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.f7591a != 0) {
            codedOutputByteBufferNano.a(7, this.f7591a);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7592b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7592b);
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.f);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.e);
        }
        if (this.f7591a != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.f7591a);
        }
        if (!this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(8, this.g);
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
                    this.f7592b = aVar.c();
                    break;
                case 16:
                    this.c = aVar.e();
                    break;
                case 24:
                    this.d = aVar.e();
                    break;
                case 32:
                    this.f = aVar.e();
                    break;
                case 50:
                    this.e = aVar.c();
                    break;
                case 56:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f7591a = e;
                            break;
                    }
                case 66:
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
