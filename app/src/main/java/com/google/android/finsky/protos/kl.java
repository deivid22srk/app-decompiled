package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kl extends com.google.protobuf.nano.c {
    private static volatile kl[] c;

    /* renamed from: a, reason: collision with root package name */
    public int f4043a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4044b = false;

    public static kl[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new kl[0];
                }
            }
        }
        return c;
    }

    public kl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4043a != 0 || this.f4044b) {
            codedOutputByteBufferNano.a(1, this.f4043a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4043a != 0 || this.f4044b) {
            return a2 + CodedOutputByteBufferNano.c(1, this.f4043a);
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
                            this.f4043a = e;
                            this.f4044b = true;
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
