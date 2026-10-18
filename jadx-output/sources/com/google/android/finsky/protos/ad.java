package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ad extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3582a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3583b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 1;
    public boolean h = false;
    public long i = 0;
    public boolean j = false;

    public ad() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3583b || this.f3582a != 0) {
            codedOutputByteBufferNano.a(1, this.f3582a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != 1 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(5, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3583b || this.f3582a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3582a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != 1 || this.h) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i != 0) {
            return a2 + CodedOutputByteBufferNano.e(5, this.i);
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
                    this.f3582a = aVar.e();
                    this.f3583b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                            this.g = e;
                            this.h = true;
                            break;
                    }
                case 40:
                    this.i = aVar.f();
                    this.j = true;
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
