package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ef extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public em f3773a = null;

    /* renamed from: b, reason: collision with root package name */
    public em f3774b = null;
    public long c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;

    public ef() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(1, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(2, this.g);
        }
        if (this.f3773a != null) {
            codedOutputByteBufferNano.b(3, this.f3773a);
        }
        if (this.f3774b != null) {
            codedOutputByteBufferNano.b(4, this.f3774b);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.g);
        }
        if (this.f3773a != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f3773a);
        }
        if (this.f3774b != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f3774b);
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.e(5, this.c);
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
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 16:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 26:
                    if (this.f3773a == null) {
                        this.f3773a = new em();
                    }
                    aVar.a(this.f3773a);
                    break;
                case 34:
                    if (this.f3774b == null) {
                        this.f3774b = new em();
                    }
                    aVar.a(this.f3774b);
                    break;
                case 40:
                    this.c = aVar.f();
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
