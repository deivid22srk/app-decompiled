package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ow extends com.google.protobuf.nano.c {
    private static volatile ow[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f4229a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4230b = false;
    public boolean c = false;
    public boolean d = false;

    public static ow[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new ow[0];
                }
            }
        }
        return e;
    }

    public ow() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4229a != 0 || this.f4230b) {
            codedOutputByteBufferNano.a(1, this.f4229a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4229a != 0 || this.f4230b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4229a);
        }
        if (this.d || this.c) {
            return a2 + CodedOutputByteBufferNano.c(2) + 1;
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
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f4229a = e2;
                            this.f4230b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.b();
                    this.d = true;
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
