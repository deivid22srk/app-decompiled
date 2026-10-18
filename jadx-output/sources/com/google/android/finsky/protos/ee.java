package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ee extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3771a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3772b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public long i = 0;
    public boolean j = false;

    public ee() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(1, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(2, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(3, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(4, this.i);
        }
        if (this.f3771a != 1 || this.f3772b) {
            codedOutputByteBufferNano.a(5, this.f3771a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.i);
        }
        if (this.f3771a != 1 || this.f3772b) {
            return a2 + CodedOutputByteBufferNano.c(5, this.f3771a);
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
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 16:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 24:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 32:
                    this.i = aVar.f();
                    this.j = true;
                    break;
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f3771a = e;
                            this.f3772b = true;
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
