package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kr extends com.google.protobuf.nano.c {
    private static volatile kr[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f4052a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4053b = false;
    public long c = 0;
    public boolean d = false;

    public static kr[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new kr[0];
                }
            }
        }
        return e;
    }

    public kr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4053b || this.f4052a != 0) {
            codedOutputByteBufferNano.a(1, this.f4052a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4053b || this.f4052a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4052a);
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.e(2, this.c);
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
                    this.f4052a = aVar.e();
                    this.f4053b = true;
                    break;
                case 16:
                    this.c = aVar.f();
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
