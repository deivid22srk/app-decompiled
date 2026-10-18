package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sb extends com.google.protobuf.nano.c {
    private static volatile sb[] d;

    /* renamed from: a, reason: collision with root package name */
    public int f4369a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4370b = false;
    public aq c = null;

    public static sb[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new sb[0];
                }
            }
        }
        return d;
    }

    public sb() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4369a != 0 || this.f4370b) {
            codedOutputByteBufferNano.a(8, this.f4369a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(9, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4369a != 0 || this.f4370b) {
            a2 += CodedOutputByteBufferNano.c(8, this.f4369a);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(9, this.c);
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
                case 64:
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
                        case 8:
                        case 9:
                        case 10:
                        case 13:
                        case 100:
                            this.f4369a = e;
                            this.f4370b = true;
                            break;
                    }
                case 74:
                    if (this.c == null) {
                        this.c = new aq();
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
