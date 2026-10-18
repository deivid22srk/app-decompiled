package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class f extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f6758a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6759b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public c g = null;
    public g h = null;
    public l i = null;
    public r j = null;
    public u k = null;
    public q l = null;
    public e m = null;

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6758a != 0 || this.f6759b) {
            codedOutputByteBufferNano.a(1, this.f6758a);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(2, this.g);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(3, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(4, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(5, this.j);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(6, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(8, this.k);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(9, this.m);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(10, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6758a != 0 || this.f6759b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f6758a);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.g);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.i);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.j);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.e);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.k);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.m);
        }
        if (this.l != null) {
            return a2 + CodedOutputByteBufferNano.d(10, this.l);
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f6758a = e;
                            this.f6759b = true;
                            break;
                    }
                case 18:
                    if (this.g == null) {
                        this.g = new c();
                    }
                    aVar.a(this.g);
                    break;
                case 26:
                    if (this.h == null) {
                        this.h = new g();
                    }
                    aVar.a(this.h);
                    break;
                case 34:
                    if (this.i == null) {
                        this.i = new l();
                    }
                    aVar.a(this.i);
                    break;
                case 42:
                    if (this.j == null) {
                        this.j = new r();
                    }
                    aVar.a(this.j);
                    break;
                case 50:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 58:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 66:
                    if (this.k == null) {
                        this.k = new u();
                    }
                    aVar.a(this.k);
                    break;
                case 74:
                    if (this.m == null) {
                        this.m = new e();
                    }
                    aVar.a(this.m);
                    break;
                case 82:
                    if (this.l == null) {
                        this.l = new q();
                    }
                    aVar.a(this.l);
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
