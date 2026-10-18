package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class w extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4417a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4418b = false;
    public jy c = null;
    public aj d = null;

    public w() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4418b || !this.f4417a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4417a);
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
        if (this.f4418b || !this.f4417a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4417a);
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
                case 10:
                    this.f4417a = aVar.c();
                    this.f4418b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new jy();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new aj();
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
