package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cs extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3695a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3696b = false;
    public String c = "";
    public boolean d = false;
    public ct e = null;
    public String f = "";
    public boolean g = false;
    public ds h = null;
    public an i = null;
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public ds n = null;
    public String o = "";
    public boolean p = false;

    public cs() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3696b || !this.f3695a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3695a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(5, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(6, this.i);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(7, this.j);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(9, this.n);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(10, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3696b || !this.f3695a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3695a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.i);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.j);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.l);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.n);
        }
        if (this.p || !this.o.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(10, this.o);
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
                    this.f3695a = aVar.c();
                    this.f3696b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new ct();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    if (this.h == null) {
                        this.h = new ds();
                    }
                    aVar.a(this.h);
                    break;
                case 50:
                    if (this.i == null) {
                        this.i = new an();
                    }
                    aVar.a(this.i);
                    break;
                case 58:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 66:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 74:
                    if (this.n == null) {
                        this.n = new ds();
                    }
                    aVar.a(this.n);
                    break;
                case 82:
                    this.o = aVar.c();
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
