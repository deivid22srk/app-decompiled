package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dj extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3730a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3731b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String k = "";
    public boolean l = false;

    public dj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3731b || !this.f3730a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3730a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(4, this.k);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3731b || !this.f3730a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3730a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.i);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.k);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.g);
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
                    this.f3730a = aVar.c();
                    this.f3731b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 34:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 42:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 50:
                    this.g = aVar.c();
                    this.h = true;
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
