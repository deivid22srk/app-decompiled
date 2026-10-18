package com.google.b.a.a.a.b.a.a.b.a;

import com.google.b.a.a.a.b.a.b.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {
    private static volatile c[] d;

    /* renamed from: a, reason: collision with root package name */
    public ae f7563a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.a.c f7564b = null;
    public com.google.b.a.a.a.b.a.a.m c = null;

    public static c[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new c[0];
                }
            }
        }
        return d;
    }

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7563a != null) {
            codedOutputByteBufferNano.b(1, this.f7563a);
        }
        if (this.f7564b != null) {
            codedOutputByteBufferNano.b(2, this.f7564b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7563a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7563a);
        }
        if (this.f7564b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7564b);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.c);
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
                    if (this.f7563a == null) {
                        this.f7563a = new ae();
                    }
                    aVar.a(this.f7563a);
                    break;
                case 18:
                    if (this.f7564b == null) {
                        this.f7564b = new com.google.b.a.a.a.b.a.a.c();
                    }
                    aVar.a(this.f7564b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.a.m();
                    }
                    aVar.a(this.c);
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
