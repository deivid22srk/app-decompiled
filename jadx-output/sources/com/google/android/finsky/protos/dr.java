package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dr extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f3744a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3745b = false;
    public dp c = null;
    public int d = 1;
    public boolean e = false;
    public int f = 0;
    public boolean g = false;
    public int h = 0;
    public boolean i = false;

    public dr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3745b || this.f3744a != 0) {
            codedOutputByteBufferNano.c(1, this.f3744a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != 1 || this.e) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != 0 || this.g) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h != 0) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3745b || this.f3744a != 0) {
            a2 += CodedOutputByteBufferNano.c(1) + 8;
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != 1 || this.e) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (this.f != 0 || this.g) {
            a2 += CodedOutputByteBufferNano.c(4, this.f);
        }
        if (this.i || this.h != 0) {
            return a2 + CodedOutputByteBufferNano.c(5, this.h);
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
                case 9:
                    this.f3744a = aVar.h();
                    this.f3745b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new dp();
                    }
                    aVar.a(this.c);
                    break;
                case 24:
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
                            this.d = e;
                            this.e = true;
                            break;
                    }
                case 32:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = e2;
                            this.g = true;
                            break;
                    }
                case 40:
                    this.h = aVar.e();
                    this.i = true;
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
