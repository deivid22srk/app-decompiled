package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sy extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4411a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4412b = false;
    public String c = "";
    public boolean d = false;

    public sy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4412b || !this.f4411a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4411a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4412b || !this.f4411a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4411a);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.c);
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
                    this.f4411a = aVar.c();
                    this.f4412b = true;
                    break;
                case 18:
                    this.c = aVar.c();
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
