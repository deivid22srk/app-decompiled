package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hf extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3905a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3906b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;

    public hf() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3906b || !this.f3905a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3905a);
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
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3906b || !this.f3905a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3905a);
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
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.l || this.k != 0) {
            return a2 + CodedOutputByteBufferNano.c(6, this.k);
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
                    this.f3905a = aVar.c();
                    this.f3906b = true;
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
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.e();
                    this.l = true;
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
