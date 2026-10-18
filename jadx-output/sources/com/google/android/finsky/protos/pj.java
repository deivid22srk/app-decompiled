package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pj extends com.google.protobuf.nano.c {
    private static volatile pj[] g;

    /* renamed from: a, reason: collision with root package name */
    public long f4251a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4252b = false;
    public lw c = null;
    public pl d = null;
    public int e = 0;
    public boolean f = false;

    public static pj[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new pj[0];
                }
            }
        }
        return g;
    }

    public pj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4252b || this.f4251a != 0) {
            codedOutputByteBufferNano.b(1, this.f4251a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4252b || this.f4251a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4251a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.d);
        }
        if (this.e != 0 || this.f) {
            return a2 + CodedOutputByteBufferNano.c(4, this.e);
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
                    this.f4251a = aVar.f();
                    this.f4252b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new lw();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new pl();
                    }
                    aVar.a(this.d);
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.e = e;
                            this.f = true;
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
