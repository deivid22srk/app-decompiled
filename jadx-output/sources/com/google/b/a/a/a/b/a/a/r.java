package com.google.b.a.a.a.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class r extends com.google.protobuf.nano.c {
    private static volatile r[] c;

    /* renamed from: a, reason: collision with root package name */
    public u f7640a = null;

    /* renamed from: b, reason: collision with root package name */
    public o f7641b = null;

    public static r[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new r[0];
                }
            }
        }
        return c;
    }

    public r() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7640a != null) {
            codedOutputByteBufferNano.b(1, this.f7640a);
        }
        if (this.f7641b != null) {
            codedOutputByteBufferNano.b(2, this.f7641b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7640a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7640a);
        }
        if (this.f7641b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7641b);
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
                    if (this.f7640a == null) {
                        this.f7640a = new u();
                    }
                    aVar.a(this.f7640a);
                    break;
                case 18:
                    if (this.f7641b == null) {
                        this.f7641b = new o();
                    }
                    aVar.a(this.f7641b);
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
