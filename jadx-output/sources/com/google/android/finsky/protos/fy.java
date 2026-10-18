package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fy extends com.google.protobuf.nano.c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile fy[] f3851b;

    /* renamed from: a, reason: collision with root package name */
    public gx f3852a = null;

    public static fy[] b() {
        if (f3851b == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f3851b == null) {
                    f3851b = new fy[0];
                }
            }
        }
        return f3851b;
    }

    public fy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3852a != null) {
            codedOutputByteBufferNano.b(1, this.f3852a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3852a != null) {
            return a2 + CodedOutputByteBufferNano.d(1, this.f3852a);
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
                    if (this.f3852a == null) {
                        this.f3852a = new gx();
                    }
                    aVar.a(this.f3852a);
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
