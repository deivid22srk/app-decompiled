package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ps extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4266a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4267b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;

    public ps() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4267b || !this.f4266a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4266a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4267b || !this.f4266a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4266a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || this.m) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.p || this.o) {
            return a2 + CodedOutputByteBufferNano.c(8) + 1;
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
                    this.f4266a = aVar.c();
                    this.f4267b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.b();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.b();
                    this.p = true;
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
