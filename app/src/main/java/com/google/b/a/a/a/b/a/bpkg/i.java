package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class i extends com.google.protobuf.nano.c {
    public static volatile i[] d;

    /* renamed from: a, reason: collision with root package name */
    public int f7675a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7676b = 0;
    public k c = null;

    public static i[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new i[0];
                }
            }
        }
        return d;
    }

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7675a != 0) {
            codedOutputByteBufferNano.a(1, this.f7675a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f7676b != 0) {
            codedOutputByteBufferNano.a(3, this.f7676b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7675a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7675a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.f7676b != 0) {
            return a2 + CodedOutputByteBufferNano.c(3, this.f7676b);
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
                    this.f7675a = aVar.e();
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new k();
                    }
                    aVar.a(this.c);
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f7676b = e;
                            break;
                    }
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
