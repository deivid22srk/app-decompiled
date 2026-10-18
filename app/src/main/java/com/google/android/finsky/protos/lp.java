package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lp extends com.google.protobuf.nano.c {
    private static volatile lp[] g;

    /* renamed from: a, reason: collision with root package name */
    public int f4092a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4093b = false;
    public int c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public static lp[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new lp[0];
                }
            }
        }
        return g;
    }

    public lp() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4092a != 0 || this.f4093b) {
            codedOutputByteBufferNano.a(1, this.f4092a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4092a != 0 || this.f4093b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4092a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(3) + 1;
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f4092a = e;
                            this.f4093b = true;
                            break;
                    }
                case 16:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e2;
                            this.d = true;
                            break;
                    }
                case 24:
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
