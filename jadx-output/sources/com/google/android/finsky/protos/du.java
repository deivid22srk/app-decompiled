package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class du extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3750a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3751b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;

    public du() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3751b || this.f3750a != 0) {
            codedOutputByteBufferNano.a(3, this.f3750a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(18, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3751b || this.f3750a != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.f3750a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.c);
        }
        if (this.e != 0 || this.f) {
            return a2 + CodedOutputByteBufferNano.c(18, this.e);
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
                case 24:
                    this.f3750a = aVar.e();
                    this.f3751b = true;
                    break;
                case 32:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 144:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.e = e;
                            this.f = true;
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
