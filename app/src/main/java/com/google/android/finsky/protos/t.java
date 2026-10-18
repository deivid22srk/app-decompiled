package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class t extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4413a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4414b = false;
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

    public t() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4414b || !this.f4413a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4413a);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(2, this.g);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(3, this.k);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(6, this.l);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(7, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4414b || !this.f4413a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4413a);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.g);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.k);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.e);
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.l);
        }
        if (this.j || !this.i.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(7, this.i);
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
                    this.f4413a = aVar.c();
                    this.f4414b = true;
                    break;
                case 18:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 26:
                    if (this.k == null) {
                        this.k = new ds();
                    }
                    aVar.a(this.k);
                    break;
                case 34:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 42:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 50:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 58:
                    this.i = aVar.c();
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
