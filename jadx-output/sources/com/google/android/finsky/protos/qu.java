package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qu extends com.google.protobuf.nano.c {
    private static volatile qu[] d;

    /* renamed from: a, reason: collision with root package name */
    public int f4312a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4313b = false;
    public qw c = null;

    public static qu[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new qu[0];
                }
            }
        }
        return d;
    }

    public qu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4312a != 0 || this.f4313b) {
            codedOutputByteBufferNano.a(1, this.f4312a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4312a != 0 || this.f4313b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4312a);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.c);
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
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f4312a = e;
                            this.f4313b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new qw();
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
