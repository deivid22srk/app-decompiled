package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rs extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public sl f4355a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f4356b = 0;
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public int f = 0;
    public boolean g = false;

    public rs() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4355a != null) {
            codedOutputByteBufferNano.b(1, this.f4355a);
        }
        if (this.c || this.f4356b != 0) {
            codedOutputByteBufferNano.b(2, this.f4356b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4355a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4355a);
        }
        if (this.c || this.f4356b != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.f4356b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || this.f != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.f);
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
                    if (this.f4355a == null) {
                        this.f4355a = new sl();
                    }
                    aVar.a(this.f4355a);
                    break;
                case 16:
                    this.f4356b = aVar.f();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.e();
                    this.g = true;
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
