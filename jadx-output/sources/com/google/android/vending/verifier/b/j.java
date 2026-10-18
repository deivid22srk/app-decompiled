package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class j extends com.google.protobuf.nano.c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile j[] f7134b;

    /* renamed from: a, reason: collision with root package name */
    public f f7135a = null;

    public static j[] b() {
        if (f7134b == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f7134b == null) {
                    f7134b = new j[0];
                }
            }
        }
        return f7134b;
    }

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7135a != null) {
            codedOutputByteBufferNano.b(1, this.f7135a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7135a != null) {
            return a2 + CodedOutputByteBufferNano.d(1, this.f7135a);
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
                    if (this.f7135a == null) {
                        this.f7135a = new f();
                    }
                    aVar.a(this.f7135a);
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
