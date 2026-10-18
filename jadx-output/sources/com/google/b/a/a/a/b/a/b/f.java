package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class f extends com.google.protobuf.nano.c {
    private static volatile f[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f7670a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7671b = 0;
    public h c = null;
    public g d = null;

    public static f[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new f[0];
                }
            }
        }
        return e;
    }

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7670a != 0) {
            codedOutputByteBufferNano.a(1, this.f7670a);
        }
        if (this.f7671b != 0) {
            codedOutputByteBufferNano.a(2, this.f7671b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7670a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7670a);
        }
        if (this.f7671b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f7671b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.d);
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
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f7670a = e2;
                            break;
                    }
                case 16:
                    this.f7671b = aVar.e();
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new h();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new g();
                    }
                    aVar.a(this.d);
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
