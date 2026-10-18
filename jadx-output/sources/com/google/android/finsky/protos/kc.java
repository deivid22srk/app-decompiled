package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4025a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4026b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public ds k = null;
    public boolean l = false;
    public boolean m = false;
    public jd n = null;
    public boolean o = false;
    public boolean p = false;

    public kc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4026b || !this.f4025a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4025a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.m || this.l) {
            codedOutputByteBufferNano.a(6, this.l);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(7, this.n);
        }
        if (this.p || this.o) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(9, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4026b || !this.f4025a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4025a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.m || this.l) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.n);
        }
        if (this.p || this.o) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.k != null) {
            return a2 + CodedOutputByteBufferNano.d(9, this.k);
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
                    this.f4025a = aVar.c();
                    this.f4026b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
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
                    this.l = aVar.b();
                    this.m = true;
                    break;
                case 58:
                    if (this.n == null) {
                        this.n = new jd();
                    }
                    aVar.a(this.n);
                    break;
                case 64:
                    this.o = aVar.b();
                    this.p = true;
                    break;
                case 74:
                    if (this.k == null) {
                        this.k = new ds();
                    }
                    aVar.a(this.k);
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
