package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kd extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4027a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4028b = false;
    public String c = "";
    public boolean d = false;
    public bx e = null;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;

    public kd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4028b || !this.f4027a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4027a);
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
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4028b || !this.f4027a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4027a);
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
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.h);
        }
        if (this.k || !this.j.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.j);
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
                    this.f4027a = aVar.c();
                    this.f4028b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new bx();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 50:
                    this.j = aVar.c();
                    this.k = true;
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
