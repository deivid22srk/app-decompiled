package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fe extends com.google.protobuf.nano.c {
    private static volatile fe[] f;

    /* renamed from: a, reason: collision with root package name */
    public fd f3814a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3815b = 0;
    public boolean c = false;
    public int d = 0;
    public boolean e = false;

    public static fe[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new fe[0];
                }
            }
        }
        return f;
    }

    public fe() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3814a != null) {
            codedOutputByteBufferNano.b(1, this.f3814a);
        }
        if (this.c || this.f3815b != 0) {
            codedOutputByteBufferNano.a(2, this.f3815b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3814a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3814a);
        }
        if (this.c || this.f3815b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f3815b);
        }
        if (this.e || this.d != 0) {
            return a2 + CodedOutputByteBufferNano.c(3, this.d);
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
                    if (this.f3814a == null) {
                        this.f3814a = new fd();
                    }
                    aVar.a(this.f3814a);
                    break;
                case 16:
                    this.f3815b = aVar.e();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.e();
                    this.e = true;
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
