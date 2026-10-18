package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gz extends com.google.protobuf.nano.c {
    private static volatile gz[] j;

    /* renamed from: a, reason: collision with root package name */
    public dp f3894a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f3895b = "";
    public boolean c = false;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    public static gz[] b() {
        if (j == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (j == null) {
                    j = new gz[0];
                }
            }
        }
        return j;
    }

    public gz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3894a != null) {
            codedOutputByteBufferNano.b(1, this.f3894a);
        }
        if (this.c || !this.f3895b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3895b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || this.f) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3894a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3894a);
        }
        if (this.c || !this.f3895b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3895b);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (this.g || this.f) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.i || this.h) {
            return a2 + CodedOutputByteBufferNano.c(5) + 1;
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
                    if (this.f3894a == null) {
                        this.f3894a = new dp();
                    }
                    aVar.a(this.f3894a);
                    break;
                case 18:
                    this.f3895b = aVar.c();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.b();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.b();
                    this.i = true;
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
