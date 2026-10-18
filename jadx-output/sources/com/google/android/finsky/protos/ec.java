package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ec extends com.google.protobuf.nano.c {
    private static volatile ec[] e;

    /* renamed from: a, reason: collision with root package name */
    public long f3767a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3768b = false;
    public dz c = null;
    public dz d = null;

    public static ec[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new ec[0];
                }
            }
        }
        return e;
    }

    public ec() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3768b || this.f3767a != 0) {
            codedOutputByteBufferNano.b(1, this.f3767a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3768b || this.f3767a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f3767a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.d);
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
                    this.f3767a = aVar.f();
                    this.f3768b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new dz();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new dz();
                    }
                    aVar.a(this.d);
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
