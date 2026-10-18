package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class v extends com.google.protobuf.nano.c {
    private static volatile v[] c;

    /* renamed from: a, reason: collision with root package name */
    public int f7690a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7691b = 0;

    public static v[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new v[0];
                }
            }
        }
        return c;
    }

    public v() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7690a != 0) {
            codedOutputByteBufferNano.a(3, this.f7690a);
        }
        if (this.f7691b != 0) {
            codedOutputByteBufferNano.a(4, this.f7691b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7690a != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.f7690a);
        }
        if (this.f7691b != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.f7691b);
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
                case 24:
                    this.f7690a = aVar.e();
                    break;
                case 32:
                    this.f7691b = aVar.e();
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
