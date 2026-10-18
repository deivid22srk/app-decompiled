package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {
    private static volatile b[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f7650a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7651b = 0;
    public int c = -1;

    public static b[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new b[0];
                }
            }
        }
        return d;
    }

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7650a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7650a);
        }
        if (this.f7651b != 0) {
            codedOutputByteBufferNano.a(2, this.f7651b);
        }
        if (this.c != -1) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7650a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7650a);
        }
        if (this.f7651b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f7651b);
        }
        if (this.c != -1) {
            return a2 + CodedOutputByteBufferNano.c(3, this.c);
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
                    this.f7650a = aVar.c();
                    break;
                case 16:
                    this.f7651b = aVar.e();
                    break;
                case 24:
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
