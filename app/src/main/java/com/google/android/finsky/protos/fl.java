package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fl extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3828a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3829b = false;
    public int c = 0;
    public boolean d = false;
    public fk e = null;
    public fi f = null;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;

    public fl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3829b || !this.f3828a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3828a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3829b || !this.f3828a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3828a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.l || this.k) {
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
                    this.f3828a = aVar.c();
                    this.f3829b = true;
                    break;
                case 16:
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
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 26:
                    if (this.e == null) {
                        this.e = new fk();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new fi();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 56:
                    this.k = aVar.b();
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
