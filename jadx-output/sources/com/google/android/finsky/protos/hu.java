package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hu extends com.google.protobuf.nano.c {
    private static volatile hu[] j;

    /* renamed from: a, reason: collision with root package name */
    public long f3928a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3929b = false;
    public int c = 1;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public hw i = null;

    public static hu[] b() {
        if (j == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (j == null) {
                    j = new hu[0];
                }
            }
        }
        return j;
    }

    public hu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3929b || this.f3928a != 0) {
            codedOutputByteBufferNano.c(10, this.f3928a);
        }
        if (this.c != 1 || this.d) {
            codedOutputByteBufferNano.a(11, this.c);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(12, this.g);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(15, this.i);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(22, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3929b || this.f3928a != 0) {
            a2 += CodedOutputByteBufferNano.c(10) + 8;
        }
        if (this.c != 1 || this.d) {
            a2 += CodedOutputByteBufferNano.c(11, this.c);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(12, this.g);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.i);
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(22) + 1;
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
                case 81:
                    this.f3928a = aVar.h();
                    this.f3929b = true;
                    break;
                case 88:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 96:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 122:
                    if (this.i == null) {
                        this.i = new hw();
                    }
                    aVar.a(this.i);
                    break;
                case 176:
                    this.e = aVar.b();
                    this.f = true;
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
