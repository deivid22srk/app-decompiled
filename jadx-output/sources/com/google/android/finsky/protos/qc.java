package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4286a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4287b = false;
    public int c = 0;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public qc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4287b || !this.f4286a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4286a);
        }
        if (this.d || this.c != 0) {
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
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4287b || !this.f4286a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4286a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
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
            a2 += CodedOutputByteBufferNano.c(6, this.k);
        }
        if (this.n || this.m) {
            return a2 + CodedOutputByteBufferNano.c(7) + 1;
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
                    this.f4286a = aVar.c();
                    this.f4287b = true;
                    break;
                case 16:
                    this.c = aVar.e();
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
                case 56:
                    this.m = aVar.b();
                    this.n = true;
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
