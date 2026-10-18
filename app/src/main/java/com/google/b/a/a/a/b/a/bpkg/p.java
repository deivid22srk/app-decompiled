package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class p extends com.google.protobuf.nano.c {
    public static volatile p[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f7684a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7685b = 0;
    public int c = 0;
    public String d = "";

    public static p[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new p[0];
                }
            }
        }
        return e;
    }

    public p() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7684a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7684a);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f7685b != 0) {
            codedOutputByteBufferNano.a(4, this.f7685b);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7684a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7684a);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f7685b != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.f7685b);
        }
        if (this.c != 0) {
            return a2 + CodedOutputByteBufferNano.c(5, this.c);
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
                    this.f7684a = aVar.c();
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 32:
                    this.f7685b = aVar.e();
                    break;
                case 40:
                    this.c = aVar.e();
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
