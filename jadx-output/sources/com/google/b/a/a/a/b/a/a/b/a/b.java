package com.google.b.a.a.a.b.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {
    private static volatile b[] e;

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.b.x f7561a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.a.b f7562b = null;
    public com.google.b.a.a.a.b.a.a.l c = null;
    public boolean d = false;

    public static b[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new b[0];
                }
            }
        }
        return e;
    }

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7561a != null) {
            codedOutputByteBufferNano.b(1, this.f7561a);
        }
        if (this.f7562b != null) {
            codedOutputByteBufferNano.b(2, this.f7562b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(4, this.c);
        }
        if (this.d) {
            codedOutputByteBufferNano.a(6, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7561a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7561a);
        }
        if (this.f7562b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7562b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.c);
        }
        if (this.d) {
            return a2 + CodedOutputByteBufferNano.c(6) + 1;
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
                    if (this.f7561a == null) {
                        this.f7561a = new com.google.b.a.a.a.b.a.b.x();
                    }
                    aVar.a(this.f7561a);
                    break;
                case 18:
                    if (this.f7562b == null) {
                        this.f7562b = new com.google.b.a.a.a.b.a.a.b();
                    }
                    aVar.a(this.f7562b);
                    break;
                case 34:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.a.l();
                    }
                    aVar.a(this.c);
                    break;
                case 48:
                    this.d = aVar.b();
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
