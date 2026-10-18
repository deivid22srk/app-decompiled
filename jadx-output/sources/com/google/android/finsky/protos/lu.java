package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lu extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4099a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4100b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public ds k = null;
    public String l = "";
    public boolean m = false;
    public String n = "";
    public boolean o = false;

    public lu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4100b || !this.f4099a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4099a);
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
        if (this.k != null) {
            codedOutputByteBufferNano.b(6, this.k);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(7, this.l);
        }
        if (this.o || !this.n.equals("")) {
            codedOutputByteBufferNano.a(8, this.n);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4100b || !this.f4099a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4099a);
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
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.k);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.l);
        }
        if (this.o || !this.n.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(8, this.n);
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
                    this.f4099a = aVar.c();
                    this.f4100b = true;
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
                case 50:
                    if (this.k == null) {
                        this.k = new ds();
                    }
                    aVar.a(this.k);
                    break;
                case 58:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 66:
                    this.n = aVar.c();
                    this.o = true;
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
