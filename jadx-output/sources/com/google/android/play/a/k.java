package com.google.android.play.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class k extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f6767a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6768b = false;
    public long c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;

    public k() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6768b || this.f6767a != 0) {
            codedOutputByteBufferNano.b(1, this.f6767a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6768b || this.f6767a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f6767a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.e);
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
                    this.f6767a = aVar.f();
                    this.f6768b = true;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
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
