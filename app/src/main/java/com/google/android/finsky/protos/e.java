package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3761a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3762b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public ds i = null;
    public String j = "";
    public boolean k = false;

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3762b || !this.f3761a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3761a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(5, this.i);
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
        if (this.f3762b || !this.f3761a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3761a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.i);
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
                    this.f3761a = aVar.c();
                    this.f3762b = true;
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
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 42:
                    if (this.i == null) {
                        this.i = new ds();
                    }
                    aVar.a(this.i);
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
