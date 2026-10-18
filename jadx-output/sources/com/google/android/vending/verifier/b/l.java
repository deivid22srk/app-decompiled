package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class l extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7138a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f7139b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;

    public l() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7139b || !this.f7138a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7138a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7139b || !this.f7138a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7138a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e != 0) {
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
                case 10:
                    this.f7138a = aVar.c();
                    this.f7139b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 32:
                    this.e = aVar.e();
                    this.f = true;
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
