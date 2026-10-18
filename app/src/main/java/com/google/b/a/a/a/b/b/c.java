package com.google.b.a.a.a.b.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7710a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f7711b = "";
    public String c = "";
    public String d = "USD";
    public String e = "US";
    public String f = "";
    public boolean g = false;
    public boolean h = false;

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7710a != 0) {
            codedOutputByteBufferNano.a(1, this.f7710a);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (!this.d.equals("USD")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.e.equals("US")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (!this.f7711b.equals("")) {
            codedOutputByteBufferNano.a(5, this.f7711b);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.g) {
            codedOutputByteBufferNano.a(7, this.g);
        }
        if (this.h) {
            codedOutputByteBufferNano.a(9, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7710a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7710a);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (!this.d.equals("USD")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (!this.e.equals("US")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (!this.f7711b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f7711b);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.f);
        }
        if (this.g) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.h) {
            return a2 + CodedOutputByteBufferNano.c(9) + 1;
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
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                            this.f7710a = e;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 34:
                    this.e = aVar.c();
                    break;
                case 42:
                    this.f7711b = aVar.c();
                    break;
                case 50:
                    this.f = aVar.c();
                    break;
                case 56:
                    this.g = aVar.b();
                    break;
                case 72:
                    this.h = aVar.b();
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
