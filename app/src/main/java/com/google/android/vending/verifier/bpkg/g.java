package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class g extends com.google.protobuf.nano.c {
    public static volatile g[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f7128a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f7129b = false;
    public f c = null;
    public int d = 0;
    public boolean e = false;

    public static g[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new g[0];
                }
            }
        }
        return f;
    }

    public g() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7129b || !this.f7128a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7128a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7129b || !this.f7128a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7128a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || this.d != 0) {
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
                case 10:
                    this.f7128a = aVar.c();
                    this.f7129b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new f();
                    }
                    aVar.a(this.c);
                    break;
                case 24:
                    this.d = aVar.e();
                    this.e = true;
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
