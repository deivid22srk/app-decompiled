package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ii extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3951a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3952b = false;
    public long c = 0;
    public boolean d = false;
    public dr e = null;

    public ii() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3951a != 1 || this.f3952b) {
            codedOutputByteBufferNano.a(1, this.f3951a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3951a != 1 || this.f3952b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3951a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2) + 8;
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.e);
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f3951a = e;
                            this.f3952b = true;
                            break;
                    }
                case 17:
                    this.c = aVar.h();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new dr();
                    }
                    aVar.a(this.e);
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
