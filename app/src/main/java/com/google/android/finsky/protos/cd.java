package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cd extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ce f3667a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3668b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public kq f = null;
    public int g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public gi k = null;
    public String l = "";
    public boolean m = false;
    public int n = 0;
    public boolean o = false;

    public cd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3667a != null) {
            codedOutputByteBufferNano.b(1, this.f3667a);
        }
        if (this.c || this.f3668b) {
            codedOutputByteBufferNano.a(2, this.f3668b);
        }
        if (this.e || this.d) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(7, this.k);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.n != 0 || this.o) {
            codedOutputByteBufferNano.a(9, this.n);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3667a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3667a);
        }
        if (this.c || this.f3668b) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.e || this.d) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.k);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.l);
        }
        if (this.n != 0 || this.o) {
            return a2 + CodedOutputByteBufferNano.c(9, this.n);
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
                    if (this.f3667a == null) {
                        this.f3667a = new ce();
                    }
                    aVar.a(this.f3667a);
                    break;
                case 16:
                    this.f3668b = aVar.b();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.b();
                    this.e = true;
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new kq();
                    }
                    aVar.a(this.f);
                    break;
                case 40:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 58:
                    if (this.k == null) {
                        this.k = new gi();
                    }
                    aVar.a(this.k);
                    break;
                case 66:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 72:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.n = e;
                            this.o = true;
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
